/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

/**
 *
 * @author flora.luiza
 */

import Bean.FuncionarioDao;

public class testeconexao {
    public void main(String[]args){
        Conector conector = new Conector();
        FuncionarioDao dao = new Funcionario();
        
        dao.inserirfuncionario(conector);
    }
    
}
