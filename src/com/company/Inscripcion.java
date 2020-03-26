package com.company;

import java.util.Date;

public class Inscripcion {
    private Alumno alumnoAInscribir;
    private Curso cursoAInscribir;
    private Date fechaDeInscripcion;

    public Inscripcion(Alumno alumnoAInscribir, Curso cursoAInscribir) {
        this.alumnoAInscribir = alumnoAInscribir;
        this.cursoAInscribir = cursoAInscribir;
        this.fechaDeInscripcion = new Date();

    }
}