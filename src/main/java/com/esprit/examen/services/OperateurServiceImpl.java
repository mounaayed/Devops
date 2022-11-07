package com.esprit.examen.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OperateurServiceImpl implements IOperateurService {

	@Autowired
	OperateurRepository  operateurRepository;
	@Override
	public List<Operateur> retrieveAllOperateurs() {
		return (List<Operateur>) operateurRepository.findAll();
	}

	@Override
	public Operateur addOperateur(Operateur o) {
		operateurRepository.save(o);
		return o;
	}

	@Override
	public void deleteOperateur(Long id) {
		operateurRepository.deleteById(id);
		
	}

	@Override
	public Operateur updateOperateur(Operateur o) {
		 return operateurRepository.save(o);
	
		
	}

	@Override
	public Operateur retrieveOperateur(Long id) {
		
		Long start =System.currentTimeMillis();
		log.info(" in method retrieveStock");
		Operateur o = operateurRepository.findById(id).orElse(null);
		log.info("out of method retrieveStock");
		Long elapsedTine = System.currentTimeMillis() - start;
		Log.info("Method excution time" + elapsedTine + "millisecond");
		
		return o;
	}

}
