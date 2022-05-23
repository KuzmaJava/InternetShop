package com.internet.shop.service;

import com.internet.shop.domain.Coal;
import com.internet.shop.domain.Tobacco;
import com.internet.shop.repository.CoalRepository;
import com.internet.shop.repository.TobaccoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TobaccoService {

    @Autowired
    private TobaccoRepository tobaccoRepository;

    public Iterable<Tobacco> getAll() throws ClassNotFoundException {
        return tobaccoRepository.findAll();
    }

}
