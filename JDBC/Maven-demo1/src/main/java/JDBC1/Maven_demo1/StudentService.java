package JDBC1.Maven_demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentService{
	
		public void addStudent(Connection con,student s) throws SQLException {
			
				//prepared query
		    	String presql = "insert into studentdetail values (?,?,?)";
		    	PreparedStatement pst = con.prepareStatement(presql);

				pst.setInt(1, s.getId());
				pst.setString(2, s.getName());
				pst.setInt(3, s.getMarks());
				pst.execute();
				System.out.println("Data stored!");
								
			}



}
