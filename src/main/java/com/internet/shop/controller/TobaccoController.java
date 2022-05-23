package com.internet.shop.controller;

import com.internet.shop.domain.Coal;
import com.internet.shop.domain.Tobacco;
import com.internet.shop.service.TobaccoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TobaccoController {

    @Autowired
    private TobaccoService tobaccoService;

    @GetMapping("/tobaccos")
    public Iterable<Tobacco> getAll() throws ClassNotFoundException {
        return tobaccoService.getAll();
    }
}
