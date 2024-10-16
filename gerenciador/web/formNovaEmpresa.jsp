<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<c:url value="/NovaEmpresa" var="linkServletNovaEmpresa"/>


<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro da EMPRESA</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        
        
        <form action="${linkServletNovaEmpresa}" method="post">
            
            Nome: <input type="text" name="nome" />
            Data Abertura: <input type="text" name="data"/>
            <input type="submit"/>
            
        </form>
    </body>
</html>
