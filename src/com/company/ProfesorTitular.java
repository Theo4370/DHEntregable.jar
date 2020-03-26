package com.company;

public class ProfesorTitular extends com.company.Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, codigoDeProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
