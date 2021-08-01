package com.interview.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class InterviewControllerTest {

    @InjectMocks
    private InterviewController interviewController;

    @Test
    void normalizedNotification_null() {
        assertThat(interviewController.normalizeNotification(null)).isNull();
    }

}