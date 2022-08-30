/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.collection;

/**
 *
 * @author 01295230208
 */
public interface Agenda {
    void addContato(Contato contato);
    Contato buscarContatoNome(String Nome);
    Contato buscarContatoTelefone(String teleone);
   
}
