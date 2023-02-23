package eci.arep.services;

import eci.arep.HTTPServer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        HTTPServer server = HTTPServer.getInstance();
        server.addServices("/index", new RESTHtml());
        server.addServices("/css", new RESTCss());
        server.addServices("/img", new RESTJpg());
        server.addServices("/script", new RESTjs());
        server.run(args);
    }
}
