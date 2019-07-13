package com.esub.api.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esub.api.domain.Procurement;
import com.esub.api.service.ProcurementService;

@RestController
public class ProcurementController {

	private static final Logger LOG = Logger.getLogger(ProcurementController.class.getName());
	
	@Autowired
	ProcurementService procurementService;
		
	@GetMapping("/get/{procurementId}")
	public ResponseEntity<Procurement> getData(@PathVariable("procurementId") int procurementId) {	
		Procurement p = procurementService.getData(procurementId); 
		LOG.log(Level.INFO, "ProcurementController::getData");
	    return new ResponseEntity<Procurement>(p,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Procurement> createData(@RequestBody Procurement procurement) {
		Procurement p = procurementService.saveData(procurement);
		return new ResponseEntity<Procurement>(p,HttpStatus.OK);
	}
}
