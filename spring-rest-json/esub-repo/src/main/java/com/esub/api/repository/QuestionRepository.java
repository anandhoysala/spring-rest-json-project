package com.esub.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esub.api.domain.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
