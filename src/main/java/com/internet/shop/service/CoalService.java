package com.internet.shop.service;

import com.internet.shop.domain.Coal;
import com.internet.shop.repository.CoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoalService {

    @Autowired
    private CoalRepository coalRepository;

    public Iterable<Coal> getAll() throws ClassNotFoundException {
        return coalRepository.findAll();
    }
}
