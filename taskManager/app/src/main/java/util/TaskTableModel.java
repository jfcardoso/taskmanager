package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Jefferson
 */
public class TaskTableModel extends AbstractTableModel{
    
    // The columns that the table will have.
    String[] columns = {"Name","Description","Deadline","Done?","Edit","Delete"};
    // List of data that the table will store.
    List<Task> tasks = new ArrayList<>();

    @Override
    // Returns the size of the table according to the number of tasks.
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    // Returns the number of columns according to the size of the array.
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    // Returns the correct column names.
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3; // column 'Done?' can be edited.
    }
    
    @Override
    // Overriding the method to show the checkpoint in the 'Done?' column.
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    @Override
    // Overriding the method to allow editing of the 'Done?' column.
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setCompleted((boolean) aValue);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
         switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return simpleDateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).getCompleted();
            case 4: return "";
            case 5: return "";
            default:
                return "Data not found!";
        }       
    }

    public String[] getColumns() {
        return columns;
    }
    
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }    
}
