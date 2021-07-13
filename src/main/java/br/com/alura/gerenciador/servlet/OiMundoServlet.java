package br.com.alura.gerenciador.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        PrintWriter out =  res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Oi Servlet </h1> ");
        out.println("</body>");
        out.println("</html>");
    }
}
