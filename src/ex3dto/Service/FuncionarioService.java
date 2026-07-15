/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3dto.Service;

import ex3dto.DTO.FuncionarioDTO;
import ex3dto.DTO.FuncionarioResponseDTO;
import ex3dto.Mapper.FuncionarioMapper;
import ex3dto.Model.Funcionario;
import ex3dto.Repository.FuncionarioRepository;

/**
 *
 * @author Administrator
 */
public class FuncionarioService {
    FuncionarioRepository repository = new FuncionarioRepository(); //chama o repositorio/arraylist
    private static Long contadorId = 0L;
    
    public FuncionarioResponseDTO listarFuncionario(Long id){ //lista funcionario a partir do id
        FuncionarioMapper mapper = new FuncionarioMapper();
        
        for(Funcionario f: repository.getList()){
            if(f.getId().equals(id)){   
                return mapper.toResponseDTO(f);
            }
        }
        return null;
    }
    
    public Funcionario cadastrarFuncionario(FuncionarioDTO dto){ //cadastra funcionario utilizando DTO
        contadorId++;
        Funcionario f = new Funcionario();
        
        //atributos do dto
        f.setNome(dto.getNome());
        f.setCargo(dto.getCargo());
        f.setSalario(dto.getSalario());
        
        //atributos separados
        f.setId(contadorId);
        f.setCpf("123.456.789-01");
        repository.saveFuncionario(f);
        return f;
    }
    
    public void removerFuncionario(Long id){
        for(Funcionario f: repository.getList()){
            if(f.getId().equals(id)){
                repository.removeFuncionario(f);
            }
        }
        
    }
}
