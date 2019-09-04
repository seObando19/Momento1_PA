<%-- 
    Document   : index
    Created on : 28-ago-2019, 18:40:18
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>  
        <div class="container mt-5">
            <div class="row">
                <div class="col-12 col-md-12 offset-lg-4 col-lg-4">
                    <form class="border p-4" method="post" action="ModelLogin">
                        <h1 class="text center">Institucion Educativa Tapitas del Norte</h1>
                        <div class="form-group">
                          <label for="exampleInputEmail1">Direccion de correo</label>
                          <input type="email" class="form-control" name="user" id="user" aria-describedby="emailHelp" placeholder="ejemplo@hotmail.com">                  
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Contraseña</label>
                          <input type="password" class="form-control" name="password" id="password" placeholder="*************">
                        </div>
                        <div class="form-group form-check">
                          <input type="checkbox" class="form-check-input" id="recuerdame">
                          <label class="form-check-label" for="exampleCheck1">Recuerdame</label>
                        </div>
                        <input type="submit" value="Enviar" class="btn btn-primary">
                     </form>  
                    </div>
                </div>
        </div>
                  
    </body>
</html>
