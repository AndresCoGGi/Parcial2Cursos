/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.business;

import co.com.poli.parcial2cursos.model.Inscripcion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IInscripcionBusiness {
    
    String guardarIns(Inscripcion inscrip);
    List<Inscripcion> listarIns();
    
}
