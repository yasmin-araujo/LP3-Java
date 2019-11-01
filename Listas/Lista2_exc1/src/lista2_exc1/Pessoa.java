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
public class Pessoa {
    private String nome;
    private String sobrenome;
    
    Pessoa ()
    {
        System.out.println("Construtor Pessoa!");
    }
    
    Pessoa (String nome, String sobrenome)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        System.out.println("Construtor Pessoa com parâmetros!");
    }
    
    void setNome(String nome)
    {
        this.nome = nome;
    }
    
    void setSobrenome (String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    String getNome()
    {
        return this.nome;
    }
    
    String getSobrenome()
    {
        return this.sobrenome;
    }
    
    String getNomeCompleto()
    {
        String nomecompleto = this.nome + " " + this.sobrenome;
        return nomecompleto;
    }
}
