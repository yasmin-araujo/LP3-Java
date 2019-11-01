/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Yasmin
 */
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor vrum = new Motor();
    
    void liga()
    {
        System.out.println("O carro está ligado");
    }
    
    void acelera ( double quantidade )
    {
        if ( ( this.velocidadeAtual + quantidade) <= velocidadeMaxima )
        {
            this.velocidadeAtual += quantidade;
        }
        else
            System.out.println("Velocidade limite atingida!");
        System.out.println(velocidadeAtual);
    }
    
    int pegamarcha()
    {
        if ( this.velocidadeAtual < 0 )
            return -1;
        else if ( this.velocidadeAtual > -1 && this.velocidadeAtual < 41 )
            return 1;
        else if ( this.velocidadeAtual > 40 && this.velocidadeAtual < 81 )
            return 2;
        else
            return 3;
    }
    
    void meumetodo()
    {
        if ( this.vrum.potencia == 500 )
        {
            System.out.println(this.modelo);
        }
        if (this.vrum.tipo == "turbo")
        {
            System.out.println(this.modelo);
        }
    }
}