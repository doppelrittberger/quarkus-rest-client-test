package com.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;

@Singleton
public class RegisterCustomModuleCustomizer implements ObjectMapperCustomizer {
    private final CurrencyResource currencyResource;

    public RegisterCustomModuleCustomizer(CurrencyResource currencyResource) {
        this.currencyResource = currencyResource;
    }

    public void customize(ObjectMapper mapper) {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Currency.class, new CurrencySerializer());
        simpleModule.addDeserializer(Currency.class, new CurrencyDeserializer(currencyResource));
        mapper.registerModule(simpleModule);
    }
}