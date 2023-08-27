package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller sellerObj = new Seller(21, "Bob", "bob@gmail.com", LocalDate.parse("1986-04-08", formatter), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sellerObj);
	}

}
