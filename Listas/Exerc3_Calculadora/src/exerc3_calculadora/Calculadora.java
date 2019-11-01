/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc3_calculadora;

/**
 *
 * @author yasmin
 */
public class Calculadora {
    private int Numero1;
    private int Numero2;
    
    Calculadora() 
    {
        this.Numero1 = 1;
        this.Numero2 = 1;
        System.out.println("Construtor feito !!");
    }
    
    int getNumero1()
    {
        return this.Numero1;
    }
    
    int getNumero2()
    {
        return this.Numero2;
    }
    
    int retornaSomaAtributos()
    {
        return (this.Numero1 + this.Numero2);
    }
    
    int retornaMultiplicacaoAtributos()
    {
        return (this.Numero1 * this.Numero2);
    }
    
    void insereValoresAtributos(int valor1, int valor2)
    {
        if ( valor1 > 0 && valor2 > 0 )
        {
            this.Numero1 = valor1;
            this.Numero2 = valor2;
        }
        else
        {
            System.out.println("Valor inválido. Digite valores maiores que 0");
        }
    }
}
