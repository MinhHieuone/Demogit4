<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="/ctrl/ok" method="post">
        <button formaction="/ok1" >OK1</button>
        <button formaction="/ok2">OK2</button>
        <button formaction="/ok3">OK3</button>
        <button> ok 4</button>
    </form>
    <h1>${ok}</h1>
   

</body>
</html>