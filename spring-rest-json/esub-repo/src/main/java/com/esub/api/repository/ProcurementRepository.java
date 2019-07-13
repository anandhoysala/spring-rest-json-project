package com.esub.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esub.api.domain.Procurement;

@Repository
public interface ProcurementRepository extends CrudRepository<Procurement, Integer> {

}
