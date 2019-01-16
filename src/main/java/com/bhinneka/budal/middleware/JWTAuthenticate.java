/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal.middleware;

import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

/**
 *
 * @author wurianto
 */
public class JWTAuthenticate extends Authenticator {

    @Override
    public Result authenticate(HttpExchange e) {
        Headers headers = e.getRequestHeaders();
        System.out.println(headers.getFirst("Authorization"));
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
