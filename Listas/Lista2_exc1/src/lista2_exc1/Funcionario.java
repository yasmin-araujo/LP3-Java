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
public class Funcionario extends Pessoa{
    protected int matricula;
    protected double salario;
    
    void setMatricula (int matricula)
    {
        this.matricula = matricula;
    }
    
    void setSalario (double salario)
    {
        this.salario = salario;
    }
    
    int getMatricula ()
    {
        return this.matricula;
    }
    
    double getSalarioPrimeiraParcela()
    {
        double parcela = this.salario * 0.6;
        return parcela;
    }
    
    double getSalarioSegundaParcela()
    {
        double parcela = this.salario * 0.4;
        return parcela;
    }
}
