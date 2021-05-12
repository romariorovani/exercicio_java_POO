package Telas;

import Imoveis.Tipo_Imovel;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCad = new javax.swing.JMenuItem();
        MenuAlu = new javax.swing.JMenuItem();
        MenuDev = new javax.swing.JMenuItem();
        MenuRel = new javax.swing.JMenuItem();
        MenuSai = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("IMÓVEL");
        jMenu1.setToolTipText("SAIR");

        MenuCad.setText("CADASTRAR");
        MenuCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCad);

        MenuAlu.setText("ALUGAR");
        MenuAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAluActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAlu);

        MenuDev.setText("DEVOLVER");
        MenuDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDevActionPerformed(evt);
            }
        });
        jMenu1.add(MenuDev);

        MenuRel.setText("RELATÓRIO");
        MenuRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRel);

        MenuSai.setText("SAIR");
        MenuSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaiActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSai);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem1.setText("Sobre o programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelActionPerformed
        // TODO add your handling code here:
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        Desktop.add(relatorio);

    }//GEN-LAST:event_MenuRelActionPerformed

    private void MenuCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadActionPerformed
        // TODO add your handling code here:
        Cadastrar cadastro = new Cadastrar();
        cadastro.setVisible(true);
        Desktop.add(cadastro);

    }//GEN-LAST:event_MenuCadActionPerformed

    private void MenuAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAluActionPerformed
        // TODO add your handling code here:
        Alugar aluga = new Alugar();
        aluga.setVisible(true);
        Desktop.add(aluga);
    }//GEN-LAST:event_MenuAluActionPerformed

    private void MenuDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDevActionPerformed
        // TODO add your handling code here:
        Devolver devolve = new Devolver();
        devolve.setVisible(true);
        Desktop.add(devolve);
    }//GEN-LAST:event_MenuDevActionPerformed

    private void MenuSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MenuSaiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        // Botão SObre
        
        JOptionPane.showMessageDialog(null," Software developed by: Romário Rovani");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MenuAlu;
    private javax.swing.JMenuItem MenuCad;
    private javax.swing.JMenuItem MenuDev;
    private javax.swing.JMenuItem MenuRel;
    private javax.swing.JMenuItem MenuSai;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
    //lista que servirá como BD
    
   public static ArrayList<Tipo_Imovel> imoveis=new ArrayList();

}
