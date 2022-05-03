package com.revature.fsd.pixott.handler;

public class UserTop5{
	
		

		public static void display() {
			System.out.println("UserMenu");
			System.out.println("*****");
			System.out.println("1] view top 5 movies");
			System.out.println("2] search movies");
			System.out.println("3] your wish list");
			System.out.println("4] view history");
			System.out.println("5] logout");
			System.out.println("select option;");
			int option = App.scanner.nextInt();
			if(option==1) {
				 UserTop5.display();
				
			}else if(option==2) {
				SearchMovieHandler.display();
			}
		}

	}


