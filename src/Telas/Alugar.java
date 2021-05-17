
package Telas;

import Imoveis.Tipo_Imovel;
import javax.swing.JOptionPane;
import Telas.TelaPrincipal;
import Metodos.Metodos;


public class Alugar extends javax.swing.JInternalFrame {

    
    public Alugar() {
        initComponents();
    }

    public void alugaimovel() {
        boolean encontrado = false;
        int cod = -1234567890;

        try {
            cod = Integer.parseInt(txtcod.getText());
            for (int i = 0; i < TelaPrincipal.imoveis.size(); i++) {

                if (TelaPrincipal.imoveis.get(i).getCodigo() == cod) {
                    encontrado = true;
                    if (TelaPrincipal.imoveis.get(i).status.equals("Disponivel")) {
                        JOptionPane.showMessageDialog(null, "Imovel Alugado Com Sucesso\n Valor do aluguel:" + Metodos.aluguel(TelaPrincipal.imoveis.get(i)) + "Código do Imóvel: \n"+TelaPrincipal.imoveis.get(i).getCodigo());
                        TelaPrincipal.imoveis.get(i).status = "Alugado";
                    } else {
                        JOptionPane.showMessageDialog(null, "Imóvel Indisponível");
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número Inválido");
        }

        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Número não encontrado, por favor \n pesquise novamente, obrigado.");
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        btnalu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        AlugarImovel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ALUGAR");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Digite o Código do Imóvel: ");

        btnalu.setText("Alugar");
        btnalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaluActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AlugarImovel.setFont(new java.awt.Font("Calibri", 1, 15));
        AlugarImovel.setText("Alugar Imóvel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnalu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(AlugarImovel)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlugarImovel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnalu))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaluActionPerformed
        // TODO add your handling code here:
        alugaimovel();
    }//GEN-LAST:event_btnaluActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.doDefaultCloseAction();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlugarImovel;
    private javax.swing.JButton btnalu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtcod;
    // End of variables declaration//GEN-END:variables
}
