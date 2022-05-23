package com.internet.shop.service;

import com.internet.shop.domain.Coal;
import com.internet.shop.domain.Hookah;
import com.internet.shop.repository.CoalRepository;
import com.internet.shop.repository.HookahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HookahService {

    @Autowired
    private HookahRepository hookahRepository;

    public Iterable<Hookah> getAll() throws ClassNotFoundException {
        return hookahRepository.findAll();
    }

}
