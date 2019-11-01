/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_exc4;

/**
 *
 * @author Yasmin
 */
public class Vip extends Ingresso{
    double adicional;
    
    double valorIngressoVip()
    {
        return this.adicional + this.valor;
    }
}
