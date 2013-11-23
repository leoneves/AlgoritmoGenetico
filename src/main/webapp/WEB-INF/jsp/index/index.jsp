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

<form class="formee">
    <fieldset>
        <legend>Equação</legend>
        <div style="margin: 55px;">
            <lu class="formee-list">
                <li>
                    <input type="text" style="width: 45px">
                </li>
                <li>
                    <label class="formee-medium">X+</label>
                </li>
                <li>
                    <input type="text" style="width: 45px">
                </li>
                <li>
                    <label class="formee-medium">Y+</label>
                </li>
            </lu>
        </div>
    </fieldset>
</form>
</body>
</html>