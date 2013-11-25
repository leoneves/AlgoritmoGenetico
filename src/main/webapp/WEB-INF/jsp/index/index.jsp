<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trabalho de Algoritmo Genético</title>
    <script type="text/javascript" src="<c:url value="/js/jquery-1.10.2.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/formee.js"/>"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/formee-structure.css"/>" media="screen">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/formee-style.css"/>" media="screen">
</head>
<body>

<form class="formee" action="/maximizarFuncao">
    <fieldset>
        <legend>Equação</legend>
        <div style="margin: 55px;">
            <lu class="formee-list">
                <li>
                    <input type="text" name="coefX" style="width: 45px">
                </li>
                <li>
                    <label class="formee-medium">X+</label>
                </li>
                <li>
                    <input type="text" name="coefY" style="width: 45px">
                </li>
                <li>
                    <label class="formee-medium">Y+</label>
                </li>
                <li>
                    <select name="funcao" id="funcao">
                        <option value="vazio"></option>
                        <option value="sin">sin</option>
                        <option value="cos">cos</option>
                    </select>
                </li>
                <li>
                    <input type="text" name="coefZ" style="width: 45px">
                </li>
                <li>
                    <label class="formee-medium">Z</label>
                </li>
            </lu>
        </div>
    </fieldset>
    <label class="formee-medium">Tamanho da População</label>
    <input type="text" name="tamanhoPopulacao">
    <br><br>
    <input type="submit" value="Maximizar função"/>
</form>
</body>
</html>