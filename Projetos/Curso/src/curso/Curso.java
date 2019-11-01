/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

/**
 *
 * @author Yasmin
 */
public class Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestaCurso teste = new TestaCurso();
        
        teste.setCodigo(20);
        teste.setDescricao("Hello World !!!");
        System.out.println(teste.getCodigo());
        System.out.println(teste.getDescricao());
    }
    
}
