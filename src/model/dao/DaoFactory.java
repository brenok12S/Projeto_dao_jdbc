package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSallerDao() {
		return new SellerDaoJDBC();
	}
	
}
