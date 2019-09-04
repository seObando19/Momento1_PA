<%-- 
    Document   : reportesEstudiante
    Created on : 04-sep-2019, 16:45:25
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
        <title>Reporte</title>
    </head>
    <body>
    <div class="container mt-5">
      <h3><a href="inicio.jsp"><span class="badge badge-secondary">Volver</span></a></h3>
      <h1 class="display-4 text-center">Estudiantes Registrados</h1>
      <table class="table table-striped mt-3">
        <thead>
          <tr>
            <th scope="col">Id</th>
            <th scope="col">Nombres</th>
            <th scope="col">Apellidos</th>
            <th scope="col">Curso</th>
            <th scope="col">Jornada</th>
          </tr>
        </thead>
        <tbody id="TableResult">
         <!-- Data students from localstorage -->
         
        </tbody>
      </table>
    </div>
        
        <script type="text/javascript">
            const data = JSON.parse(localStorage.getItem("Estudiantes"));
            
            let Tabla = document.querySelector('#TableResult');
            Tabla.innerHTML='';
            data.reverse();
            for(let valor of data){
                Tabla.innerHTML +=
                        "<tr>" + "<td>" + valor.id + "</td>" +
                                 "<td>" + valor.nombres + "</td>" +                                 
                                 "<td>" + valor.apellidos + "</td>" +
                                 "<td>" + valor.cursos + "</td>" +
                                 "<td>" + valor.jornada + "</td>" 
                         "</tr>"
            }
        </script>
    
    </body>
</html>
