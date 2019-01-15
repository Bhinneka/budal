package com.bhinneka.budal;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by Wuriyanto 15 01 2019
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        int serverPort = 9000;
        
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(serverPort), 0);
        
        httpServer.createContext("/", new IndexHandler());
        
        httpServer.setExecutor(null);
        httpServer.start();
        

    }
}
