



import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pssaw
 */
public class manageStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentForm
     */
    student std = new student();
    DefaultTableModel model;
    public manageStudentForm() {
        initComponents();
        std.fillStudentJTable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonFemale);
        bg.add(jRadioButtonMale);
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLACK);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jDateChooserBirthdate = new com.toedter.calendar.JDateChooser();
        jTextField_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonRemoveStudent = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_STD_ID = new javax.swing.JTextField();
        jButtonEditStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Val_Find = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Students");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("First Name ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Name ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sex ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("BirthDate ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Phone No. ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Address ");

        jTextField_FName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_LName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNameActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setText("Female");

        jRadioButtonMale.setText("Male");

        jDateChooserBirthdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButtonAddStudent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonRemoveStudent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Id");

        jTextField_STD_ID.setEditable(false);
        jTextField_STD_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_STD_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_STD_IDActionPerformed(evt);
            }
        });

        jButtonEditStudent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "BirthDate", "Phone No.", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField_Val_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Val_FindActionPerformed(evt);
            }
        });
        jTextField_Val_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Enter Value To Search: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jDateChooserBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonEditStudent)
                        .addGap(56, 56, 56)
                        .addComponent(jButtonAddStudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(182, 182, 182))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel14)
                .addGap(65, 65, 65)
                .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6))
                            .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(30, 30, 30)))
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonMale)
                                    .addComponent(jRadioButtonFemale))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(jDateChooserBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel11))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNameActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        //
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // Allow Only Numbers

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }

    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed

        AddStudentForm Addsf = new AddStudentForm();
                    Addsf.setVisible(true); 
                    Addsf.pack();
                    Addsf.setLocationRelativeTo(null);
                    Addsf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
        if(jTextField_STD_ID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Student Selected");
        }else{
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
        std.fillStudentJTable(jTable1, "");
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone No.","Address"}));
        std.fillStudentJTable(jTable1, jTextField_Val_Find.getText());
        MainForm.jLabel_StdsCount.setText(" Students Count = "+Integer.toString(MyFunction.countData("student")));
        
        jTextField_STD_ID.setText("");
        jTextArea_Address.setText("");
        jTextField_FName.setText("");
        jTextField_LName.setText("");
        jTextField_Phone.setText("");
        jRadioButtonFemale.setSelected(false);
        jRadioButtonMale.setSelected(false);
        jDateChooserBirthdate.setDate(null);
        
        }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    private void jTextField_STD_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_STD_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_STD_IDActionPerformed

    int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        rowIndex = jTable1.getSelectedRow();
        
        if(model.getValueAt(rowIndex, 3).toString().equals("Female"))
        {
            jRadioButtonFemale.setSelected(true);
        }else{
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        }
        jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
        
        Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooserBirthdate.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_Val_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Val_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Val_FindActionPerformed

    private void jTextField_Val_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyTyped
        
    }//GEN-LAST:event_jTextField_Val_FindKeyTyped

    private void jTextField_Val_FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyPressed
        
    }//GEN-LAST:event_jTextField_Val_FindKeyPressed

    private void jTextField_Val_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyReleased
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone No.","Address"}));
        std.fillStudentJTable(jTable1, jTextField_Val_Find.getText());
    }//GEN-LAST:event_jTextField_Val_FindKeyReleased

     public boolean verifText(){
        
        if(jTextField_FName.getText().equals("") || jTextField_LName.getText().equals("") 
                || jTextField_Phone.getText().equals("") || jTextArea_Address.getText().equals("")
                || jTextField_STD_ID.getText().equals("") || jDateChooserBirthdate.getDate() == null)
        {
            JOptionPane.showMessageDialog(null, "One or More Empty Field");
            return false;
        }
        // Choose a date higher then current date
        else if(jDateChooserBirthdate.getDate().compareTo(new Date()) > 0){
            JOptionPane.showMessageDialog(null, "No Student From The Future Are Allowed");
            return false;
        }
        else{
            return true;
        }
        
    }
    
    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextArea_Address.getText();
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        String sex = "";
        if(jRadioButtonMale.isSelected()){
            sex = "Male";
        }else if(jRadioButtonMale.isSelected()){
            sex = "Female";
        }
        

        if(verifText()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(jDateChooserBirthdate.getDate());
            student std = new student();
            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address);
            //MainForm.jLabel_StdsCount.setText(" Students Count = "+Integer.toString(MyFunction.countData("student")));
        }
    }//GEN-LAST:event_jButtonEditStudentActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
            rowIndex = jTable1.getSelectedRow();
        jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
        
        if(model.getValueAt(rowIndex, 3).toString().equals("Female"))
        {
            jRadioButtonFemale.setSelected(true);
        }else{
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        }
        
        Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooserBirthdate.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
        
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private com.toedter.calendar.JDateChooser jDateChooserBirthdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID;
    private javax.swing.JTextField jTextField_Val_Find;
    // End of variables declaration//GEN-END:variables
}