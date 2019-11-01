package PacoteProjeto1;

import javax.swing.JOptionPane;

public class FormProjeto1 extends javax.swing.JFrame {

    public FormProjeto1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton_Limpar = new javax.swing.JButton();
        jButton_Somar = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        jButton_Subtrair = new javax.swing.JButton();
        jButton_Multiplicar = new javax.swing.JButton();
        jButton_Dividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uso da GUI - Programa bem legal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primeiro Exemplo"));

        jLabel1.setText("Primeiro Valor");

        jLabel2.setText("Segundo Valor");

        jLabel3.setText("Resultado");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton_Limpar.setText("Limpar");
        jButton_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparActionPerformed(evt);
            }
        });

        jButton_Somar.setText("Somar");
        jButton_Somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SomarActionPerformed(evt);
            }
        });

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jButton_Subtrair.setText("Subtrair");
        jButton_Subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SubtrairActionPerformed(evt);
            }
        });

        jButton_Multiplicar.setText("Multiplicar");
        jButton_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MultiplicarActionPerformed(evt);
            }
        });

        jButton_Dividir.setText("Dividir");
        jButton_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Sair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton_Somar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton_Subtrair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jButton_Multiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Dividir)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Somar)
                    .addComponent(jButton_Subtrair)
                    .addComponent(jButton_Multiplicar)
                    .addComponent(jButton_Dividir))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Sair)
                    .addComponent(jButton_Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SomarActionPerformed
        //Definir as variáveis tipo float
        float num1;
        float num2;
        float result;
        
        //Converter o tipo String para o tipo float
        num1 = Float.parseFloat(jTextField1.getText());
        num2 = Float.parseFloat(jTextField2.getText());
        
        //Realizar o cálculo
        result = num1 + num2;
        
        //Converter o valor float para String e apresentar em JTextField3
        jTextField3.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton_SomarActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton_LimparActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton_SubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SubtrairActionPerformed
        // TODO add your handling code here:
        //Definir as variáveis tipo float
        float num1;
        float num2;
        float result;
        
        //Converter o tipo String para o tipo float
        num1 = Float.parseFloat(jTextField1.getText());
        num2 = Float.parseFloat(jTextField2.getText());
        
        //Realizar o cálculo
        result = num1 - num2;
        
        //Converter o valor float para String e apresentar em JTextField3
        jTextField3.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton_SubtrairActionPerformed

    private void jButton_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MultiplicarActionPerformed
        // TODO add your handling code here:
        //Definir as variáveis tipo float
        float num1;
        float num2;
        float result;
        
        //Converter o tipo String para o tipo float
        num1 = Float.parseFloat(jTextField1.getText());
        num2 = Float.parseFloat(jTextField2.getText());
        
        //Realizar o cálculo
        result = num1 * num2;
        
        //Converter o valor float para String e apresentar em JTextField3
        jTextField3.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton_MultiplicarActionPerformed

    private void jButton_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DividirActionPerformed
        // TODO add your handling code here:
        //Definir as variáveis tipo float
        float num1;
        float num2;
        float result;
        
        //Converter o tipo String para o tipo float
        num1 = Float.parseFloat(jTextField1.getText());
        num2 = Float.parseFloat(jTextField2.getText());
        String msg = "Não pode dividir por zero";
        if (num2 == 0)
            JOptionPane.showMessageDialog(null, "Não pode dividir por 0","Aviso", JOptionPane.INFORMATION_MESSAGE); 
        else 
        {
            result = num1 / num2;
            //Converter o valor float para String e apresentar em JTextField3
            jTextField3.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_jButton_DividirActionPerformed

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
            java.util.logging.Logger.getLogger(FormProjeto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProjeto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProjeto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProjeto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProjeto1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Dividir;
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_Multiplicar;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Somar;
    private javax.swing.JButton jButton_Subtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
