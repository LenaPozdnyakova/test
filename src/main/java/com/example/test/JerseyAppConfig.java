package com.example.test;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyAppConfig extends ResourceConfig {

    public JerseyAppConfig(){
        packages("com.example.test.resources");
    }
}
