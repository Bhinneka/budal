package com.bhinneka.budal;

import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;

/**
 * Created by Wuriyanto 15 01 2019
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        Dotenv dotenv = Dotenv.load();

        Server server = new Server(Integer.parseInt(dotenv.get("PORT")));
        server.start();
    }
}
