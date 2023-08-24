/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

/**
 *
 * @author Jefferson
 */
public class JDialogTaskScreen1 extends javax.swing.JDialog {

    /**
     * Creates new form JDialogProjectScreen
     */
    public JDialogTaskScreen1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNewProjectTitle = new javax.swing.JPanel();
        jLabelNewProjectTitle = new javax.swing.JLabel();
        jLabelNewProjectCheck = new javax.swing.JLabel();
        jPanelNewTaskForm = new javax.swing.JPanel();
        jLabelNewTaskNameCab = new javax.swing.JLabel();
        jTextFieldNewTaskName = new javax.swing.JTextField();
        jLabelNewTaskDescriptionCab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNewTaskDescription = new javax.swing.JTextArea();
        jLabelNewTaskDeadline = new javax.swing.JLabel();
        jTextFieldNewTaskDeadline = new javax.swing.JTextField();
        jLabelNewTaskNote = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNewTaskNote = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelNewProjectTitle.setBackground(new java.awt.Color(0, 102, 153));

        jLabelNewProjectTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNewProjectTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNewProjectTitle.setText("New Task");

        jLabelNewProjectCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewProjectCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelNewProjectCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelNewProjectTitleLayout = new javax.swing.GroupLayout(jPanelNewProjectTitle);
        jPanelNewProjectTitle.setLayout(jPanelNewProjectTitleLayout);
        jPanelNewProjectTitleLayout.setHorizontalGroup(
            jPanelNewProjectTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewProjectTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNewProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNewProjectCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelNewProjectTitleLayout.setVerticalGroup(
            jPanelNewProjectTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewProjectTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewProjectTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNewProjectCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabelNewProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelNewTaskForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNewTaskNameCab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNewTaskNameCab.setText("Name");

        jTextFieldNewTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNewTaskName.setToolTipText("");

        jLabelNewTaskDescriptionCab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNewTaskDescriptionCab.setText("Description");

        jTextAreaNewTaskDescription.setColumns(20);
        jTextAreaNewTaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNewTaskDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNewTaskDescription);

        jLabelNewTaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNewTaskDeadline.setText("DeadLine");

        jTextFieldNewTaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelNewTaskNote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNewTaskNote.setText("Notes");

        jTextAreaNewTaskNote.setColumns(20);
        jTextAreaNewTaskNote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNewTaskNote.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNewTaskNote);

        javax.swing.GroupLayout jPanelNewTaskFormLayout = new javax.swing.GroupLayout(jPanelNewTaskForm);
        jPanelNewTaskForm.setLayout(jPanelNewTaskFormLayout);
        jPanelNewTaskFormLayout.setHorizontalGroup(
            jPanelNewTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewTaskFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jLabelNewTaskNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNewTaskDescriptionCab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNewTaskName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNewTaskNameCab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNewTaskFormLayout.createSequentialGroup()
                        .addComponent(jLabelNewTaskDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNewTaskDeadline))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelNewTaskFormLayout.setVerticalGroup(
            jPanelNewTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewTaskFormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelNewTaskNameCab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNewTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNewTaskDescriptionCab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNewTaskDeadline)
                    .addComponent(jLabelNewTaskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNewTaskNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNewTaskForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNewProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNewTaskForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogTaskScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTaskScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTaskScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTaskScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogTaskScreen1 dialog = new JDialogTaskScreen1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNewProjectCheck;
    private javax.swing.JLabel jLabelNewProjectTitle;
    private javax.swing.JLabel jLabelNewTaskDeadline;
    private javax.swing.JLabel jLabelNewTaskDescriptionCab;
    private javax.swing.JLabel jLabelNewTaskNameCab;
    private javax.swing.JLabel jLabelNewTaskNote;
    private javax.swing.JPanel jPanelNewProjectTitle;
    private javax.swing.JPanel jPanelNewTaskForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaNewTaskDescription;
    private javax.swing.JTextArea jTextAreaNewTaskNote;
    private javax.swing.JTextField jTextFieldNewTaskDeadline;
    private javax.swing.JTextField jTextFieldNewTaskName;
    // End of variables declaration//GEN-END:variables
}