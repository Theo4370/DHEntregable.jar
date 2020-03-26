package com.company;

import com.digitalhouse.DHException;
import com.digitalhouse.DigitalException;
import com.digitalhouse.Estudioso;
import com.digitalhouse.OtherException;

import java.util.Objects;

public class Alumno implements Estudioso {
    //Voy a agregar un parametro booleano que sea seraEstudioso, que sera true o false dependiendo del alumno.
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;
    private boolean seraEstudioso;

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno, Boolean seraEstudioso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
        this.seraEstudioso = seraEstudioso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    public void setCodigoDeAlumno(Integer codigoDeAlumno) {
        this.codigoDeAlumno = codigoDeAlumno;
    }


    @Override
    public boolean equals(Object alumnoAComparar) {
        if (!(alumnoAComparar instanceof Alumno)) {
            return false;
        }

        Alumno otroAlumno = (Alumno) alumnoAComparar;
        return otroAlumno.getCodigoDeAlumno().equals(this.codigoDeAlumno);

    }
    //Lo primero que hago es hacer un override del metodo esEstudioso deifinido en la interfas Estudioso provista por Digital House. La clase alumno pasa a implementar la interfaz Estudioso.
    //Le voy a pedir que me devuelva el valor que yo le pase como parámetro para cada alumno del valor seraEstudioso.

    @Override
    public Boolean esEstudioso() {
        return this.seraEstudioso;
    }

    //Hago un override de toString para que me devuelva los datos pertinentes del alumno. No es necesario pero quiero saber a que alumno corresponde cada excepcion.
    @Override
    public String toString() {
        return "Alumno " + nombre +
                " " + apellido +
                ", con codigo de alumno: " + codigoDeAlumno;
    }
}