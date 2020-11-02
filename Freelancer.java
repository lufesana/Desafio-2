package com.felipe.desafio2;

public class Freelancer extends Empleado {

    private long valorHora;
    private int horasTrabajadas;

    public Freelancer(String nombreEmpleado, long valorHora, int horasTrabajadas) {
        super(nombreEmpleado);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;

    }
    @Override
    public long calcularSalario() {
        return (this.horasTrabajadas * this.valorHora);
    }

}
