package com.example.cashbackclientapi.client;

import com.example.cashbackclientapi.model.CashbackResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CashbackClient {
    private final RestTemplate restTemplate;
    private static final String CASHBACK_API_URL = "https://api.example.com/api/cashback";

    public CashbackClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Double getCashbackAmount(Double transactionAmount) {
        String url = UriComponentsBuilder.fromHttpUrl(CASHBACK_API_URL)
                .queryParam("transactionAmount", transactionAmount)
                .toUriString();
        CashbackResponse response = restTemplate.getForObject(url, CashbackResponse.class);
        return response != null ? response.getCashbackAmount() : null;

    }
}
