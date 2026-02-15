package model;

public class oder {
   int makhachhang;
   String hovatenString;
   String tenmathnagString;
   int mahang;
   String doiquaString;
public int getMakhachhang() {
	return makhachhang;
}
public void setMakhachhang(int makhachhang) {
	this.makhachhang = makhachhang;
}
public String getHovatenString() {
	return hovatenString;
}
public void setHovatenString(String hovatenString) {
	this.hovatenString = hovatenString;
}
public String getTenmathnagString() {
	return tenmathnagString;
}
public void setTenmathnagString(String tenmathnagString) {
	this.tenmathnagString = tenmathnagString;
}
public int getMahang() {
	return mahang;
}
public void setMahang(int mahang) {
	this.mahang = mahang;
}
public String getDoiquaString() {
	return doiquaString;
}
public void setDoiquaString(String doiquaString) {
	this.doiquaString = doiquaString;
}
/**
 * @param makhachhang
 * @param hovatenString
 * @param tenmathnagString
 * @param mahang
 * @param doiquaString
 */
public oder(int makhachhang, String hovatenString, String tenmathnagString, int mahang, String doiquaString) {
	super();
	this.makhachhang = makhachhang;
	this.hovatenString = hovatenString;
	this.tenmathnagString = tenmathnagString;
	this.mahang = mahang;
	this.doiquaString = doiquaString;
}
   
}