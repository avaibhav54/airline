/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * flights_and_seats_selections.java
 *
 * Created on 27 Dec, 2019, 10:33:28 PM
 */

/**
 *
 * @author Vaibhav Agarwal
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
public class flights_and_seats_selections extends javax.swing.JFrame {

    /** Creates new form flights_and_seats_selections */
    public flights_and_seats_selections() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("SELECT FLIGHT AND SEATS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 0, 331, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("SELECT DEPARTURE TIMING:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 90, 170, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("SELECT CLASS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 140, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("INFO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(765, 20, 50, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("SPECILITY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 140, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("TOTAL SEATS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(890, 230, 90, 14);

        jPanel1.setOpaque(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ECONOMY");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("BUSINESS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 170, 120, 46);

        jPanel2.setOpaque(false);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("WINDOW SEATS");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("NORMAL SEATS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton4))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 160, 130, 53);

        jPanel3.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("ID NUMBER");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("FLIGHT TYPE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("FROM");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("TO");

        jTextField9.setText("                 ");

        jTextField10.setText("                  ");

        jTextField11.setText("                 ");

        jTextField12.setText("                ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(740, 40, 171, 119);

        jButton2.setText("CHECK AVAILABLE FLIGHTS AND SEATS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 310, 310, 23);

        jButton1.setText("PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(279, 440, 160, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FLIGHT ID", "FLIGHT NAME", "FLIGHT FACILITIES", "FLIGHT DEPARTURE TIMING"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 452, 70);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEAT ID", "SPECILITY", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(jTable3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(480, 350, 452, 100);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Early Morning(00:00:00-10:30:00)", "Morning(10:31:00-12:30:00)", "Afternoon(12:31:00-16:00:00)", "Evening(16:31:00-19:00:00)", "Night(19:00:00-23:59:00)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(260, 80, 190, 20);

        jTextField1.setText("                     ");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(900, 260, 69, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/193176.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-550, -10, 1580, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    try{

                 Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");
             {
              Statement stmt = null;
              ResultSet rs = null;
              stmt= con.createStatement();
              String SQL = "Select * From Destination_Table;";
              rs = stmt.executeQuery(SQL);
              if(rs.last()){
                   String source = rs.getString("SOURCE");
                   String Des = rs.getString("DESTINATION");
                   String type = rs.getString("FLIGHT_TYPE");
                   String Id_num = rs.getString("ID_NUMBER");
                   jTextField9.setText(""+Id_num);
                   jTextField11.setText(source);
                   jTextField10.setText(type);
                   jTextField12.setText(Des);
              }
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
           // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 int in = jTable1.getRowCount();
        int bn =jTable3.getRowCount();
        DefaultTableModel model1 = (DefaultTableModel) jTable3.getModel();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i = 0;i<=in;i++){
            jTable1.remove(i);
        }
        for(int i = 0;i<=bn;i++){
            jTable3.remove(i);
        }
        String f_on , f_off;
        String f_timing = null ;
        if(jComboBox1.getSelectedIndex()==0){
            f_timing="Early Morning";
            f_on="00:00:00" ;
            f_off="10:30:00";
        }else if(jComboBox1.getSelectedIndex()==1){
            f_timing="Morning";
            f_on="10:31:00";
            f_off="12:30:00";
        }else if(jComboBox1.getSelectedIndex()==2){
            f_timing="Afternoon";
            f_on="12:31:00";
            f_off="16:00:00";
        }else if(jComboBox1.getSelectedIndex()==3){
            f_timing="Evening";
            f_on="16:31:00";
            f_off="19:00:00";
        }else if(jComboBox1.getSelectedIndex()==4){
            f_timing="Night";
            f_on="19:00:00";
            f_off="23:59:00";
        }

        String Flag ;
        if(jRadioButton3.isSelected()){
            Flag = "W";
        }
        else
            Flag = "N";
        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");
             {
              Statement stmt = null,stmt1 = null,stmt2 = null;
              ResultSet rs = null, rs1 = null, rs2 = null;
              stmt2= con.createStatement();
              stmt= con.createStatement();
              stmt1= con.createStatement();

              String SQL2 = "SELECT * FROM passenger_details_1 where ID_Number='"+(jTextField9.getText())+"';";
              rs2 = stmt.executeQuery(SQL2);
              int b=0;
              while(rs2.next()){
                 String a = rs2.getString("DEPARTURE_DATE");
                 b = Integer.parseInt(a.substring(8,10));
              }

              String SQL1 = "SELECT * FROM Flight_Seats WHERE SEAT_ID LIKE '"+Flag+"%';";
              rs1 = stmt1.executeQuery(SQL1);
              while(rs1.next()){
                   String Seatid= rs1.getString("Seat_id");
                   String Specility = rs1.getString("Specility");
                   String Price=rs1.getString("Price");
                  model1.addRow(new Object[]{Seatid,Specility,Price});
              }

              String SQL = "SELECT * FROM flight_status where f_time_name= '"+(f_timing)+"' AND F_onservice_Date >="+(b)+" ;";
              rs = stmt.executeQuery(SQL);
                   while(rs.next()){
                   String fname= rs.getString("F_Name");
                   String fdeparture= rs.getString("F_offline_timing");
                   String ffacilities=rs.getString("F_facilities");
                   String fid = rs.getString("F_id");
                  model.addRow(new Object[]{fid,fname,ffacilities,fdeparture});
              }
          }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e.getMessage());
       }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");
                    {
                        Statement stmt = null , stmt1 = null ;
                        ResultSet rs =null ;
                        ResultSet rs1 = null ;
                        stmt=con.createStatement();
                        stmt1=con.createStatement();

                        String id = (jTextField9.getText());
                        String selectedFlightID=String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0));
                        String classtype = (jRadioButton1.isSelected())? "Economy":"Bussiness";
                        String SeatType = (jRadioButton3.isSelected())? "Window":"Normal";

                        String Sql2 = "Select * From passenger_details_1 ;";
                        String SQL1 = "Insert Into passenger_details_3 values ('"+(id)+"','"+(selectedFlightID)+"','"+(classtype)+"','"+(SeatType)+"');";

                        rs =stmt.executeQuery(Sql2);
                        int r1=stmt1.executeUpdate(SQL1);
                        if(rs.last()){
                        int ad = rs.getInt("Adult");
                        int cd = rs.getInt("Children");
                        int totalseats = ad+cd;
                        jTextField1.setText(""+totalseats);
                        }
                    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

              int s = Integer.parseInt(jTextField1.getText());
              int selectedrows= jTable3.getSelectedRowCount();
              jTextField1.setText(""+selectedrows);
                     if(s==selectedrows){
                      this.dispose();
                 new check_out().setVisible(true);
                     }else{
                         JOptionPane.showMessageDialog(rootPane,"Please select the number of seats you entered earlier");
                     }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flights_and_seats_selections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}