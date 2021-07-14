package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Empresa empresa = null;
        try {
            SimpleDateFormat format =  new SimpleDateFormat("dd/MM/yyyy");
            empresa = new Empresa(req.getParameter("nome"), format.parse(req.getParameter("dataAbertura")));
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        Banco banco = new Banco();
        banco.adiciona(empresa);

        //enviando informação para o JSP de empresa Cadastrada
        req.setAttribute("nome", empresa.getNome());
        resp.sendRedirect("listaEmpresas");

//        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//         rd.forward(req,resp);
    }


}
