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
	
	@Column(name = "assembly")
	private String Item;
	
	@Column(name = "raw_material")
	private String rawMaterial;
	
	@Column(name = " fin_size")
	private String finSize;
	
	@Column(name = "assembly")
	private String Assembly;
	
	@Column(name = "assembly")
	private int purchaseQty;
	
	@Column(name = "assembly")
	private int purchaseNo;
	
	@Column(name = "assembly")
	private Date purchaseDate;
	
	@Column(name = "assembly")
	private Date StartDate;
	
	@Column(name = "assembly")
	private int priority;
	
	@Column(name = "assembly")
	private int productionQty;
	
	@Column(name = "assembly")
	private Date issueDate;
	
	@Column(name = "assembly")
	private int accurateQty;
	
	@Column(name = "assembly")
	private int rejectedQty;
	
}
