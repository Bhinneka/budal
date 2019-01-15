/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 *
 * @author wurianto
 */
public class IndexHandler implements HttpHandler{

    
    @Override
    public void handle(HttpExchange e) throws IOException {
        
        URI uri = e.getRequestURI();
        
        String query = uri.getQuery();
        Map<String, String> queries = Utils.queryToMap(query);
        
        System.out.println(queries);
        
        String responseText = "index";
        
        Utils.writeResponse(200, e, responseText.getBytes());
    
    }
    
}