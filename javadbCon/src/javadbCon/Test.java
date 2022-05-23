package javadbCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String args[])
	  {
	    try
	    {
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection conn = DriverManager.getConnection(
	      "jdbc:mysql://localhost:3307/projetIntegration", "root", "root");
	      Statement stmt = conn.createStatement();
	      ResultSet res = stmt.executeQuery("SELECT * FROM users");
		  
	      while(res.next())
			//parcourir le resultat
	        System.out.println(res.getInt(1)+"  "+res.getString(2)
	        +"  "+res.getString(3));
	      conn.close();
	    }
	    catch(Exception e){ 
	      System.out.println(e);
	    }
	  }
}
