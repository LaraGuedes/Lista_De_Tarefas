package com.teste.listatarefas;

import java.util.LinkedList;
import javax.swing.DefaultListModel;


public class ListaTarefasPorCategoria extends javax.swing.JDialog {
    LinkedList<String> lista;
    /**
     * Creates new form ListaTarefasPorCategoria
     * @param parent
     * @param modal
     * @param lista
     */
    public ListaTarefasPorCategoria(javax.swing.JFrame parent, boolean modal, LinkedList<String> lista) {
        super(parent, modal);
        initComponents();
        this.lista = lista;
            DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < lista.size(); i++) {
            model.addElement(lista.get(i));
        }
        listaTarefas.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        novaTarefa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTarefas = new javax.swing.JList<>();
        salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cadastrar nova tarefa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 250, 20);
        getContentPane().add(novaTarefa);
        novaTarefa.setBounds(20, 30, 300, 30);

        jScrollPane1.setViewportView(listaTarefas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 300, 130);

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(20, 70, 63, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/janela1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 620, 360);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 10, 37, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        lista.add(novaTarefa.getText());
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < lista.size(); i++) {
            model.addElement(lista.get(i));
        }
        novaTarefa.setText("");
        listaTarefas.setModel(model);
    }//GEN-LAST:event_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaTarefas;
    private javax.swing.JTextField novaTarefa;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
