package Practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import jdbcEx.MyConnection;

public class StudMangeEx {
	Connection connection;
	Statement statement;
	Resultset resultset;

	public StudMangeEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getmyConnection();
		System.out.println("connection get open");
	}

	public void getStud_By_Email_Id() throws SQLException {
		statement = connection.createStatement();
		resultset= statement.executeQuery("selct * from Student_Management");
		while(resultset.next()) {
			
		}
	}
	

	public static void main(String[] args) {
		

	}

}
