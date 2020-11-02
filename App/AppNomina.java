package com.felipe.desafio2.App;

import java.util.ArrayList;
import java.util.List;

import com.felipe.desafio2.Directo;
import com.felipe.desafio2.Promotor;
import com.felipe.desafio2.Empleado;
import com.felipe.desafio2.Vendedor;
import com.felipe.desafio2.Freelancer;

public class AppNomina {

    public static void main(String[] args) {

//        List <Empleado> empleados =  new ArrayList<>();

        Promotor promotor = new Promotor("Pedro", 1200, 300, 62);
        Freelancer free = new Freelancer("Jhoana", 71000, 89);
        Freelancer free2 = new Freelancer("Gustavo", 42500, 65);
        Directo fijo = new Directo("juan", 4840000);
        Directo fijo2 = new Directo("David", 3975000);
        Vendedor vendedorComisionista = new Vendedor("julian", 2050000, 45510000);
        Vendedor vendedorComisionista2 = new Vendedor("Carolina", 980000, 35989000);

//        empleados.add(promotor);
//        empleados.add(free);
//        empleados.add(free2);
//        empleados.add(fijo);
//        empleados.add(fijo2);
//        empleados.add(vendedorComisionista);
//        empleados.add(vendedorComisionista2);

//        empleados.forEach(empleado -> System.out.println("El salario de los empleados es : "  +  promotor.calcularSalario()));


//        PROFE, AQUÍ ME COSTÓ COLOCARLE A CADA EMPLEADO SU RESPECTIVO SALARIO. POR TAL MOTIVO, PREFERÍ HACERLO "MANUALMENTE".

        System.out.println("El salario de pedro es : "  +  promotor.calcularSalario());
        System.out.println("El salario de Johana es : "  +  free.calcularSalario());
        System.out.println("El salario de Gustavo es : "  +  free2.calcularSalario());
        System.out.println("El salario de Juan es : "  +  fijo.calcularSalario());
        System.out.println("El salario de David es : "  +  fijo2.calcularSalario());
        System.out.println("El salario de Julian es : "  +  vendedorComisionista.calcularSalario());
        System.out.println("El salario de Carolina es : "  +  vendedorComisionista2.calcularSalario());






    }
}
