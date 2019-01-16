<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--JSTL Tag-->
        
        <center>
            <hr/>
            <h1>Employee Details</h1>
            <hr/>
            <table>
                <tr>
                    <th>Employee Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                </tr>
                
                <c:forEach items="${employees}" var="e">
                    <tr>
                        <td>${e.employeeid}</td>
                        <td>${e.employeename}</td>
                        <td>${e.salary}</td>
                    </tr>
                </c:forEach>
            </table>
            <hr/>
        </center>
    
    </body>
</html>
