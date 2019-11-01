/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import static java.lang.Boolean.TRUE;

/**
 *
 * @author Yasmin
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1, f2;
        f1 = new Funcionario();
        f2 = new Funcionario();
        
        f1.nome = "ONE";
        f1.departamento = "Alimentício";
        f1.salario = 1000.0;
        //f1.dataadmissao = ;
        f1.RG = "000";
        f1.estanaEmpresa = TRUE;
        
        f2.nome = "TWO";
        f2.departamento = "Limpeza";
        f2.salario = 2000.0;
        //f2.dataadmissao =;
        f2.RG = "111";
        f2.estanaEmpresa = TRUE;
        
        f1.mostra();
        f2.mostra();
        f2.demite();
        f1.bonifica(50);
        f2.ganhoanual();
        f1.meumetodo();
        f1.mostra();
        f2.mostra();
    }
    
}
