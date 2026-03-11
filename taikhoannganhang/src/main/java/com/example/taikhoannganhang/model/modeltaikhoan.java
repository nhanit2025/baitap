package com.example.taikhoannganhang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class modeltaikhoan {
@Id
@Column(name = "sotaikhoan")
int sotaikhoan;
@Column(name = "ten")
String ten;
@Column(name = "sotien")
int sotien;
@Column(name = "matkhau")
String matkhauString;
	/**
 * @param sotaikhoan
 * @param ten
 * @param sotien
 * @param matkhauString
 */
public modeltaikhoan(int sotaikhoan, String ten, int sotien, String matkhauString) {
	super();
	this.sotaikhoan = sotaikhoan;
	this.ten = ten;
	this.sotien = sotien;
	this.matkhauString = matkhauString;
}
	public int getSotaikhoan() {
	return sotaikhoan;
}
public void setSotaikhoan(int sotaikhoan) {
	this.sotaikhoan = sotaikhoan;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getSotien() {
	return sotien;
}
public void setSotien(int sotien) {
	this.sotien = sotien;
}
public String getMatkhauString() {
	return matkhauString;
}
public void setMatkhauString(String matkhauString) {
	this.matkhauString = matkhauString;
}
	public modeltaikhoan() {
		// TODO Auto-generated constructor stub
	}

}
