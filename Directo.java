package com.felipe.desafio2;

public  class Directo extends Empleado {

    private long salario;

    public Directo(String nombreEmpleado, long salario) {
        super(nombreEmpleado);
        this.salario = salario;
    }
    public long calcularSalud(){
        return (long) (salario * 0.05);
    }
    public long calcularPension(){
        return (long) (salario * 0.065);
    }
    @Override
    public long calcularSalario() {
        return this.getSalario()-(this.calcularSalud()+this.calcularPension());
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}
