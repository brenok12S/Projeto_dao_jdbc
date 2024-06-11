package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller sl = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

		SellerDao sellerdao = DaoFactory.createSallerDao();
		
		System.out.println(sellerdao);
		
	}

}
