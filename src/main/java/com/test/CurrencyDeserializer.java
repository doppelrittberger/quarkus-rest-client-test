package com.test;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class CurrencyDeserializer extends JsonDeserializer<Currency> {
    private final CurrencyResource currencyResource;

    public CurrencyDeserializer(CurrencyResource currencyResource) {
        this.currencyResource = currencyResource;
    }

    @Override
    public Currency deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        System.out.println("CurrencyDeserializer called");
        RestCurrency restCurrency = currencyResource.getCurrency(jsonParser.getValueAsString());
        return new Currency(restCurrency.getCode(), restCurrency.getPrecision());
    }
}
