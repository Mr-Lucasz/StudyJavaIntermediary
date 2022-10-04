/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.Listas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 01295230208
 */
public class AgendaSet implements Agenda{
    private Set<Contato> contatos;
    //evitar a duplica

    public AgendaSet() {
        contatos = new HashSet<>();
    }
    
    
    @Override 
    public void addContato(Contato contato){
         contatos.add(contato);  
    }
    
    @Override 
    public  Contato buscarContatoNome(String nome){
     for(Contato c: contatos){
         if(c.getNome().equals(nome))
         return c;
     }
        return null;
        
    }
    @Override 
    public Contato buscarContatoTelefone(String telefone){
         for(Contato c: contatos){
         if(c.getTelefone().equals(telefone))
         return c;
     }
        return null;    
    }
    
    
}
