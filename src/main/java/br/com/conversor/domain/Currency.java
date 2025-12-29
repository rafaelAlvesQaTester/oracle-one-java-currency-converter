package br.com.conversor.domain;

public enum Currency {

    BRL("BRL", "Real Brasileiro"),
    ARS("ARS", "Peso Argentino"),
    BOB("BOB", "Boliviano"),
    CLP("CLP", "Peso Chileno"),
    COP("COP", "Peso Colombiano"),
    USD("USD", "Dólar Americano"),
    CAD("CAD", "Dólar Canadense"),
    MXN("MXN", "Peso Mexicano"),
    EUR("EUR", "Euro");

    private final String code;
    private final String description;

    Currency(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
