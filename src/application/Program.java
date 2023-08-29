package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test 1: seller findById ---");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		//is going to be printed the seller's info found in the id 3 row
		
		System.out.println("\n--- Test 2: seller findByDepartment ---");
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller obj : list) {
			System.out.println(obj);
			
			//its going to be printed all the Sellers who works at our chosen department
			//and also, all of then are referring to the same object (the chosen department)
		}
		
		System.out.println("\n--- Test 3: seller findAll ---");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
			
			//printing all the sellers sorted by name
		}
		
		System.out.println("\n--- Test 4: seller insert ---");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		//a new seller is going to be inserted in our database
	
		
		//the info is going to be collected from our database
	}

}
