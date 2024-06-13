package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		

//		System.out.println("Attempting to find seller with ID: 3");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(1);
		
		System.out.println(seller);
		

/*		if (seller != null) {
            System.out.println(seller);
        } else {
            System.out.println("Seller not found.");
        }
*/		
	
		

	}

}
