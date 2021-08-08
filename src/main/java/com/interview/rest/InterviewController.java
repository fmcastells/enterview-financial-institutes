package com.interview.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.interview.model.InterviewModel;
import com.interview.service.InterviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterviewController {

    private final InterviewService service;


    public InterviewController(InterviewService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<InterviewModel> normalizeNotification(@RequestBody final JsonNode payload) {
        return null;
    }
}
