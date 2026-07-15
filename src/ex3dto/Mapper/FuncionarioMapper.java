/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3dto.Mapper;

import ex3dto.DTO.FuncionarioDTO;
import ex3dto.DTO.FuncionarioResponseDTO;
import ex3dto.Model.Funcionario;

/**
 *
 * @author Administrator
 */
public class FuncionarioMapper {
    
    public FuncionarioDTO toDTO(Funcionario f){
        FuncionarioDTO dto = new FuncionarioDTO(
        f.getNome(),
        f.getCargo(),
        f.getSalario()
        );
        
        return dto;
    }
    
    public FuncionarioResponseDTO toResponseDTO(Funcionario f) {
        return new FuncionarioResponseDTO(
                f.getNome(),
                f.getCargo(),
                f.getSalario()
        );
    }
}
