/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ticketingreservationsystem_client;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class JPanelSchedule extends javax.swing.JPanel{

    /**
     * Creates new form JPanelSchedule
     * @param airlineName
     */    
    
    public String flightNumber, departureAirport, arrivalAirport, seatClass,airlineName, price;
    public Date departureDate;
    
    public JPanelSchedule(){
        initComponents();    
    }
    
    public JPanelSchedule(String flightNumber, Date departureDate, String departureAirport, String arrivalAirport, String seatClass, String airlineName, String price) {
        initComponents();
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.seatClass = seatClass;
        this.airlineName = airlineName;
        this.price = price;
        
        jLabelFlightNumber.setText(flightNumber);
        jLabelAirlineTrainShipName.setText(airlineName);
        jLabelOriginLocation.setText(departureAirport);
        jLabelDestinationLocation.setText(arrivalAirport);
        jLabelDepartureDate.setText(departureDate.getDate() + " / " + (departureDate.getMonth() + 1) + " / " + (departureDate.getYear()+1900));
        jLabelSeatClass.setText(seatClass);
        jLabelPrice.setText(price);
        
    }
    
    //clone
    public JPanelSchedule(JPanelSchedule panel){
        this(panel.flightNumber,panel.departureDate,panel.departureAirport, panel.arrivalAirport, panel.seatClass, panel.airlineName, panel.price);        
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
        jLabelAirlineTrainShipName = new javax.swing.JLabel();
        jLabelDepartureDate = new javax.swing.JLabel();
        jButtonBook = new javax.swing.JButton();
        jLabelFlightNumber = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDestinationLocation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelOriginLocation = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelSeatClass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelAirlineTrainShipName.setText("Airline,TrainName,ShipName");

        jLabelDepartureDate.setText("Departure Date");

        jButtonBook.setText("Book");
        jButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookActionPerformed(evt);
            }
        });

        jLabelFlightNumber.setText("flightNumber");

        jLabelDestinationLocation.setText("Destination");

        jLabel2.setText("To:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabelDestinationLocation))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabelDestinationLocation)
                .addContainerGap())
        );

        jLabel1.setText("From :");

        jLabelOriginLocation.setText("Origin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelOriginLocation))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabelOriginLocation)
                .addContainerGap())
        );

        jLabel9.setText("Price :");

        jLabelPrice.setText("jLabel10");

        jLabelSeatClass.setText("seatClass");

        jLabel7.setText("Seat Class :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelSeatClass))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPrice)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabelSeatClass))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelPrice))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDepartureDate)
                        .addGap(452, 452, 452)
                        .addComponent(jButtonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAirlineTrainShipName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFlightNumber)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAirlineTrainShipName)
                    .addComponent(jLabelFlightNumber))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelDepartureDate))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookActionPerformed

            // TODO add your handling code here:
        JFrameBookTicket frameBookTicket = new JFrameBookTicket(this);
        frameBookTicket.setVisible(true);

        
    }//GEN-LAST:event_jButtonBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAirlineTrainShipName;
    private javax.swing.JLabel jLabelDepartureDate;
    private javax.swing.JLabel jLabelDestinationLocation;
    private javax.swing.JLabel jLabelFlightNumber;
    private javax.swing.JLabel jLabelOriginLocation;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSeatClass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
