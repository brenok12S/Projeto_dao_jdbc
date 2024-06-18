package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\n ==== TEST 1 : Department findById ==== ");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println();
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 2 : Department findAll ==== ");
		List<Department> list = departmentDao.findAll();
		
		for (Department dep : list) {
			System.out.println(dep);
		}
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 3 : Department insert ==== ");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id:" + newDepartment.getId());
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 4 : Department update ==== ");
		Department  deptest = departmentDao.findById(1);
		deptest.setName("Food");
		departmentDao.update(deptest);
		System.out.println("Update Completed");
		System.out.println("=================================================================================================================================================================");

		System.out.println("\n ==== TEST 5 : Department delete ==== ");
		System.out.println("Enter id for deled test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.print("Delete completed");
		
		sc.close();
	}

}
