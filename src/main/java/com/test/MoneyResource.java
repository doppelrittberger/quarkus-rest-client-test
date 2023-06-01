package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/money")
public interface MoneyResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Money getMoney();
}
