/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.Listas;

import collection.Listas.Agenda;

/**
 *
 * @author 01295230208
 */
public class App {
    public static void main(String[] args) {
        Agenda agenda = new AgendaList();
        
        agenda.addContato(new Contato("Lucas", "123"));
         agenda.addContato(new Contato("Pedro", "001"));
         agenda.addContato(new Contato("Julica", "001"));
         
        Contato contato = agenda.buscarContatoNome("Lucas");
        
        System.out.println(contato);
        
        }
    
}
