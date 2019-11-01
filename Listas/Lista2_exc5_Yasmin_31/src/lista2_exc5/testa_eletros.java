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
public class testa_eletros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eletrodomestico e1 = new Eletrodomestico();
        arcondicionado e2 = new arcondicionado(5);
        maquinalavar e3 = new maquinalavar(30);
        extra e4 = new extra(25.90);
        
        e1.setConsumo(10);
        e1.setHorasUSo(4);
        e1.setMarca("LG");
        e1.setVoltagem(110);
        e1.classeEnergia();
        
        e2.setConsumo(50);
        e2.setHorasUSo(2);
        e2.setMarca("Samsung");
        e2.setVoltagem(110);
        e2.classeEnergia();
        e2.setModelo("split");
        
        e3.setConsumo(13);
        e3.setHorasUSo(5);
        e3.setMarca("Apple");
        e3.setVoltagem(220);
        e3.classeEnergia();
        e3.setTipo("lava e seca");
        
        e4.setConsumo(30);
        e4.setHorasUSo(1);
        e4.setMarca("Philips");
        e4.setVoltagem(110);
        e4.classeEnergia();
        e4.getValor();
    }
    
}
