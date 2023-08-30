package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author Jefferson
 */
public class DeadlineCellRenderer extends DefaultTableCellRenderer{
    
    
    @Override
    public Component getTableCellRendererComponent(JTable jTable,Object value,
            boolean isSelected,boolean hasFocus,int row ,int col){
        
        JLabel jLabel;
        // Returns the component that will be rendered on the screen. In this case, a label.
        jLabel = (JLabel)super.getTableCellRendererComponent(jTable, value,
                isSelected, hasFocus, row, col);        
        jLabel.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskTableModel = (TaskTableModel) jTable.getModel();
        Task task = taskTableModel.getTasks().get(row);
        
        if (task.getDeadline().after(new Date())){
            jLabel.setBackground(Color.green);
        }else {
            jLabel.setBackground(Color.red);            
        }       
        return jLabel;
    }    
}
