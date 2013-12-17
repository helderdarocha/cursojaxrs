/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.argonavis.servletrest.client;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author helderdarocha
 */
public class CriarFilmesClient {

    public static String createFilme(String titulo, String diretor, String imdb, int ano, int duracao) throws IOException {
        // return null if film exists
        String jsonFilme = getFilme(imdb);
        if (jsonFilme != null) { // already exists!
            return null;
        }
        
        StringBuilder json = new StringBuilder();
        json.append("{\"filme\": {")
                .append("\"id\":0,")
                .append("\"titulo\":\"")
                .append(titulo)
                .append("\",")
                .append("\"diretor\":\"")
                .append(diretor)
                .append("\",")
                .append("\"imdb\":\"")
                .append(imdb)
                .append("\",")
                .append("\"ano\":")
                .append(ano)
                .append(",")
                .append("\"duracao\":")
                .append(duracao)
                .append(",")
                .append("\"exibicoes\":[]")
                .append("}}");
        return json.toString();
    }
    
    public static void postFilme(String json) throws IOException {
        if (json == null) {
            System.out.println("Film already in database!");
            return;
        }
        PostMethod method = new PostMethod("http://localhost:8080/ServletREST/filme");
        method.addRequestHeader("Content-type", "application/json");
        RequestEntity entity = new StringRequestEntity(json);
        method.setRequestEntity(entity);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }
    
    public static String getFilme(String imdb) throws IOException {
        GetMethod method = new GetMethod("http://localhost:8080/ServletREST/filme/imdb/"+imdb);
        method.addRequestHeader("Accept", "application/json");
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        String response = null;
        if(responseCode == HttpStatus.SC_OK) {
            response = method.getResponseBodyAsString();
        }
        return response;
    }
    
    public static void main(String[] args) throws IOException {

        postFilme(createFilme("The Shining", "Stanley Kubrick", "tt0081505", 1980, 144));
        postFilme(createFilme("Melancolia", "Lars von Trier", "tt1527186", 2011, 136));
        postFilme(createFilme("Annie Hall", "Woody Allen", "tt0075686", 1977, 93));
        postFilme(createFilme("Fahrenheit 451", "François Truffaut", "tt0060390", 1966, 112));
        postFilme(createFilme("Nosferatu, eine Symphonie des Grauens", "F. W. Murnau", "tt0013442", 1922, 81));
        postFilme(createFilme("Amarcord", "Frederico Fellini", "tt0071129", 1973, 123));
        postFilme(createFilme("A Clockwork Orange", "Stanley Kubrick", "tt0066921", 1972, 136));
        postFilme(createFilme("La double vie de Véronique", "Krzysztof Kieslowski", "tt0101765", 1991, 98));
        postFilme(createFilme("Solyaris", "Andrei Tarkovsky", "tt0069293", 1972, 167));
        postFilme(createFilme("Jodaeiye Nader az Simin", "Asghar Farhadi", "tt1832382", 2011, 123));
        postFilme(createFilme("Hearat Shulayim", "Joseph Cedar", "tt1445520", 2011, 103));
        postFilme(createFilme("O Som ao Redor", "Kleber Mendonça Filho", "tt2190367", 2012, 131));
        postFilme(createFilme("Un Cuento Chino", "Sebastián Borensztein", "tt1705786", 2011, 93));
        postFilme(createFilme("El Laberinto del Fauno", "Guillermo del Toro", "tt0457430", 2006, 118));
        postFilme(createFilme("Holy Motors", "Leos Carax", "tt2076220", 2012, 115));
        postFilme(createFilme("La Flor de mi Secreto", "Pedro Almodovar", "tt0113083", 1995, 103));
        postFilme(createFilme("La Piel que Habito", "Pedro Almodovar", "tt1189073", 2011, 120));
        postFilme(createFilme("Stalker", "Andrei Tarkovsky", "tt0079944", 1979, 163));
        postFilme(createFilme("Nymphomaniac", "Lars von Trier", "tt1937390", 2013, 330));
        postFilme(createFilme("2001: A Space Odyssey", "Stanley Kubrick", "tt0062622", 1968, 160));
        postFilme(createFilme("The Godfather", "Francis Ford Copolla", "tt0068646", 1972, 175));

    }

}
