/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Date;

/**
 *
 * @author Yasmin
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Date dataadmissao;
    String RG;
    boolean estanaEmpresa;
    
    void mostra()
    {
        if (this.estanaEmpresa == TRUE)
        {
            System.out.println("Nome: " + this.nome);
            System.out.println("Departamento: " + this.departamento);
            System.out.println("Salário: " + this.salario);
            System.out.println("Data de admissão: " + this.dataadmissao);
            System.out.println("RG: " + this.RG);
        }
    }
    
    void bonifica ( double aumento )
    {
       double porcent = ( aumento / 100 ) + 1;
       this.salario *= porcent;
    }
    
    void demite()
    {
        this.estanaEmpresa = FALSE;
    }
    
    double ganhoanual()
    {
        double ganho = this.salario * 12;
        return ganho;
    }
    
    void meumetodo()
    {
        System.out.println("Chamou o meu método!!");
    }
}
