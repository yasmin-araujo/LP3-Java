/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_exc5;

/**
 *
 * @author Yasmin
 */
public class arcondicionado extends Eletrodomestico{
    private String modelo;
    private int btus;
    
    arcondicionado( int qtd_btus )
    {
        this.btus = qtd_btus;
    }
    
    void setModelo (String auxMod)
    {
        if ( !"split".equals(auxMod) && !"Split".equals(auxMod) && !"wall".equals(auxMod) && !"Wall".equals(auxMod) )
            System.out.println("O modelo deve ser Split ou Wall !");
        else
            this.modelo = auxMod;
    }
}
