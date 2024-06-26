/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketingreservationsystem_client;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class JFrameBookTicket extends javax.swing.JFrame {

    /**
     * Creates new form JFrameBookTicket
     */
    public JFrameScheduleList parent;
    private ArrayList<JPanelPassengerDetail> panelPassengers;
    private JPanelSchedule schedule;
    public JFrameBookTicket() {
        initComponents();                
        panelPassengers = new ArrayList<JPanelPassengerDetail>();
    }
    
    public JFrameBookTicket(JFrameScheduleList parent,String flightNumber, Date departureDate, String departureAirport, String arrivalAirport, String seatClass,String airlineName, String price , int adults, int childrens , int infants) {
        this();
        
        this.parent = parent;
        
        JPanelSchedule schedule = new JPanelSchedule(this, flightNumber, departureDate, departureAirport, arrivalAirport, seatClass, airlineName, price);
        this.schedule = schedule;
        schedule.jButtonBook.setVisible(false);
        jPanel1.add(schedule);
        
        
        
        
        for (int i = 0; i < adults; i++) {
            JPanelPassengerDetail adultPassenger = new JPanelPassengerDetail("Adult");
            panelPassengers.add(adultPassenger);
        }
        
        for (int i = 0; i < childrens; i++) {
            JPanelPassengerDetail childPassenger = new JPanelPassengerDetail("Children");
            panelPassengers.add(childPassenger);
        }
        
        for (int i = 0; i < infants; i++) {
            JPanelPassengerDetail infantPassenger = new JPanelPassengerDetail("Infant");
            panelPassengers.add(infantPassenger);
        }
        
        for (JPanelPassengerDetail panelPassenger : panelPassengers) {
            jPanel1.add(panelPassenger);            
        }
        
        int total = Integer.parseInt(this.schedule.price) * (adults + childrens + infants);
        jLabelTotal.setText(total + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonBookTicket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        jButtonBookTicket.setText("Book Ticket");
        jButtonBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookTicketActionPerformed(evt);
            }
        });

        jLabel1.setText("Total :");

        jLabelTotal.setText("total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTotal)
                        .addGap(176, 176, 176)
                        .addComponent(jButtonBookTicket))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBack)
                                .addGap(0, 598, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBookTicket)
                    .addComponent(jLabel1)
                    .addComponent(jLabelTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookTicketActionPerformed
        // TODO add your handling code here:
        for (JPanelPassengerDetail panelPassenger : panelPassengers) {
            String title = (String)panelPassenger.jComboBoxTitle.getSelectedItem();
            String firstMiddleName = panelPassenger.jTextFieldFirstMiddleName.getText();
            String lastName = panelPassenger.jTextFieldLastName.getText();
            String dobDay = panelPassenger.jTextFieldDobDay.getText();
            String dobMonth = panelPassenger.jTextFieldDobMonth.getText();
            String dobYear = panelPassenger.jTextFieldDobYear.getText();
            String nationality = panelPassenger.jTextFieldNationality.getText();
            if(firstMiddleName.isEmpty() || lastName.isEmpty() || dobDay.isEmpty() || dobMonth.isEmpty() || dobYear.isEmpty() || nationality.isEmpty()){
                JOptionPane.showMessageDialog(this, "Lengkapi seluruh data penumpang");
                return;
            }
        }
        
        String idReservation = parent.parent.parent.socketController.BookingTiket(schedule.flightNumber, panelPassengers);
        
        if(idReservation.isEmpty()){
            JOptionPane.showMessageDialog(this, "Booking tiket gagal");
        }
        else{
            JOptionPane.showMessageDialog(this, "Booking ticket berhasil. Kode booking : " + idReservation);
            parent.parent.setVisible(true);
            parent.dispose();
            this.dispose();
        }
        
        
        
        
        
    }//GEN-LAST:event_jButtonBookTicketActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonBookTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
