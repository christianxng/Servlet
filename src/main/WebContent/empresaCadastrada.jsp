<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Empresa cadastrada</title>
    </head>
    <body>
    <c:if test = "${not empty nome}">
        <h1>Empresa cadastrada: ${nome} </h1>
    </c:if>
    <c:if test = "${empty nome}">
            <h1>Atenção. Nenhuma empresa cadastrada </h1>
        </c:if>
    </body>
</html>