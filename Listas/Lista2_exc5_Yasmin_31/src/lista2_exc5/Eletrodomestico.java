/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_exc5;

/**
 *
 * @author Yasmin
 */
public class Eletrodomestico {
    protected double consumo;
    protected int voltagem;
    protected int horas_uso_diario;
    protected String marca;
    
    Eletrodomestico()
    {
        System.out.println("Objeto eletrodomestico ok!!");
    }
    
    void setConsumo(double auxConsumo)
    {
        if (auxConsumo > 0)
            this.consumo = auxConsumo;
        else
            System.out.println("Consumo deve ser maior que 0!");
    }
    
    void setHorasUSo(int auxHoras)
    {
        if (auxHoras > 0)
            this.horas_uso_diario = auxHoras;
        else
            System.out.println("Tanto de Horas deve ser maior que 0!");
    }
    
    void setVoltagem( int auxVolt)
    {
        if (auxVolt == 220 || auxVolt == 110)
            this.voltagem = auxVolt;
        else
            System.out.println("Voltagem deve ser 110V ou 220V !");
    }
    
    void setMarca (String auxMarca)
    {
        this.marca = auxMarca;
    }
    
    void classeEnergia ()
    {
        System.out.println("Classe A");
    }
}
