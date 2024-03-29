package br.iesp.edu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static class CompositeResponseTO {
        public BodyTO body;
    }

    private static class BodyTO {
        public String id;
    }

}
