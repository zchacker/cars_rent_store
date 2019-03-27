/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars_rent_store;

/**
 *
 * @author user00
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
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

        jPanel1 = new javax.swing.JPanel();
        cars = new javax.swing.JButton();
        rent_car = new javax.swing.JButton();
        rented_cars = new javax.swing.JButton();
        cars_maintenance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        cars.setText("السيارات");
        cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsActionPerformed(evt);
            }
        });

        rent_car.setText("استأجار سيارة");
        rent_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rent_carActionPerformed(evt);
            }
        });

        rented_cars.setText("السيارات المؤجرة");
        rented_cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rented_carsActionPerformed(evt);
            }
        });

        cars_maintenance.setText("صيانة السيارات");
        cars_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cars_maintenanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(cars_maintenance)
                .addGap(18, 18, 18)
                .addComponent(rented_cars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rent_car)
                .addGap(18, 18, 18)
                .addComponent(cars)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cars)
                    .addComponent(rent_car)
                    .addComponent(rented_cars)
                    .addComponent(cars_maintenance))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsActionPerformed
        Cars cars = new Cars();
        cars.setVisible(true);
        cars.setLocationRelativeTo(this);
    }//GEN-LAST:event_carsActionPerformed

    private void rent_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rent_carActionPerformed
       Rent_car rent_car = new Rent_car();
       rent_car.setVisible(true);
       rent_car.setLocationRelativeTo(this);
    }//GEN-LAST:event_rent_carActionPerformed

    private void rented_carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rented_carsActionPerformed
        Rented_car rented_car = new Rented_car();
        rented_car.setVisible(true);
        rented_car.setLocationRelativeTo(this);
    }//GEN-LAST:event_rented_carsActionPerformed

    private void cars_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cars_maintenanceActionPerformed
        Maintenance maintenance = new Maintenance();
        maintenance.setVisible(true);
        maintenance.setLocationRelativeTo(this);
    }//GEN-LAST:event_cars_maintenanceActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cars;
    private javax.swing.JButton cars_maintenance;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rent_car;
    private javax.swing.JButton rented_cars;
    // End of variables declaration//GEN-END:variables
}
