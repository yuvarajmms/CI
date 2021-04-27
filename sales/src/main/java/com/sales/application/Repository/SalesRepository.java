package com.sales.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.application.model.Sales;



@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {
	

}
