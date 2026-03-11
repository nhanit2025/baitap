package com.example.ketnoidulieu.service;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ketnoidulieu.model.sach_model;
import com.example.ketnoidulieu.repository.sach_repository;
import com.zaxxer.hikari.util.ConcurrentBag.IBagStateListener;
@Service
public class sach_service {
//	@Autowired
//	sach_repository idRepository;
//	public sach_service() {
//		// TODO Auto-generated constructor stub
//	}
//	// hienthidanhsach
//	public List<sach_model> hienthi(){
//		return idRepository.abc();
//	}
//	// timkiem
//	public sach_model timkieModel( String ten) { 
//	return	idRepository.timkiemtheoten(ten);
//		
//	}
//	// themsach
//	public String themsach( List<sach_model> idList,List<sach_model > listsach) {
//	     for(int i=0;i<idList.size();i++) {
//	    	 for(int j=0;j<listsach.size();j++) {
//	    	 if(idList.get(i).getId()==listsach.get(j).getId()) {
//	    	//	 idRepository.themsach(idList.get(i).getId(), idList.get(i).getTen(),idList.get(i).getGia());
//	    		 listsach.add(idList.get(i));
//	    		 return "themsachthanhcong";
//	    	 }
//	     }
//	     }
//		
//		return "ko them sach thanh cong";
//	}
//	// suasach
//	public String suasach(int id ,String ten,List<sach_model> list) {
//		//
//		for(sach_model iModel : list) {
//			if(iModel.getId()==id) {
//			idRepository.suasach(ten, id);
//			   iModel.setTen(ten);
//			return "sua thanh cong";
//			}
//		}
//		return "sua ko thanh cong";
//	}
//public String xoasachString( String ten ,List<sach_model> list) {
//	for(sach_model idModel :list) {
//		if(idModel.getTen().equals(ten)) {
//			idRepository.xoasah(ten);
//			list.remove(idModel);
//			return "xoa thanhc ong";
//		}
//	}
//	return "ko thanh cong";
//}
//	
@Autowired
sach_repository idRepository;
// hienthi
public List<sach_model > danhsach(){
	return idRepository.abc();
}
// them
   public String them(int id,String ten,int gia) {
	idRepository.themsach(id, ten, gia);
	return "themsachthanhcong";
}
// sua
public String sua(int id,String ten) {
	idRepository.suasach(ten, id);
	return "suathanhcong";
}
public String xoa(int id) {
	idRepository.xoasach(id);
	return "xoathanhcong";
}
public sach_model timkiem(int id) {
	return idRepository.sach(id);
}
}
