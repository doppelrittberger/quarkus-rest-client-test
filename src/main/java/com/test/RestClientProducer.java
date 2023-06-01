package com.test;

import io.smallrye.mutiny.infrastructure.Infrastructure;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public class RestClientProducer {
    @Produces
    @ApplicationScoped
    CurrencyResource createCurrencyResource() throws URISyntaxException {
        return RestClientBuilder.newBuilder()
                .baseUri(new URI("http://localhost:8080"))
                .build(CurrencyResource.class);
    }

    @Produces
    @ApplicationScoped
    MoneyResource createMoneyResource() throws URISyntaxException {
        return RestClientBuilder.newBuilder()
                .baseUri(new URI("http://localhost:8080"))
                .build(MoneyResource.class);
    }
}
