package br.com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection createConnection()
{
Connection con = null;
String url = "jdbc:mysql://localhost:3306/Viagem"; //for SQL and oracle or any other db server this url differs. where ravi is the database name and 3306 is the port where mysql is running
String usuario = "root"; //username of database user
String senha = "1234";	 //password

try
{
try
{
Class.forName("com.mysql.jdbc.Driver");// differs from DB server to server
}
catch (ClassNotFoundException e)
{
e.printStackTrace();
}

con = DriverManager.getConnection(url, usuario, senha);

}
catch (Exception e)
{
e.printStackTrace();
}

return con;
}
}	