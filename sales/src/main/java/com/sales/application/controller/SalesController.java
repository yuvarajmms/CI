package com.sales.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sales.application.model.Sales;
import com.sales.application.service.SalesService;


@RestController
public class SalesController {

	@Autowired
	SalesService saleService;
	
	@RequestMapping(value="/info", method = RequestMethod.GET)
	public List<Sales> getSalesDepartmentInfo() {
		return saleService.getAllSalesData();
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public ResponseEntity<Sales> getSalesByID(@PathVariable("id") String id){
		Sales sale = saleService.getSalesById(Integer.valueOf(id));
		return new ResponseEntity<Sales>(sale, HttpStatus.OK);
	}
}
