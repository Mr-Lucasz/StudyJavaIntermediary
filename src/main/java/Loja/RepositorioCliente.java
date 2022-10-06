/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

import java.util.List;

/**
 *
 * @author 01295230208
 */
public interface RepositorioCliente {
    List<Cliente> getTodosClientes();
    void gravarCliente(Cliente c);
    void buscarCliente(Cliente c);
    void attCliente(Cliente c);
}
