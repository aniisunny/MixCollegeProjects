package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingOracle {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//step 2: register JDBC driver
			Class.forName ( "oracle.jdbc.driver.OracleDriver" );
			
			//step 3: open a connection
			System.out.println ( "Connecting to database..." );
			conn = DriverManager.getConnection ( "jdbc::oracle:thin:@localhost:1521:XE", "system", "1234" );
			
			//step 4 : Exceute a query 
			System.out.println ( "Creating statement... " );
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery( "select * from student" );
			
			//step 5 : Extract data from result set
			while ( rs.next () ) {
				
				//Retrieve by column name
				String rollno = rs.getString ( "ROLLNO" );
				String name = rs.getString ( 2 );
				String date_adm = rs.getString ( "DATE_ADM" );
				String per = rs.getString ( 4 );
				
				//Display values
				System.out.print ( "Roll Number: " + rollno );
				System.out.print ( ", Name: " + name );
				System.out.print ( ", Adm date: " + date_adm );
				System.out.print ( ", Percentage: " + per );
				
			}
			
			//step 6 : clean up - environment
			rs.close ();
			stmt.close();
			conn.close ();
			
		}
		
		catch ( SQLException se ) {
			System.out.println("1");
			//handle errors for JDBC
			se.printStackTrace ();
			
		}
		
		catch ( Exception e ) {
		System.out.println("2");
			//handle errors for class.forName
			e.printStackTrace ();
			
		}
		
		finally {
			
			//finally block used to close resources
			try {
				
				if ( stmt != null ) 
					stmt.close ();
				
			}
			
			catch ( SQLException se2 ) {
				System.out.println("3");
			} //nothing we can do
		
			try {
			
				if ( conn != null )
					conn.close ();
			
		}
		
			catch ( SQLException se ) {
				System.out.println("4");
			} 

		} //end finally 
		
		System.out.println ( "Goodbye!" );

	}

}
