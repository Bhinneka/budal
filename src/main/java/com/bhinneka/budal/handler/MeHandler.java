/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal.handler;

import com.bhinneka.budal.utils.Utils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

/**
 *
 * @author wurianto
 */
public class MeHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange e) throws IOException {

        String responseText = "me";

        Utils.writeResponse(200, e, responseText.getBytes());
    }

}
