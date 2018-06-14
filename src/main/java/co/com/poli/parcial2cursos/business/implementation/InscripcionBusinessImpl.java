/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.business.implementation;

import co.com.poli.parcial2cursos.business.IInscripcionBusiness;
import co.com.poli.parcial2cursos.dao.implementation.InscripcionDaoImpl;
import co.com.poli.parcial2cursos.model.Inscripcion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class InscripcionBusinessImpl implements IInscripcionBusiness {

    private InscripcionDaoImpl insDaoImpl = new InscripcionDaoImpl();

    @Override
    public String guardarIns(Inscripcion inscrip) {
        return insDaoImpl.guardarIns(inscrip);
    }

    @Override
    public List<Inscripcion> listarIns() {
        return insDaoImpl.listarIns();
    }

}
