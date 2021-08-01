package com.interview.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterviewModelTest {

    private static final String COUNTRY = "country";
    private static final String INSTITUTION = "institution";
    private static final double VALUE = 3.59;

    @Test
    void createModel_true() {
        InterviewModel interviewModel = new InterviewModel(COUNTRY, INSTITUTION, VALUE, true);

        assertThat(interviewModel.getCountry()).isEqualTo(COUNTRY);
        assertThat(interviewModel.getInstitution()).isEqualTo(INSTITUTION);
        assertThat(interviewModel.getValue()).isEqualTo(VALUE);
        assertThat(interviewModel.isShouldNotify()).isTrue();
    }

    @Test
    void createModel_false() {
        InterviewModel interviewModel = new InterviewModel(COUNTRY, INSTITUTION, VALUE, false);

        assertThat(interviewModel.getCountry()).isEqualTo(COUNTRY);
        assertThat(interviewModel.getInstitution()).isEqualTo(INSTITUTION);
        assertThat(interviewModel.getValue()).isEqualTo(VALUE);
        assertThat(interviewModel.isShouldNotify()).isFalse();
    }
}