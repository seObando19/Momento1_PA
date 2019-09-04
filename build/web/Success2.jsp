<%-- 
    Document   : Success2
    Created on : 31-ago-2019, 19:10:43
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script type="text/javascript">
            const data =<%=request.getAttribute("dataTeacher")%>;            
            const miStorage = window.localStorage;
            const getData=JSON.parse(miStorage.getItem('profesores')) || [];
            getData.push(data);
            miStorage.setItem('profesores', JSON.stringify(getData));
            
        </script>        
        <h1>HELLO MY FRIEND!!!</h1>
    </body>
</html>
