<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Student Details</h1>
        <table>
            <tr>
                <th>Roll No</th>
                <th>Name</th>
            </tr>
            
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.rollno}</td>
                    <td>${student.name}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
    </body>
</html>
