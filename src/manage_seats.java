/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * destination_page.java
 *
 * Created on 27 Dec, 2019, 9:58:57 PM
 */

/**
 *
 * @author Vaibhav Agarwal
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class manage_seats extends javax.swing.JFrame {

    /** Creates new form destination_page */
    public manage_seats() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("MANAGE SEATS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 172, 29);

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("SEAT ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 50, 80, 17);

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("PRICE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(34, 80, 70, 17);

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("SEAT TYPE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 80, 17);

        jTextField1.setText("                  ");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 50, 100, 20);

        jTextField2.setText("                ");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 80, 100, 20);

        jButton1.setText("SEARCH FOR SEAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(305, 40, 160, 23);

        jButton2.setText("ADD SEATS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 80, 170, 23);

        jButton3.setText("SHOW TOTAL SEATS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(303, 120, 170, 23);

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 160, 130, 23);

        jButton5.setText("DELETE SEATS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(340, 200, 130, 23);

        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 0, 41, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEAT ID", "SEAT TYPE", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 280, 100);

        jTextField3.setText("                  ");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 110, 100, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i8.jpeg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 500, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String id = jTextField1.getText();
        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");
             {
             Statement stmt = null;
              ResultSet rs = null;
              stmt= con.createStatement();
             String SQL = "Select * from flight_seats where seat_id ='"+(id)+"';";
             rs = stmt.executeQuery(SQL);
             while(rs.next()){
                 String a = rs.getString("seat_id");
                 String b = rs.getString("specility");
                 String c = rs.getString("price");
                 model.addRow(new Object[]{a,b,c});}
              rs.close();
             stmt.close();
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  String a1 = jTextField1.getText();
        if((a1.startsWith("W"))||(a1.startsWith("w"))){
            jTextField2.setText("5000");
            jTextField3.setText("WindowSeat");
        }else if((a1.startsWith("N"))||(a1.startsWith("n"))){
            jTextField2.setText("4500");
            jTextField3.setText("NormalSeat");
        }
         String id = jTextField1.getText();
        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");
             {
             Statement stmt = null;
              ResultSet rs = null;
              stmt= con.createStatement();
             String SQL = "insert into flight_seats values('"+(jTextField1.getText())+"','"+(jTextField3.getText())+"',"+(jTextField2.getText())+");";
             int z = stmt.executeUpdate(SQL);
                rs.close();
             stmt.close();
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");{
             Statement stmt = null;
              ResultSet rs = null;
              stmt= con.createStatement();
             String SQL = "Select * from flight_seats;";
             rs = stmt.executeQuery(SQL);
             while(rs.next()){
                 String a = rs.getString("seat_id");
                 String b = rs.getString("specility");
                 String c = rs.getString("price");
                 model.addRow(new Object[]{a,b,c});
             }

              rs.close();
             stmt.close();
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          String a1 = jTextField1.getText();
        try{

           Class.forName("java.sql.Driver");
             Connection con = (Connection)
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","vaibhav");{
             Statement stmt = null;
              ResultSet rs = null;
              stmt= con.createStatement();
             String SQL = "DELETE from flight_seats where seat_id = '"+(a1)+"';";
             int z = stmt.executeUpdate(SQL);
                rs.close();
             stmt.close();
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    new login_page().setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_seats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
