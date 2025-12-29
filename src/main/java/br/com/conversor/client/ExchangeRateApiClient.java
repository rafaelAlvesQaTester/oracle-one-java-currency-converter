package br.com.conversor.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public class ExchangeRateApiClient {

    private static final String API_KEY;
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    // Carregar a API_KEY do arquivo config.properties
    static {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("config.properties"));
            API_KEY = prop.getProperty("API_KEY");
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível carregar a API_KEY do config.properties", e);
        }
    }

    // Método para obter as taxas de câmbio a partir da moeda base
    public JsonObject getExchangeRates(String baseCurrency) {
        try {
            String urlStr = BASE_URL + API_KEY + "/latest/" + baseCurrency;
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser parser = new JsonParser();
            JsonElement root = parser.parse(new InputStreamReader(request.getInputStream()));
            return root.getAsJsonObject();

        } catch (Exception e) {
            System.out.println("Erro ao acessar API: " + e.getMessage());
            return null;
        }
    }
}
