/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.data;

import co.com.poli.parcial2cursos.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class cursoData {
    
    private static List<Curso> listaCursos;
    
    static{
        listaCursos = new ArrayList<Curso>(){
            {
                add(new Curso("001", "Redes", 5.0D, 40, 20));
                add(new Curso("002", "Modelos", 5.0D, 50, 10));
                add(new Curso("003", "PDP", 2.5D, 30, 7));
                
            }  
        };
    }

    public static List<Curso> getListaCursos() {
        return listaCursos;
    }

    public static void setListaCursos(List<Curso> aListaCursos) {
        listaCursos = aListaCursos;
    }
    
    
    
}
