package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetriving {
	Connection conn=null;
	public void getData() {
		MakeConnection mkc1 = new MakeConnection();
	conn  =	mkc1.getConnectionMethod();
	try {
	   PreparedStatement pmt1 =	conn.prepareStatement("select * from result order by Student_Score desc;");
	//   pmt1.setString(1, "Gaurav Patil");
	   ResultSet rs =pmt1.executeQuery();
	 while(rs.next()) {
		 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	 }
	 System.out.println("Data Retrived successfully");
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
	}
	public static void main(String[] args) throws SQLException {

		UserName up = new UserName();
	
		//up.getUserName();
		DataRetriving dr= new DataRetriving();
		dr.getData();
		
		
	}

}
