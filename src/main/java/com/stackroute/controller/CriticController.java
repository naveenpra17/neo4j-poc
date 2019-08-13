package com.stackroute.controller;

import com.stackroute.domain.Critic;
import com.stackroute.service.CriticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "api/v1/")
public class CriticController {
    private CriticService criticService;
    @Autowired
    private CriticController(CriticService criticService){
        this.criticService = criticService;
    }
    @GetMapping
    public Collection<Critic>

}
