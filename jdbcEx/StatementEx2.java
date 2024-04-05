package jdbcEx;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.Scanner;

	public class StatementEx2 {

		Connection connection;
		Statement statement;
		ResultSet resultset;
		
		public StatementEx2() throws ClassNotFoundException, SQLException {
			connection = MyConnection.getmyConnection();
			System.out.println("Connection get Open");
		}
		public void getCustomerById(int Id) throws SQLException {
			statement = connection.createStatement();
			resultset = statement.executeQuery("select*from Customer where CustId="+Id);
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
			StatementEx2 obj = new StatementEx2();
			Scanner sc=new Scanner(System.in);
			int id = sc.nextInt();
			obj.getCustomerById(id);
			obj.close();

		}
}