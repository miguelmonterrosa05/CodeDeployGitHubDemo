/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edmundo
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testGetN2() {
        System.out.println("getN2");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getN2();
        assertEquals(expResult, result, 0.0);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetN2() {
        System.out.println("setN2");
        double n2 = 0.0;
        Calculadora instance = new Calculadora();
        instance.setN2(n2);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetN1() {
        System.out.println("getN1");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getN1();
        assertEquals(expResult, result, 0.0);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetN1() {
        System.out.println("setN1");
        double n1 = 0.0;
        Calculadora instance = new Calculadora();
        instance.setN1(n1);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testGetDiv() {
        System.out.println("getDiv");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getDiv();
       // assertEquals(expResult, result, 0.0);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testGetSqrtN1() {
        System.out.println("getSqrtN1");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getSqrtN1();
        assertEquals(expResult, result, 0.0);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testGetSqrtN2() {
        System.out.println("getSqrtN2");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getSqrtN2();
        assertEquals(expResult, result, 0.0);
      //  fail("The test case is a prototype.");
    }
    
}
