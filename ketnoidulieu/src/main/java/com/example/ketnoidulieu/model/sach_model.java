package com.example.ketnoidulieu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name = "sach")

public class sach_model {
	@Id
     @Column (name ="id")
     int id;
     @Column (name ="ten")
     String ten;
     @Column (name = "gia")
     int gia;
     

	public int getId() { 
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getGia() {
		return gia;
	}


	public void setGia(int gia) {
		this.gia = gia;
	}


	public sach_model() {
		// TODO Auto-generated constructor 
    
     
	}


	/**
	 * @param id
	 * @param ten
	 * @param gia
	 */
	public sach_model(int id, String ten, int gia) {
		super();
		this.id = id;
		this.ten = ten;
		this.gia = gia;
	}

}
