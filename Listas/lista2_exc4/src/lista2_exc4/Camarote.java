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
public class Camarote extends Vip{
    String localizacao;
    double adicionalCamarote;
    
    void setLocalizacao (String local)
    {
        this.localizacao = local;
    }
    
    String getLocalizacao()
    {
        return this.localizacao;
    }
    
    void setPrecoCamarote (Double preco)
    {
        this.adicionalCamarote = preco;
    }
    
    Double getPrecoCamarote()
    {
        return this.adicionalCamarote;
    }
            
}
