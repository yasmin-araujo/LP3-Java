/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Yasmin
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.numero = 1234;
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 2000.0;
        
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        //Utiliza os métodos criados na classe Conta
        minhaConta.deposita(350);
        minhaConta.deposita(1200);
        System.out.println("Saldo após depósitos: " + minhaConta.saldo);
        
        if (minhaConta.saca(570))
            System.out.println("Consegui sacar, saldo = " + minhaConta.saldo);
        else 
            System.out.println("Valor não dinponível para saque, saldo: " + minhaConta.saldo);
        
        if (minhaConta.saca(5000))
            System.out.println("Consegui sacar, saldo: " + minhaConta.saldo);
        else
            System.out.println("Valor não disponível para saque, saldo: " + minhaConta.saldo);
        
        Conta meuSonho;
        meuSonho = new Conta();
        //Define valores para atributos
        meuSonho.numero = 1234;
        meuSonho.saldo = 15000.0;
        meuSonho.limite = 20000.0;
        
        System.out.println("Saldo da minha conta: " + minhaConta.saldo);
        System.out.println("Saldo dos meus sonhos: " + meuSonho.saldo);
        //Utilizando o método transfere com o retorno true
        if (meuSonho.transfere(minhaConta, 5000))
        {
            System.out.println("Saldo da minha conta: " + minhaConta.saldo);
            System.out.println("Saldo dos meus sonhos: " + meuSonho.saldo);
        }
        else
            System.out.println("Transferência não realizada!!!");
    }
    
}
