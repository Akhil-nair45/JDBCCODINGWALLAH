package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	
	public void createDb() {

//		5 steps of JDBC :-
//		Step-1: Driver Load
		//load the driver by going to project left click of jdbctutorial and go to last option properties then go to javabuildpath then go to libraries and click on classpath then click on add external jars go to c drive go to programm files x86 and go to mysql click on connector j inside javamysqlconnecto open that and apply and apply close now save the project and re run it
		
//		Step-2: Conn establish 
//		try {
//			String url= "jdbc:mysql://localhost:3306/";  // it is not compulsory to write port number if db is online u have to mention unless if it is offline then it is not compulsory to write port number
//			String userName= "root";
//			String password= "root";
//			Connection con = DriverManager.getConnection(url, userName, password);
//			
//			Step-3: Statement create
//			Statement stm = con.createStatement();
			
//			Step-4: Execute-Query
			//to create a new database
//			String query = "create database codingwallahjdbc)";
//			boolean b = stm.execute(query);
//			System.out.println("Database Created Successfully!");
//			
//			Step-5: close Conn
////			con.close();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		
	}
	public void createTable() {
//		5 steps of JDBC :-
//		Step-1: Driver Load
		//load the driver by going to project left click of jdbctutorial and go to last option properties then go to javabuildpath then go to libraries and click on classpath then click on add external jars go to c drive go to programm files x86 and go to mysql click on connector j inside javamysqlconnecto open that and apply and apply close now save the project and re run it
		
//		Step-2: Conn establish 
//		try {
//			String url= "jdbc:mysql://localhost:3306/codingwallahjDBC";  // it is not compulsory to write port number if db is online u have to mention unless if it is offline then it is not compulsory to write port number
//			String userName= "root";
//			String password= "root";
//			Connection con = DriverManager.getConnection(url, userName, password);
//			
//			Step-3: Statement create
//			Statement stm = con.createStatement();
			
//			Step-4: Execute-Query
			//to create a new database
//			String query = "create table student(sid int(3), sname varchar(200), semail varchar(200))";
//			boolean b = stm.execute(query);
//			System.out.println("Table Created Successfully!");
//			
//			Step-5: close Conn
//			con.close();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		
	}
	public void createData() {
//		5 steps of JDBC :-
//		Step-1: Driver Load
		//load the driver by going to project left click of jdbctutorial and go to last option properties then go to javabuildpath then go to libraries and click on classpath then click on add external jars go to c drive go to programm files x86 and go to mysql click on connector j inside javamysqlconnecto open that and apply and apply close now save the project and re run it
		
//		Step-2: Conn establish 
//		try {
//			String url= "jdbc:mysql://localhost:3306/";  // it is not compulsory to write port number if db is online u have to mention unless if it is offline then it is not compulsory to write port number
//			String db= "codingwallahjdbc";
//			String userName= "root";
//			String password= "root";
//			Connection con = DriverManager.getConnection(url+db, userName, password);
//			String query = "INSERT into student (sid, sname, semail) VALUES (?,?,?)";
//			Step-3: Statement create
//			PreparedStatement pstm = con.prepareStatement(query);
//			pstm.setInt(1, 10);
//			pstm.setString(2, "Shivam");
//			pstm.setString(3, "shivam@gmail.com");
//			
//			pstm.execute();
//			System.out.println("Data inserted Successfully!");
			
//			Step-5: close Conn
//			con.close();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	}
	
	public void readData() {
//		
////		5 steps of JDBC :-
////		Step-1: Driver Load
//		//load the driver by going to project left click of jdbctutorial and go to last option properties then go to javabuildpath then go to libraries and click on classpath then click on add external jars go to c drive go to programm files x86 and go to mysql click on connector j inside javamysqlconnecto open that and apply and apply close now save the project and re run it
//		
////		Step-2: Conn establish 
//		try {
//			String url= "jdbc:mysql://localhost:3306/";  // it is not compulsory to write port number if db is online u have to mention unless if it is offline then it is not compulsory to write port number
//			String db= "codingwallahjdbc";
//			String userName= "root";
//			String password= "root";
//			Connection con = DriverManager.getConnection(url+db, userName, password);
//			String query = "select * from student";
////			Step-3: Statement create
//			Statement st= con.createStatement();
//		
//			ResultSet rs = st.executeQuery(query);
//			while(rs.next())
//			{
//				System.out.println(" id = "+rs.getInt(1));
//				System.out.println(" name = "+rs.getString(2));
//				System.out.println(" email = "+rs.getString(3));
//			}
//			System.out.println("Read Successfully!");
//			
////			Step-5: close Conn
//			con.close();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
	}
	public void updateData() {
//		5 steps of JDBC :-
//		Step-1: Driver Load
		//load the driver by going to project left click of jdbctutorial and go to last option properties then go to javabuildpath then go to libraries and click on classpath then click on add external jars go to c drive go to programm files x86 and go to mysql click on connector j inside javamysqlconnecto open that and apply and apply close now save the project and re run it
		
//		Step-2: Conn establish 
		try {
			String url= "jdbc:mysql://localhost:3306/";  // it is not compulsory to write port number if db is online u have to mention unless if it is offline then it is not compulsory to write port number
			String db= "codingwallahjdbc";
			String userName= "root";
			String password= "root";
			Connection con = DriverManager.getConnection(url+db, userName, password);
			String query = " UPDATE student set sid = ? where sname =?";
//			Step-3: Statement create
			PreparedStatement pstm= con.prepareStatement(query);
			pstm.setInt(1, 12);
			pstm.setString(2, "Shubham");
		
			pstm.execute();
			System.out.println("Data Updated Successfully!");
			
//			Step-5: close Conn
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	
		
	

	

		

