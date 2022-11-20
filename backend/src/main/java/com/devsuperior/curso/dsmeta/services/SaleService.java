package com.devsuperior.curso.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.curso.dsmeta.entities.Sale;
import com.devsuperior.curso.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales(){
		return repository.findAll();
		
	}

}