/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.festivalclient;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author helderdarocha
 */
public class CriarExibicoesClient {

    public static String createExibicao(String dataExibicao, String horaExibicao, int duracao, String filme, String sala) throws IOException {
        
        String jsonFilme = getFilme(filme);
        String jsonSala  = getSala(sala);
        
        
        StringBuilder json = new StringBuilder();
        json.append("{")
                .append("\"id\":0,")
                .append("\"duracao\":")
                .append(duracao)
                .append(",")
                .append("\"filme\":")
                .append(jsonFilme)
                .append(",")
                .append("\"salaExibicao\":")
                .append(jsonSala)
                .append(",")
                .append("\"dataExibicao\":\"")
                .append(dataExibicao)
                .append("\",\"horaExibicao\":\"")
                .append(horaExibicao)
                .append("\"}");
        System.out.println(json);
        return json.toString();

    }
    
    public static String getFilme(String imdb) throws IOException {
        GetMethod method = new GetMethod("http://localhost:8080/FestivalDeCinema/webapi/filme/imdb/"+imdb);
        method.addRequestHeader("Accept", "application/json");
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
        String response = method.getResponseBodyAsString();
        return response;
    }
    
    public static String getSala(String nome) throws IOException {
        GetMethod method = new GetMethod("http://localhost:8080/FestivalDeCinema/webapi/sala/nome/"+nome);
        method.addRequestHeader("Accept", "application/json");
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
        String response = method.getResponseBodyAsString();
        return response;
    }

    public static void postData(String json) throws IOException {
        PostMethod method = new PostMethod("http://localhost:8080/FestivalDeCinema/webapi/exibicao");
        method.addRequestHeader("Content-type", "application/json");
        RequestEntity entity = new StringRequestEntity(json);
        method.setRequestEntity(entity);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }

    public static long createDateTime(int Y, int M, int D, int h, int m) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, Y);
        calendar.set(Calendar.MONTH, M - 1);
        calendar.set(Calendar.DAY_OF_MONTH, D);
        calendar.set(Calendar.HOUR_OF_DAY, h);
        calendar.set(Calendar.MINUTE, m);
        return calendar.getTime().getTime();
    }

    public static void main(String[] args) throws IOException {

        postData(createExibicao("2014-06-01", "12:00", 3, "tt0081505", "Sala%201"));
        postData(createExibicao("2014-06-01", "15:00", 3, "tt0069293", "Sala%202"));
        postData(createExibicao("2014-06-01", "18:00", 3, "tt0457430", "Sala%203"));
        postData(createExibicao("2014-06-01", "21:00", 6, "tt1937390", "Sala%204"));
        
        

    }

}
