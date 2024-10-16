
<%@ page import = "java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de EMPRESAS</title>
    </head>
    <body>
        
        <c:if test="${not empty empresa}">
            <p> Empresa ${ empresa } Cadastrada com sucesso    </p>
        </c:if>
        <c:if test="${empty empresa}">
            Nenhuma empresa Cadastrada
        </c:if>
            <p>
        Lista de Empresas, segue a ordem:  </br>
            </p>
        <ul>
            <c:forEach items="${empresas}" var="empresa">
                <li>
                    ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy"/>
                    <a href="/gerenciador/mostraEmpresa?id=${empresa.id}"> Editar</a>
                    <a href="/gerenciador/removeEmpresa?id=${empresa.id}"> remove</a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
