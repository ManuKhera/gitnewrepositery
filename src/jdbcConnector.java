import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnector {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":" +port+ "/Qadbt","root","admin");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Emp where id=5");
		while(rs.next())
		{
		System.out.println(rs.getString("name"));
		
		}
		
		
	}

}
