package com.example.taikhoannganhang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taikhoannganhang.model.modeltaikhoan;
import com.example.taikhoannganhang.repository.repositorytaikhoan;

import net.bytebuddy.build.Plugin.Engine.Source.Empty;

@Service
public class taikhoanservice {
   @Autowired
   repositorytaikhoan idRepositorytaikhoan;
   public List<modeltaikhoan> listtaikhoan(){
	   return idRepositorytaikhoan.listtaikhoan();
   }
	// them
   public String themtaikhoanString(int ma,String ten,int sotien,String matkhau) {
	   idRepositorytaikhoan.themtaikhoan(ma, ten, sotien, matkhau);
	   return "themtaikhoanthanhcong";
   }
  public String suataikhoan(int ma,String ten) {
	  idRepositorytaikhoan.suataikhoan(ten, ma);
	  return "suathanhcong";
  }
public String xoataikhoan(int ma) {
	idRepositorytaikhoan.xoataikhoan(ma);
	return "xoathanhcong";
}
public String dangnhaptaikhoan(int ma,String ten) {
	if(idRepositorytaikhoan.dangnhap(ma, ten) !=null){
		return "dangnhapthanhcong";
	}
	else {
		return"dangnhapkothanhcong";
	}
}
public String suamatkhau(int ma,String matkhau) {
	 idRepositorytaikhoan.suamatkhau(ma,matkhau);
	 return "suathanhcong";
}
public String naptienString(int ma,int sotien) {
	idRepositorytaikhoan.naptien(sotien, ma);
	return "chuyentienthanhcong";
}
public String ruttienString(int ma,int sotien) {
	idRepositorytaikhoan.ruttien(sotien, ma);
	return "rut tien thanh cong";
}
public String chuyentien(int manhan,int magui,int sotien) {
	idRepositorytaikhoan.naptien(sotien, manhan);
	idRepositorytaikhoan.ruttien(sotien, magui);
	return "chuyen tien thanh cong";
}
public int sodu(int ma) {
 return	idRepositorytaikhoan.sodu(ma);
}
}
