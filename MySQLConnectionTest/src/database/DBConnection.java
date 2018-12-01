package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kEssen?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "answldud93");
			st = con.createStatement();
			System.out.println("Connection Successful");
		}
		catch(Exception e) {
			System.out.println("Database Connection Error: " + e.getMessage());
		}
	}
	public boolean isName(String name) {
		try {
			String SQL = "SELECT * FROM CUSTOMERINFO WHERE NAME = '" + name + "'";
			rs = st.executeQuery(SQL);
				if(rs.next()) {
					return true;
				}
			}
		catch(Exception e) {
			System.out.println("Database Search Error: " + e.getMessage());
		}
		return false;
	}
}
