
	package com.revature.fsd.pixott.handler;

	import com.revature.fsd.pixott.dao.CustomerDao;
	import com.revature.fsd.pixott.model.Customer;

	public class LoginHandler {
		public static void display() {
			System.out.println("enter mobie number");
			String mobile = App.scanner.next();
			System.out.println("enter password");
			String pass = App.scanner.next();
			CustomerDao dao = new CustomerDao();
			Customer customer = dao.getUser(mobile);
			//System.out.println(customer);
			if (customer.getPassword().equals(pass)) {
				System.out.println("Login Successful");
				Admin.main();
				} else {
				System.out.println("Invalid mobile number or password.");
			}
		}
	}


