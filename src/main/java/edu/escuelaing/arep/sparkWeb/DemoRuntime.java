package edu.escuelaing.arep.sparkWeb;
import  edu.escuelaing.arep.httpserver.HttpServer;

import java.io.IOException;

public class DemoRuntime {
    public static void main(String[] args) throws IOException {
      HttpServer server = new HttpServer();
      server.start();
    }
}
