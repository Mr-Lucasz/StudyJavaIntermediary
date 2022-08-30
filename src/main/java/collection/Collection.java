/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udesc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class Collection {

    public static void main(String[] args) {
        List<String> agenda = new ArrayList<>();
       
        System.out.println(agenda);
    }
   
    public static void addContato(List<String> agenda, String contato){
        agenda.add(contato);
        
    }
}
