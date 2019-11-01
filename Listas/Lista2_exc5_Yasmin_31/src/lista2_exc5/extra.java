/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_exc5;


public class extra extends Eletrodomestico {
    private double valor;
    
    extra(double auxValor)
    {
        this.valor = auxValor;
    }
    
    double getValor ()
    {
        return this.valor;
    }
}
