package Loja;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 01295230208
 */
public class ClienteDAO implements RepositorioCliente{
      //simula o banco de dados
    private static List<Cliente> clientes = new ArrayList<>();
    
   


    @Override
    public List<Cliente> getTodosClientes() {
        return clientes;
    }

    @Override
    public void gravarCliente(Cliente c) {
       clientes.add(c);
    }

    @Override
    public void buscarCliente(Cliente c) {
        
    }

    @Override
    public void attCliente(Cliente c) {
        
    }
}
