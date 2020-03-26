package com.company;


public abstract class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;



    public Profesor(String nombre, String apellido, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
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

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }

    public void setCodigoDeProfesor(Integer codigoDeProfesor) {
        this.codigoDeProfesor = codigoDeProfesor;
    }


    @Override
    public boolean equals(Object profesorAComparar) {
        if (!(profesorAComparar instanceof Profesor)) {
            return false;
        }

        Profesor otroProfesor = (Profesor) profesorAComparar;
        return otroProfesor.getCodigoDeProfesor().equals(this.codigoDeProfesor);

    }
}
