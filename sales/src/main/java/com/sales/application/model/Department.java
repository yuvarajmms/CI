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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="DEPARTMENT")
public class Department {

	@Id
	@Column(name="dept_id")
	private int id;
	@Column
	private String name;
	@Column
	private String manager;
}
