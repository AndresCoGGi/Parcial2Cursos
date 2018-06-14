/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.dao;

import co.com.poli.parcial2cursos.model.Curso;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface ICursoDao {
    
    String guardarCurso(Curso curso);
    Curso obtenerCurso(String idCurso);
    List<Curso> listarCursos();
    
}
