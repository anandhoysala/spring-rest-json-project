package com.esub.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esub.api.domain.Question;
import com.esub.api.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	public Question saveData(Question question) {
		return questionRepository.save(question);
	}

	public List<Question> fetchAll() {
		Iterable<Question> source = questionRepository.findAll();
		List<Question> target = new ArrayList<Question>();		
		source.iterator().forEachRemaining(target::add);
		return target;
	}

}
