package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) throws SQLException {
		Connection c = new ConnectionFactory().getConnection();
		
		//PreparedStatement prepareStatement = c.prepareStatement("Select * From");
		//...
		
	}
}
