package controller;

import java.sql.Connection;
import java.sql.Date;
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
        String sql = "INSERT INTO tasks ("
                + "idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "observation,"
                + "deadline,"
                + "createdAt,"
                + " updatedAt)"
                + "VALUES (?,?,?,?,?,?,?,?)";
       
       Connection conn = null;
       // obj que auxilia na preparação do comando SQL que será executada no BD.
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           //setando os parâmetros
           statement.setInt(1,task.getIdProject());
           statement.setString(2, task.getName());
           statement.setString(3, task.getDescription());
           statement.setBoolean(4, task.getCompleted());
           statement.setString(5, task.getObservation());
           statement.setDate(6,new Date(task.getDeadline().getTime()));
           statement.setDate(7,new Date(task.getCreatedAt().getTime()));
           statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
           statement.execute();           
       }catch(SQLException ex){
           throw new RuntimeException("Erro ao incluir a tarefa!" + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn);
       }        
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
