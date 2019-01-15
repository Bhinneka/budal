/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal.middleware;

import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.HttpExchange;

/**
 *
 * @author wurianto
 */
public class JWTAuthenticate extends Authenticator{

    @Override
    public Result authenticate(HttpExchange he) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
