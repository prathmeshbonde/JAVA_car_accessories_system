
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class A_ADDaccdetails extends javax.swing.JFrame {

    /**
     * Creates new form A_ADDcardetails
     */
    public A_ADDaccdetails() {
        initComponents();
    }
    void Clear(){
        cn.setText("");
      cm.setText("");
        e.setText("");
        m.setText("");
        bph.setText("");
        s.setText("");
        c.setText("");
        sc.setText("");
        ac.setText("");
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bph = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        m = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ac = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        s = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        fuelT = new javax.swing.JComboBox<>();
        trans = new javax.swing.JComboBox<>();
        cn = new javax.swing.JTextField();
//        jLabel22 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(Color.white);
        jLabel1.setText("<HTML><BODY><U>Add Accessory Details</U></BOD Y></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(620, 15, 530, 80);
        jPanel1.add(e);
        e.setBounds(840, 250, 258, 30);

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel11.setForeground(Color.white);
        jLabel11.setText("Price: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(620, 250, 146, 23);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel12.setForeground(Color.white);
        jLabel12.setText("Accessory Id: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(620, 170, 146, 23);
        jPanel1.add(cm);
        cm.setBounds(840, 170, 258, 30);

        jLabel16.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel16.setText("Warranty: ");
        jLabel16.setForeground(Color.white);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(620, 370, 170, 20);

        jLabel13.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel13.setText("Accessory Name: ");
        jLabel13.setForeground(Color.white);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(620, 210, 146, 23);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1000, 620, 90, 50);
        jPanel1.add(bph);
        bph.setBounds(840, 290, 258, 30);
        jPanel1.add(c);
        c.setBounds(840, 410, 258, 30);

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel14.setText("Recommadation: ");
        jLabel14.setForeground(Color.white);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(620, 290, 200, 23);

        jLabel17.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel17.setText("Foldable (Type YES/No): ");
        jLabel17.setForeground(Color.white);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(620, 410, 180, 23);
        jPanel1.add(m);
        m.setBounds(840, 210, 258, 30);

        jLabel18.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel18.setForeground(Color.white);
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Enter Accessory Details");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(600, 110, 270, 28);

        jLabel15.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel15.setText("Price Rnage: ");
        jLabel15.setForeground(Color.white);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(620, 330, 120, 23);
        jPanel1.add(sc);
        sc.setBounds(840, 450, 258, 30);

        jLabel19.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel19.setText("Water Resistance(YES/NO): ");
        jLabel19.setForeground(Color.white);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(620, 460, 200, 23);
        jPanel1.add(ac);
        ac.setBounds(840, 490, 258, 30);

        jLabel20.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel20.setText("Color: ");
        jLabel20.setForeground(Color.white);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(620, 500, 146, 23);

        jLabel21.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel21.setText("Category: ");
        jLabel21.setForeground(Color.white);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(620, 540, 146, 23);

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(920, 620, 70, 50);
        jPanel1.add(s);
        s.setBounds(840, 370, 260, 30);

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(840, 620, 70, 50);

        fuelT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By company", "By community", "None" }));
        jPanel1.add(fuelT);
        fuelT.setBounds(840, 530, 260, 30);

        trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium","High" }));
        jPanel1.add(trans);
        trans.setBounds(840, 330, 260, 30);
        jPanel1.add(cn);
        
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blue.png"))); // NOI18N
        image.setPreferredSize(new java.awt.Dimension(1448, 731));
        image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageFocusGained(evt);
            }
        });
        jPanel1.add(image);
        image.setBounds(0, 0, 1450, 730);
        
        


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
     private void imageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imageFocusGained
          // TODO add your handling code here:
        
      }//GEN-LAST:event_imageFocusGained


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     Clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Input All details
//        String accessname=cn.getText();
        String access_id= cm.getText();
        String access_name=m.getText();
        String price=e.getText();
        String recom=bph.getText();
        String price_range=(String)trans.getSelectedItem();
        String warranty=s.getText();
        String foldable=c.getText();
        String color=sc.getText();
        String water_res=ac.getText();
        String category=(String)fuelT.getSelectedItem();
        //Check No Field should be empty
        if(access_id.equals("")||access_name.equals("")||price.equals("")||recom.equals("")||price_range.equals("")
                ||warranty.equals("")||foldable.equals("")||color.equals("")||water_res.equals("")){
        JOptionPane.showMessageDialog(rootPane, "Fill All The Fields");
        }
        else try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456");
                Statement stmt=(Statement) con.createStatement();
                //Quary fro database
                String sql1="insert into accessory_details values('"+access_id+"','"+access_name+"','"+category+"','"
                        +price+"','"+price_range+"','"+recom+"','"+warranty+"','"+foldable+"','"+water_res+"','"+color+"');";
                
                stmt.executeUpdate(sql1);
               JOptionPane.showMessageDialog(rootPane,"Details are uploaded successfully");
              //Close Statement
                stmt.close();
                con.close();
                //Clear Field
                Clear();
        }
        catch(Exception e){
            System.out.println(e);
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(A_ADDaccdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_ADDaccdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_ADDaccdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_ADDaccdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_ADDaccdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac;
    private javax.swing.JTextField bph;
    private javax.swing.JTextField c;
    private javax.swing.JTextField cm;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField e;
    private javax.swing.JComboBox<String> fuelT;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField m;
    private javax.swing.JTextField s;
    private javax.swing.JTextField sc;
    private javax.swing.JComboBox<String> trans;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}
