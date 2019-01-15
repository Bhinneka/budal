/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal;

import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wurianto
 */
public class Utils {

    public static Map<String, String> queryToMap(String query) {
        Map<String, String> results = new HashMap<>();
        for (String param : query.split("&")) {
            String pair[] = param.split("=");
            if (pair.length > 1) {
                results.put(pair[0], pair[1]);
            } else {
                results.put(pair[0], "");
            }
        }
        return results;
    }

    public static void writeResponse(int httpCode, HttpExchange httpExchange, byte[] response) throws IOException {
        httpExchange.sendResponseHeaders(httpCode, response.length);
        OutputStream os = httpExchange.getResponseBody();
        os.write(response);
        os.close();
    }

}