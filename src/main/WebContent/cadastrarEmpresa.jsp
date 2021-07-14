<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value = "/novaEmpresa" var="linkNovaEmpresa"/>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Cadastro de Empresa</title>
    </head>
    <body>
        <h2>Informe a empresa que deseja cadastrar</h2>
        <form action="${linkNovaEmpresa}" method="post">
            Nome: <input type="text" name="nome"/>
            Data Abertura: <input type="text" name="dataAbertura"/>
            <input type="submit"/>
        </form>
    </body>
</html>