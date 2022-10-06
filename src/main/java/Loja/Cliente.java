/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;
    
     public Cliente() {
        this.pedidos =  new ArrayList<>();
        
    }
    //simula o banco de dados
    private static List<Cliente> clientes = new ArrayList<>();
    
   
    
    public static void addCliente(Cliente c){
        clientes.add(c);
    }
    
     public static List<Cliente> getClientes(){
        return clientes;
    }
   
}
