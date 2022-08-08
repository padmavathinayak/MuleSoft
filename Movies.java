package Misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class MovieDB {
	
	public static void main(String args[]) {
		try {
						
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			
			Statement st = con.createStatement();			
			st.executeUpdate("CREATE DATABASE Movies");
			st.executeUpdate("USE Movies;");
			st.executeUpdate("CREATE TABLE favorites( movie_name VARCHAR(30), main_actor VARCHAR(25), main_actress VARCHAR(25), director VARCHAR(25));"); 			
			st.executeUpdate("INSERT INTO favorites VALUES('Bahubali','Prabhas','Anushka','Rajamouli');");
			st.executeUpdate("INSERT INTO favorites VALUES('RRR','NTR','Alia','Rajamouli');");
			st.executeUpdate("INSERT INTO favorites VALUES('Ra.One','SRK','Kareena','Anubhav sinha');");
			st.executeUpdate("INSERT INTO favorites VALUES('Eega','Nani','Samantha','Rajamouli');");
			st.executeUpdate("INSERT INTO favorites VALUES('Chennai Express','SRK','Deepika Padukone','Rohit Setty');");
			
			
			System.out.println("Complete");
			
			con.close();
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
