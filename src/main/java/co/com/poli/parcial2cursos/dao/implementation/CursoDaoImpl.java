/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.dao.implementation;

import co.com.poli.parcial2cursos.dao.ICursoDao;
import co.com.poli.parcial2cursos.data.cursoData;
import co.com.poli.parcial2cursos.model.Curso;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class CursoDaoImpl implements ICursoDao {

    @Override
    public String guardarCurso(Curso curso) {
        List<Curso> listaCursos = cursoData.getListaCursos();
        listaCursos.add(curso);
        cursoData.setListaCursos(listaCursos);
        return "Curso creado";
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        Curso curso = null;
        List<Curso> listaCursos = cursoData.getListaCursos();
        for (Curso listaCurso : listaCursos) {
            if (listaCurso.getIdMateria().equals(idCurso)) {
                curso = listaCurso;
            }
        }
        return curso;
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoData.getListaCursos();
    }

}
