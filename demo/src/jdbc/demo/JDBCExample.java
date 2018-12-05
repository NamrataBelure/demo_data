package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/registration";

	   //  Database credentials
	   static final String USER="userName";
	   static final String PASS="passWord";
	   
	   public static void main(String[] args)  {
	    Connection con=null;
	    Statement stmt=null;
	    ResultSet rs=null;
	    String sql;
	    try{
	    	
	    
	    //STEP 2: Register JDBC driver
	    Class.forName("com.mysql.jdbc.Driver");
	    
	  //STEP 3: Open a connection
		System.out.println("connecting to a selected database");
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("Connected Database Successfully....");
		
		  //STEP 4: Execute a query
		   System.out.println("Creating table in given Database...");
		   stmt=con.createStatement();
		    sql="CREATE TABLE REGISTRATION"+"(userId INTEGER not null,"+"UserFName varchar(30),"+"UserLName varchar(30),"+"userAge INTEGER(10),"+"PRIMARY KEY( userid ))";
		   stmt.executeUpdate(sql);
		   System.out.println("Creating table in given Database..");
		   
		   
		  //STEP 5: Deleting a query
		   System.out.println("Deleting table in given database...");
		      stmt = con.createStatement();
		       sql = "DROP TABLE REGISTRATION ";
		   
		    //STEP 5: Inserting a query
		      System.out.println("Inserting records into the table...");
		      stmt = con.createStatement();
		      
		      sql = "INSERT INTO Registration " +
		                   "VALUES (100, 'ANU', 'PATIL', 18)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (101, 'ASAD', 'SHAKH', 15)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (102, 'ASLAM', 'INAMDAR', 30)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES(103, 'HARSH', 'BELURE', 28)";
		      stmt.executeUpdate(sql);
		      System.out.println("Inserted records into the table...");
		      
		      
		       sql = "SELECT id, first, last, age FROM Registration";
		       rs = stmt.executeQuery(sql);
		      
		       sql = "UPDATE Registration " +
	                   "SET age = 30 WHERE id in (100, 101)";
	           stmt.executeUpdate(sql);
	           
		      //STEP 7: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs.close();

	    }
	    catch (SQLException se) {
	    	 //Handle errors for JDBC
	        se.printStackTrace();
	   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
			   //finally block used to close resources
		   
			 try {
				if (stmt!=null) {
					con.close();
				}
			} catch (SQLException se) {	}  
		   }
		   try {
			if (con!=null) {
				con.close();
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		   System.out.println("Goodbye!");
	   }
}
