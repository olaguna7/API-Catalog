package com.example.api_catalog.DTO;

public class CountryDTO {
    private Long id;
    private String code;
    private String name;
    private String locale;
    private String timezone;
    private Boolean enabled;

    public CountryDTO(Long id, String code, String name, String locale, String timezone, Boolean enabled) {
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
}
