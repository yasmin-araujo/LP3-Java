/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteMenu;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_TP = new javax.swing.JMenuItem();
        jMenuItem_FPD = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_JAVA = new javax.swing.JMenuItem();
        jMenuItem_PHP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_C = new javax.swing.JMenuItem();
        jMenuItem_Mat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matérias CTI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jMenu1.setText("Primeiro Ano");

        jMenuItem_TP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_TP.setText("TP");
        jMenuItem_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TPActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_TP);

        jMenuItem_FPD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_FPD.setText("FPD");
        jMenuItem_FPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_FPDActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_FPD);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Segundo Ano");

        jMenuItem_JAVA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_JAVA.setText("JAVA");
        jMenuItem_JAVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_JAVAActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_JAVA);

        jMenuItem_PHP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_PHP.setText("PHP");
        jMenuItem_PHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PHPActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_PHP);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Terceiro Ano");

        jMenuItem_C.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_C.setText("C#");
        jMenuItem_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_C);

        jMenuItem_Mat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Mat.setText("Matemática");
        jMenuItem_Mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MatActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Mat);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jMenuBar1 = new javax.swing.JMenuBar(); 
        jMenu1 = new javax.swing.JMenu(); 
        jMenu2 = new javax.swing.JMenu(); 
        jMenu3 = new javax.swing.JMenu(); 
 
        jMenu1.setText("Primeiro Ano"); 
        jMenuBar1.add(jMenu1); 

        jMenu2.setText("Segundo Ano");  
        jMenuBar1.add(jMenu2); 

        jMenu3.setText("Terceiro Ano");  
        jMenuBar1.add(jMenu3);  
        setJMenuBar(jMenuBar1);
        
        //JMenuItem jMenuItem_TP = new javax.swing.JMenuItem();
        //JMenuItem jMenuItem_FPD = new javax.swing.JMenuItem(); 
        jMenuItem_TP.setText("TP"); 
        jMenu1.add(jMenuItem_TP);
        jMenuItem_FPD.setText("FPD"); 
        jMenu1.add(jMenuItem_FPD);
        jMenuItem_JAVA.setText("JAVA"); 
        jMenu2.add(jMenuItem_JAVA);
        jMenuItem_PHP.setText("PHP"); 
        jMenu2.add(jMenuItem_PHP);
        jMenuItem_C.setText("C#"); 
        jMenu3.add(jMenuItem_C);
        jMenuItem_Mat.setText("Matemática"); 
        jMenu3.add(jMenuItem_Mat);

    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TPActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos de lógica de Programação", "Técnicas de Programação",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_TPActionPerformed

    private void jMenuItem_JAVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_JAVAActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos de JAVA", "JAVA",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_JAVAActionPerformed

    private void jMenuItem_FPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_FPDActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos de Processamentos de Dados", "Fundamentos de Processamenro de Dados",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_FPDActionPerformed

    private void jMenuItem_PHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PHPActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos de PHP", "PHP",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_PHPActionPerformed

    private void jMenuItem_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos de C#", "C#",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_CActionPerformed

    private void jMenuItem_MatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MatActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Disciplina que trabalha conteúdos matemáticos", "Matemática",  JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jMenuItem_MatActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_C;
    private javax.swing.JMenuItem jMenuItem_FPD;
    private javax.swing.JMenuItem jMenuItem_JAVA;
    private javax.swing.JMenuItem jMenuItem_Mat;
    private javax.swing.JMenuItem jMenuItem_PHP;
    private javax.swing.JMenuItem jMenuItem_TP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
