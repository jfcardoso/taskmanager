
package util;

/**
 * Classe Responsável por criar a conexão com o banco de dados, e devolver 
 * para onde for necessário realizar consultas e manipulação do BD.
 * @author Jefferson
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/taskManager"; 
    public static final String USER = "root"; 
    public static final String PASS = ""; 
    
}
