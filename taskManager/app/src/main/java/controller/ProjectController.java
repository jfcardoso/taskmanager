package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 * 
 * @author Jefferson
 */
public class ProjectController {
    
   public void save(Project project){
        String sql = "INSERT INTO projects ("
                + "name,"
                + "description,"
                + "createdAt,"
                + "updatedAt)"
                + "VALUES (?,?,?,?)";
       
       Connection conn = null;
       PreparedStatement statement = null;
       
       try{
           // estabelecendo a conexão com o BD
           conn = ConnectionFactory.getConnection();
           // preparando a query
           statement = conn.prepareStatement(sql);
           // setando os parâmetros
           statement.setString(1, project.getName());
           statement.setString(2, project.getDescription());           
           statement.setDate(3,new Date(project.getCreatedAt().getTime()));
           statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
           // executando a query
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao incluir o projeto! "
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }        
   }
    
   public void update(Project project){       
       String sql = "UPDATE projects SET"
               + "name = ?,"
               + "description = ?,"
               + "createdAt = ?,"
               + "updatedAt = ?"
               + "WHERE id = ?";
       
       Connection conn = null;
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setString(1, project.getName());
           statement.setString(2, project.getDescription());
           statement.setDate(3,new Date(project.getCreatedAt().getTime()));
           statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
           statement.setInt(5,project.getId());
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao atualizar o projeto! "
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }       
   }
   
   public void removeById(int id){       
       String sql = "DELETE FROM projects WHERE ID = ?";
       
       Connection conn = null;
       PreparedStatement statement = null;
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1,id);
           statement.execute();           
       }catch(Exception ex){
           throw new RuntimeException("Erro ao excluir o projeto!"
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn,statement);
       }       
   }
   
   public List<Project> getAllProject(){       
       String sql = "SELECT * FROM projects";
       
       Connection conn = null;
       PreparedStatement statement = null;
       ResultSet result = null; // obj que recebe o retorno do SELECT.
       
       // lista de tarefas que será retornada quando o método for chamado.
       List<Project> projects = new ArrayList<>();
       
       try{
           conn = ConnectionFactory.getConnection();
           statement = conn.prepareStatement(sql);
           result = statement.executeQuery();
           
           while(result.next()){
               
               Project project = new Project();
               
               project.setId(result.getInt("id"));
               project.setName(result.getString("name"));
               project.setDescription(result.getString("description"));
               project.setCreatedAt(result.getDate("createdAt"));
               project.setUpdatedAt(result.getDate("updatedAt"));
               
               projects.add(project);               
           }
        
       }catch(Exception ex){
           throw new RuntimeException("Erro ao carregar a lista de projetos!"
                   + ex.getMessage(),ex);           
       }finally{
           ConnectionFactory.closeConnection(conn, statement, result);
       }
       
       return projects;
   }
}

