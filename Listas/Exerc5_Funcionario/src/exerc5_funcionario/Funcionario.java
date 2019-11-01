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
public class Funcionario {
    int numero;
    String nome;
    int idade;
    String cargo;
    double salario;
    
    Funcionario ()
    {
        this.salario = 1500.00;
    }
    
    Funcionario (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    Funcionario (int numero, String nome, double salario)
    {
       this.numero = numero;
       this.nome = nome;
       this.salario = salario;
    }
    
    void aumentaTodos (int porcent)
    {
        double aumento = ((double)porcent / 100) + 1;
        this.salario *= aumento;
    }
    
    void aumetaExclusivo (int porcent)
    {
        double aumento = ((double)porcent / 100) + 1;
        if (this.idade > 50 && this.salario < 3000.00)
            this.salario *= aumento;
    }
}
