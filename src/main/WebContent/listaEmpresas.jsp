<%@ page import = "java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Lista de Empresas</title>
    </head>
    <body>
       <h2> Lista de empresas </h2> <br/>
       <ul>
            <c:forEach items="${lista}" var="empresa">
                <li> ${empresa.nome} - <fmt:formatDate  pattern = "dd/MM/yyyy" value= "${empresa.dataAbertura}" /> </li>
            </c:forEach>
       </ul>
    </body>
</html>