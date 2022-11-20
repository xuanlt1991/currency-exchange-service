package com.microservices.currencyexchangeservice.service.impl;

import com.microservices.currencyexchangeservice.bean.CurrencyExchange;
import com.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;
import com.microservices.currencyexchangeservice.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService  {
    @Autowired
    private CurrencyExchangeRepository repository;

    @Override
    public List<CurrencyExchange> finAll() {
        return repository.findAll();
    }

    @Override
    public CurrencyExchange findByFromAndTo(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}
