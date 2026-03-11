package com.example.taikhoannganhang.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.taikhoannganhang.model.modeltaikhoan;
@Repository
// dungf dder keets noois guwx caau leenhj vaf nhaanj duwx lieeuj
public interface repositorytaikhoan extends JpaRepository<modeltaikhoan, Integer> {
   // hienthi
	@Query(value = "select * from taikhoan",nativeQuery = true)
	List<modeltaikhoan> listtaikhoan();
	// them
	@Modifying
	@Transactional
  @Query(value = "insert into taikhoan(sotaikhoan,ten,sotien,matkhau) values (:sotaikhoan,:ten,:sotien,:matkhau)"
  		                ,nativeQuery = true  )
   void themtaikhoan(@Param("sotaikhoan") int sotaikhoan,@Param("ten") String ten,
		   @Param ("sotien") int sotien,@Param("matkhau") String matkhau);
 
   // sua
	@Modifying
	@Transactional
	@Query (value = "update taikhoan set taikhoan.ten= :ten where sotaikhoan=:id ",nativeQuery = true)
	void suataikhoan(@Param ("ten") String ten,@Param ("id") int id);
	@Modifying
	@Transactional
	@Query(value = "delete from taikhoan where sotaikhoan=:id",nativeQuery = true)
	void xoataikhoan(@Param("id") int id);
	// dangnhap
	@Query(value ="select * from taikhoan where sotaikhoan=:id and  ten=:ten",nativeQuery = true)
	modeltaikhoan dangnhap(@Param("id") int id,@Param("ten") String ten);
	//suamatkhau
	@Modifying
	@Transactional
	@Query(value = "update taikhoan set taikhoan.matkhau=:matkhau where sotaikhoan=:id",nativeQuery = true)
	void suamatkhau (@Param("id") int id,@Param("matkhau") String matkhau);
	// chuyentien
	@Modifying
	@Transactional
	@Query (value = "update taikhoan set sotien=sotien+:sotien where sotaikhoan=:id",nativeQuery = true)
	void naptien(@Param ("sotien") int sotien ,@Param("id") int id);
	@Modifying
	@Transactional
	@Query(value = "update taikhoan set sotien=sotien - :sotien where sotaikhoan= :id",nativeQuery = true)
	void ruttien(@Param("sotien") int sotien,@Param("id") int id);
	@Query(value = "select sotien from taikhoan where sotaikhoan=:id" ,nativeQuery = true)
	int sodu(@Param ("id") int id);
	
}
