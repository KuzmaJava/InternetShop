package com.internet.shop.repository;

import com.internet.shop.domain.Coal;
import com.internet.shop.domain.Tobacco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TobaccoRepository extends CrudRepository<Tobacco, Long> {
}
