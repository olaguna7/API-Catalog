package com.example.api_catalog.entity;

import java.io.Serializable;
import java.util.Objects;

public class State implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Boolean enabled;

    public State(Long id, String code, String name, Boolean enabled) {
        this.id = id;
        this.code = code;
        this.name = name;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(id, state.id) && Objects.equals(code, state.code) && Objects.equals(name, state.name) && Objects.equals(enabled, state.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, enabled);
    }
}
