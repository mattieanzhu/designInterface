package interfaceTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBReader implements ReadTestingData {
	
	@Override
	public void read(String dataInfo) {
		try {
			Connection connection = DriverManager.getConnection(dataInfo, "root", "root");
			PreparedStatement ps = connection.prepareStatement("SELECT FirstName, LastName, School FROM StudentTable");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("firstName") + " "+ rs.getString("lastName") + " " + rs.getString("School"));
			}
	} catch (SQLException e) {
		System.out.println("Error, connection not found");

	}	
}
	
	@Override
	public void print() {
		
	}
	
	@Override
	public void save() {
		
	}
}
