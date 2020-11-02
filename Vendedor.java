package com.felipe.desafio2;

public class Vendedor extends Empleado {

    private long salarioBase;
    private long ventasMes;
    private static final int tope = 1000000;

    public Vendedor(String nombreEmpleado, long salarioBase, long ventasMes) {
        super(nombreEmpleado);
        this.salarioBase = salarioBase;
        this.ventasMes = ventasMes;
    }

    public long calcularSalario() {

        if (salarioBase >= tope) {
            return (long) (this.salarioBase + (this.ventasMes * 0.035));
        } else {return (long) (this.salarioBase + (this.ventasMes * 0.04));}
    }


    public long getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(long ventasMes) {
        this.ventasMes = ventasMes;
    }
}
