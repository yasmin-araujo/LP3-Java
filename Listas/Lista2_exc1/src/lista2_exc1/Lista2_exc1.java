/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_exc1;

/**
 *
 * @author Yasmin
 */
public class Lista2_exc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("José","Maria");
        Funcionario f = new Funcionario();
        Professor pf = new Professor();
        
        f.setNome("Fulano");
        f.setSobrenome ("De Tal");
        f.setSalario(2000.00);
        pf.setNome("Prof");
        pf.setSobrenome (" Maestro");
        pf.setSalario(2000.00);
        
        System.out.println(p.getNomeCompleto());
        System.out.println(f.getNomeCompleto());
        System.out.println(f.getSalarioPrimeiraParcela());
        System.out.println(f.getSalarioSegundaParcela());
        System.out.println(pf.getNomeCompleto());
        System.out.println(pf.getSalario());
        System.out.println(pf.getSalarioPrimeiraParcela());
    }
    
}
