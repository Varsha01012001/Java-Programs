package jdbcEx;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getmyConnection();
		System.out.println("connection get open");
	}

	public void insertCustomer(int id, String name, String address, String phoneNo) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.setString(3, phoneNo);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + "record is inserted");
	}
  public void getCustomerByCity(String city) throws SQLException
  {
	  preparedStatement = connection.prepareStatement("select*from customer where custAddress = ?");
	  preparedStatement.setString(1, city);
	  
	  resultSet = preparedStatement.executeQuery();
	  while(resultSet.next()) {
		  System.out.println(resultSet.getInt("CustId")+"\t");
		  System.out.println(resultSet.getString("CustName")+"\t");
		  System.out.println(resultSet.getString("CustAddress")+"\t");
		  System.out.println(resultSet.getString("CustphoneNo")+"\t");
		  
	  }
	  public static void main(String[]args){
		  PreparedStatementEx 
	  }
	  }
  }


