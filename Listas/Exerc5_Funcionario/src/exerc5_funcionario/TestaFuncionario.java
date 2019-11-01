/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc5_funcionario;

/**
 *
 * @author Yasmin
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("João",60 );
        Funcionario f3 = new Funcionario(3, "Maria", 4000.00);
        
        f1.idade = 30;
        f1.nome = "Bento";
        f2.salario = 1000.00;
        f3.idade = 55;
        
        f1.aumentaTodos(10);
        f2.aumetaExclusivo(10);
        f3.aumetaExclusivo(10);
        
        System.out.println("\nNome: " + f1.nome);
        System.out.println("Salario: " + f1.salario);
        System.out.println("\nNome: " + f2.nome);
        System.out.println("Salario: " + f2.salario);
        System.out.println("\nNome: " + f3.nome);
        System.out.println("Salario: " + f3.salario);
    }
    
}