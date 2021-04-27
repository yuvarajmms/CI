package com.sales.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.application.Repository.SalesRepository;
import com.sales.application.exception.EntityNotFound;
import com.sales.application.model.Sales;


@Service
public class SalesService {

	@Autowired
	SalesRepository salesRepo;
	
	public List<Sales> getAllSalesData() {
		return salesRepo.findAll();
	}
	
	public Sales getSalesById(Integer id) {
		return salesRepo.findById(id).
				orElseThrow(() -> new EntityNotFound("Sales", id));
	}
	
}
