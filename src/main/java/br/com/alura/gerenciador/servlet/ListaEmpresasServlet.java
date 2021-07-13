package br.com.alura.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Empresa> empresas = banco.getEmpresas();

        PrintWriter out =  resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<ul>");
        for (Empresa empresa: empresas) {
            out.println("<li>" + empresa.getNome()+"</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }


}