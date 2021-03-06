/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sst.gui;

import fnss.functions.DB;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author CheeBhagyani
 */
public class sstManageJobs extends javax.swing.JFrame {

    /**
     * Creates new form sstNewJob
     */
    public sstManageJobs() {
        initComponents();
        this.setLocationRelativeTo(null);
        Load_jobTable();
    }
    
        sstAddJob updatejob = new sstAddJob();
    
    private void Load_jobTable(){
        try{
            
            String sql = "select ServiceID,AllocatedTime,ServiceType,SlotNumber,VehicleNumber,VehicleType,Date,CustomerID from service where AllocatedTime IS NOT NULL";
            //DB.getDbCon().insert(sql1);
           ResultSet res;
            res = DB.getDbCon().query(sql);
            jobtable.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobtable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        mng_addjob = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1170, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/sstlogo.png"))); // NOI18N
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 140, 141));
        jLabel5.setText("Manage Jobs");

        jobtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ServiceID", "AllocatedTime", "ServiceType", "SlotNumber", "VehicleNumber", "VehicleType", "Date", "CustomerID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jobtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jobtable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Commands"));

        mng_addjob.setBackground(new java.awt.Color(149, 165, 166));
        mng_addjob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mng_addjob.setText("Add New Job");
        mng_addjob.setOpaque(true);
        mng_addjob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mng_addjobMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(mng_addjob, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(mng_addjob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(396, 396, 396))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1020, 480));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(189, 195, 199));
        jLabel3.setOpaque(true);
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1240, 390));

        jLabel2.setBackground(new java.awt.Color(44, 62, 80));
        jLabel2.setOpaque(true);
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1260, 300));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new sstHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void mng_addjobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mng_addjobMouseClicked
        // TODO add your handling code here:
        new sstAddJob().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mng_addjobMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new sstHome().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jobtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtableMouseClicked
       
       updatejob.addjob_addjob.hide();
       int index = jobtable.getSelectedRow();
       TableModel model = jobtable.getModel();
  
       String sertype = model.getValueAt(index, 2).toString();
       String slotnum = model.getValueAt(index, 3).toString();
       String vehnumbr = model.getValueAt(index, 4).toString();
       String vehicl = model.getValueAt(index, 5).toString();
       String id = model.getValueAt(index, 7).toString();
       
       
       String caldate = model.getValueAt(index, 1).toString(); 
       
      // Date now = new Date();
      //  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
      //  updatejob.allDate.set(sf.format(now));
        
       //.toString();
      // String d = date.toString();

       updatejob.setVisible(true);
       updatejob.pack();
       updatejob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       updatejob.vehno.setText(vehnumbr);
       updatejob.vehtype.setText(vehicl);
       updatejob.jobcusid.setSelectedItem(id);
       updatejob.booked.setText(" Booked on " + caldate);
       updatejob.raBtn.setSelected(false);
       
      // updatejob.allDate.setDate(sf.format(now));
      
       
    //   jobtable.getColumnModel().getColumn(7).setCellEditor(new DefaultCellEditor(updatejob.jobcusid));
       
       if("Reparing".equals(sertype)){
       updatejob.cb1.setSelected(true);
       }
          
       else if("Cleaning".equals(sertype)){
       updatejob.cb2.setSelected(true);
       }
       
       else /*("Full Service".equals(sertype))*/{
       updatejob.cb3.setSelected(true);
       }
       
       if("Slot one".equals(slotnum)){
       updatejob.slot1.setSelected(true);
       }
       
       else{
       updatejob.slot2.setSelected(true);
       }

       this.dispose();
       
       
    }//GEN-LAST:event_jobtableMouseClicked

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
            java.util.logging.Logger.getLogger(sstManageJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sstManageJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sstManageJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sstManageJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sstManageJobs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jobtable;
    private javax.swing.JLabel mng_addjob;
    // End of variables declaration//GEN-END:variables

  
}
