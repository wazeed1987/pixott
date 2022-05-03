
	package com.revature.fsd.pixott.dao;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.MovieSearch;

	public class SearchMovie {
		public  List<MovieSearch> Search(String Keyword) {
			String Ari="%";
			String sql=String.format("select *from movie where name like'%s%s%s';",Ari,Keyword,Ari);
			ArrayList<MovieSearch> result =new ArrayList<>();
			try (
					Connection conn =Util.getConnection();
					PreparedStatement stmt = conn.prepareStatement(sql);	
					) {
			           ResultSet rs=stmt.executeQuery(sql);
			           while(rs.next()){
						MovieSearch review = new MovieSearch();
						review.setName(rs.getString("name"));
						review.setId(rs.getInt("id"));
						result.add(review);
			           }
					}catch (SQLException e) {
						System.out.println(e.getMessage());
					
					}
					return result;
			
		}


	}


