/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroPaciente.DAO;

import CadastroPaciente.repositorio.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class PacienteDAO implements CadastroPaciente.repositorio.Paciente{

    private static List<Paciente> pacientes =  new ArrayList <>();

    public PacienteDAO(List<Paciente> pacientes) {
        
    }
    
    
    @Override
    public List<Paciente> getPacientes() {
       return pacientes;
    }

    @Override
    public void salvarPaciente(Paciente p) {
        pacientes.add(p);
    }
    
}
