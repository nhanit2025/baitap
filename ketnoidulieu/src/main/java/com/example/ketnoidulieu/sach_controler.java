package com.example.ketnoidulieu;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ketnoidulieu.model.sach_model;
import com.example.ketnoidulieu.service.sach_service;
//@RestController
//@RequestMapping("/sach")
//public class sach_controler {
//List<sach_model> idList = new ArrayList<sach_model>();
//	@Autowired
//	sach_service idSach_service;
//@GetMapping ("/hienthi")
//public List<sach_model> hienthi(){
//	
//	return idSach_service.hienthi();
//}
//@GetMapping("/timkiem")
//public sach_model timkiem(@Param ("ten") String ten) {
//	return  idSach_service.timkieModel(ten);
//}
//@PutMapping("/sua")
//public String suaString (@Param("ten") String tenString ,@Param("id") int id) {
//return	idSach_service.suasach(id, tenString, idList);
//	
//}
//@PostMapping ("/them")
//public String themString(@RequestBody List<sach_model> list) {
//	return idSach_service.themsach(list);
//}
//	public sach_controler() {
//		// TODO Auto-generated constructor stub
//	}
//
//}
@RestController
@RequestMapping("/sach")
public class sach_controler {
	@Autowired
	sach_service idSach_service;
	@GetMapping("/hienthi")
	public List<sach_model>hienthidanhsach(){
		return idSach_service.danhsach();
	}
	@PostMapping("/themsach")
	public String themsachString(@RequestBody sach_model idModel) {
		return idSach_service.them(idModel.getId(), idModel.getTen(), idModel.getGia());
		 
	}
	@PutMapping("/suasach")
	public String suasaString(@Param("id") int id,@Param("ten") String ten) {
		return idSach_service.sua(id, ten);
	}
	@GetMapping("/timkiem")
	public sach_model timkiem(@Param("id") int id) {
		return idSach_service.timkiem(id);
	}
}

