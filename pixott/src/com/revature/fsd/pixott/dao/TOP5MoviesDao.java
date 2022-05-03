package com.revature.fsd.pixott.dao;

public class TOP5MoviesDao {
	
		public  List<Top5movies> Top() {
		String sql="select *from top5movies ";
		ArrayList<top5movies> result =new ArrayList<>();
		try (
				Connection conn =Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);	
				) {
		           ResultSet rs=stmt.executeQuery(sql);
		           while(rs.next()){
					Top5movies review = new Top5();
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

