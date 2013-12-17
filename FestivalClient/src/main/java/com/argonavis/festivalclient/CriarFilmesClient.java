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
public class CriarFilmesClient {

    public static String createFilme(String titulo, String diretor, String imdb, int ano, int duracao) {
        StringBuilder json = new StringBuilder();
        json.append("{")
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
                .append("}");
        return json.toString();
    }
    
    public static void sendRequest(String json) throws IOException {
        PostMethod method = new PostMethod("http://localhost:8080/FestivalDeCinema/webapi/filme");
        method.addRequestHeader("Content-type", "application/json");
        RequestEntity entity = new StringRequestEntity(json);
        method.setRequestEntity(entity);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }
    
    public static void main(String[] args) throws IOException {

        sendRequest(createFilme("The Shining", "Stanley Kubrick", "tt0081505", 1980, 144));
        sendRequest(createFilme("Melancolia", "Lars von Trier", "tt1527186", 2011, 136));
        sendRequest(createFilme("Annie Hall", "Woody Allen", "tt0075686", 1977, 93));
        sendRequest(createFilme("Fahrenheit 451", "François Truffaut", "tt0060390", 1966, 112));
        sendRequest(createFilme("Nosferatu, eine Symphonie des Grauens", "F. W. Murnau", "tt0013442", 1922, 81));
        sendRequest(createFilme("Amarcord", "Frederico Fellini", "tt0071129", 1973, 123));
        sendRequest(createFilme("A Clockwork Orange", "Stanley Kubrick", "tt0066921", 1972, 136));
        sendRequest(createFilme("La double vie de Véronique", "Krzysztof Kieslowski", "tt0101765", 1991, 98));
        sendRequest(createFilme("Solyaris", "Andrei Tarkovsky", "tt0069293", 1972, 167));
        sendRequest(createFilme("Jodaeiye Nader az Simin", "Asghar Farhadi", "tt1832382", 2011, 123));
        sendRequest(createFilme("Hearat Shulayim", "Joseph Cedar", "tt1445520", 2011, 103));
        sendRequest(createFilme("O Som ao Redor", "Kleber Mendonça Filho", "tt2190367", 2012, 131));
        sendRequest(createFilme("Un Cuento Chino", "Sebastián Borensztein", "tt1705786", 2011, 93));
        sendRequest(createFilme("El Laberinto del Fauno", "Guillermo del Toro", "tt0457430", 2006, 118));
        sendRequest(createFilme("Holy Motors", "Leos Carax", "tt2076220", 2012, 115));
        sendRequest(createFilme("La Flor de mi Secreto", "Pedro Almodovar", "tt0113083", 1995, 103));
        sendRequest(createFilme("La Piel que Habito", "Pedro Almodovar", "tt1189073", 2011, 120));
        sendRequest(createFilme("Stalker", "Andrei Tarkovsky", "tt0079944", 1979, 163));
        sendRequest(createFilme("Nymphomaniac", "Lars von Trier", "tt1937390", 2013, 330));
        sendRequest(createFilme("2001: A Space Odyssey", "Stanley Kubrick", "tt0062622", 1968, 160));
        
    }

}
