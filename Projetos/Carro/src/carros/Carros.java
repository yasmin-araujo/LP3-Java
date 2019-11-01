/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Yasmin
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car = new Carro();
        Carro kar = new Carro();
        
        car.cor = "Preto";
        car.modelo = "Cobalt";
        car.velocidadeAtual = 0;
        car.velocidadeMaxima = 200;
        car.vrum.potencia = 500;
        car.vrum.tipo = "esportivo";
        
        kar.cor = "Prata";
        kar.modelo = "City";
        kar.velocidadeAtual = 0;
        kar.velocidadeMaxima = 300;
        kar.vrum.potencia = 560;
        kar.vrum.tipo = "turbo";
                
        car.liga();
        
        int x = 1;
        while ( car.velocidadeAtual != car.velocidadeMaxima)
        {
            car.acelera(x);
        }
        x *= (-1);
        while (car.velocidadeAtual != 0)
        {
            car.acelera(x);
        }
        
        System.out.println("\nCom 500 cv e turbo, respectivamente: ");
        car.meumetodo();
        kar.meumetodo();
    }
    
}
