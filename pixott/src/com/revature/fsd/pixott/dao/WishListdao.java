package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.MovieSearch;

public class WishListdao {
	public static void addwishllist(int id,int user) {
		String sql = "insert into wishlist (wishlist_id,user_id) values (?,?);";
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			           stmt.setInt(1, id);
			           stmt.setInt(2, user);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	}
		
		public List<MovieSearch> view(int id ){
		String sql="select *from wishlist inner join on movie on wishlist_id=movie.id inner join customer on user_id=? where customer.id=?";
		List<MovieSearch> show=new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			           stmt.setInt(1, id);
			           stmt.setInt(2, id);
			           ResultSet rs= stmt.executeQuery();
			   		while(rs.next()) {
			   			MovieSearch sh=new MovieSearch();
			   			sh.setId(rs.getInt("wishlist_id"));
			   			sh.setName(rs.getString("name"));
			   		}
			   }catch (SQLException e) {
			   	Util.displayMessage(e);
			   }
			   	return show;
			   }
		
	
		
	

}