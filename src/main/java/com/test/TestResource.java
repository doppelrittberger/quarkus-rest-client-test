package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {
    private final MoneyResource moneyResource;

    public TestResource(MoneyResource moneyResource) {
        this.moneyResource = moneyResource;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Money getMoney() {
        System.out.println("TestResource called");
        return moneyResource.getMoney();
    }
}
