package com.howtodoinjava.jerseydemo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by Ext-MayukhG on 9/25/2018.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UserResource.class);
    }
}
