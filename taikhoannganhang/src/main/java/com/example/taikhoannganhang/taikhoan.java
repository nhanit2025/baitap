package com.example.taikhoannganhang;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.taikhoannganhang.model.modeltaikhoan;
import com.example.taikhoannganhang.service.taikhoanservice;

@RestController
@RequestMapping("/taikhoan")
public class taikhoan {
	@Autowired
	taikhoanservice idTaikhoanservice;
    @GetMapping("/hienthi")
    public List<modeltaikhoan> hienthi(){
    	return idTaikhoanservice.listtaikhoan();
    	
    }
   
    @PostMapping("/them")
    public String themtaikhoan(@RequestBody modeltaikhoan idModeltaikhoan) {
    	return idTaikhoanservice.themtaikhoanString(idModeltaikhoan.getSotaikhoan(),
    			idModeltaikhoan.getTen(), idModeltaikhoan.getSotien(), 
    			idModeltaikhoan.getMatkhauString());
    }
    @PutMapping("/sua")
    public String suaString(@Param("id") int id,@Param("ten") String ten) {
    	return idTaikhoanservice.suataikhoan(id, ten);
    }//
    @DeleteMapping("/xoa")
    public String xoaString(@Param ("id") int id) {
    	return idTaikhoanservice.xoataikhoan(id);
    }
    @GetMapping("dangnhap")
    public String dangnhap(@Param("id") int id,@Param("ten") String ten) {
    	return idTaikhoanservice.dangnhaptaikhoan(id, ten);
    }
   @PutMapping("/suamatkhau")
   public String suamatkhau(@Param("id") int id,@Param("matkhau") String matkhau) {
	   return idTaikhoanservice.suamatkhau(id, matkhau);
   }
   @PutMapping("/chuyentien")
   public String chuyentien(@RequestParam("ma nhan") int manhan,@RequestParam("sotien") int sotien,@RequestParam("ma gui") int magui) {
	   return idTaikhoanservice.chuyentien(manhan, magui, sotien);
	   
   }
   @PutMapping("/naptien")
   public String naptien(@Param("id") int id,@Param("sotien") int sotien) {
	   return idTaikhoanservice.naptienString(id, sotien);
   }
   @PutMapping("/rutien")
   public String ruttien(@Param("id") int id,@Param("sotien") int sotien) {
	   return idTaikhoanservice.ruttienString(id, sotien);
   }
   @GetMapping("/sodu")
   public int sodu(@Param ("id") int id) {
	   return idTaikhoanservice.sodu(id);
   }
	public taikhoan() {
		// TODO Auto-generated constructor stub
	}

}
