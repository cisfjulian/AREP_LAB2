package eci.arep.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RESTCss implements RESTService{
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/css\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() {
        byte[] content = new byte[0];
//        String answer;
        try {
            Path file = Paths.get("src/main/resources/style.css");
            content = Files.readAllBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(content);
    }
}
