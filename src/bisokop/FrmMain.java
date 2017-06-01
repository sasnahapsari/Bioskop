package bisokop;

public class FrmMain extends javax.swing.JFrame {
    private String film = "";
    
    private String nama, duduk;
    private int jumlah;
    
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        pnl4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        films = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbNama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        asu = new javax.swing.JLabel();
        tbJumlah = new javax.swing.JTextField();
        tbDuduk = new javax.swing.JComboBox<>();
        pnl2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        next1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnl4.setBackground(new java.awt.Color(60, 119, 182));
        pnl4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Bioskop Premium");
        pnl4.add(jLabel16);
        jLabel16.setBounds(10, 10, 160, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(420, 10, 122, 32);

        pnl4.add(jPanel5);
        jPanel5.setBounds(0, 350, 550, 50);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mall Jaya Harapan, Papua Nugini");
        pnl4.add(jLabel17);
        jLabel17.setBounds(270, 10, 270, 30);

        films.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        films.setForeground(new java.awt.Color(255, 255, 255));
        films.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        films.setText("SIlahkan Pilih Film");
        pnl4.add(films);
        films.setBounds(30, 160, 240, 20);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Selasa, 20 Juni 2017 15.30");
        pnl4.add(jLabel19);
        jLabel19.setBounds(50, 220, 190, 16);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Terima Kasih");
        pnl4.add(jLabel21);
        jLabel21.setBounds(240, 150, 290, 70);

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Rp. 45.000");
        pnl4.add(lblTotal);
        lblTotal.setBounds(30, 200, 230, 16);

        lblNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNama.setText("Nama");
        pnl4.add(lblNama);
        lblNama.setBounds(30, 180, 230, 16);

        getContentPane().add(pnl4);
        pnl4.setBounds(10, 10, 550, 400);

        pnl3.setBackground(new java.awt.Color(60, 119, 182));
        pnl3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bioskop Premium");
        pnl3.add(jLabel7);
        jLabel7.setBounds(10, 10, 160, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButton3.setText("Next >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(420, 10, 122, 32);

        pnl3.add(jPanel4);
        jPanel4.setBounds(0, 350, 550, 50);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mall Jaya Harapan, Papua Nugini");
        pnl3.add(jLabel8);
        jLabel8.setBounds(270, 10, 270, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SIlahkan Pilih Film");
        pnl3.add(jLabel9);
        jLabel9.setBounds(50, 170, 170, 20);

        jLabel10.setText("Selasa, 20 Juni 2017");
        pnl3.add(jLabel10);
        jLabel10.setBounds(50, 210, 140, 16);

        jLabel11.setText("Atas Nama");
        pnl3.add(jLabel11);
        jLabel11.setBounds(290, 130, 120, 16);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Isikan Biodata Anda");
        pnl3.add(jLabel12);
        jLabel12.setBounds(10, 50, 520, 70);

        tbNama.setToolTipText("Atas Nama");
        pnl3.add(tbNama);
        tbNama.setBounds(290, 150, 190, 24);

        jLabel13.setText("15.30 WIB");
        pnl3.add(jLabel13);
        jLabel13.setBounds(50, 230, 120, 16);

        jLabel14.setText("Rp. 45.000");
        pnl3.add(jLabel14);
        jLabel14.setBounds(50, 190, 120, 16);

        jLabel15.setText("Tempat Duduk");
        pnl3.add(jLabel15);
        jLabel15.setBounds(290, 230, 120, 16);

        asu.setText("Jumlah TIket");
        pnl3.add(asu);
        asu.setBounds(290, 180, 120, 16);

        tbJumlah.setToolTipText("Atas Nama");
        pnl3.add(tbJumlah);
        tbJumlah.setBounds(290, 200, 190, 24);

        tbDuduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J1", "J2", "J3", "A1", "A5", "F4", "F7" }));
        pnl3.add(tbDuduk);
        tbDuduk.setBounds(290, 250, 190, 26);

        getContentPane().add(pnl3);
        pnl3.setBounds(10, 10, 550, 400);

        pnl2.setBackground(new java.awt.Color(60, 119, 182));
        pnl2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bioskop Premium");
        pnl2.add(jLabel4);
        jLabel4.setBounds(10, 10, 160, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jButton2.setText("Next >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(420, 10, 122, 32);

        pnl2.add(jPanel3);
        jPanel3.setBounds(0, 350, 550, 50);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mall Jaya Harapan, Papua Nugini");
        pnl2.add(jLabel5);
        jLabel5.setBounds(270, 10, 270, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIlahkan Pilih Film");
        pnl2.add(jLabel6);
        jLabel6.setBounds(10, 50, 520, 70);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("TRANSFORMERS: THE LAST KNIGHT");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        pnl2.add(jRadioButton1);
        jRadioButton1.setBounds(40, 150, 260, 28);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("SPIDER-MAN: HOMECOMING");
        pnl2.add(jRadioButton2);
        jRadioButton2.setBounds(330, 230, 210, 28);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("THE WHOLE TRUTH");
        pnl2.add(jRadioButton3);
        jRadioButton3.setBounds(330, 190, 170, 28);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("A FAMILY MAN");
        pnl2.add(jRadioButton4);
        jRadioButton4.setBounds(330, 150, 170, 28);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("THE MUMMY");
        pnl2.add(jRadioButton5);
        jRadioButton5.setBounds(40, 190, 150, 28);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("SURAT KECIL UNTUK TUHAN");
        pnl2.add(jRadioButton6);
        jRadioButton6.setBounds(40, 230, 230, 28);

        getContentPane().add(pnl2);
        pnl2.setBounds(10, 10, 550, 400);

        pnl1.setBackground(new java.awt.Color(60, 119, 182));
        pnl1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bioskop Premium");
        pnl1.add(jLabel1);
        jLabel1.setBounds(10, 140, 520, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        next1.setText("Next >>");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        jPanel2.add(next1);
        next1.setBounds(420, 10, 122, 32);

        pnl1.add(jPanel2);
        jPanel2.setBounds(0, 350, 550, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mall Jaya Harapan, Papua Nugini");
        pnl1.add(jLabel2);
        jLabel2.setBounds(20, 190, 520, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selamat Datang");
        pnl1.add(jLabel3);
        jLabel3.setBounds(10, 110, 520, 70);

        getContentPane().add(pnl1);
        pnl1.setBounds(10, 10, 550, 400);

        setSize(new java.awt.Dimension(584, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        // TODO add your handling code here:
        pnl1.setVisible(false);
        pnl2.setVisible(true);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
    }//GEN-LAST:event_next1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setActionCommand("TRANSFORMERS: THE LAST KNIGHT");
        jRadioButton2.setActionCommand("SPIDER-MAN: HOMECOMING");
        jRadioButton3.setActionCommand("THE WHOLE TRUTH");
        jRadioButton4.setActionCommand("A FAMILY MAN");
        jRadioButton5.setActionCommand("THE MUMMY");
        jRadioButton6.setActionCommand("SURAT KECIL UNTUK TUHAN");
        film = buttonGroup2.getSelection().getActionCommand();
        
        jLabel9.setText(film);
        films.setText(film);
        
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(true);
        pnl4.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nama = tbNama.getText();
        duduk = tbDuduk.getSelectedItem().toString();
        jumlah = Integer.valueOf(tbJumlah.getText()) * 45000;
        
        lblTotal.setText("Rp. " + String.valueOf(jumlah) + " | " + "Seat : " + duduk);
        lblNama.setText(nama);
        
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asu;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel films;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JButton next1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JComboBox<String> tbDuduk;
    private javax.swing.JTextField tbJumlah;
    private javax.swing.JTextField tbNama;
    // End of variables declaration//GEN-END:variables
}
