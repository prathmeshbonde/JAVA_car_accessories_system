
import javax.swing.JOptionPane;


public class Admin extends javax.swing.JFrame {
 Var x=new Var();
    /**
     * Creates new form Admin_page
     */
    public Admin() {
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Welcome1 = new javax.swing.JLabel();
        Welcome2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        
        image = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1448, 731));
        jPanel1.setPreferredSize(new java.awt.Dimension(1448, 731));
        jPanel1.setLayout(null);

        jButton2.setText("Client Details ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 30, 250, 80);
        jButton2.setFont(new java.awt.Font("Times new roman", 0, 29));

        jButton3.setText("Customer Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 30, 280, 80);
        jButton3.setFont(new java.awt.Font("Times new roman", 0, 29));

        jButton5.setText("Delete Client");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(570, 30, 250, 80);
        jButton5.setFont(new java.awt.Font("Times new roman", 0, 29));

        jButton6.setText("Edit Own Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(820, 30, 210, 80);
        jButton6.setFont(new java.awt.Font("Times new roman", 0, 26));

        jButton7.setText("Log Out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1240, 30, 160, 80);
        jButton7.setFont(new java.awt.Font("Times new roman", 0, 30));

        Welcome1.setFont(new java.awt.Font("Algerian", 0, 35)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(0,0,0));
        Welcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome1.setText("Hello   "+x.User_id+"   !!");
        Welcome1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Welcome1);
        Welcome1.setBounds(460, 520, 540, 40);

        Welcome2.setFont(new java.awt.Font("Algerian", 0, 33)); // NOI18N
        Welcome2.setForeground(new java.awt.Color(0,0,0));
        Welcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome2.setText("Welcome back to Admin portal");
        Welcome2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Welcome2);
        Welcome2.setBounds(460, 630, 540, 40);

        jButton1.setText("Add accessories");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1030, 30, 210, 80);
        jButton1.setFont(new java.awt.Font("Times new roman", 0, 28));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0,0,0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Catlog");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 220, 500, 90);
        
        
        jLabel2.setFont(new java.awt.Font("Times new roman", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0,0,0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--------------------------------------------");
     
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 200, 840, 20);
        
        jLabel3.setFont(new java.awt.Font("Times new roman", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0,0,0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("--------------------------------------------");
     
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 310, 840, 20);
        

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageIn.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new A_DClient().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         int y=JOptionPane.showConfirmDialog(null,"Are you sure you want to Log out","Select an Option",JOptionPane.YES_NO_OPTION);
        if(y==0){
            this.setVisible(false);
             x.CatlogKey=0;  
            new Login_page().setVisible(true);
        }
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void imageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imageFocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_imageFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new A_CDetails().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new A_CUSDetails().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new A_editowndetails().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new A_ADDaccdetails().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
           this.setVisible(false);
        new Catlog().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
                 
      //  Welcome.setText("Welcome "+x.User_id);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel Welcome2;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    
    // End of variables declaration//GEN-END:variables
}