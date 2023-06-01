package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/currencies")
public class CurrencyResourceImpl {
    @GET
    @Path("/{code}")
    @Produces(MediaType.APPLICATION_JSON)
    public RestCurrency getCurrency(@PathParam("code") String code) {
        System.out.println("CurrencyResourceImpl called");
        switch (code) {
            case "EUR" -> {
                return new RestCurrency("EUR", 2);
            }
            case "USD" -> {
                return new RestCurrency("USD", 2);
            }
        }
        return null;
    }
}
