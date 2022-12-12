package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;


public class ResultStore  {
	Connection conn =null;
	
	public void getResult(String name, String score)  {
		
		MakeConnection mkc = new MakeConnection();
		conn=mkc.getConnectionMethod();
		try {
			PreparedStatement pmt = conn.prepareStatement("insert into result(student_name, student_score) values( ?,? )");
			pmt.setString(1, name);
			pmt.setString(2, score);
			pmt.execute();
		
			/*	PreparedStatement pmt = connection.prepareStatement("select * from result");
			 ResultSet rs = pmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
			}*/
		
			System.out.println("Successfully Stored result");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	

}
