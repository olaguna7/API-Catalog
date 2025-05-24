package com.example.api_catalog.entity;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {
    private Long id;
    private String name;
    private Boolean enabled;

    public City(Long id, String name, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        City city = (City) o;
        return Objects.equals(id, city.id) && Objects.equals(name, city.name) && Objects.equals(enabled, city.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, enabled);
    }
}
