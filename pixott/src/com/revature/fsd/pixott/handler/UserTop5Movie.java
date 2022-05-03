package com.revature.fsd.pixott.handler;

public class UserTop5Movie {
	public static void display() {
		Top5Moviedao user=new Top5Moviedao();
		List<Top5> show=user.Top();
		System.out.println(String.format("%s %-40s", "id","name"));
		show.forEach(System.out::println);
		UserMenu.display();
	}

}
