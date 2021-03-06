/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Model.Export;
import Model.ExportModify;
import Model.HoverEffect;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KHANH VY
 */
public class ReceiptTrackingForm extends javax.swing.JPanel {

    ArrayList<Export> exportList = new ArrayList<>();
    DefaultTableModel tableModelExport;
    
    
    /**
     * Creates new form StorageTrackingForm
     */
    public ReceiptTrackingForm() {
        initComponents();
        tableModelExport = (DefaultTableModel) tblExportTracking.getModel();
        showExportTracking();
        lblStrgTrackReset.setVisible(false);
    }

    
    public void showExportTracking() {
        //employeeList = EmployeeModify.findAll();
        exportList = ExportModify.findAllExport();

        tableModelExport.setRowCount(0);
        exportList.forEach((exp) -> {
            tableModelExport.addRow(new Object[]{/*tableModel.getRowCount() + 1 ,*/exp.getReceiptId().trim(), exp.getDate(),
                exp.getTotal(), exp.getEmpId()});
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchStrgTrack = new javax.swing.JTextField();
        btnStrgTrackSearch = new javax.swing.JPanel();
        lblStrgTrackSearch = new javax.swing.JLabel();
        lblStrgTrackReset = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblExportTracking = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txtSearchStrgTrack.setFont(new java.awt.Font("Trebuchet MS", 0, 21)); // NOI18N
        txtSearchStrgTrack.setForeground(new java.awt.Color(204, 204, 204));
        txtSearchStrgTrack.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnStrgTrackSearch.setBackground(new java.awt.Color(255, 255, 255));

        lblStrgTrackSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search2.png"))); // NOI18N
        lblStrgTrackSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStrgTrackSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStrgTrackSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStrgTrackSearchMouseExited(evt);
            }
        });

        lblStrgTrackReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        lblStrgTrackReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStrgTrackResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStrgTrackResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStrgTrackResetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnStrgTrackSearchLayout = new javax.swing.GroupLayout(btnStrgTrackSearch);
        btnStrgTrackSearch.setLayout(btnStrgTrackSearchLayout);
        btnStrgTrackSearchLayout.setHorizontalGroup(
            btnStrgTrackSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStrgTrackSearchLayout.createSequentialGroup()
                .addComponent(lblStrgTrackSearch)
                .addGap(4, 4, 4)
                .addComponent(lblStrgTrackReset))
        );
        btnStrgTrackSearchLayout.setVerticalGroup(
            btnStrgTrackSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnStrgTrackSearchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnStrgTrackSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStrgTrackReset)
                    .addComponent(lblStrgTrackSearch)))
        );

        tblExportTracking.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblExportTracking.setForeground(new java.awt.Color(153, 153, 153));
        tblExportTracking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ReceiptId", "Date", "Total", "EmpId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExportTracking.setGridColor(new java.awt.Color(255, 255, 255));
        tblExportTracking.setRowHeight(25);
        tblExportTracking.setSelectionBackground(new java.awt.Color(0, 181, 204));
        jScrollPane3.setViewportView(tblExportTracking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearchStrgTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnStrgTrackSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchStrgTrack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStrgTrackSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblStrgTrackSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackSearchMouseClicked
        String find = txtSearchStrgTrack.getText();
        if (find != null && find.length() > 0) {
            lblStrgTrackReset.setVisible(true);
            lblStrgTrackSearch.setVisible(false);
            exportList = ExportModify.searchExportTracking(find);

            tableModelExport.setRowCount(0);
            exportList.forEach((exp) -> {
            tableModelExport.addRow(new Object[]{/*tableModel.getRowCount() + 1 ,*/exp.getReceiptId().trim(), exp.getDate(),
                exp.getTotal(), exp.getEmpId()});
        });
        } else {
            showExportTracking();
        }
    }//GEN-LAST:event_lblStrgTrackSearchMouseClicked

    private void lblStrgTrackSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackSearchMouseEntered
        HoverEffect.btnSearchHover(btnStrgTrackSearch);
    }//GEN-LAST:event_lblStrgTrackSearchMouseEntered

    private void lblStrgTrackSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackSearchMouseExited
        HoverEffect.btnSearchHoverExt(btnStrgTrackSearch);
    }//GEN-LAST:event_lblStrgTrackSearchMouseExited

    private void lblStrgTrackResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackResetMouseClicked
        lblStrgTrackReset.setVisible(false);
        lblStrgTrackSearch.setVisible(true);
        showExportTracking();
        txtSearchStrgTrack.setText("");
    }//GEN-LAST:event_lblStrgTrackResetMouseClicked

    private void lblStrgTrackResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackResetMouseEntered
        HoverEffect.btnSearchHover(btnStrgTrackSearch);
    }//GEN-LAST:event_lblStrgTrackResetMouseEntered

    private void lblStrgTrackResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStrgTrackResetMouseExited
        HoverEffect.btnSearchHoverExt(btnStrgTrackSearch);
    }//GEN-LAST:event_lblStrgTrackResetMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        showExportTracking();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnStrgTrackSearch;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblStrgTrackReset;
    private javax.swing.JLabel lblStrgTrackSearch;
    private javax.swing.JTable tblExportTracking;
    private javax.swing.JTextField txtSearchStrgTrack;
    // End of variables declaration//GEN-END:variables
}
