package com.example.api_catalog.service;

import com.example.api_catalog.DTO.CurrencyDTO;
import com.example.api_catalog.entity.Currency;
import com.example.api_catalog.mapper.ApiMapper;
import com.example.api_catalog.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrencyService {

    CurrencyRepository repository;

    @Autowired
    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public CurrencyDTO getById(Long id) {
        CurrencyDTO response = null;
        Optional<Currency> currency = repository.findById(id);

        if (currency.isPresent()) {
            response = ApiMapper.INSTANCE.entityToDTO(currency.get());
        }

        return response;
    }

    public CurrencyDTO save(CurrencyDTO currencyDTO) {
        return currencyDTO;
    }

    public CurrencyDTO update(CurrencyDTO currencyDTO) {
        return currencyDTO;
    }

    public void delete(Long id) {
        // TODO Auto-generated method stub
    }
}
