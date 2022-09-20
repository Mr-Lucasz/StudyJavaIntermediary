/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.Questao2;

/**
 *
 * @author 01295230208
 */
public class App {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Malu");
        
        System.out.println("Código: " + funcionario1.getCodigo());
        System.out.println("Nome: " + funcionario1.getNome());
        
        Funcionario funcionario2 = new Funcionario("Lara");
        
        System.out.println("Código: " + funcionario2.getCodigo());
        System.out.println("Nome: " + funcionario2.getNome());
        
        Funcionario funcionario3 = new Funcionario("Marina");
        
        System.out.println("Código: " + funcionario3.getCodigo());
        System.out.println("Nome: " + funcionario3.getNome());
        
        funcionario3.geradorCodigo = 200;
        
        Funcionario funcionario4 = new Funcionario("Marília");
        
        System.out.println("Código: " + funcionario4.getCodigo());
        System.out.println("Nome: " + funcionario4.getNome());
        
        
        /*Cria outro funcionario com o nome do funcionario4, mas com o código diferente
            Utilizamos um método que está no escopo da classe
        */
        Funcionario funcionario5 = Funcionario.copiarFuncionario(funcionario4);
        
        System.out.println("Código: " + funcionario5.getCodigo());
        System.out.println("Nome: " + funcionario5.getNome());
        
        
    }
}
