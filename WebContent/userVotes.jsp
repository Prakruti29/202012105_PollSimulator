<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.PollSimulator.controller.*,com.PollSimulator.model.*,com.PollSimulator.service.CandidateService,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vote Candidate</title>
</head>
<body>
<form action="VoteController">
Student ID: 		
<input type="text" name="id" id="userId"/><br><br>		

<%  
List<Candidate> candidates=CandidateService.getAllCandidates();  
request.setAttribute("candidates",candidates);  

%>		
<c:forEach items="${candidates}" var="item">
    <input type="radio" name="candidateName" value="${item.getName()}">${item.getName()}<br>
</c:forEach> 

<br><br><br>			
<input type="submit" value="Vote">

</form>
</body>
</html>
