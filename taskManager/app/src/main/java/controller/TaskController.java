package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 * Classe com os métodos que farão as operações CRUD no BD
 * @author Jefferson
 */
public class TaskController {
    
   public void save(Task task){
        
   }
    
   public void update(Task task){
       
   }
   
   public void removeById(int idTask) throws SQLException{
       
       String sql = "DELETE FROM tasks WHERE ID = ?";
       
       Connection conn = null;
       // obj que auxilia na preparação do comando SQL que será executada no BD.
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1,idTask); //setando os parâmetros
           statement.execute();           
       }catch(SQLException ex){
           throw new SQLException("Erro ao excluir a tarefa!",ex);
           
       }finally{
           ConnectionFactory.closeConnection(conn);
       }       
   }
   
   public List<Task> getAllTasks(int idProject){
     
       return null;
   }
}
