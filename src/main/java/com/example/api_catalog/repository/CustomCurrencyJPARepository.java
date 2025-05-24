package com.example.api_catalog.repository;

import com.example.api_catalog.entity.Currency;

import java.util.List;

public interface CustomCurrencyJPARepository {
    List<Currency> myCustomFindMethod(String code);
}
