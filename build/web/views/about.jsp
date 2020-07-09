<%-- 
    Document   : about
    Created on : Jul 1, 2020, 9:03:48 AM
    Author     : altha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page = "layouts/head.jsp">
            <jsp:param name="title" value="About Page"></jsp:param>
        </jsp:include>
    </head>
    <body>
        <div>
            <jsp:include page = "layouts/navbar.jsp"></jsp:include>
            <h1>Hello World! You're in About Page!</h1>
            <jsp:include page = "layouts/scripts.jsp"></jsp:include>
            <jsp:include page = "layouts/footer.jsp"></jsp:include>        
        </div>
    </body>
</html>
