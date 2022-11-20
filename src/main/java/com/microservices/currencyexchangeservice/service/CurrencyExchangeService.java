package com.microservices.currencyexchangeservice.service;

import com.microservices.currencyexchangeservice.bean.CurrencyExchange;

import java.util.List;

public interface CurrencyExchangeService {
    List<CurrencyExchange> finAll();

    CurrencyExchange findByFromAndTo(String from, String to);
}
