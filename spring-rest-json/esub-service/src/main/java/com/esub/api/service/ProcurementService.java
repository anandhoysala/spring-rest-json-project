package com.esub.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esub.api.domain.Procurement;
import com.esub.api.repository.ProcurementRepository;

@Service
public class ProcurementService {

	@Autowired
	ProcurementRepository procurementRepository;

	public Procurement saveData(Procurement procurement) {
		return procurementRepository.save(procurement);
	}

	public Procurement getData(Integer procurementId) {
		Optional<Procurement> optProcurement = procurementRepository.findById(procurementId);
		Procurement pr = new Procurement();
		if (optProcurement.empty() != null) {
			pr = optProcurement.get();
		}

		return pr;
	}

}
