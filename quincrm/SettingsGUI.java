/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincrm;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cuong
 */
public class SettingsGUI extends javax.swing.JFrame {

    //class
    CurrentUser currentuser = new CurrentUser();

    /**
     * Creates new form SettingsGUI
     */
    public SettingsGUI() {
        initComponents();
        //set names
        String username = currentuser.getUsername();
        userDatQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM UserDat u WHERE u.usernick = '" + username + "'");
        refreshList();

        jUserTable.setRowSelectionInterval(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("jdbc:derby:QuinDatabase;create=truePU").createEntityManager();
        userDatQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM UserDat u");
        userDatList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(userDatQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        fnameLBL = new javax.swing.JLabel();
        fnameTXT = new javax.swing.JTextField();
        lnameTXT = new javax.swing.JTextField();
        lnameLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passchangeBTN = new javax.swing.JButton();
        dellaccBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jUserTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        fnameLBL.setForeground(new java.awt.Color(153, 153, 153));
        fnameLBL.setText("First Name");

        fnameTXT.setBackground(new java.awt.Color(102, 102, 102));
        fnameTXT.setForeground(new java.awt.Color(255, 255, 255));
        fnameTXT.setBorder(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jUserTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.userfname}"), fnameTXT, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        fnameTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameTXTFocusGained(evt);
            }
        });

        lnameTXT.setBackground(new java.awt.Color(102, 102, 102));
        lnameTXT.setForeground(new java.awt.Color(255, 255, 255));
        lnameTXT.setBorder(null);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jUserTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.userlname}"), lnameTXT, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lnameTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameTXTFocusGained(evt);
            }
        });

        lnameLBL.setForeground(new java.awt.Color(153, 153, 153));
        lnameLBL.setText("Last Name");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        passchangeBTN.setBackground(new java.awt.Color(51, 51, 51));
        passchangeBTN.setForeground(new java.awt.Color(204, 204, 204));
        passchangeBTN.setText("Change Password");
        passchangeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passchangeBTNActionPerformed(evt);
            }
        });

        dellaccBTN.setBackground(new java.awt.Color(51, 51, 51));
        dellaccBTN.setForeground(new java.awt.Color(204, 204, 204));
        dellaccBTN.setText("Delete Account");
        dellaccBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dellaccBTNActionPerformed(evt);
            }
        });

        backBTN.setBackground(new java.awt.Color(51, 51, 51));
        backBTN.setForeground(new java.awt.Color(204, 204, 204));
        backBTN.setText("Save & Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, userDatList, jUserTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userID}"));
        columnBinding.setColumnName("User ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userfname}"));
        columnBinding.setColumnName("Userfname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userlname}"));
        columnBinding.setColumnName("Userlname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usernick}"));
        columnBinding.setColumnName("Usernick");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userpass}"));
        columnBinding.setColumnName("Userpass");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jUserTable);
        if (jUserTable.getColumnModel().getColumnCount() > 0) {
            jUserTable.getColumnModel().getColumn(0).setMinWidth(0);
            jUserTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            jUserTable.getColumnModel().getColumn(1).setMinWidth(0);
            jUserTable.getColumnModel().getColumn(1).setPreferredWidth(0);
            jUserTable.getColumnModel().getColumn(2).setMinWidth(0);
            jUserTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            jUserTable.getColumnModel().getColumn(3).setMinWidth(0);
            jUserTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            jUserTable.getColumnModel().getColumn(4).setMinWidth(0);
            jUserTable.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnameLBL)
                            .addComponent(lnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passchangeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dellaccBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameLBL))))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(fnameLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lnameLBL)
                .addGap(6, 6, 6)
                .addComponent(lnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passchangeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(dellaccBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 480, 420));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Settings");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 420));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameTXTFocusGained
        fnameLBL.setForeground(new Color(255, 255, 255));
        lnameLBL.setForeground(new Color(153, 153, 153));

        //set Caret Color
        fnameTXT.setCaretColor(Color.WHITE);
    }//GEN-LAST:event_fnameTXTFocusGained

    private void lnameTXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameTXTFocusGained
        lnameLBL.setForeground(new Color(255, 255, 255));
        fnameLBL.setForeground(new Color(153, 153, 153));

        //set Caret Color
        lnameTXT.setCaretColor(Color.WHITE);
    }//GEN-LAST:event_lnameTXTFocusGained

    private void passchangeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passchangeBTNActionPerformed
        PassChangeGUI show = new PassChangeGUI();
        show.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_passchangeBTNActionPerformed

    private void dellaccBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dellaccBTNActionPerformed
        DelAccGUI show = new DelAccGUI();
        show.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dellaccBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        //save changes to fname and lname
        UserDat users = new UserDat();
        users.setUserID((Integer) returnUserID());
        users.setUserfname(fnameTXT.getText());
        users.setUserlname(lnameTXT.getText());
        users.setUsernick(currentuser.getUsername());
        users.setUserpass(currentuser.getUserpass());
        //EMF
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc:derby:QuinDatabase;create=truePU");
        //JPA
        UserDatJpaController jpa = new UserDatJpaController(emf);
        try {
            jpa.edit(users);
        } catch (Exception ex) {
            Logger.getLogger(SettingsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshList();

        //reset new name for home screen
        currentuser.setFname(fnameTXT.getText());

        MainGUI show = new MainGUI();
        show.setVisible(true);
        show.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_backBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton dellaccBTN;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel fnameLBL;
    private javax.swing.JTextField fnameTXT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jUserTable;
    private javax.swing.JLabel lnameLBL;
    private javax.swing.JTextField lnameTXT;
    private javax.swing.JButton passchangeBTN;
    private java.util.List<quincrm.UserDat> userDatList;
    private javax.persistence.Query userDatQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public Object returnUserID() {
        Object uID = jUserTable.getValueAt(0, 0);
        //return value for calling method
        return uID;
    }

    public void refreshList() {
        userDatList.clear();
        userDatList.addAll(userDatQuery.getResultList());
        System.out.println(userDatList);
        //repaint jTable
        jUserTable.repaint();
    }

}
