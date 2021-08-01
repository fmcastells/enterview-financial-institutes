package com.interview.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InterviewModel {

    private final String country;
    private final String institution;
    private final double value;
    private final boolean shouldNotify;

    @JsonCreator
    public InterviewModel(@JsonProperty("country") String country,
                          @JsonProperty("institution") String institution,
                          @JsonProperty("chargebackValue") double value,
                          @JsonProperty("shouldNotify") boolean shouldNotify) {
        this.country = country;
        this.institution = institution;
        this.value = value;
        this.shouldNotify = shouldNotify;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("institution")
    public String getInstitution() {
        return institution;
    }

    @JsonProperty("chargebackValue")
    public double getValue() {
        return value;
    }

    @JsonProperty("shouldNotify")
    public boolean isShouldNotify() {
        return shouldNotify;
    }
}
