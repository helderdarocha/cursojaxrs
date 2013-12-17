
package com.argonavis.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientFactory;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import org.glassfish.jersey.uri.UriTemplate;

@Generated(value = {
    "wadl|http://localhost:8080/FestivalDeCinema/webapi/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2013-12-05T14:39:22.999-02:00")
public class Localhost_FestivalDeCinemaWebapi {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://localhost:8080/FestivalDeCinema/webapi/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = Localhost_FestivalDeCinemaWebapi.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static Localhost_FestivalDeCinemaWebapi.Exibicao exibicao(Client client, URI baseURI) {
        return new Localhost_FestivalDeCinemaWebapi.Exibicao(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(Configurable cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static Client createClientInstance() {
        return ClientFactory.newClient();
    }

    /**
     * Create a new Client instance
     * 
     */
    public static Client createClient() {
        Client client = createClientInstance();
        customizeClientConfiguration(client);
        return client;
    }

    public static Localhost_FestivalDeCinemaWebapi.Exibicao exibicao() {
        return exibicao(createClient(), BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Exibicao exibicao(Client client) {
        return exibicao(client, BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Sala sala(Client client, URI baseURI) {
        return new Localhost_FestivalDeCinemaWebapi.Sala(client, baseURI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Sala sala() {
        return sala(createClient(), BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Sala sala(Client client) {
        return sala(client, BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Assento assento(Client client, URI baseURI) {
        return new Localhost_FestivalDeCinemaWebapi.Assento(client, baseURI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Assento assento() {
        return assento(createClient(), BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Assento assento(Client client) {
        return assento(client, BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Filme filme(Client client, URI baseURI) {
        return new Localhost_FestivalDeCinemaWebapi.Filme(client, baseURI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Filme filme() {
        return filme(createClient(), BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.Filme filme(Client client) {
        return filme(client, BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.ApplicationWadl applicationWadl(Client client, URI baseURI) {
        return new Localhost_FestivalDeCinemaWebapi.ApplicationWadl(client, baseURI);
    }

    public static Localhost_FestivalDeCinemaWebapi.ApplicationWadl applicationWadl() {
        return applicationWadl(createClient(), BASE_URI);
    }

    public static Localhost_FestivalDeCinemaWebapi.ApplicationWadl applicationWadl(Client client) {
        return applicationWadl(client, BASE_URI);
    }

    public static class ApplicationWadl {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private ApplicationWadl(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public ApplicationWadl(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("application.wadl");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsVndSunWadlXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsVndSunWadlXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T options(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T options(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Localhost_FestivalDeCinemaWebapi.ApplicationWadl.Path path(String path) {
            return new Localhost_FestivalDeCinemaWebapi.ApplicationWadl.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Path(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/application.wadl/{path}");
                } else {
                    template.append("application.wadl/{path}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get path
             * 
             */
            public String getPath() {
                return ((String) _templateAndMatrixParameterValues.get("path"));
            }

            /**
             * Duplicate state and set path
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.ApplicationWadl.Path setPath(String path) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("path", path);
                return new Localhost_FestivalDeCinemaWebapi.ApplicationWadl.Path(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Assento {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Assento(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Assento(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("assento");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public Response postXml(com.argonavis.client.Assento input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "assento"), com.argonavis.client.Assento.class, input), "application/xml")).invoke();
            return response;
        }

        public<T >T postXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postJson(com.argonavis.client.Assento input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "assento"), com.argonavis.client.Assento.class, input), "application/json")).invoke();
            return response;
        }

        public<T >T postJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Assento getAsAssentoXml() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Assento.class);
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Assento getAsAssentoJson() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Assento.class);
        }

        public<T >T getAsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T options(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T options(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Localhost_FestivalDeCinemaWebapi.Assento.Count count() {
            return new Localhost_FestivalDeCinemaWebapi.Assento.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_FestivalDeCinemaWebapi.Assento.Id id(Long id) {
            return new Localhost_FestivalDeCinemaWebapi.Assento.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_FestivalDeCinemaWebapi.Assento.FromTo fromTo(Integer from, Integer to) {
            return new Localhost_FestivalDeCinemaWebapi.Assento.FromTo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), from, to);
        }

        public static class Count {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class FromTo {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private FromTo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public FromTo(Client client, URI baseUri, Integer from, Integer to) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{from}/{to}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("from", from);
                _templateAndMatrixParameterValues.put("to", to);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public FromTo(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/assento/{from}/{to}");
                } else {
                    template.append("assento/{from}/{to}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get from
             * 
             */
            public Integer getFrom() {
                return ((Integer) _templateAndMatrixParameterValues.get("from"));
            }

            /**
             * Duplicate state and set from
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Assento.FromTo setFrom(Integer from) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("from", from);
                return new Localhost_FestivalDeCinemaWebapi.Assento.FromTo(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get to
             * 
             */
            public Integer getTo() {
                return ((Integer) _templateAndMatrixParameterValues.get("to"));
            }

            /**
             * Duplicate state and set to
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Assento.FromTo setTo(Integer to) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("to", to);
                return new Localhost_FestivalDeCinemaWebapi.Assento.FromTo(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Assento getAsAssentoXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Assento.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Assento getAsAssentoJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Assento.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/assento/{id}");
                } else {
                    template.append("assento/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Assento.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_FestivalDeCinemaWebapi.Assento.Id(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Assento getAsAssentoXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Assento.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Assento getAsAssentoJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Assento.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putXml(com.argonavis.client.Assento input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "assento"), com.argonavis.client.Assento.class, input), "application/xml")).invoke();
                return response;
            }

            public<T >T putXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putJson(com.argonavis.client.Assento input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "assento"), com.argonavis.client.Assento.class, input), "application/json")).invoke();
                return response;
            }

            public<T >T putJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response delete() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                return response;
            }

            public<T >T delete(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T delete(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Exibicao {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Exibicao(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Exibicao(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("exibicao");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public Response postXml(com.argonavis.client.Exibicao input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "exibicao"), com.argonavis.client.Exibicao.class, input), "application/xml")).invoke();
            return response;
        }

        public<T >T postXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postJson(com.argonavis.client.Exibicao input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "exibicao"), com.argonavis.client.Exibicao.class, input), "application/json")).invoke();
            return response;
        }

        public<T >T postJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Exibicao getAsExibicaoXml() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Exibicao.class);
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Exibicao getAsExibicaoJson() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Exibicao.class);
        }

        public<T >T getAsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T options(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T options(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Localhost_FestivalDeCinemaWebapi.Exibicao.Id id(Long id) {
            return new Localhost_FestivalDeCinemaWebapi.Exibicao.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo fromTo(Integer from, Integer to) {
            return new Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), from, to);
        }

        public Localhost_FestivalDeCinemaWebapi.Exibicao.Count count() {
            return new Localhost_FestivalDeCinemaWebapi.Exibicao.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Count {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class FromTo {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private FromTo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public FromTo(Client client, URI baseUri, Integer from, Integer to) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{from}/{to}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("from", from);
                _templateAndMatrixParameterValues.put("to", to);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public FromTo(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/exibicao/{from}/{to}");
                } else {
                    template.append("exibicao/{from}/{to}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get from
             * 
             */
            public Integer getFrom() {
                return ((Integer) _templateAndMatrixParameterValues.get("from"));
            }

            /**
             * Duplicate state and set from
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo setFrom(Integer from) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("from", from);
                return new Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get to
             * 
             */
            public Integer getTo() {
                return ((Integer) _templateAndMatrixParameterValues.get("to"));
            }

            /**
             * Duplicate state and set to
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo setTo(Integer to) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("to", to);
                return new Localhost_FestivalDeCinemaWebapi.Exibicao.FromTo(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Exibicao getAsExibicaoXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Exibicao.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Exibicao getAsExibicaoJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Exibicao.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/exibicao/{id}");
                } else {
                    template.append("exibicao/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Exibicao.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_FestivalDeCinemaWebapi.Exibicao.Id(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Exibicao getAsExibicaoXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Exibicao.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Exibicao getAsExibicaoJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Exibicao.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putXml(com.argonavis.client.Exibicao input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "exibicao"), com.argonavis.client.Exibicao.class, input), "application/xml")).invoke();
                return response;
            }

            public<T >T putXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putJson(com.argonavis.client.Exibicao input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "exibicao"), com.argonavis.client.Exibicao.class, input), "application/json")).invoke();
                return response;
            }

            public<T >T putJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response delete() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                return response;
            }

            public<T >T delete(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T delete(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Filme {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Filme(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Filme(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("filme");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public com.argonavis.client.Filme getAsFilmeXml() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Filme.class);
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Filme getAsFilmeJson() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Filme.class);
        }

        public<T >T getAsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postXml(com.argonavis.client.Filme input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "filme"), com.argonavis.client.Filme.class, input), "application/xml")).invoke();
            return response;
        }

        public<T >T postXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postJson(com.argonavis.client.Filme input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "filme"), com.argonavis.client.Filme.class, input), "application/json")).invoke();
            return response;
        }

        public<T >T postJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T options(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T options(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.Count count() {
            return new Localhost_FestivalDeCinemaWebapi.Filme.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.DiretorDiretor diretorDiretor(String diretor) {
            return new Localhost_FestivalDeCinemaWebapi.Filme.DiretorDiretor(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), diretor);
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.Id id(Long id) {
            return new Localhost_FestivalDeCinemaWebapi.Filme.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.ImdbImdb imdbImdb(String imdb) {
            return new Localhost_FestivalDeCinemaWebapi.Filme.ImdbImdb(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), imdb);
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.TituloTitulo tituloTitulo(String titulo) {
            return new Localhost_FestivalDeCinemaWebapi.Filme.TituloTitulo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), titulo);
        }

        public Localhost_FestivalDeCinemaWebapi.Filme.FromTo fromTo(Integer from, Integer to) {
            return new Localhost_FestivalDeCinemaWebapi.Filme.FromTo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), from, to);
        }

        public static class Count {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class DiretorDiretor {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private DiretorDiretor(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public DiretorDiretor(Client client, URI baseUri, String diretor) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("diretor/{diretor}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("diretor", diretor);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public DiretorDiretor(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/filme/diretor/{diretor}");
                } else {
                    template.append("filme/diretor/{diretor}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get diretor
             * 
             */
            public String getDiretor() {
                return ((String) _templateAndMatrixParameterValues.get("diretor"));
            }

            /**
             * Duplicate state and set diretor
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.DiretorDiretor setDiretor(String diretor) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("diretor", diretor);
                return new Localhost_FestivalDeCinemaWebapi.Filme.DiretorDiretor(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Filme getAsFilmeXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Filme getAsFilmeJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class FromTo {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private FromTo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public FromTo(Client client, URI baseUri, Integer from, Integer to) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{from}/{to}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("from", from);
                _templateAndMatrixParameterValues.put("to", to);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public FromTo(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/filme/{from}/{to}");
                } else {
                    template.append("filme/{from}/{to}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get from
             * 
             */
            public Integer getFrom() {
                return ((Integer) _templateAndMatrixParameterValues.get("from"));
            }

            /**
             * Duplicate state and set from
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.FromTo setFrom(Integer from) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("from", from);
                return new Localhost_FestivalDeCinemaWebapi.Filme.FromTo(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get to
             * 
             */
            public Integer getTo() {
                return ((Integer) _templateAndMatrixParameterValues.get("to"));
            }

            /**
             * Duplicate state and set to
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.FromTo setTo(Integer to) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("to", to);
                return new Localhost_FestivalDeCinemaWebapi.Filme.FromTo(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Filme getAsFilmeXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Filme getAsFilmeJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/filme/{id}");
                } else {
                    template.append("filme/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_FestivalDeCinemaWebapi.Filme.Id(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Filme getAsFilmeXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Filme getAsFilmeJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response delete() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                return response;
            }

            public<T >T delete(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T delete(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putXml(com.argonavis.client.Filme input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "filme"), com.argonavis.client.Filme.class, input), "application/xml")).invoke();
                return response;
            }

            public<T >T putXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putJson(com.argonavis.client.Filme input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "filme"), com.argonavis.client.Filme.class, input), "application/json")).invoke();
                return response;
            }

            public<T >T putJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class ImdbImdb {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private ImdbImdb(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public ImdbImdb(Client client, URI baseUri, String imdb) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("imdb/{imdb}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("imdb", imdb);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public ImdbImdb(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/filme/imdb/{imdb}");
                } else {
                    template.append("filme/imdb/{imdb}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get imdb
             * 
             */
            public String getImdb() {
                return ((String) _templateAndMatrixParameterValues.get("imdb"));
            }

            /**
             * Duplicate state and set imdb
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.ImdbImdb setImdb(String imdb) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("imdb", imdb);
                return new Localhost_FestivalDeCinemaWebapi.Filme.ImdbImdb(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Filme getAsFilmeXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Filme getAsFilmeJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class TituloTitulo {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private TituloTitulo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public TituloTitulo(Client client, URI baseUri, String titulo) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("titulo/{titulo}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("titulo", titulo);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public TituloTitulo(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/filme/titulo/{titulo}");
                } else {
                    template.append("filme/titulo/{titulo}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get titulo
             * 
             */
            public String getTitulo() {
                return ((String) _templateAndMatrixParameterValues.get("titulo"));
            }

            /**
             * Duplicate state and set titulo
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Filme.TituloTitulo setTitulo(String titulo) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("titulo", titulo);
                return new Localhost_FestivalDeCinemaWebapi.Filme.TituloTitulo(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Filme getAsFilmeXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Filme getAsFilmeJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Filme.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Sala {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Sala(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Sala(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("sala");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public com.argonavis.client.Sala getAsSalaXml() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Sala.class);
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public com.argonavis.client.Sala getAsSalaJson() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(com.argonavis.client.Sala.class);
        }

        public<T >T getAsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postXml(com.argonavis.client.Sala input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "sala"), com.argonavis.client.Sala.class, input), "application/xml")).invoke();
            return response;
        }

        public<T >T postXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Response postJson(com.argonavis.client.Sala input) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "sala"), com.argonavis.client.Sala.class, input), "application/json")).invoke();
            return response;
        }

        public<T >T postJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T options(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (response.getStatus()>= 400) {
                throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T options(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
            Response response;
            response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public Localhost_FestivalDeCinemaWebapi.Sala.FromTo fromTo(Integer from, Integer to) {
            return new Localhost_FestivalDeCinemaWebapi.Sala.FromTo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), from, to);
        }

        public Localhost_FestivalDeCinemaWebapi.Sala.Count count() {
            return new Localhost_FestivalDeCinemaWebapi.Sala.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_FestivalDeCinemaWebapi.Sala.Id id(Long id) {
            return new Localhost_FestivalDeCinemaWebapi.Sala.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_FestivalDeCinemaWebapi.Sala.NomeNome nomeNome(String nome) {
            return new Localhost_FestivalDeCinemaWebapi.Sala.NomeNome(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), nome);
        }

        public static class Count {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class FromTo {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private FromTo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public FromTo(Client client, URI baseUri, Integer from, Integer to) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{from}/{to}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("from", from);
                _templateAndMatrixParameterValues.put("to", to);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public FromTo(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/sala/{from}/{to}");
                } else {
                    template.append("sala/{from}/{to}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get from
             * 
             */
            public Integer getFrom() {
                return ((Integer) _templateAndMatrixParameterValues.get("from"));
            }

            /**
             * Duplicate state and set from
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Sala.FromTo setFrom(Integer from) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("from", from);
                return new Localhost_FestivalDeCinemaWebapi.Sala.FromTo(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get to
             * 
             */
            public Integer getTo() {
                return ((Integer) _templateAndMatrixParameterValues.get("to"));
            }

            /**
             * Duplicate state and set to
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Sala.FromTo setTo(Integer to) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("to", to);
                return new Localhost_FestivalDeCinemaWebapi.Sala.FromTo(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Sala getAsSalaXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Sala getAsSalaJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/sala/{id}");
                } else {
                    template.append("sala/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Sala.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_FestivalDeCinemaWebapi.Sala.Id(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Sala getAsSalaXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Sala getAsSalaJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response delete() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                return response;
            }

            public<T >T delete(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T delete(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putXml(com.argonavis.client.Sala input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "sala"), com.argonavis.client.Sala.class, input), "application/xml")).invoke();
                return response;
            }

            public<T >T putXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Response putJson(com.argonavis.client.Sala input) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "sala"), com.argonavis.client.Sala.class, input), "application/json")).invoke();
                return response;
            }

            public<T >T putJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class NomeNome {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private NomeNome(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public NomeNome(Client client, URI baseUri, String nome) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("nome/{nome}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("nome", nome);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public NomeNome(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/sala/nome/{nome}");
                } else {
                    template.append("sala/nome/{nome}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get nome
             * 
             */
            public String getNome() {
                return ((String) _templateAndMatrixParameterValues.get("nome"));
            }

            /**
             * Duplicate state and set nome
             * 
             */
            public Localhost_FestivalDeCinemaWebapi.Sala.NomeNome setNome(String nome) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("nome", nome);
                return new Localhost_FestivalDeCinemaWebapi.Sala.NomeNome(_client, copyUriBuilder, copyMap);
            }

            public com.argonavis.client.Sala getAsSalaXml() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public com.argonavis.client.Sala getAsSalaJson() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(com.argonavis.client.Sala.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsVndSunWadlXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsVndSunWadlXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.sun.wadl+xml");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T optionsAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T optionsAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T options(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T options(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("OPTIONS", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_FestivalDeCinemaWebapi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
