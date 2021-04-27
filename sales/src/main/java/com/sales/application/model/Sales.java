package com.sales.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="SALES")
public class Sales {

	@Id
	@Column(name="sales_id")
	private int sales_id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String location;
	public int getSales_id() {
		return sales_id;
	}
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Sales(int sales_id, String name, String category, String location) {
		super();
		this.sales_id = sales_id;
		this.name = name;
		this.category = category;
		this.location = location;
	}
	
	public Sales() {
		
	}
}
