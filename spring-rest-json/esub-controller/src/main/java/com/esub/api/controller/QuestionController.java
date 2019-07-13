package com.esub.api.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esub.api.domain.Question;
import com.esub.api.service.QuestionService;

@RestController
public class QuestionController {

	private static final Logger LOG = Logger.getLogger(QuestionController.class.getName());
	
	@Autowired
	QuestionService questionService;
		
	@GetMapping("/questions")
	public ResponseEntity<List<Question>> fetch() {	
		List<Question> target = questionService.fetchAll(); 
		LOG.info("QuestionController::fetch::=" + target);
	    return new ResponseEntity<List<Question>>(target,HttpStatus.OK);
	}
	
	@PostMapping("/savequestion")
	public ResponseEntity<Question> create(@RequestBody Question question) {
		Question target = questionService.saveData(question);
		LOG.info("QuestionController::create:: " + target);
		return new ResponseEntity<Question>(target,HttpStatus.OK);
	}
}
