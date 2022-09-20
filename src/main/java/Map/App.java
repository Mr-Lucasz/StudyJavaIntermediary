package Map;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 01295230208
 */
public class App {
    public static void main(String[] args) {
        
        
        Map<String, Carro> estacionamento = new HashMap();
        Carro car1 = new Carro("asd123", "Verde");
        Carro car2 = new Carro("asd113", "Azul");
        
        estacionamento.put(car1.getPlaca(), car1);
        estacionamento.put(car2.getPlaca(), car2);
    
        Carro carroBuscado =  estacionamento.get("1if421");
        
        System.out.println(estacionamento);
    
    }
}
