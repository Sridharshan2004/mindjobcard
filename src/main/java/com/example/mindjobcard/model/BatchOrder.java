package com.example.mindjobcard.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "batchorder")
public class BatchOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batchorder_id")
	private Long id ;
	
	@Column(name = "comapany_name")
	private String comapanyName;
	
	@Column(name = "company_person")
	private String companyPerson;
	
	@Column(name = "Item")
	private String Item;
	
	@Column(name = "raw_material")
	private String rawMaterial;
	
	@Column(name = " fin_size")
	private String finSize;
	
	@Column(name = "assembly")
	private String Assembly;
	
	@Column(name = "purchaseQty")
	private int purchaseQty;
	
	@Column(name = "purchaseNo")
	private int purchaseNo;
	
	@Column(name = "purchaseDate")
	private Date purchaseDate;
	
	@Column(name = "StartDate")
	private Date StartDate;
	
	@Column(name = "priority")
	private int priority;
	
	@Column(name = "productionQty")
	private int productionQty;
	
	@Column(name = "issueDate")
	private Date issueDate;
	
	@Column(name = "accurateQty")
	private int accurateQty;
	
	@Column(name = "rejectedQty")
	private int rejectedQty;
	
}
