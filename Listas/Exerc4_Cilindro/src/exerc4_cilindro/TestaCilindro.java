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
public class TestaCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cilindro c1 = new Cilindro();
        Cilindro c2 = new Cilindro(40.0);
        
        c1.setAltura(20);
        c1.setRaioBase(2.5);
        
        System.out.println(c1.getAltura());
        System.out.println(c1.getRaioBase());
        System.out.println(c2.getAltura());
        System.out.println(c2.getRaioBase());
    }
    
}
