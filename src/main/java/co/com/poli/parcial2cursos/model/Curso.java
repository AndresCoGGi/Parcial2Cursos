/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.parcial2cursos.model;

/**
 *
 * @author ANDRESCOGI
 */
public class Curso {
    
    private String idMateria;
    private String nombre;
    private Double numCreditos;
    private Integer cupoMax;
    private Integer cupoMin;

    public Curso(String idMateria, String nombre, Double numCreditos, Integer cupoMax, Integer cupoMin) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.cupoMax = cupoMax;
        this.cupoMin = cupoMin;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(Double numCreditos) {
        this.numCreditos = numCreditos;
    }

    public Integer getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(Integer cupoMax) {
        this.cupoMax = cupoMax;
    }

    public Integer getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(Integer cupoMin) {
        this.cupoMin = cupoMin;
    }
    
    
    
}
