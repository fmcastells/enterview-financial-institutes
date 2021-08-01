package com.interview.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.interview.model.InterviewModel;
import com.interview.service.InterviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class InterviewController {

    private final InterviewService service;


    public InterviewController(InterviewService service) {
        this.service = service;
    }

    public ResponseEntity<InterviewModel> normalizeNotification(final JsonNode payload) {
        return null;
    }
}
