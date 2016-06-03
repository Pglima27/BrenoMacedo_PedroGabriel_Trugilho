package br.com.viagem.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.mvc.util.DBConnection;
import br.com.viagem.model.Pais;
 
public class Listar {
	

	public List<Pais> listar() {
		Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		ArrayList<Pais> lista = new ArrayList<Pais>();
		try {
			con = DBConnection.createConnection(); //establishing connection
			 statement = con.createStatement(); //Statement is used to write queries. Read more about it.
			 resultSet = statement.executeQuery("select pais from paises"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
			
			while (resultSet.next()) {
				Pais pais = new Pais();
				pais.setPais(resultSet.getString("pais"));
				lista.add(pais);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
}
}