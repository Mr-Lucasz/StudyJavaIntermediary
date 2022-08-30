/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package packageInterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        List<Autenticavel> autenticaveis = new ArrayList<>();
        
        Autenticavel diretor = (Autenticavel) new Diretor();
        Autenticavel gerente = (Autenticavel) new Gerente();
        
        autenticaveis.add(gerente);
        autenticaveis.add(diretor);

        
    }
}
