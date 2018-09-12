<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="client" class="fr.dtaIng.beans.Client" />
<p>Bonjour ${!empty client.nom ? client.nom : ''} </p>

</body>
</html>