package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static private final String DB_URL = "jdbc:mysql://localhost:3306/kEssen";
	static private final String SERVERTIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	static private final String USERNAME = "root";
	static private final String PASSWORD = "1234";
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL + SERVERTIMEZONE, USERNAME, PASSWORD);
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
