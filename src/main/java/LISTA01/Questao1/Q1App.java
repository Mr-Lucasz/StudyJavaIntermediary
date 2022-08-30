/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.Questao1;

;

/**
 *
 * @author 01295230208
 */
    public class Q1App {
    public static void main(String[] args){
        Q1Funcionario funcionario = new Q1Funcionario(1, "Marina", "12345", "DevOps");
        
        System.out.println("Codigo: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("CPF: " + funcionario.CPF);
        System.out.println("Nome: " + funcionario.cargo);
    }
}
