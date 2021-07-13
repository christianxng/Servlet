<%@ page import = "java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<html>
    <body>
    <h2> Lista de empresas</h2> <br/>
       <ul>
           <%
             List<Empresa> empresas = ( List<Empresa>) request.getAttribute("lista");
             for (Empresa empresa: empresas) {
           %>
                  <li> <%= empresa.getNome() %> </li>
           <%  } %>
       </ul>
    </body>
</html>