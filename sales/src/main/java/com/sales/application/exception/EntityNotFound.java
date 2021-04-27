package com.sales.application.exception;

public class EntityNotFound extends RuntimeException {
	
	public EntityNotFound(String objName, Integer id) {
		super("Could not find Data in "+objName+" for the id:"+id);
	}
	
}
