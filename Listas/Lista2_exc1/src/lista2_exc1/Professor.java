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
public class Professor extends Funcionario{
    
    double getSalario ()
    {
        return this.salario;
    }
    
    @Override
    double getSalarioPrimeiraParcela()
    {
        double parcela = this.salario;
        System.out.println("Recebe apenas 1 parcela");
        return parcela;
    }
    
    @Override
    double getSalarioSegundaParcela()
    {
        double parcela = this.salario;
        System.out.println("Recebe apenas 1 parcela");
        return parcela;
    }
}
