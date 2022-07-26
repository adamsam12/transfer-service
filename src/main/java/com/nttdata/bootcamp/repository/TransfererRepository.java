package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.model.Transferer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfererRepository extends ReactiveCrudRepository<Transferer, String> {
}
