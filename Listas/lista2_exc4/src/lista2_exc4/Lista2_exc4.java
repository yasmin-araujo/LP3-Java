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
public class Lista2_exc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Normal ing1 = new Normal();
        Vip ing2 = new Vip();
        Camarote ing3 = new Camarote();
        
        ing3.setLocalizacao("No meio do bafafá");
        ing3.setPrecoCamarote(400.00);
        System.out.println("Valor Normal: " + ing1.imprimeValor());
        System.out.println("Valor Vip: " + ing2.valorIngressoVip());
        System.out.println("Valor camarote: " + ing3.getPrecoCamarote());
        System.out.println("Localizacao Camarote: " + ing3.getLocalizacao());
    }
    
}
