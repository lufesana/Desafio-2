package com.felipe.desafio2;

public  class Promotor extends Empleado {

    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombreEmpleado, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombreEmpleado);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;

    }

    @Override
    public long calcularSalario() {
        return (long) (((this.getValorVolante()* this.volantesRepartidos))+(this.comprasVolante * 15.000));
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }
}
