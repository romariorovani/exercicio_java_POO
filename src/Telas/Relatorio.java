package Telas;

import Telas.TelaPrincipal;
import javax.swing.table.DefaultTableModel;
import Metodos.Metodos;

public class Relatorio extends javax.swing.JInternalFrame {

    public Relatorio() {
        initComponents();
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        for (int i = 0; i < TelaPrincipal.imoveis.size(); i++) {

            Object[] dadostabela = {TelaPrincipal.imoveis.get(i).getCodigo(), TelaPrincipal.imoveis.get(i).getAluguel_base(), TelaPrincipal.imoveis.get(i).getTipo(), TelaPrincipal.imoveis.get(i).descricao, TelaPrincipal.imoveis.get(i).bairro, TelaPrincipal.imoveis.get(i).status, Metodos.aluguel(TelaPrincipal.imoveis.get(i))};

            dtm.addRow(dadostabela);
        }
    }
// alugados

    public void relalugado() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < TelaPrincipal.imoveis.size(); i++) {
            if (TelaPrincipal.imoveis.get(i).status.equals("Alugado")) {
                Object[] dadostabela = {TelaPrincipal.imoveis.get(i).getCodigo(), TelaPrincipal.imoveis.get(i).getAluguel_base(),
                    TelaPrincipal.imoveis.get(i).getTipo(), TelaPrincipal.imoveis.get(i).descricao, TelaPrincipal.imoveis.get(i).bairro,
                    TelaPrincipal.imoveis.get(i).status, Metodos.aluguel(TelaPrincipal.imoveis.get(i))};

                dtm.addRow(dadostabela);
            }
        }

    }
//disponiveis

    public void reldispo() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < TelaPrincipal.imoveis.size(); i++) {
            if (TelaPrincipal.imoveis.get(i).status.equals("Disponivel")) {
                Object[] dados = {TelaPrincipal.imoveis.get(i).getCodigo(), TelaPrincipal.imoveis.get(i).getAluguel_base(), 
                    TelaPrincipal.imoveis.get(i).getTipo(), TelaPrincipal.imoveis.get(i).descricao, TelaPrincipal.imoveis.get(i).bairro,
                    TelaPrincipal.imoveis.get(i).status, Metodos.aluguel(TelaPrincipal.imoveis.get(i))};

                dtm.addRow(dados);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * alwayscodigo regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btna = new javax.swing.JRadioButton();
        btnd = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("RELATÓRIO");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Salario Base", "Tipo", "DESCRIÇÃO", "BAIRRO", "STATUS", "ALUGUEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
        }

        buttonGroup1.add(btna);
        btna.setText("Alugados");
        btna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaMouseClicked(evt);
            }
        });
        btna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnaKeyReleased(evt);
            }
        });

        buttonGroup1.add(btnd);
        btnd.setText("Disponíveis");
        btnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Todos");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel1.setText("Relatório de Status dos Imóveis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnd)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)))
                        .addGap(228, 228, 228))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btna)
                    .addComponent(btnd)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        setBounds(0, 0, 655, 371);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaKeyReleased
        // TODO add your handling code here:
        // /alugado

    }//GEN-LAST:event_btnaKeyReleased

    private void btnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaMouseClicked
        // TODO add your handling code here:
        relalugado();
    }//GEN-LAST:event_btnaMouseClicked

    private void btndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndMouseClicked
        // TODO add your handling code here:
        reldispo();
    }//GEN-LAST:event_btndMouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:

        //
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < TelaPrincipal.imoveis.size(); i++) {

            Object[] dadostabela = {TelaPrincipal.imoveis.get(i).getCodigo(), TelaPrincipal.imoveis.get(i).getAluguel_base(), 
                TelaPrincipal.imoveis.get(i).getTipo(), TelaPrincipal.imoveis.get(i).descricao, TelaPrincipal.imoveis.get(i).bairro, 
                TelaPrincipal.imoveis.get(i).status,Metodos.aluguel(TelaPrincipal.imoveis.get(i))};

            dtm.addRow(dadostabela);
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.doDefaultCloseAction();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btna;
    private javax.swing.JRadioButton btnd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
