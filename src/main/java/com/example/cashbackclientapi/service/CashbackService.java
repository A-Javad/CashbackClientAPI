package com.example.cashbackclientapi.service;

import com.example.cashbackclientapi.client.CashbackClient;
import org.springframework.stereotype.Service;

@Service
public class CashbackService {
    private final CashbackClient cashbackClient;


    public CashbackService(CashbackClient cashbackClient) {
        this.cashbackClient = cashbackClient;
    }

    public Double calculateCashback(Double transactionAmount) {
        return cashbackClient.getCashbackAmount(transactionAmount);
    }
}
