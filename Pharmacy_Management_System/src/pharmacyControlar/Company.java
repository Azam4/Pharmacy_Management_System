/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyControlar;

import Com.modelpackage.AgentsModel;
import Com.modelpackage.CompanyModel;
import Service.AgentsService;
import Service.CompanyService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azam
 */
//id, name, address, exprience, phone

public class Company extends javax.swing.JFrame {
    
    String id;
    String name;
    String address;
    String exprience;
    String phone;

    /**
     * Creates new form Company
     */
    public Company() {
        initComponents();
         List<CompanyModel> l = new CompanyService().getAll(null);
            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
          n.setRowCount(0);
           for (int i = 0; i < l.size(); i++) {
               CompanyModel get = l.get(i);
               n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
               get.getPhone()});     
    }
    }
    private void allcomdata(){
    id = coId.getText();
    name = coName.getText();
    address = coAddress.getText();
    exprience = coExpricence.getText();
    phone = comphone.getText();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        coName = new javax.swing.JTextField();
        coAddress = new javax.swing.JTextField();
        comphone = new javax.swing.JTextField();
        coId = new javax.swing.JTextField();
        coUpdatebtn = new javax.swing.JButton();
        coSerch = new javax.swing.JButton();
        coAddbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabcom = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        coExpricence = new javax.swing.JTextField();
        coDeletebtn = new javax.swing.JButton();
        Idserch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 0));
        jLabel5.setText("MANAGE COMPANY");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 29, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("    ID:");
        jLabel6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel6InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 75, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("       NAME:");
        jLabel7.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel7InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("ADDRESS:");
        jLabel8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel8InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 78, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("    PHONE:");
        jLabel9.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel9InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 137, -1, 15));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("EXPERIENCE:");
        jLabel10.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel10InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 98, 106, -1));

        coName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coName.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(coName, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 131, 159, 28));

        coAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coAddress.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(coAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 179, 159, 28));

        comphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comphone.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(comphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 131, 159, 28));

        coId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coId.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(coId, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 93, 159, 28));

        coUpdatebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coUpdatebtn.setForeground(new java.awt.Color(255, 102, 102));
        coUpdatebtn.setText("Update");
        coUpdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coUpdatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(coUpdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 301, -1, -1));

        coSerch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coSerch.setForeground(new java.awt.Color(255, 102, 102));
        coSerch.setText("Search");
        coSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coSerchActionPerformed(evt);
            }
        });
        jPanel3.add(coSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 301, -1, -1));

        coAddbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coAddbtn.setForeground(new java.awt.Color(255, 102, 102));
        coAddbtn.setText("Add");
        coAddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coAddbtnActionPerformed(evt);
            }
        });
        jPanel3.add(coAddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 301, -1, -1));

        jTabcom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESS", "EXPERIENCE", "PHONE"
            }
        ));
        jScrollPane1.setViewportView(jTabcom);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 414, 525, 376));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 255, 0));
        jLabel13.setText("COMPANY LIST");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 374, -1, -1));

        coExpricence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coExpricence.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(coExpricence, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 93, 159, 28));

        coDeletebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coDeletebtn.setForeground(new java.awt.Color(255, 102, 102));
        coDeletebtn.setText("Delete");
        coDeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coDeletebtnActionPerformed(evt);
            }
        });
        jPanel3.add(coDeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 301, -1, -1));
        jPanel3.add(Idserch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pharmace Center");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGENTS");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEDICIENS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELLING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel6InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6InputMethodTextChanged

    private void jLabel7InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel7InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7InputMethodTextChanged

    private void jLabel8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel8InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8InputMethodTextChanged

    private void jLabel9InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel9InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9InputMethodTextChanged

    private void jLabel10InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel10InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10InputMethodTextChanged

    private void coAddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coAddbtnActionPerformed
        // TODO add your handling code here:
        allcomdata();
        CompanyModel comod = new CompanyModel();
        comod.setId(id);
        comod.setName(name);
        comod.setAddress(address);
        comod.setExpriece(exprience);
        comod.setPhone(phone);
       int st = new CompanyService().save(comod);
       if(st>0){
           JOptionPane.showMessageDialog(comphone, "Data Save");
           List<CompanyModel> l = new CompanyService().getAll(null);
            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
          n.setRowCount(0);
           for (int i = 0; i < l.size(); i++) {
               CompanyModel get = l.get(i);
               n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
               get.getPhone()});
               
           }
       }else{
       JOptionPane.showMessageDialog(comphone, "Data Not Save");
       }
        
    }//GEN-LAST:event_coAddbtnActionPerformed

    private void coSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coSerchActionPerformed
        // TODO add your handling code here:
        //allcomdata();
        String ser = Idserch.getText();
        CompanyModel sec = new CompanyModel();
        sec.setId(ser);
        CompanyModel value = new CompanyService().search(sec);
        coId.setText(value.getId());
        coName.setText(value.getName());
        coAddress.setText(value.getAddress());
        coExpricence.setText(value.getExpriece());
        comphone.setText(value.getPhone());
    }//GEN-LAST:event_coSerchActionPerformed

    private void coUpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coUpdatebtnActionPerformed
        // TODO add your handling code here:
        allcomdata();
        CompanyModel coup = new CompanyModel();
        coup.setId(id);
        coup.setName(name);
        coup.setAddress(address);
        coup.setExpriece(exprience);
        coup.setPhone(phone);
       int st = new CompanyService().update(coup);
       if(st>0){
           JOptionPane.showMessageDialog(comphone, "Data Update");
           List<CompanyModel> l = new CompanyService().getAll(null);
            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
          n.setRowCount(0);
           for (int i = 0; i < l.size(); i++) {
               CompanyModel get = l.get(i);
               n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
               get.getPhone()});     
    }
       }else{
       JOptionPane.showMessageDialog(comphone, "Data Not Update");
       }
    }//GEN-LAST:event_coUpdatebtnActionPerformed

    private void coDeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coDeletebtnActionPerformed
        // TODO add your handling code here:
        allcomdata();
        CompanyModel del = new CompanyModel();
        del.setId(id);
        int st = new CompanyService().delete(del);
        if(st>0){
           JOptionPane.showMessageDialog(comphone, "Data Delete");
           List<CompanyModel> l = new CompanyService().getAll(null);
            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
          n.setRowCount(0);
           for (int i = 0; i < l.size(); i++) {
               CompanyModel get = l.get(i);
               n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
               get.getPhone()});     
    }
       }else{
       JOptionPane.showMessageDialog(comphone, "Data Not Delete");
       }
    }//GEN-LAST:event_coDeletebtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idserch;
    private javax.swing.JButton coAddbtn;
    private javax.swing.JTextField coAddress;
    private javax.swing.JButton coDeletebtn;
    private javax.swing.JTextField coExpricence;
    private javax.swing.JTextField coId;
    private javax.swing.JTextField coName;
    private javax.swing.JButton coSerch;
    private javax.swing.JButton coUpdatebtn;
    private javax.swing.JTextField comphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabcom;
    // End of variables declaration//GEN-END:variables
}
