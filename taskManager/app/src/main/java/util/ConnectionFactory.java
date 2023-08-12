
package util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Classe Responsável por criar a conexão com o banco de dados, e devolver 
 * para onde for necessário realizar consultas e manipulação do BD.
 * @author Jefferson Cardoso
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/taskManager"; 
    public static final String USER = "root"; 
    public static final String PASS = ""; 
    
    public static Connection getConnection(){
        try{
            //carrega o drive a ser usado pela classe
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch (Exception ex){
            throw new RuntimeException ("Erro na conexão com o Banco de Dados",ex);            
        }
    }
    
    public static void closeConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Erro ao fechar a conexão com o Banco de Dados",ex);
        }
    }
}
