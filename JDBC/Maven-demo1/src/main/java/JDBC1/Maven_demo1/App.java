package JDBC1.Maven_demo1;
import java.sql.*;
import java.util.*;

public class App 
{
	/*
	 * import packages
	 * load and register
	 * create statement
	 * execute statement
	 * process the result
	 * close
	 * */
	
    public static void main( String[] args ) throws Exception  {
    	
    	Scanner sc = new Scanner(System.in);
    	String url="jdbc:postgresql://localhost:5433/postgres";
    	String uname="postgres";
    	String pass = "root";
    	
    	//query's
    	String fetchData = "Select * from student ";
    	String addData = "insert into student values (4,'ankit',97)";
    	
    	//not working 
    	String updatedata = "update student set Sresult=88  where Sname='aryan'";
    	
    	//prepared query
    	String presql = "insert into student values (?,?,?)";
    	int sid = 51;
    	String name = "tanvi";
    	int marks = 87;
    	
    	//it is not mandatory
		//    	try {
		//    		Class.forName("org.postgresql.Driver");		
		//    	}catch(Exception e) {
		//    		System.out.println(e);
		//    	}
    	
    	//interface
    	Connection con = DriverManager.getConnection(url,uname,pass);
    	Statement st = con.createStatement();
    	
    	
    	int opt;
    	System.out.print("Enter value: ");
    	opt = sc.nextInt();
    	
    	switch(opt) {
    		case 1:
    					//	fetch data
    					ResultSet result = st.executeQuery(fetchData);
    					while(result.next()) {
    			        	System.out.print(result.getInt(1) + " ");
    			        	System.out.print(result.getString(2) + " ");
    			        	System.out.println(result.getInt(3));        	
    			        	
    			    	}
    					break;
    					
    		case 2:    	
    					//add data
    					boolean status = st.execute(addData);
    					String result1 = status ? "true" : "false";
    					if(result1.equalsIgnoreCase("false")) {
    						System.out.println("Data added");
    					}else {
    						System.out.println("Something wrong");
    					}
    					break;
    
    		case 3:
    					//update data
    					 st.execute(updatedata);
    					break;
    					
    		case 4: 
    					//prepared statement or Query
    				PreparedStatement pst = con.prepareStatement(presql);
    				pst.setInt(1, sid);
    				pst.setString(2, name);
    				pst.setInt(3, marks);
    				pst.execute();
    				System.out.println("Data stored!");
    				break;
    				
    		default:
    					System.out.println("option not found");
    					break;
    	}
    
    	
    	
    	
    	

    	

    	con.close();
        
    }
}
