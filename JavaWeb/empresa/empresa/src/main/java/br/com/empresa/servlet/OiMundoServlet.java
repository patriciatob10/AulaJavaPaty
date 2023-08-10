package br.com.empresa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		PrintWriter  out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Página vinda do servidor web como HTML</h1>");
		out.println("Feita por Patricia");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
