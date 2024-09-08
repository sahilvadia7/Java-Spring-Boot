package JDBC1.Maven_demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import  JDBC1.Maven_demo1.*;

public class studentRunner {

		public static void main(String[] args) throws SQLException {
			
			//database
			String url="jdbc:postgresql://localhost:5433/student";
			String uname="postgres";
			String pass = "root";
		
			//objects
			Connection con = DriverManager.getConnection(url,uname,pass);
			Scanner sc = new Scanner(System.in);
			student stu = new student();
			
			//variables
			int opt;
			
//			
//			do {
//				System.out.println("1. Add Student");
//				System.out.println("2. Get Student");
//				System.out.println("Select Option: ");
//				opt = sc.nextInt();
//			}while(opt!=0);

			
			System.out.print("Enter Student id : ");
			stu.setId(sc.nextInt());
			
			System.out.print("Enter Student Name : ");
			stu.setName(sc.next());
			
			System.out.print("Enter Student Marks : ");
			stu.setMarks(sc.nextInt());
					
			StudentService ss = new StudentService();
			ss.addStudent(con,stu);
			
			sc.close();
		}
}
