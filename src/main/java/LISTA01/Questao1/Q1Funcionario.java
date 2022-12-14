/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.Questao1;

/**
 *
 * @author 01295230208
 */
public class Q1Funcionario {
    /* 
    Acessível de qualquer local. Também possibilita sua alteração de qualquer local
    ferindo o encapuslamento (temos que tomar cuidado com esse tipo de declaração)
    
    */
    public String nome;

    /*Acessível apenas na classe Funcionario. Para acessar de outro local
    será necessário implementar os métodos get e set.
    Esse modificador não se aplica às classes, somente para seus métodos e atributos. 
    Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.
    */
    private int codigo;
    
    /*
    O modificador protected torna o membro acessível às classes do mesmo pacote 
    ou através de herança, seus membros herdados não são acessíveis a outras 
    classes fora do pacote em que foram declarados.
    */
    protected String CPF;
    
    /*
    A classe e/ou seus membros são acessíveis somente por classes do mesmo 
    pacote, na sua declaração não é definido nenhum tipo de modificador, 
    sendo este identificado pelo compilador.
    */
    String cargo;

    public Q1Funcionario(int codigo, String nome, String CPF, String cargo) {
        this.nome = nome;
        this.codigo = codigo;
        this.CPF = CPF;
        this.cargo = cargo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCargo() {
        return cargo;
    }
    
}

