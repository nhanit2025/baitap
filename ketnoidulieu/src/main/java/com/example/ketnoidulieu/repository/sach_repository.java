package com.example.ketnoidulieu.repository;

import java.security.PublicKey;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ketnoidulieu.model.sach_model;

public interface sach_repository extends JpaRepository<sach_model, Integer> {
//    @Query ( value="select * from sach", nativeQuery = true)
//    List<sach_model> abc();
//    // tim kiem
//    @Query(value=" select * from sach where ten= :ten",nativeQuery = true)
//    sach_model timkiemtheoten(@Param("ten") String ten);
//    // them 
//    @Modifying
//    @Query(value = "INSERT INTO sach(id,ten,gia) VALUES (:id,:ten,:gia)", nativeQuery = true)
//    void themsach(@Param("id") int id,
//                  @Param("ten") String ten,
//                  @Param("gia") int gia);
//    // xoa
//    @Modifying
//    @Query(value="DELETE form sach where ten =:ten",nativeQuery = true)
//    void xoasah(@Param("ten") String ten);
//    //sua
//    @Modifying
//    @Query (value="update sach set sach.ten= :ten where id =:id",nativeQuery = true)
//     void suasach(@Param ("ten") String ten ,@Param ("id") int id);
//    
//	
	@Query(value = "select * from sach ",nativeQuery =true)
	List<sach_model> abc();
	// chen
	@Modifying
	@Transactional
	@Query(value = "insert into sach(id,ten,gia) values (:id,:ten,:gia)",nativeQuery
	= true)
	   void themsach(@Param("id") int id,@Param("ten") String tenString ,@Param("gia"
			   ) int gia);
	// sua
	@Modifying
	@Transactional
	@Query(value = "update sach set sach.ten=:ten where id= :id",nativeQuery =true)
	 void suasach(@Param ("ten") String ten,@Param("id") int id);
	@Modifying
	@Transactional
	@Query(value = "delete sach where id= :id",nativeQuery = true)
	void xoasach(@Param ("id") int id);
	@Query (value = "select * from sach where id= :id",nativeQuery = true)
	sach_model sach(@Param ("id") int id);
   

}
