package br.com.mvc.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.viagem.model.Usuario;
import br.com.mvc.util.DBConnection;
public class LoginDao {
	public String authenticateUser(Usuario user)
	 {
	 
	String usuario = user.getUsuario(); //Keeping user entered values in temporary variables.
	 String senha = user.getSenha();
	 
	Connection con = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	String userNameDB = "";
	 String passwordDB = "";
	 try
	 {
	 con = DBConnection.createConnection(); //establishing connection
	 statement = con.createStatement(); //Statement is used to write queries. Read more about it.
	 resultSet = statement.executeQuery("select usuario,senha from usuarios"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
	 
	while(resultSet.next()) // Until next row is present otherwise it return false
	 {
	  userNameDB = resultSet.getString("usuario"); //fetch the values present in database
	  passwordDB = resultSet.getString("senha");
	 
	   if(usuario.equals(userNameDB) && senha.equals(passwordDB))
	   {
	      return "SUCCESS"; 
	   }
	 }}
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid user credentials"; 
}
}

