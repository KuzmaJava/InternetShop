package com.internet.shop.repository;

import com.internet.shop.domain.Hookah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HookahRepository extends CrudRepository<Hookah, Long> {
}
