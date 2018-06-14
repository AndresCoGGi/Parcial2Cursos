<%-- 
    Document   : listarCursos
    Created on : 13-jun-2018, 19:26:50
    Author     : ANDRESCOGI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Lista</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">Cursos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">

                    <table class="table">
                        <caption>Lista de Cursos</caption>
                        <thead>
                            <tr>
                                <th scope="col">ID Materia</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Numero Creditos</th>
                                <th scope="col">Cupo Maximo</th>
                                <th scope="col">Cupo Minimo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="curso" items="${sessionScope.LISTADOC}">
                                <tr>
                                    <td><c:out value="${curso.getIdMateria()}"/></td>
                                    <td><c:out value="${curso.getNombre()}"/></td>
                                    <td><c:out value="${curso.getNumCreditos()}"/></td>
                                    <td><c:out value="${curso.getCupoMax()}"/></td>
                                    <td><c:out value="${curso.getCupoMin()}"/></td>
                                    <td></td>
                                </tr>
                        </c:forEach><br>
                        <a class="btn btn-primary" href="${pageContext.servletContext.contextPath}/index.jsp">Regresar</a>
                        </tbody>
                    </table>
                </div>
            </div>

            <!-- Example row of columns -->

            <hr>

            </div> <!-- /container -->

        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
        crossorigin="anonymous"></script>

    </body>
</html>