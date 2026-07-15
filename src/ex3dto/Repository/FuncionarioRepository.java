/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3dto.Repository;

import ex3dto.Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FuncionarioRepository {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void saveFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void removeFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
    public ArrayList<Funcionario> getList(){
        return funcionarios;
    }
}
