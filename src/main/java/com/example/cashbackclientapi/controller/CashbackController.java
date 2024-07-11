package com.example.cashbackclientapi.controller;

import com.example.cashbackclientapi.service.CashbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashbackController {
    private final CashbackService cashbackService;

    public CashbackController(CashbackService cashbackService) {
        this.cashbackService = cashbackService;
    }
    @GetMapping("/calculate-cashback")
    public Double getCashback(@RequestParam("transactionAmount") Double transactionAmount) {
        return cashbackService.calculateCashback(transactionAmount);
    }
}
