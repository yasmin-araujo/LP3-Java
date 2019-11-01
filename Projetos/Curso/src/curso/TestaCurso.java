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
public class TestaCurso {
    private int codigo;
    private String descricao;
    
    //Construtor
    public TestaCurso()
    {
        System.out.println("Construtor Feito");
    }

    //Getters
    public int getCodigo()
    {
       return this.codigo; 
    }

    String getDescricao()
    {
        return this.descricao;
    }

    //Setters
    void setCodigo (int codigo)
    {
        this.codigo = codigo;
    }

    void setDescricao (String descricao)
    {
        this.descricao = descricao;
    }
}
