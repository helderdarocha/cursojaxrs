/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivalclient;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.DeleteMethod;



public class RemoverExibicao {
    
    public static void delete (long id) throws IOException {
        DeleteMethod method = new DeleteMethod("http://localhost:8080/FestivalDeCinema/webapi/exibicao/" + id);
        HttpClient client = new HttpClient();
        int responseCode = client.executeMethod(method);
        System.out.println("Response code: " + responseCode);
    }
    
    public static void main(String[] args) throws IOException {
        delete(3501);
    }
}
