package com.example.taikhoanthuong;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.oder;
import model.taikhoandiemthuong_model;
import net.bytebuddy.asm.Advice.Return;
@RestController 
@RequestMapping("/taikhoanthuong")
public class taikhanngoaithuong_main {

	public taikhanngoaithuong_main() {
		// TODO Auto-generated constructor stub
	}
	List<taikhoandiemthuong_model> listaikhoanList=new ArrayList<taikhoandiemthuong_model>();	
@PostMapping("/them")
public int themtaikhoan(@RequestBody List<taikhoandiemthuong_model> listtaikhoan) {
	for(taikhoandiemthuong_model iModel :listtaikhoan) {
		listaikhoanList.add(iModel);
	}
	return listaikhoanList.size();
}
@GetMapping("/henthi")
public List<taikhoandiemthuong_model> hienthitaikhoan(){
	return listaikhoanList;
}
@PutMapping("/suataikhoan")
public String suataikhoan(@RequestParam int stk,@RequestParam String ten) {
         for(taikhoandiemthuong_model iModel : listaikhoanList) {
        	 if(stk==iModel.getMakhachhang()) {
        		 iModel.setTenkhachhangString(ten);
        		 return "sua thanh cong";
        	 }
         }
         return "k tim thay taikhoan";
}
@DeleteMapping("/xoataikhoan")
public String xoataikhoan(@RequestParam int stk) {
	for(int i=0;i<listaikhoanList.size();i++) {
		if(listaikhoanList.get(i).getMakhachhang()==stk) {
			listaikhoanList.remove(i);
			return "xoa thanh cong";
		}
	}
	return "ko thanh cong";
}
@GetMapping("/dangnhap")
public String dangnhap(@RequestParam int stk,@RequestParam String matkhau) {
	for(taikhoandiemthuong_model iModel : listaikhoanList) {
		if(iModel.getMakhachhang()==stk && iModel.getMatkhauString().equals(matkhau)) {
			return"dangnhapthanhcong";
		}
	}
	return "dangnhapkothanhcong";
}
List<oder> oders=new ArrayList<oder>();
@PostMapping("/oder")
public int themString (@RequestBody List<oder> osList) {
	for(oder lisOder :osList) {
		oders.add(lisOder);
	}
	return oders.size();
}
@GetMapping("/congdiem")
public int congdiemString() {
	int a=0;
	for(oder lisOder :oders) {
		for(taikhoandiemthuong_model lisModel : listaikhoanList) {
			if(lisOder.getMakhachhang()==lisModel.getMakhachhang()) {
				int tongdiem=lisModel.getTongdiem();
				if(lisOder.getDoiquaString().equals("doiqua")) {
					tongdiem=tongdiem-2;
				}
				else {
					tongdiem=tongdiem+2;
				}
				lisModel.setTongdiem(tongdiem);
				a++;
			}
				
			}
		}
	return a;
	}

}
