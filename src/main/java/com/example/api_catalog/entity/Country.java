package com.example.api_catalog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "catalog")
public class Country implements Serializable {
    @Id
    private Long id;

    @Column(name = "code", nullable = false, length = 4)
    private String code;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "locale", nullable = false, length = 6)
    private String locale;

    @Column(name = "time_zone", nullable = false, length = 10)
    private String timezone;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = Boolean.TRUE;

    public Country() {}

    public Country(Long id, String code, String name, String locale, String timezone, Boolean enabled) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.locale = locale;
        this.timezone = timezone;
        this.enabled = enabled;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) && Objects.equals(code, country.code) && Objects.equals(name, country.name) && Objects.equals(locale, country.locale) && Objects.equals(timezone, country.timezone) && Objects.equals(enabled, country.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, locale, timezone, enabled);
    }
}
