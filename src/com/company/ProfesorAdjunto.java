package com.company;

public class ProfesorAdjunto extends Profesor {
    private Integer horasDeConsulta;


    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasDeConsulta) {
        super(nombre, apellido, codigoDeProfesor);
        this.horasDeConsulta = horasDeConsulta;
    }

    public Integer getHorasDeConsulta() {
        return horasDeConsulta;
    }

    public void setHorasDeConsulta(Integer horasDeConsulta) {
        this.horasDeConsulta = horasDeConsulta;
    }


}
