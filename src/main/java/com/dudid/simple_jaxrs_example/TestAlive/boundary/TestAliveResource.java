package com.dudid.simple_jaxrs_example.TestAlive.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/test-alive")
public class TestAliveResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getTestAliveJson() {

        final Map<String, String> response = new HashMap<>();
        response.put("data", "Endpoint is alive");

        return response;
    }
}
