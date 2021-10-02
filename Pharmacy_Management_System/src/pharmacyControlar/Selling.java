/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyControlar;

import Com.modelpackage.CompanyModel;
import Com.modelpackage.MedicineModel;
import Service.CompanyService;
import Service.MedicineService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        ShowDate();
        List<MedicineModel> l = new MedicineService().getAll(null);
          DefaultTableModel n = (DefaultTableModel) Tableselling.getModel();
          n.setRowCount(0);
          //stem.out.println(l.get(0).getaName());
        for (int i = 0; i < l.size(); i++) {
            MedicineModel get = l.get(i);
            n.addRow(new Object[] {get.getM_id(),get.getM_name(),get.getM_price(),get.getM_qty(),
            get.getM_comp()});
        }
    }
    public void ShowDate(){
    Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelebel.setText(s.format(d));
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
        datelebel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selMname = new javax.swing.JTextField();
        selqty = new javax.swing.JTextField();
        selId = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        seladdtobill = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        coDeletebtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableselling = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtext = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datelebel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        datelebel.setForeground(new java.awt.Color(51, 255, 255));
        datelebel.setText("Date");
        jPanel3.add(datelebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

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
        jLabel7.setText("   M_NAME:");
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
        jLabel8.setText("        QTY:");
        jLabel8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel8InputMethodTextChanged(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 78, -1));

        selMname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selMname.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(selMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 131, 159, 28));

        selqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selqty.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(selqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 179, 159, 28));

        selId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selId.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(selId, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 93, 159, 28));

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 102, 102));
        clearbtn.setText("clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel3.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        seladdtobill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        seladdtobill.setForeground(new java.awt.Color(255, 102, 102));
        seladdtobill.setText("Add To Bill");
        seladdtobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seladdtobillActionPerformed(evt);
            }
        });
        jPanel3.add(seladdtobill, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 255, 0));
        jLabel13.setText("MEDICINES LIST");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        coDeletebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coDeletebtn.setForeground(new java.awt.Color(255, 102, 102));
        coDeletebtn.setText("Delete");
        coDeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coDeletebtnActionPerformed(evt);
            }
        });
        jPanel3.add(coDeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 0));
        jLabel11.setText("BILLING");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 255));
        jLabel12.setText("Seller");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Tableselling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MEDNAME", "PRICE", "QUANTITY", "COMANY"
            }
        ));
        Tableselling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablesellingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tableselling);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 370, 130));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 255, 0));
        jLabel14.setText("    BILL");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, -1));

        billtext.setColumns(20);
        billtext.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        billtext.setRows(5);
        billtext.setText("***************************PharmaCenter***********");
        jScrollPane2.setViewportView(billtext);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 400, 180));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton1.setText("PRINT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
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

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
//       allcomdata();
//        CompanyModel coup = new CompanyModel();
//        coup.setId(id);
//        coup.setName(name);
//        coup.setAddress(address);
//        coup.setExpriece(exprience);
//        coup.setPhone(phone);
//        int st = new CompanyService().update(coup);
//        if(st>0){
//            JOptionPane.showMessageDialog(comphone, "Data Update");
//            List<CompanyModel> l = new CompanyService().getAll(null);
//            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
//            n.setRowCount(0);
//            for (int i = 0; i < l.size(); i++) {
//                CompanyModel get = l.get(i);
//                n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
//                    get.getPhone()});
//        }
//        }else{
//            JOptionPane.showMessageDialog(comphone, "Data Not Update");
//        }
  
    }//GEN-LAST:event_clearbtnActionPerformed

    private void seladdtobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seladdtobillActionPerformed
        // TODO add your handling code here:
//        allcomdata();
//        CompanyModel comod = new CompanyModel();
//        comod.setId(id);
//        comod.setName(name);
//        comod.setAddress(address);
//        comod.setExpriece(exprience);
//        comod.setPhone(phone);
//        int st = new CompanyService().save(comod);
//        if(st>0){
//            JOptionPane.showMessageDialog(comphone, "Data Save");
//            List<CompanyModel> l = new CompanyService().getAll(null);
//            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
//            n.setRowCount(0);
//            for (int i = 0; i < l.size(); i++) {
//                CompanyModel get = l.get(i);
//                n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
//                    get.getPhone()});
//
//        }
//        }else{
//            JOptionPane.showMessageDialog(comphone, "Data Not Save");
//        }

    }//GEN-LAST:event_seladdtobillActionPerformed

    private void coDeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coDeletebtnActionPerformed
        // TODO add your handling code here:
//        allcomdata();
//        CompanyModel del = new CompanyModel();
//        del.setId(id);
//        int st = new CompanyService().delete(del);
//        if(st>0){
//            JOptionPane.showMessageDialog(comphone, "Data Delete");
//            List<CompanyModel> l = new CompanyService().getAll(null);
//            DefaultTableModel n = (DefaultTableModel) jTabcom.getModel();
//            n.setRowCount(0);
//            for (int i = 0; i < l.size(); i++) {
//                CompanyModel get = l.get(i);
//                n.addRow(new Object[]{get.getId(),get.getName(),get.getAddress(),get.getExpriece(),
//                    get.getPhone()});
//        }
//        }else{
//            JOptionPane.showMessageDialog(comphone, "Data Not Delete");
//        }
    }//GEN-LAST:event_coDeletebtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void TablesellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablesellingMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Tableselling.getModel();
        int myindex = Tableselling.getSelectedRow();
        selId.setText(model.getValueAt(myindex, 0).toString());
        selMname.setText(model.getValueAt(myindex, 1).toString());
        int price = Integer.valueOf(model.getValueAt(myindex, 2).toString());
        
    }//GEN-LAST:event_TablesellingMouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tableselling;
    private javax.swing.JTextArea billtext;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton coDeletebtn;
    private javax.swing.JLabel datelebel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField selId;
    private javax.swing.JTextField selMname;
    private javax.swing.JButton seladdtobill;
    private javax.swing.JTextField selqty;
    // End of variables declaration//GEN-END:variables
}
