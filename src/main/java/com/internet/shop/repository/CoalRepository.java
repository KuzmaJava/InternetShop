package com.internet.shop.repository;

import com.internet.shop.domain.Coal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoalRepository extends CrudRepository<Coal, Long> {

}
