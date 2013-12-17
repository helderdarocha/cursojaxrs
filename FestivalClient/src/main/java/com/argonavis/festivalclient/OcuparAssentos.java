/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.festivalclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PutMethod;

/**
 *
 * @author helderdarocha
 */
public class OcuparAssentos {

    public static void put(long id, String xml) throws IOException {
        PutMethod method = new PutMethod("http://localhost:8080/FestivalDeCinema/webapi/assento/" + id);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }

    public static List<Long> getAssentoIDs(String sala) throws IOException {
        GetMethod method = new GetMethod("http://localhost:8080/FestivalDeCinema/webapi/sala/nome/"+sala);
        method.addRequestHeader("Accept", "application/xml");
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
        String response = method.getResponseBodyAsString();
        List<Long> ids = new ArrayList<>();
        // use XPath to get all assento IDs
        
        
        return ids;
    }
    
    public static String getAssentoAsXml(Long id) throws IOException {
        GetMethod method = new GetMethod("http://localhost:8080/FestivalDeCinema/webapi/assento/"+id);
        method.addRequestHeader("Accept", "application/xml");
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
        String xml = method.getResponseBodyAsString();
        return xml;
    }
    
    public static String ocuparAssento(String xml) {
        // use JAXP/DOM to change the contents of <ocupado>
        return xml;
    }

    public static void main(String[] args) throws IOException {
        // Ocupar metade dos assentos da sala 1
        List<Long> idsSala1 = getAssentoIDs("Sala 1");
        int ocupados = 0;
        for(Long id : idsSala1) {
            if (ocupados == idsSala1.size()/2) {
                break;
            }
            String xml = ocuparAssento(getAssentoAsXml(id));
            put(id, xml);
            ++ocupados;
        }
    }
}
