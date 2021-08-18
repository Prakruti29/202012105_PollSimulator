<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.PollSimulator.model.Candidate"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
<title>Registration Status</title>
</head>
<body>
<%
	if ((String) session.getAttribute("message") != null) {
	%> <%
	out.print((String) session.getAttribute("message"));
	}
%>
<jsp:include page="RegisterCandidate.jsp"></jsp:include><br><br>
<a href="home.jsp">Go Back</a>
</body>
</html>