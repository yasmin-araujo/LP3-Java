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
public class maquinalavar extends Eletrodomestico{
    private String tipo;
    private int kgs;
    
    maquinalavar( int kgs )
    {
        this.kgs = kgs;
    }
    
    void setTipo ( String auxTipo )
    {
        if ( !"lava".equals(auxTipo) && !"Lava".equals(auxTipo) && !"lava e seca".equals(auxTipo) && !"Lava e seca".equals(auxTipo) )
            System.out.println("O tipo deve ser Lava ou Lava e seca !");
        else
            this.tipo = auxTipo;
    }
}
