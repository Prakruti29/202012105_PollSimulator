<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.PollSimulator.controller.*,com.PollSimulator.model.*,com.PollSimulator.service.CandidateService,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Winner</title>
</head>
<body>
<h1>Poll Winner</h1>
<%
	List<Candidate> candidates = CandidateService.showWinner();
	request.setAttribute("candidates", candidates);
	%>
	Won: ${candidates.get(0).getId()} ${candidates.get(0).getName()}(${candidates.get(0).getVotes()}) <br>
	Lost: ${candidates.get(1).getId()} ${candidates.get(1).getName()}(${candidates.get(1).getVotes()})
</body>
</body>
</html>