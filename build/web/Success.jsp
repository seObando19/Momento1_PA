<%-- 
    Document   : Success
    Created on : 30-ago-2019, 22:57:37
    Author     : sebas
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body style="background-color: #344A40">        
        <div class="container mt-5" style="height: 60vh; display: flex; align-items: center; justify-content: center;">
      <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
          <h5 class="card-title">✔</h5>
          <p class="card-text"><b>Registro guardado exitosamente</b></p>
          <a href="inicio.jsp" class="btn btn-primary btn-block">👉 Volver</a>
        </div>
    </div>   
  </div>
        
    <!-- Insert code for servelt Estudiantes -->
    <script type="text/javascript">
        //Insert data to localstorage for students
        const data =<%=request.getAttribute("dataStudent")%>;
        const miStorage = window.localStorage;
        
        const getData = JSON.parse(miStorage.getItem('Estudiantes')) || [];
        getData.push(data);
        
        // Delete objects null
      for(let i = 0; i <= getData.length; i++){
        if(getData[i] === null){
         getData.pop(data);  
        }
      }
      
      miStorage.setItem('Estudiantes',JSON.stringify(getData));
    </script>
    <!-- Insert code for servelt Profesores -->    
    <script type="text/javascript">
        const dataTeachers =<%=request.getAttribute("dataTeacher")%>;
        const getDataTeachers = JSON.parse(miStorage.getItem('Profesores')) || [];
        
        getDataTeachers.push(dataTeachers);
        
          // Delete objects null
      
       for(let i = 0; i <= getDataTeachers.length; i++){
        if(getDataTeachers[i] === null){
         getDataTeachers.pop(dataTeachers);  
        }
      }
       
       
       miStorage.setItem('Profesores',JSON.stringify(getDataTeachers));
        
    </script>
    </body>
</html>
