/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3dto;

import ex3dto.DTO.FuncionarioDTO;
import ex3dto.Service.FuncionarioService;
import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class Ex3DTO {


    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();
        
        //instanciando funcionarios utilizando o service
        service.cadastrarFuncionario(new FuncionarioDTO("funcionario um",
        "adm",
        new BigDecimal(2500))
        );
        
        service.cadastrarFuncionario(new FuncionarioDTO("funcionario dois",
        "adm2",
        new BigDecimal(250))
        );
        
        service.cadastrarFuncionario(new FuncionarioDTO("funcionario dois",
        "adm2",
        new BigDecimal(250))
        );
        
        //listando funcionarios a partir do ID
        System.out.println(service.listarFuncionario(1L));
        System.out.println(service.listarFuncionario(2L));
        System.out.println(service.listarFuncionario(3L));
        
        //removendo funcionario com ID == 2
        service.removerFuncionario(2L);
        
        //listando novamente para verificar se o funcionario foi removido corretamente
        System.out.println(service.listarFuncionario(1L));
        System.out.println(service.listarFuncionario(2L));
        System.out.println(service.listarFuncionario(3L));
    }
    
}
