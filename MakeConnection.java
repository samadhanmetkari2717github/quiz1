package demo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class MakeConnection {
	
		Connection connection = null;
		public Connection getConnectionMethod() {
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Root");
					
			}catch (Exception e) {
				System.out.println(e);
			}
			return  connection;
		}
		

	}



