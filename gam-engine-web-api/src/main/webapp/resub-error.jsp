<%@ page isErrorPage="true" import="java.io.*" contentType="text/html"%>
<html>
	<head>
		<title>GAM - Report de Execu��o</title>
	</head>
	<body style="font-family:verdana">
		<h2>GAM - GLOBALITY API MANAGER</h2>		
		<h3>Opera��o: RESUBMIT<p>
			Status: <font color="#ff0000">ERRO</font><p>
			Mensagem:<p>&nbsp;&nbsp;&nbsp;&nbsp;<i><%=exception.getMessage()%></i>
		</h3>
	</body>
</html>

