/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class AgendaList implements Agenda {

    
    private List<Contato> contatos;
    
    public AgendaList() {
        this.contatos = new ArrayList<>();
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
