/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc4_cilindro;

/**
 *
 * @author Yasmin
 */
public class Cilindro {
    private double raioBase;
    private double altura;
    
    Cilindro ()
    {
        System.out.println("Construtor feito !!!");
    }
    
    Cilindro ( double altura )
    {
        System.out.println("Construtor feito com parametro !!!");
        this.raioBase = 5.0;
        this.altura = altura;
    }
    
    double getRaioBase()
    {
        return this.raioBase;
    }
    
    double getAltura()
    {
        return this.altura;
    }
    
    void setRaioBase( double raio )
    {
        this.raioBase = raio;
    }
    
    void setAltura( double alt )
    {
        this.altura = alt;
    }
}
