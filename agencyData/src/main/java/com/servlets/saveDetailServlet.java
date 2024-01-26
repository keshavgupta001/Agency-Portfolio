package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.dataStored;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class saveDetailServlet
 */
public class saveDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public saveDetailServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			//name email message fetch
			String name = request.getParameter("Name");
			String email = request.getParameter("Email");
			String message = request.getParameter("Message");
			
			dataStored ds = new dataStored(name, email, message);
			
			
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			s.persist(ds);
			tx.commit();
			s.close();
//			out.println("<script>");
			out.println("Details Received!");
//			out.println("</script>");
//			out.println("document.getElementById('myForm').reset();"); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
