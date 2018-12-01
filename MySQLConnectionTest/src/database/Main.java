package database;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		DBConnection connection = new DBConnection();
		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);

		String name = br.readLine();
		System.out.println("Corresponding names in the table: " + connection.isName(name));

	}

}
