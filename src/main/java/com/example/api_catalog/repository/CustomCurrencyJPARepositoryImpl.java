package com.example.api_catalog.repository;

import com.example.api_catalog.entity.Currency;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CustomCurrencyJPARepositoryImpl implements CustomCurrencyJPARepository {
    EntityManager em;

    public CustomCurrencyJPARepositoryImpl(EntityManager em) {
        this.em = em;
    }

    public List<Currency> myCustomFindMethod(String code) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Currency> cq = cb.createQuery(Currency.class);

        // Define the main entity
        Root<Currency> currency = cq.from(Currency.class);

        // Define all the conditions of the query
        Predicate codePredicate = cb.equal(currency.get("code"), code);

        // We can have more than one where clause
        cq.where(codePredicate);

        // Create the query and after that executed
        TypedQuery<Currency> query = em.createQuery(cq);
        return query.getResultList();
    }
}
