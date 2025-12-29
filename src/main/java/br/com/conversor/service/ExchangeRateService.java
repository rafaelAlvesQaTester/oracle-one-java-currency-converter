package br.com.conversor.service;

import br.com.conversor.client.ExchangeRateApiClient;
import com.google.gson.JsonObject;

public class ExchangeRateService {

    private final ExchangeRateApiClient apiClient;

    public ExchangeRateService() {
        this.apiClient = new ExchangeRateApiClient();
    }

    /**
     * Converte um valor de uma moeda para outra
     *
     * @param fromCurrency Código da moeda de origem (ex: "USD")
     * @param toCurrency Código da moeda de destino (ex: "BRL")
     * @param amount Valor a ser convertido
     * @return valor convertido, ou -1 em caso de erro
     */
    public double convert(String fromCurrency, String toCurrency, double amount) {
        JsonObject response = apiClient.getExchangeRates(fromCurrency);

        if (response != null && "success".equalsIgnoreCase(response.get("result").getAsString())) {
            JsonObject rates = response.getAsJsonObject("conversion_rates");

            if (rates.has(toCurrency)) {
                double rate = rates.get(toCurrency).getAsDouble();
                return amount * rate;
            } else {
                System.out.println("Moeda de destino não encontrada: " + toCurrency);
            }
        } else {
            System.out.println("Erro ao obter taxas de câmbio.");
        }

        return -1; // indica erro
    }
}
