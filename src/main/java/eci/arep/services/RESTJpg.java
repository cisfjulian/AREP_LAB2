package eci.arep.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class RESTJpg implements RESTService{
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: image/jpg\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() {
        String content = null;
        try {
            Path file = new File("src/main/resources/img.png").toPath();
            content = Files.probeContentType(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

