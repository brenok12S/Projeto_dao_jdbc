package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void inser(Seller obj);
	void update(Seller obj);
	void deleteByID(Integer id);
	Seller findById(Integer id);
	
	List<Seller> findAll();

}
