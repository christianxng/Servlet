package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
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
        Empresa empresa = new Empresa(req.getParameter("nome"));
        Banco banco = new Banco();
        banco.adiciona(empresa);

        //enviando informação para o JSP de empresa Cadastrada
         RequestDispatcher rd = req.getRequestDispatcher("/empresaCadastrada.jsp");
         req.setAttribute("nome", empresa.getNome());
         rd.forward(req,resp);
    }


}
