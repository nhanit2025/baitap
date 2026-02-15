package model;

public class taikhoandiemthuong_model {
	int makhachhang;
	String tenkhachhangString;
	int tongdiem;
	String matkhauString;
	

	/**
	 * @param makhachhang
	 * @param tenkhachhangString
	 * @param tongdiem
	 * @param matkhauString
	 */
	public taikhoandiemthuong_model(int makhachhang, String tenkhachhangString, int tongdiem, String matkhauString) {
		super();
		this.makhachhang = makhachhang;
		this.tenkhachhangString = tenkhachhangString;
		this.tongdiem = tongdiem;
		this.matkhauString = matkhauString;
	}


	public int getMakhachhang() {
		return makhachhang;
	}


	public void setMakhachhang(int makhachhang) {
		this.makhachhang = makhachhang;
	}


	public String getTenkhachhangString() {
		return tenkhachhangString;
	}


	public void setTenkhachhangString(String tenkhachhangString) {
		this.tenkhachhangString = tenkhachhangString;
	}


	public int getTongdiem() {
		return tongdiem;
	}


	public void setTongdiem(int tongdiem) {
		this.tongdiem = tongdiem;
	}


	public String getMatkhauString() {
		return matkhauString;
	}


	public void setMatkhauString(String matkhauString) {
		this.matkhauString = matkhauString;
	}


	public taikhoandiemthuong_model() {
		// TODO Auto-generated constructor stub
	}
	

}
