/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Edmundo
 */
public class Calculadora {
    private double n1;
    private double n2;

    public Calculadora() {
    }

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }
    
    public double getDiv(){
        return n1/n2;
    }
    public double getSqrtN1(){
        return Math.sqrt(n1);
    }
     public double getSqrtN2(){
        return Math.sqrt(n2);
    }
    
    
    
}
