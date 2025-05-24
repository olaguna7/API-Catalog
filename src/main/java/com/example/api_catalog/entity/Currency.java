package com.example.api_catalog.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String code;
    private String description;
    private Boolean enabled;

    @Column(name = "decimal_places")
    private int decimalPlaces;

    public Currency() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return decimalPlaces == currency.decimalPlaces && Objects.equals(id, currency.id) && Objects.equals(code, currency.code) && Objects.equals(description, currency.description) && Objects.equals(enabled, currency.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, description, enabled, decimalPlaces);
    }
}
