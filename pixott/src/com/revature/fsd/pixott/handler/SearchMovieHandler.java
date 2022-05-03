
	package com.revature.fsd.pixott.handler;

	import java.util.List;

	import com.revature.fsd.pixott.dao.SearchMovie;
	import com.revature.fsd.pixott.model.MovieSearch;

	public class SearchMovieHandler {
		public static void display() {
			System.out.println("enter the movie name to search ");
			String keyword=App.scanner.nextLine();
			keyword+=App.scanner.nextLine();
			SearchMovie search=new  SearchMovie();
			List<MovieSearch> movie=search.Search(keyword);
			movie.forEach(System.out::println);
				
			
			}

	}


