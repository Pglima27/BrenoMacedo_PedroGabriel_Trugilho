package br.com.viagem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.viagem.model.Usuario;
import br.com.mvc.dao.RegisterDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		 String cpf = request.getParameter("cpf");
		 String senha = request.getParameter("senha");
		  
		 
		//Using Java Beans - An easiest way to play with group of related data
		 Usuario user = new Usuario();
			user.setUsuario(usuario);
			user.setSenha(senha);
			user.setcpf(cpf);
		  
		 RegisterDao registerDao = new RegisterDao();
		  
		//The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		 String userRegistered = registerDao.registerUser(user);
		  
		 if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		 {
		 request.getRequestDispatcher("/home1.jsp").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
		 request.setAttribute("errMessage", userRegistered);
		 request.getRequestDispatcher("/Register.jsp").forward(request, response);}
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
