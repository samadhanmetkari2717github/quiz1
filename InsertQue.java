package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQue {
	Connection conn= null;
	public void method () {
		MakeConnection mkc =new MakeConnection();
		conn = mkc.connectionMethod();
		
	try {
		PreparedStatement pmt =	conn.prepareStatement("insert into que(que,option_1,option_2,option_3,option_4) values(?,?,?,?,?)");
		pmt.setObject(1, "q1");
		pmt.setObject(2, "q2");
		pmt.setObject(3, "q3");
		pmt.setObject(4, "q4");
		pmt.setObject(5, "q4");
		
		pmt.execute();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		//System.out.println("successfully");
		
	}
	/*public static void main(String[] args) {
		InsertQue iq = new InsertQue();
		iq.method();
	}*/
}
