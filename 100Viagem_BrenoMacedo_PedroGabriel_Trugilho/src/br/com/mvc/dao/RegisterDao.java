package br.com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.viagem.model.Usuario;
import br.com.mvc.util.DBConnection;
 
public class RegisterDao {
  
 public String registerUser(Usuario user)
 {
 String usuario = user.getUsuario();
 String cpf = user.getcpf();
 String senha = user.getSenha();
  
 Connection con = null;
 PreparedStatement preparedStatement = null;
  
 try
 {
 con = DBConnection.createConnection();
 String query = "insert into usuarios(id,usuario,senha) values (?,?,?)"; //Insert user details into the table 'USERS'
 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
 preparedStatement.setString(1, cpf);
 preparedStatement.setString(2, usuario);
 preparedStatement.setString(3, senha);
  
 int i= preparedStatement.executeUpdate();
  
 if (i!=0)  //Just to ensure data has been inserted into the database
 return "SUCCESS"; 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }

}
