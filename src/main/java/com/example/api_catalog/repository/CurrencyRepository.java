package com.example.api_catalog.repository;

import com.example.api_catalog.entity.Currency;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
    // General queries
    List<Currency> findByCode(String code);
    List<Currency> findByCodeAndDescription(String code, String description);


}
