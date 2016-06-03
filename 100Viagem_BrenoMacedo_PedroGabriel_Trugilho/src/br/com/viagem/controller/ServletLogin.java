package br.com.viagem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;



import br.com.mvc.dao.LoginDao;
import br.com.viagem.model.Usuario;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		Usuario user = new Usuario();
		user.setUsuario(usuario);
		user.setSenha(senha);
		LoginDao loginDao = new LoginDao();
		String userValidate = loginDao.authenticateUser(user);
		if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
		 {
			HttpSession session = request.getSession();
            session.setAttribute("usuario", user.getUsuario());
            session.setMaxInactiveInterval(30*60);
            response.sendRedirect("homeSucess.jsp");
		 }
		 else
		 {
		 request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
		 request.getRequestDispatcher("/login1.jsp").forward(request, response);//forwarding the request
		 }

	}

}
