package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestCurrency {
    private final String code;
    private final int precision;

    public RestCurrency(
            @JsonProperty("code") String code,
            @JsonProperty("precision") int precision) {
        this.code = code;
        this.precision = precision;
    }

    public String getCode() {
        return code;
    }

    public int getPrecision() {
        return precision;
    }

    @Override
    public String toString() {
        return "RestCurrency{" +
                "code='" + code + '\'' +
                ", precision=" + precision +
                '}';
    }
}
