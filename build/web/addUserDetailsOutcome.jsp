<%-- 
    Document   : addUserDetailsOutcome
    Created on : Mar 3, 2022, 10:38:35 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User Details Outcome pages</title>
    </head>
    <body>
        <h1>Add User Details Outcome</h1>
        <% 
           String name = (String)request.getAttribute("name");
           String age  = (String)request.getAttribute("age");
          String title = (String)request.getAttribute("title");
        %>
        <p>
            hello<b><%=title%> <%=name%></b>.good to know that you are <b><%=age%></b> year old
        </p>
        <p>
            Please click <a href="index.html">here</a>.to go back to the main page   
        </p>
    </body>
</html>
