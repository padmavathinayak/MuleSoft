package Misc;

import java.sql.*;
import java.util.*;

public class GetFavoriteMovies {
	
	public static void main(String args[]) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Rachana#7");
			
			Statement st = con.createStatement();
	
			
			st.executeUpdate("USE Movies;");
			
			
			ResultSet res = st.executeQuery("SELECT * FROM favorites");
			
			System.out.println("NAME \t\t MAIN ACTOR \t\t MAIN ACTRESS \t\t DIRECTOR\n");
			
			while(res.next()) {
				
				System.out.println(res.getString(1) + " \t\t " + res.getString(2) + " \t\t " + res.getInt(3) + " \t\t " + res.getString(4));
				
			}
						
			System.out.println("Complete");
			
			con.close();
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
