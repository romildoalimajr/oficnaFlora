/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import conexao.Conector;

/**
 *
 * @author flora.luiza
 */

public class FuncionarioDao {
    
    Conector conector = new Conector();
    
        public void insertFuncionario (Conector conector){
    
            String sql = "insert into Funcionario (cpf, nome, telefone, funcao) values (?,?,?,?)";
        
        PreparedStatemente ps;
        
//        ps = conector.getConnection().prepareStatement(sql);
//        ps.setString(1, cpf);
//        ps.setString(2, nome);
//        ps.setString(3, telefone);
//        ps.setString(4, model);
//        ps.execute();
//        ps.close();
//        System.out.println("Cadastro realizado com sucesso!");
//        conector.getConnection();
}

    public void inserirfuncionario(Conector conector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}