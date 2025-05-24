package com.example.api_catalog.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import com.example.api_catalog.entity.Currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencySpecification implements Specification<Currency> {

    private static final long serialVersionUID = 2753473399996931822L;

    Currency entity;

    public CurrencySpecification(Currency entity) {
        this.entity = entity;
    }

    @Override
    public Predicate toPredicate(Root<Currency> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        // Create a list of predicates
        List<Predicate> predicates = new ArrayList<>();

        CriteriaQuery<Currency> cq = builder.createQuery(Currency.class);

        // We define the main entity
        Root<Currency> currency = cq.from(Currency.class);

        // Define all the conditions of the query
        Predicate codePredicate = builder.equal(currency.get("code"), entity.getCode());

        return builder.and(predicates.toArray(new Predicate[0]));
    }
}
