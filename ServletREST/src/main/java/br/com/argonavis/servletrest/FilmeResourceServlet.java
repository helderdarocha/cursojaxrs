/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.argonavis.servletrest;

import br.com.argonavis.filme.Filme;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.MarshallerProperties;

@WebServlet(name = "FilmeResource", urlPatterns = {"/filme/*"})
public class FilmeResourceServlet extends HttpServlet {

    @Resource
    private javax.transaction.UserTransaction utx;

    @PersistenceContext(unitName = "FestivalDeCinema")
    private EntityManager em;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String pathInfo = request.getPathInfo();
            String pathParam = null;
            if (pathInfo != null) {
                pathParam = pathInfo.substring(1);
            }

            System.out.println(pathParam);

            if (pathParam == null) {
                getFilmes(request, response);
            } else if (pathParam.matches("\\d+")) { // {id}
                getFilmeById(pathParam, request, response);
            } else if (pathParam.matches("\\d+\\/\\d+")) { // {id}/{id}
                getFilmesByRange(pathParam, request, response);
            } else if (pathParam.matches("imdb\\/tt[0-9]{4,7}")) { // imdb/{imdb}
                getFilmeByImdb(pathParam, request, response);
            } else if (pathParam.matches("diretor\\/.*")) { // diretor/{imdb}
                getFilmesByDiretor(pathParam, request, response);
            } else if (pathParam.matches("titulo\\/.*")) { // titulo/{titulo}
                getFilmesByTitulo(pathParam, request, response);
            } else if (pathParam.matches("count")) { // count
                getFilmesCount(response);
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404
            }
        } catch (JAXBException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Filme entity = getRequestBody(request);
            utx.begin();
            em.persist(entity);
            utx.commit();
        } catch (JAXBException ex) {
            throw new ServletException(ex);
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Filme entity = getRequestBody(request);
            utx.begin();
            em.merge(entity);
            utx.commit();
        } catch (JAXBException ex) {
            throw new ServletException(ex);
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String pathInfo = request.getPathInfo();
            String pathParam = null;
            if (pathInfo != null) {
                pathParam = pathInfo.substring(1);
            }
            utx.begin();
            em.remove(em.merge(em.find(Filme.class, Long.parseLong(pathParam))));
            utx.commit();
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            throw new ServletException(ex);
        }
    }
    
    
    // HELPERS

    private String getResponseType(HttpServletRequest request) {
        String responseType = "text/plain";

        if (request.getHeader("Accept").indexOf("application/json") != -1) {
            responseType = "application/json;charset=UTF-8";
        } else if (request.getHeader("Accept").indexOf("application/xml") != -1) {
            responseType = "application/xml;charset=UTF-8";
        }

        return responseType;
    }

    private Marshaller getMarshaller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JAXBException {
        String responseType = getResponseType(request);

        response.setContentType(responseType);
        JAXBContext jc = getJAXBContext(responseType);

        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        return m;
    }

    private JAXBContext getJAXBContext(String contentType) throws JAXBException {
        JAXBContext jc;
        if (contentType.indexOf("json") != -1) { // JSON
            Map<String, Object> props = new HashMap<>();
            props.put(MarshallerProperties.MEDIA_TYPE, "application/json");
            props.put(MarshallerProperties.JSON_INCLUDE_ROOT, true);
            jc = JAXBContextFactory.createContext(new Class[]{Filme.class}, props);
        } else if (contentType.indexOf("xml") != -1) {
            jc = JAXBContext.newInstance("br.com.argonavis.filme");
        } else { // text/plain
            throw new JAXBException("Unsupported media type: " + contentType);
        }
        return jc;
    }

    private Filme getRequestBody(HttpServletRequest request) throws JAXBException, IOException {
        BufferedReader in = new BufferedReader(request.getReader());
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        String dataString = sb.toString();
        String contentType = request.getContentType();
        JAXBContext jc = getJAXBContext(contentType);
        Unmarshaller u = jc.createUnmarshaller();

        Object result = u.unmarshal(new StringReader(dataString));
        Filme f;
        if (result instanceof JAXBElement) {
            f = (Filme) ((JAXBElement) result).getValue();
        } else {
            f = (Filme) result;
        }
        return f;
    }
    
    private void sendResponseList(List<Filme> collection, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JAXBException {
        Marshaller m = getMarshaller(request, response);
        m.setProperty(Marshaller.JAXB_FRAGMENT, true);

        String wrapperBegin = "[";
        String wrapperEnd = "]";

        String mediaType = response.getContentType();

        if (mediaType.indexOf("application/xml") != -1) {
            wrapperBegin = "<filmes>";
            wrapperEnd = "</filmes>";
        }

        PrintWriter out = response.getWriter();
        out.write(wrapperBegin);
        for (Filme filme : collection) {
            m.marshal(filme, out);
        }
        out.write(wrapperEnd);
    }
    
    // OPERACOES
    

    private void getFilmeById(String pathParam, HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        Filme filme = em.find(Filme.class, Long.parseLong(pathParam));
        Marshaller m = getMarshaller(request, response);
        m.marshal(filme, response.getOutputStream());
    }

    private void getFilmeByImdb(String pathParam, HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        String jpql = "select filme from Filme filme where filme.imdb = :imdb";
        Query query = em.createQuery(jpql);
        String imdb = pathParam.split("\\/")[1];
        query.setParameter("imdb", imdb);

        Filme filme = (Filme) query.getSingleResult();
        Marshaller m = getMarshaller(request, response);
        m.marshal(filme, response.getOutputStream());
    }

    private void getFilmesByRange(String pathParam, HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        int[] range = new int[2];
        String[] rangeComponents = pathParam.split("\\/");
        range[0] = Integer.parseInt(rangeComponents[0]);
        range[1] = Integer.parseInt(rangeComponents[1]);

        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Filme.class));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);

        List<Filme> result = q.getResultList();
        sendResponseList(result, request, response);
    }

    private void getFilmes(HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Filme.class));

        List<Filme> result = em.createQuery(cq).getResultList();
        sendResponseList(result, request, response);
    }

    private void getFilmesCount(HttpServletResponse response) throws IOException {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Filme> rt = cq.from(Filme.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);

        int result = ((Long) q.getSingleResult()).intValue();
        try (PrintWriter out = response.getWriter()) {
            out.write(result);
        }
    }

    private void getFilmesByDiretor(String pathParam, HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        String jpql = "select filme from Filme filme where lower(filme.diretor) like :diretor";
        Query query = em.createQuery(jpql);
        String diretor = pathParam.split("\\/")[1];
        query.setParameter("diretor", "%" + diretor.toLowerCase() + "%");
        List<Filme> result = query.getResultList();
        sendResponseList(result, request, response);
    }

    private void getFilmesByTitulo(String pathParam, HttpServletRequest request, HttpServletResponse response) throws ServletException, JAXBException, IOException {
        String jpql = "select filme from Filme filme where lower(filme.titulo) like :titulo";
        Query query = em.createQuery(jpql);
        String titulo = pathParam.split("\\/")[1];
        query.setParameter("titulo", "%" + titulo.toLowerCase() + "%");
        List<Filme> result = query.getResultList();
        sendResponseList(result, request, response);
    }

}
