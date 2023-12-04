<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1" pageEncoding = "ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
  <head>
    <title>processForm</title>
  </head>
  <body>
       <p>The saved details are: </p>
       <h1> Id: ${user.id} </h1>
       <h1> Username: ${user.email} </h1>
       <h1> Password: ${user.password} </h1>
  </body>
</html>