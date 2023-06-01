package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/money")
public class MoneyResourceImpl {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Money getMoney() {
        System.out.println("MoneyResourceImpl called");
        return new Money(new Currency("EUR", 2), 1);
    }
}
