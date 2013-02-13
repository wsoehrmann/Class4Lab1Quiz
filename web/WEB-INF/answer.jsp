<%-- 
    Document   : answer
    Created on : Feb 11, 2013, 6:53:05 PM
    Author     : wsoehrmann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is the answer page</title>
    </head>
    <body>

        <%
            String title = request.getAttribute("title").toString();
            String answer = request.getAttribute("answer").toString();
            String formula = request.getAttribute("formula").toString();
        %>
        <h1><%= title%></h1>
        <p>You submitted <%= formula%></p>
        <p>The answer is: <%= answer%></p>
        <br/>
        <p><a href="index.jsp">Return to Home page</a></p>




    </body>
</html>
