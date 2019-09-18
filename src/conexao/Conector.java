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
        import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
        
        private String  hostname    = "localhost";
        private int     porta       = 3306;
        private String  database    = "oficina";
        private String  username    = "root";
        private String  password    = "";
    
        public Connection connection;
        
        public Conector(){
    
        String url = "jdbc:mysql://"+hostname+":"+porta+"/"+database;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.err.println( "Conectado com Sucesso!");
        } catch (SQLException ex) {
            System.err.println("Falhou Geral! "+ex);
        }
        
        
        }
        
    public Connection getConnection(){
        return this.connection;
    }
    public void closeConnection(){
        try {
            connection.close();
            System.out.println("Banco Fechado");
        } catch (SQLException ex) {
            System.err.println("Falha ao fechar o banco! " + ex);
        }
    }
    public PreparedStatement prepareStatement(String sql){
        return null;
        
    }
}
