package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Insert {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simon","root","");
	
	PreparedStatement preparedStatement = connection.prepareStatement("insert into info values(?,?)");
	preparedStatement.setString(1,"Simon");
	preparedStatement.setInt(2, 11);
	preparedStatement.execute();
	System.out.println("Inserted");
	connection.close();
}
}
