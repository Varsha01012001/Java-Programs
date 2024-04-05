package jdbcEx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getmyConnection();
		System.out.println("Connection get Open");
	}
	public void getCustomers() throws SQLException {
		statement = connection.createStatement();
		resultset = statement.executeQuery("select*from Customer");
		while(resultset.next()) {
			System.out.print(resultset.getInt("CustId")+"\t");
			System.out.print(resultset.getString("CustName")+"\t");
			System.out.print(resultset.getString("CustAddress")+"\t");
			//System.out.println(resultset.getInt("Phone_no"));
			System.out.println();
			
		}
	}
	public void close() throws SQLException {
		connection.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx obj = new StatementEx();
		obj.getCustomers();
		obj.close();

	}

}
