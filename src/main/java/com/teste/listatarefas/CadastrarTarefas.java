package com.teste.listatarefas;

import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class CadastrarTarefas extends javax.swing.JFrame {

  
    
    LinkedList<LinkedList<String>> lista = new LinkedList();
    LinkedList<String> categorias = new LinkedList();
    public CadastrarTarefas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        novaCategoria = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        selecionaCategoria = new javax.swing.JComboBox<>();
        buscarTarefas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Suas Categorias"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cadastre Nova Categoria");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 160, 20);

        novaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(novaCategoria);
        novaCategoria.setBounds(20, 20, 280, 30);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(10, 60, 107, 25);

        jPanel1.add(selecionaCategoria);
        selecionaCategoria.setBounds(10, 140, 300, 24);

        buscarTarefas.setText("Buscar Tarefas");
        buscarTarefas.setToolTipText("");
        buscarTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTarefasActionPerformed(evt);
            }
        });
        jPanel1.add(buscarTarefas);
        buscarTarefas.setBounds(10, 170, 130, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Selecione uma Categoria");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 120, 160, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janelaTres_redimensionada.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, -10, 600, 338);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaCategoriaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       String text =  novaCategoria.getText();
       lista.add(new LinkedList());
       categorias.add(text);
    DefaultComboBoxModel model = new DefaultComboBoxModel(categorias.toArray());
    selecionaCategoria.setModel(model);
    novaCategoria.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void buscarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTarefasActionPerformed

        int posicao = selecionaCategoria.getSelectedIndex();
//        JFrame f = new JFrame("Detalhes Taregas");
       ListaTarefasPorCategoria tela = new ListaTarefasPorCategoria(this, true, lista.get(posicao));
       tela.setSize(620, 360);
       tela.setVisible(true);
    }//GEN-LAST:event_buscarTarefasActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton buscarTarefas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField novaCategoria;
    private javax.swing.JComboBox<String> selecionaCategoria;
    // End of variables declaration//GEN-END:variables
}
