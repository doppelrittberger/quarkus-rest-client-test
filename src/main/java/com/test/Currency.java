package com.test;

public class Currency {
    private final String code;
    private final int precision;

    public Currency(String code, int precision) {
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
        return "Currency{" +
                "code='" + code + '\'' +
                ", precision=" + precision +
                '}';
    }
}
