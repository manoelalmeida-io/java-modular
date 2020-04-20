package org.example.core;

import org.example.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(27, 3));
        System.out.println(calculadora.mult(9, 3));
    }
}
