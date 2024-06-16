package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		System.out.println("Attempting to find seller with ID: 3");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n ==== TEST 1 : Seller findById ==== ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		System.out.println("=================================================================================================================================================================");

		
		System.out.println("\n ==== TEST 2 : Seller findByDepartment ==== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=================================================================================================================================================================");

		
		System.out.println("\n ==== TEST 3 : Seller findById ==== ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 4 : Seller findById ==== ");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 400.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Insert! New id = " + newSeller.getId());
		System.out.println("=================================================================================================================================================================");

		
		System.out.println("\n ==== TEST 5 : Seller update ==== ");
		seller = sellerDao.findById(1);
		seller.setEmail("bobbrown@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 6 : Seller update ==== ");
		System.out.println("Enter id for deled test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.print("Delete completed");
		
		sc.close();
		
	}

}
