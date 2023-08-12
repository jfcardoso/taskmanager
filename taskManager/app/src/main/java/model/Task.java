package model;

import java.util.Date;

/**
 *
 * @author Jefferson
 */
public class Task {
    
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String observation;
    private Date deadline;
    private boolean completed;
    private Date createdAt;
    private Date updatedAt;

    public Task(int id, int idProject, String name, String description,
            String observation, Date deadline, boolean completed, 
            Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.observation = observation;
        this.deadline = deadline;
        this.completed = completed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + 
                name + ", description=" + description + ", observation=" + 
                observation + ", deadline=" + deadline + ", completed=" + 
                completed + ", createdAt=" + createdAt + ", updatedAt=" + 
                updatedAt + '}';
    }   
}
