/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.dao.implementation;

import co.com.poli.parcial2cursos.dao.IIncripcionDao;
import co.com.poli.parcial2cursos.data.inscripcionData;
import co.com.poli.parcial2cursos.model.Inscripcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class InscripcionDaoImpl implements IIncripcionDao{

    @Override
    public String guardarIns(Inscripcion inscrip) {
        List<Inscripcion> listaInscritos = inscripcionData.getListaIns();
        listaInscritos.add(inscrip);
        inscripcionData.setListaIns(listaInscritos);
        return "Inscripcion Creada";
    }

    @Override
    public List<Inscripcion> listarIns() {
        return inscripcionData.getListaIns();
    }
    
}
