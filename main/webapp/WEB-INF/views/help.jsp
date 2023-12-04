<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1" pageEncoding = "ISO-8859-1"%>

<%@ page import="java.time.LocalDateTime" %>
<%@ page import = "java.util.List" %>

<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset = "ISO-8859-1">
        <title>Home Page</title>
    </head>
    <body>

        <h1>This is help page</h1>
        <h1>Called by home controller</h1>
        <h1>url/help</h1>

        <%
            String name = (String) request.getAttribute("name");
            Integer id = (Integer) request.getAttribute("id");
            LocalDateTime time = (LocalDateTime) request.getAttribute("time");
            List<Integer> marks = (List<Integer>) request.getAttribute("marks");
        %>

        <h1>
                Name is ${name}.<br>
                Id is ${id}.<br>
                Time is ${time}.
        </h1>
        <hr>
        <%
            for (Integer i : marks) {
        %>
            <h2><%= i %></h2>
        <%
            }
        %>

    </body>
</html>
