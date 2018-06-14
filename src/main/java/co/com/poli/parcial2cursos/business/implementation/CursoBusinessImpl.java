/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.business.implementation;

import co.com.poli.parcial2cursos.business.ICursoBusiness;
import co.com.poli.parcial2cursos.dao.implementation.CursoDaoImpl;
import co.com.poli.parcial2cursos.model.Curso;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class CursoBusinessImpl implements ICursoBusiness{
    
    private CursoDaoImpl cursoDaoImpl = new CursoDaoImpl();

    @Override
    public String guardarCurso(Curso curso) {
        return cursoDaoImpl.guardarCurso(curso);
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        return cursoDaoImpl.obtenerCurso(idCurso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoDaoImpl.listarCursos();
    }
    
    
}
