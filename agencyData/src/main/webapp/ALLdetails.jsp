<%@ page import="org.hibernate.query.Query" %>
<%@ page import = "com.helper.FactoryProvider" %>
<%@ page import = "org.hibernate.Session" %>
<%@ page import = "java.util.List" %>
<%@ page import = "com.entities.dataStored" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Collected</title>
</head>
<body>
	<%
		Session s = FactoryProvider.getFactory().openSession();
		Query q = s.createQuery("from dataStored");
		List<dataStored> list = q.list();
		for(dataStored ds: list){
			%>
			<!-- make a card to show details in clean way -->
			
			
		<%
		}
		
		
		s.close();
	%>
</body>
</html>