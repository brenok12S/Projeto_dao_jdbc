package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		
		System.out.println(" === Connection established successfully. === ");
		System.out.println();
		
		return new SellerDaoJDBC(DB.getConnection());
		
	}
	
	public static DepartmentDao createDepartmentDao() {
		System.out.println(" === Connection established successfully. === ");
		return new DepartmentDaoJDBC(DB.getConnection());
		
	}
	
}
