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
public class Inscripcion {
    
    private String idInscripcion;
    private String documento;
    private Curso curso;
    private Double estrato;
    private Double valorCredito;

    public Inscripcion(String idInscripcion, String documento, Curso curso, Double estrato, Double valorCredito) {
        this.idInscripcion = idInscripcion;
        this.documento = documento;
        this.curso = curso;
        this.estrato = estrato;
        this.valorCredito = valorCredito;
    }

    public String getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(String idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Double getEstrato() {
        return estrato;
    }

    public void setEstrato(Double estrato) {
        this.estrato = estrato;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }
    
    
    
}
