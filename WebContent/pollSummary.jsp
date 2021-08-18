<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page import="com.PollSimulator.controller.*,com.PollSimulator.model.*,com.PollSimulator.service.CandidateService,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Summary</title>
</head>
<body>
<%  
List<Candidate> candidates=CandidateService.getAllCandidates();  
request.setAttribute("candidates",candidates);  

%>		
<c:forEach items="${candidates}" var="item">
    ${item.getName()}: ${item.getVotes()}<br>
</c:forEach> 
</body>
</html>