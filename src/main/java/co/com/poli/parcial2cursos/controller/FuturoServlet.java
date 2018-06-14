/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.controller;

import co.com.poli.parcial2cursos.business.implementation.CursoBusinessImpl;
import co.com.poli.parcial2cursos.business.implementation.InscripcionBusinessImpl;
import co.com.poli.parcial2cursos.model.Curso;
import co.com.poli.parcial2cursos.model.Inscripcion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANDRESCOGI
 */
public class FuturoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CursoBusinessImpl cBusinessImpl = new CursoBusinessImpl();
        InscripcionBusinessImpl iBusinessImpl = new InscripcionBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crearCurso":
                String idMateria = request.getParameter("txtidmateria");
                String nombre = request.getParameter("txtnombre");
                Double numCreditos = Double.valueOf(request.getParameter("txtnumCreditos"));
                Integer cupoMax = Integer.parseInt(request.getParameter("txtcupoMax"));
                Integer cupoMin = Integer.parseInt(request.getParameter("txtcupoMin"));

                Curso curso = new Curso(idMateria, nombre, numCreditos, cupoMax, cupoMin);

                String mensaje = cBusinessImpl.guardarCurso(curso);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");

                break;
            case "crearInscripcion":
                Curso cursoIns = null;
                String idIncripcion = request.getParameter("txtidinscripcion");
                String documento = request.getParameter("txtdocumento");
                String idCurso = request.getParameter("txtcurso");
                Double estrato = Double.valueOf(request.getParameter("txtestrato"));
                Double valorCredito = 0D;

                cursoIns = cBusinessImpl.obtenerCurso(idCurso);
                if (estrato.equals(1D)) {
                    valorCredito = 25000D;
                }else{
                    valorCredito = 30000D;
                }
                Inscripcion inscripcion = new Inscripcion(idIncripcion, documento, cursoIns, estrato, valorCredito);
                
                if (cursoIns != null) {
                    String mensajeIns = iBusinessImpl.guardarIns(inscripcion);
                    session.setAttribute("MENSAJE", mensajeIns);
                    rd = request.getRequestDispatcher("/mensaje.jsp");
                } else {
                    String error = "Este curso no existe";
                    session.setAttribute("MENSAJE", error);
                    rd = request.getRequestDispatcher("/mensaje.jsp");
                }

                break;
            case "listarCursos":
                List<Curso> listaCursos = cBusinessImpl.listarCursos();
                session.setAttribute("LISTADOC", listaCursos);
                rd = request.getRequestDispatcher("/views/listarCursos.jsp");
                break;
            case "listarInsc":
                List<Inscripcion> listains = iBusinessImpl.listarIns();
                session.setAttribute("LISTADOL", listains);
                rd = request.getRequestDispatcher("/views/listarInscritos.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
