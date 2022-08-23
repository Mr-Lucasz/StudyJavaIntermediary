/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exemplos;

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
        Pessoa p1 = new Pessoa("Pessoa 1");
        Pessoa p2 = new Pessoa("Pessoa 2");
        Pessoa p3 = new Pessoa("Pessoa 3");
        
        Funcionario f1 = new Funcionario("Funcionário 1");
        Funcionario f2 = new Funcionario("Funcionário 1");
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        pessoas.add(f1);
        pessoas.add(f2);

        for(Pessoa p: pessoas){
            if(p instanceof Funcionario) {
                
                
            }
        }
    }
}
