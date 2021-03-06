/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Model.ExportModify;
import Model.ReceiptDetailModify;
import Model.Validation;
import java.awt.Color;
import java.util.Date;

/**
 *
 * @author KHANH VY
 */
public class Statistic extends javax.swing.JPanel {
     Date date1, date2;
     
     
    /**
     * Creates new form Statistic
     */
    public Statistic() {
        initComponents();
        pnlRevenue.setVisible(false);
        pnlBookSale.setVisible(false);
        pnlCustomer.setVisible(false);
        pnlBestSaler.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        pnlRevenue = new javax.swing.JPanel();
        lblAdd1 = new javax.swing.JLabel();
        lblRevenue = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnCheck = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlBookSale = new javax.swing.JPanel();
        lblAdd4 = new javax.swing.JLabel();
        lblBookSale = new javax.swing.JLabel();
        pnlCustomer = new javax.swing.JPanel();
        lblAdd5 = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        pnlBestSaler = new javax.swing.JPanel();
        lblAdd6 = new javax.swing.JLabel();
        lblBestSeller = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlRevenue.setBackground(new java.awt.Color(0, 181, 204));
        pnlRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRevenueMouseEntered(evt);
            }
        });

        lblAdd1.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        lblAdd1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd1.setText("            Revenue");

        lblRevenue.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblRevenue.setForeground(new java.awt.Color(255, 255, 255));
        lblRevenue.setText("   ");

        javax.swing.GroupLayout pnlRevenueLayout = new javax.swing.GroupLayout(pnlRevenue);
        pnlRevenue.setLayout(pnlRevenueLayout);
        pnlRevenueLayout.setHorizontalGroup(
            pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlRevenueLayout.createSequentialGroup()
                .addComponent(lblAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlRevenueLayout.setVerticalGroup(
            pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueLayout.createSequentialGroup()
                .addComponent(lblAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 181, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCheck.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckMouseExited(evt);
            }
        });
        jPanel9.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 70));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("To");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("From");

        pnlBookSale.setBackground(new java.awt.Color(0, 181, 204));

        lblAdd4.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        lblAdd4.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd4.setText("   Number of Book Sale");

        lblBookSale.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblBookSale.setForeground(new java.awt.Color(255, 255, 255));
        lblBookSale.setText("   ");

        javax.swing.GroupLayout pnlBookSaleLayout = new javax.swing.GroupLayout(pnlBookSale);
        pnlBookSale.setLayout(pnlBookSaleLayout);
        pnlBookSaleLayout.setHorizontalGroup(
            pnlBookSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookSaleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblBookSale, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBookSaleLayout.createSequentialGroup()
                .addComponent(lblAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBookSaleLayout.setVerticalGroup(
            pnlBookSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookSaleLayout.createSequentialGroup()
                .addComponent(lblAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblBookSale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCustomer.setBackground(new java.awt.Color(0, 181, 204));

        lblAdd5.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        lblAdd5.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd5.setText("   Number of Customer");

        lblCustomer.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomer.setText("   ");

        javax.swing.GroupLayout pnlCustomerLayout = new javax.swing.GroupLayout(pnlCustomer);
        pnlCustomer.setLayout(pnlCustomerLayout);
        pnlCustomerLayout.setHorizontalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addComponent(lblAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCustomerLayout.setVerticalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addComponent(lblAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBestSaler.setBackground(new java.awt.Color(0, 181, 204));

        lblAdd6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        lblAdd6.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd6.setText("          Best Seller");

        lblBestSeller.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblBestSeller.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBestSalerLayout = new javax.swing.GroupLayout(pnlBestSaler);
        pnlBestSaler.setLayout(pnlBestSalerLayout);
        pnlBestSalerLayout.setHorizontalGroup(
            pnlBestSalerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBestSalerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblBestSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBestSalerLayout.createSequentialGroup()
                .addComponent(lblAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBestSalerLayout.setVerticalGroup(
            pnlBestSalerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBestSalerLayout.createSequentialGroup()
                .addComponent(lblAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblBestSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBookSale, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBestSaler, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBookSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBestSaler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlRevenueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRevenueMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRevenueMouseEntered

    private void btnCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseEntered
        Color clr = new Color(0, 153, 204);
        jPanel9.setBackground(clr);
    }//GEN-LAST:event_btnCheckMouseEntered

    private void btnCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseExited
        Color clr = new Color(0, 181, 204);
        jPanel9.setBackground(clr);
    }//GEN-LAST:event_btnCheckMouseExited

    private void btnCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseClicked
        date1 = jDateChooser1.getDate();
        date2 = jDateChooser2.getDate();
        if (date1 != null & date2 != null) {
            int revenue = ExportModify.showRevenue(date1, date2);
            int bookSale = ReceiptDetailModify.showBookSale(date1, date2);
            int customer = ExportModify.showCustomer(date1, date2);
            String bestSeller = ReceiptDetailModify.showBestSaler(date1, date2);
            lblRevenue.setText(Integer.toString(revenue));
            lblBookSale.setText(Integer.toString(bookSale));
            lblCustomer.setText(Integer.toString(customer));
            lblBestSeller.setText(bestSeller);
            
            if (!lblRevenue.getText().equals("0")) {
                pnlRevenue.setVisible(true);
                pnlBookSale.setVisible(true);
                pnlCustomer.setVisible(true);
                pnlBestSaler.setVisible(true);
            } else {
                pnlRevenue.setVisible(false);
                pnlBookSale.setVisible(false);
                pnlCustomer.setVisible(false);
                pnlBestSaler.setVisible(false);
                Validation.Notify(this, "No Data!", "Message");

            }
        } else {
            Validation.Notify(this, "Please choose date!", "Message");
        }
    }//GEN-LAST:event_btnCheckMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCheck;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAdd1;
    private javax.swing.JLabel lblAdd4;
    private javax.swing.JLabel lblAdd5;
    private javax.swing.JLabel lblAdd6;
    private javax.swing.JLabel lblBestSeller;
    private javax.swing.JLabel lblBookSale;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JPanel pnlBestSaler;
    private javax.swing.JPanel pnlBookSale;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlRevenue;
    // End of variables declaration//GEN-END:variables
}
