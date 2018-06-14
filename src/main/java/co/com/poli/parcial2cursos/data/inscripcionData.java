/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.data;

import co.com.poli.parcial2cursos.model.Inscripcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class inscripcionData {
    
     private static List<Inscripcion> listaIns;
    
    static{
        listaIns = new ArrayList<Inscripcion>();
    }

    public static List<Inscripcion> getListaIns() {
        return listaIns;
    }

    public static void setListaIns(List<Inscripcion> aListaIns) {
        listaIns = aListaIns;
    }
    
    
    
}
