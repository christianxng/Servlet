<%
    String nomeEmpresa = (String) request.getAttribute("nome");
%>
<html>
    <body>
      <h1>Empresa cadastrada: <%= nomeEmpresa %> </h1>
    </body>
</html>