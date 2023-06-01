package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/currencies")
public interface CurrencyResource {
    @GET
    @Path("/{code}")
    @Produces(MediaType.APPLICATION_JSON)
    RestCurrency getCurrency(@PathParam("code") String code);
}
