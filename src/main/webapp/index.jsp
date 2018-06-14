<%-- 
    Document   : index
    Created on : 13-jun-2018, 18:06:38
    Author     : ANDRESCOGI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Futuros</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppFuturos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/FuturoServlet?accion=listarCursos">Listar Cursos<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/FuturoServlet?accion=listarInsc">Listar Inscripciones</a>
                    </li>
                </ul>
            </div>
        </nav><br>
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/FuturoServlet"
              method="post">

            <h1 class="h3 mb-3 font-weight-normal">Incripciones</h1>

            <label for="inputidinscripcion" class="sr-only">ID inscripcion</label>
            <input type="text" id="inputidinscripcion" name="txtidinscripcion" class="form-control" placeholder="ID Inscripcion" required autofocus>
            <label for="inputdocumento" class="sr-only">Documento</label>
            <input type="text" id="inputdocumento" name="txtdocumento" class="form-control" placeholder="Documento " required>
            <label for="inputcurso" class="sr-only">Curso</label>
            <input type="text" id="inputcurso" name="txtcurso" class="form-control" placeholder="ID Curso " required>
            <select name="txtestrato" id="inputestrato" class="form-control" required>
                <option value="">Estrato</option>
                <option value="1">1</option>
                <option value="2" >2</option>
            </select>
            
            <br>
            <button name="accion" value="crearInscripcion" 
                    type="submit" class="btn btn-primary">
                Enviar</button>
            <p class="mt-5 mb-3 text-muted">&copy;2018</p>
        </form><br>   
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/FuturoServlet"
              method="post">
            <h1 class="h3 mb-3 font-weight-normal">Reserva</h1>

            <label for="inputidmateria" class="sr-only">ID Materia</label>
            <input type="text" id="inputidmateria" name="txtidmateria" class="form-control" placeholder="ID Materia" required autofocus>
            <label for="inputnombre" class="sr-only">Nombre</label>
            <input type="text" id="inputnombre" name="txtnombre" class="form-control" placeholder="Nombre" required>
            <label for="inputnumCreditos" class="sr-only">Numero creditos</label>
            <input type="text" id="inputnumCreditos" name="txtnumCreditos" class="form-control" placeholder="Numero creditos" required>
            <label for="inputcupomax" class="sr-only">Cupo Maximo</label>
            <input type="text" id="inputcupomax" name="txtcupoMax" class="form-control" placeholder="Cupo maximo" required>
            <label for="inputcupomin" class="sr-only">Cupo Minimo</label>
            <input type="text" id="inputcupomin" name="txtcupoMin" class="form-control" placeholder="Cupo minimo" required>
            <br>
            <button name="accion" value="crearCurso" 
                    type="submit" class="btn btn-primary">
                Crear Curso</button>
            <p class="mt-5 mb-3 text-muted">&copy;2018</p>
        </form>
    </body>
</html>