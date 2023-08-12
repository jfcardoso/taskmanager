package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
           // estabelecendo a conexão com o BD
           conn = ConnectionFactory.getConnection();
           // preparando a query
           statement = conn.prepareStatement(sql);
           // setando os parâmetros
           statement.setInt(1,task.getIdProject());
           statement.setString(2, task.getName());
           statement.setString(3, task.getDescription());
           statement.setBoolean(4, task.getCompleted());
           statement.setString(5, task.getObservation());
           statement.setDate(6,new Date(task.getDeadline().getTime()));
           statement.setDate(7,new Date(task.getCreatedAt().getTime()));
           statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
           // executando a query
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao incluir a tarefa! "
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }        
   }
    
   public void update(Task task){       
       String sql = "UPDATE tasks SET idProject = ?,"
               + "name = ?,"
               + "description = ?,"
               + "completed = ?,"
               + "observation = ?,"
               + "deadline = ?,"
               + "createdAt = ?,"
               + "updatedAt = ?"
               + "WHERE id = ?";
       
       Connection conn = null;
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1,task.getIdProject());
           statement.setString(2, task.getName());
           statement.setString(3, task.getDescription());
           statement.setBoolean(4, task.getCompleted());
           statement.setString(5, task.getObservation());
           statement.setDate(6,new Date(task.getDeadline().getTime())); 
           statement.setDate(7,new Date(task.getCreatedAt().getTime()));
           statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
           statement.setInt(9,task.getId());
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao atualizar a tarefa! "
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }       
   }
   
   public void removeById(int idTask){       
       String sql = "DELETE FROM tasks WHERE ID = ?";
       
       Connection conn = null;
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1,idTask);
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao excluir a tarefa!"
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }       
   }
   
   public List<Task> getAllTasks(int idProject){       
       String sql = "SELECT * FROM tasks WHERE idProject = ?";
       
       Connection conn = null;
       PreparedStatement statement = null;
       ResultSet result = null; // obj que recebe o retorno do SELECT.
       
       // lista de tarefas que será retornada quando o método for chamado.
       List<Task> tasks = new ArrayList<>();
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1,idProject);
           result = statement.executeQuery();
           
           while(result.next()){
               
               Task task = new Task();
               task.setId(result.getInt("id"));
               task.setIdProject(result.getInt("idProject"));
               task.setName(result.getString("name"));
               task.setDescription(result.getString("description"));
               task.setCompleted(result.getBoolean("completed"));
               task.setObservation(result.getString("observation"));
               task.setDeadline(result.getDate("deadline"));
               task.setCreatedAt(result.getDate("createdAt"));
               task.setUpdatedAt(result.getDate("updatedAt"));
               
               tasks.add(task);               
           }
        
       }catch(Exception ex){
           throw new RuntimeException("Erro ao carregar a lista de tarefas!"
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn, statement, result);
       }
       
       return tasks;
   }
}
