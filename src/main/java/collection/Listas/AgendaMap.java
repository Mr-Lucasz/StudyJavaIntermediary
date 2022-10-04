/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.Listas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 01295230208
 */
public class AgendaMap implements Agenda {
    private Map<String, Contato> contato;
    
    public AgendaMap(){
        contato = new HashMap<>();
        
    }

    @Override 
    public void addContato(Contato novoContato){
         contato.put(novoContato.getTelefone(), novoContato);
    }
    
    @Override 
    public  Contato buscarContatoNome(String nome){
        for(String telefone : contato.keySet()){
            Contato c = contato.get(telefone);
            if(c.getNome().equals(nome))
          return c;
                }
        return null;
           
        
    }
    @Override 
    public Contato buscarContatoTelefone(String telefone){
      return contato.get(telefone);
    }
    
    
    
    
}
