/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroPaciente.repositorio;

import java.util.List;

/**
 *
 * @author 01295230208
 */
public interface Consulta {
        List<Consulta> getConsultas();
        void salvarConsulta(Consulta c);
    
}
