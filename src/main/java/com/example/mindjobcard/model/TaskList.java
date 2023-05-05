package com.example.mindjobcard.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasklist")
public class TaskList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tasklist_id")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "specification")
	private String specification;
	
	@Column(name = "standard")
	private String standard;
	
	@Column(name = "process")
	private String process;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@Column(name = "endDate")
	private Date endDate;
	
	@Column(name = "quantity")
	private int quantity;

}
