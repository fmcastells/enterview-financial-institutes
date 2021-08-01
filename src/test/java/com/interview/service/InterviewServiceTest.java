package com.interview.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class InterviewServiceTest {

    @InjectMocks
    private InterviewService interviewService;

    @Test
    void getNormalizedModel_null() {
        assertThat(interviewService.getNormalizedModel(null)).isNull();
    }

}