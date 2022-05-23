package com.internet.shop.controller;

import com.internet.shop.domain.Hookah;
import com.internet.shop.service.HookahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HookahController {

    @Autowired
    private HookahService hookahService;

    @GetMapping("/hookahs")
    public Iterable<Hookah> getAll() throws ClassNotFoundException {
        return hookahService.getAll();
    }
}
