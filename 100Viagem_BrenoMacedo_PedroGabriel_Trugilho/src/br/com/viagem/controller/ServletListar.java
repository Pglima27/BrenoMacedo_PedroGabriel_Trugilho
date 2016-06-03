package br.com.viagem.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import br.com.viagem.model.Pais;

/**
 * Servlet implementation class ServletListar
 */
@WebServlet("/ServletListar")
public class ServletListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Pais> lista = new ArrayList<Pais>();
		Listar tabela = new Listar();
		 
		Pais pais = new Pais();
		pais.setPais(request.getParameter("pais"));
		lista = tabela.listar();
		request.setAttribute("x", lista.size());
		request.setAttribute("listapaises", lista);
		RequestDispatcher view = request.getRequestDispatcher("mundo.jsp");  
        view.forward (request,response);         

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
