package com.nabenik;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void probarSumar(){
        //Resultado esperado
        double resultado = 10.00; //5 + 5

        Calculadora cal = new Calculadora();

        assertEquals(resultado, cal.sumar(5, 5), 0.001);
    }

    @Test
    public void probarRestar(){

        //Resultado esperado
        double resultado = 5.00; //10 - 5

        Calculadora cal = new Calculadora();

        assertEquals(resultado, cal.restar(10, 5), 0.001);

        assertEquals(-5, cal.restar(0, 5), 0.001);
    }

    @Test
    public void probarMultiplicar(){

        //Resultado esperado
        double resultado1 = 15.00; //3 * 5
        double resultado2 = -5.00; //-1 * 5

        Calculadora cal = new Calculadora();

        assertEquals(resultado1, cal.multiplicar(3, 5), 0.001);

        assertEquals(resultado2, cal.multiplicar(-1, 5), 0.001);
    }

    @Test
    public void probarDividir(){

        //Resultado esperado
        double resultado1 = 4.00; //   20/5
        double resultado2 = -30.00; // 30/10

        Calculadora cal = new Calculadora();

        assertEquals(resultado1, cal.dividir(20, 5), 0.001);

        assertEquals(resultado2, cal.multiplicar(30, 10), 0.001);
    }
}