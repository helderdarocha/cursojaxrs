/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.festivalclient;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author helderdarocha
 */
public class CriarSalasClient {
    
        
    public static String createSala(String nome, int rows, int cols) {
        if (rows > 26) rows = 26;
        
        StringBuilder assentos = new StringBuilder();
        int lotacao = 0;
        for (char r = 'A'; r <= (char)('A'+rows-1); r++) {
            for (int c = 1; c <= cols; c++) {
                assentos.append("{\"assento\":{\"id\":0,\"nome\":\"")
                        .append(r)
                        .append(c)
                        .append("\",\"ocupado\":false}}");
                ++lotacao;
                if (!(r == ('A'+rows-1) && c == cols)) {
                    assentos.append(",");
                }
            }
        }
        StringBuilder json = new StringBuilder();
        json.append("{\"id\":0,\"nome\":\"")
             .append(nome)
             .append("\",\"lotacao\":")
             .append(lotacao)
             .append(",\"exibicoes\":[")
             .append("],\"assentos\":[")
             .append(assentos.toString())
             .append("]}");
        System.out.println(json);
        return json.toString();
    }
    
    public static void sendRequest(String json) throws IOException {
        PostMethod method = new PostMethod("http://localhost:8080/FestivalDeCinema/webapi/sala");
        method.addRequestHeader("Content-type", "application/json");
        RequestEntity entity = new StringRequestEntity(json);
        method.setRequestEntity(entity);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }

    public static void main(String[] args) throws IOException {

        sendRequest(createSala("Sala 1", 26, 35));
        sendRequest(createSala("Sala 2", 26, 70));
        sendRequest(createSala("Sala 3", 18, 30));
        sendRequest(createSala("Sala 4", 10, 10));
        
    }


}
