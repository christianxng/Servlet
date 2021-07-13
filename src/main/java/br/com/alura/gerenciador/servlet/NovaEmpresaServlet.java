package br.com.alura.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =  resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Empresa cadastrada: "+req.getParameter("nome")+"</h1> ");
        out.println("</body>");
        out.println("</html>");

        Empresa empresa = new Empresa(req.getParameter("nome"));
        Banco banco = new Banco();
        banco.adiciona(empresa);
    }


}
