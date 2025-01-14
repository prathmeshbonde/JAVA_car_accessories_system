
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Catlog extends javax.swing.JFrame {

    Var x=new Var();
    /**
     * Creates new form Catlog_page
     */
    public Catlog() {
        initComponents();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 40, 410, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Security", "Comfort", "Ambience", "Media", "Interior" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(50, 40, 510, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Accessory id", "accessory name", "category", "price", "price range", "recommendation", "warranty", "foldable", "water_res", "color"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 540, 1350, 150);

//        jButton2.setText("Clear");
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//        jPanel1.add(jButton2);
//        jButton2.setBounds(510, 0, 440, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageDefault.png"))); // NOI18N
        jPanel1.add(image);
        image.setBounds(0, 0, 1450, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int s=x.CatlogKey;
       int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to back","Select an Option",JOptionPane.YES_NO_OPTION);
         if(x==0){ 
             this.setVisible(false);
             if(s==1)
                 new Admin().setVisible(true);
             else if(s==2)
                  new Client().setVisible(true);
             else
                    new Login_page().setVisible(true);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         //clear table
      model.setRowCount(0);
    int ind=jComboBox1.getSelectedIndex();
    
    //Set Background as per the car name
    /*
Security  ==      0
Comfort   ==      1
Ambience  ==      2
Media     ==      3
Interior  ==      4
    */
    switch(ind){
         case 0:image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/security.jpg")));
                break; 
         case 1:image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageMercedes-Benz_cla.png")));
                break;
         case 2:image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ambience.jpg")));
                break;
         case 3:image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media.jpg")));
                break;
         case 4:image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interior.jpg")));
                break;
         
    }
    
    
      try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456");
                Statement stmt=(Statement) con.createStatement();
               
               String category=(String)jComboBox1.getSelectedItem();
           //Queary for cardetails
                String sql1="select * from accessory_details where category='"+category+"';";
                ResultSet rs1=stmt.executeQuery(sql1);
          while(rs1.next())
             {      
                 //data from database
                 String accessid=rs1.getString(1);
                 String accessname=rs1.getString(2);
                 String category1=rs1.getString(3);
                 String price=rs1.getString(4);
                 String pricerange=rs1.getString(5);
                 String recom=rs1.getString(6);
                 String warranty=rs1.getString(7);
                 String foldable=rs1.getString(8);
                 String water=rs1.getString(9);
                 String color=rs1.getString(10);
               //Print in table
                 model.addRow(new Object[]{accessid,accessname,category1,price,pricerange,recom,warranty,foldable,water,color});
       }
                //Car Icon Change as per selection of car
                
          
                //Close Statement
                rs1.close();
                stmt.close();
                con.close();
        }
       
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
      model.setRowCount(0);
  image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageDefault.png")));

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Catlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
