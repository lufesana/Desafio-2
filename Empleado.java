package com.felipe.desafio2;

public abstract class Empleado {

    private String nombreEmpleado;

    public Empleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }


    public abstract long calcularSalario();
}

