/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Yasmin
 */
public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();
    
    //Método sem retorno pertencente a classe Conta
    void deposita (double valor)
    {
        this.saldo += valor;
    }
    
    boolean saca (double valor)
    {
        if (this.saldo < valor)
        {
            return false;
        }
        else
        {
            this.saldo -= valor;
            return true;
        }
    }
    
    boolean transfere (Conta destino, double valor)
    {
        boolean retirou = this.saca(valor);
        if (retirou== false)
        {
            //não deu para sacar!
            return false;
        }
        else
        {
            destino.deposita(valor);
            return true;
        }
    }
}
