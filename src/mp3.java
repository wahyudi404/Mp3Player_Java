/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.JFileChooser;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author COMPUTER
 */
public class mp3 extends javax.swing.JFrame {
    DefaultListModel model= new DefaultListModel();
    public Player mp3_ok;
    /**
     * Creates new form mp3
     */
    public mp3() {
        initComponents();
        this.setLocationRelativeTo(null); //tampilan di tengah layar 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftar = new javax.swing.JList();
        buka = new javax.swing.JButton();
        main = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel1.setText("PEMUTAR MUSIK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel2.setText("Tambah ke daftar putar....");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 78, -1, -1));

        daftar.setBackground(new java.awt.Color(204, 204, 255));
        daftar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setViewportView(daftar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 500, 173));

        buka.setBackground(new java.awt.Color(255, 255, 255));
        buka.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        buka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/20201123_091110.png"))); // NOI18N
        buka.setText("OPEN");
        buka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukaActionPerformed(evt);
            }
        });
        getContentPane().add(buka, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, -1));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/20201123_091101.png"))); // NOI18N
        main.setText("PLAY");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 110, -1));

        hapus.setBackground(new java.awt.Color(255, 255, 255));
        hapus.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/20201123_091047.png"))); // NOI18N
        hapus.setText("DELETE");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        keluar.setBackground(new java.awt.Color(255, 255, 255));
        keluar.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Keluar.png"))); // NOI18N
        keluar.setText("EXIT");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bgimg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukaActionPerformed
        // TODO add your handling code here:
        JFileChooser fc =new JFileChooser();
        JFrame jf = new JFrame();

        FileNameExtensionFilter Filemp3 = new FileNameExtensionFilter(".mp3,.wav","mp3","wav");
        fc.addChoosableFileFilter(Filemp3);

        int setuju= fc.showOpenDialog(jf.add(fc));
        int posisi= daftar.getModel().getSize();
        if(setuju == JFileChooser.APPROVE_OPTION){
        File file=fc.getSelectedFile();
        String text = file.getPath().toString();
        String[] txt = new String[]{text};
        model.add(posisi, text);
        }
        daftar.setModel(model);
    }//GEN-LAST:event_bukaActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
        if(evt.getActionCommand().equalsIgnoreCase("Play")){
        String musik = daftar.getSelectedValue().toString();
        try{
         mp3_ok = Manager.createPlayer(new URL("File",null,musik));
         mp3_ok.start();
        }
            catch(Exception e){}
            main.setText("Stop");
        }
        if(evt.getActionCommand().equalsIgnoreCase("Stop")){
            mp3_ok.stop();
            main.setText("Play");
        }
    }//GEN-LAST:event_mainActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int posisi =daftar.getSelectedIndex();
        model.remove(posisi);
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(mp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mp3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buka;
    private javax.swing.JList daftar;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton main;
    // End of variables declaration//GEN-END:variables
}
