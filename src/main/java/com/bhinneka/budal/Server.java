/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal;

import com.bhinneka.budal.handler.IndexHandler;
import com.bhinneka.budal.handler.MeHandler;
import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.BasicAuthenticator;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 *
 * @author wurianto
 */
public class Server {

    private final HttpServer httpServer;

    public Server(int port) throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(port), 0);
    }

    public void start() {
        this.httpServer.createContext("/", new IndexHandler());
        HttpContext meContext = this.httpServer.createContext("/me", new MeHandler());

        // set basic auth
        Authenticator authenticator = new BasicAuthenticator("myrealm") {
            @Override
            public boolean checkCredentials(String username, String password) {
                return username.equals("wury") && password.equals("12345");
            }
        };
        

        meContext.setAuthenticator(authenticator);

        httpServer.setExecutor(null);
        httpServer.start();
    }

}
