/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasam.global.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Conexao {
    
    private static String driver = "org.postgresql.driver";
    private static String url = "jdbc:postgresql://localhost/fasam";
    private static String usuario = "postgres";
    private static String senha = "fasam";
    
    public static Connection getConexao() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
