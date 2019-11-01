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
public class TestaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Calculadora n1 = new Calculadora();
       Calculadora n2 = new Calculadora();
       Calculadora n3 = new Calculadora();
       
        System.out.println(n1.retornaSomaAtributos());
        System.out.println(n1.retornaMultiplicacaoAtributos());
        n1.insereValoresAtributos(5,6);
        
        System.out.println(n2.retornaSomaAtributos());
        System.out.println(n2.retornaMultiplicacaoAtributos());
        n2.insereValoresAtributos(2, 7);
        
        System.out.println(n3.retornaSomaAtributos());
        System.out.println(n3.retornaMultiplicacaoAtributos());
        n3.insereValoresAtributos(4, 8);
        
        System.out.println("\n\nNumero 1:\n" + n1.getNumero1());
        System.out.println(n1.getNumero2() + "\n\n");
        
        System.out.println("Numero 2:\n" + n2.getNumero1());
        System.out.println(n2.getNumero2() + "\n\n");
        
        System.out.println("Numero 3:\n" + n3.getNumero1());
        System.out.println(n3.getNumero2());
    }
    
}
