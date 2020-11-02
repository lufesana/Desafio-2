package com.felipe.desafio2.App;

import java.util.ArrayList;
import java.util.List;

import com.felipe.desafio2.*;

public class AppNomina {

    public static void main(String[] args) {

        Promotor promotor = new Promotor("Pedro", 1200, 300, 62);
        Freelancer free = new Freelancer("Jhoana", 71000, 89);
        Freelancer free2 = new Freelancer("Gustavo", 42500, 65);
        Directo fijo = new Directo("juan", 4840000);
        Directo fijo2 = new Directo("David", 3975000);
        Vendedor vendedorComisionista = new Vendedor("julian", 2050000, 45510000);
        Vendedor vendedorComisionista2 = new Vendedor("Carolina", 980000, 35989000);



        System.out.println("El salario de pedro es : "  +  promotor.calcularSalario());
        System.out.println("El salario de Johana es : "  +  free.calcularSalario());
        System.out.println("El salario de Gustavo es : "  +  free2.calcularSalario());
        System.out.println("El salario de Juan es : "  +  fijo.calcularSalario());
        System.out.println("El salario de David es : "  +  fijo2.calcularSalario());
        System.out.println("El salario de Julian es : "  +  vendedorComisionista.calcularSalario());
        System.out.println("El salario de Carolina es : "  +  vendedorComisionista2.calcularSalario());






    }
}
