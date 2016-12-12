
package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Visualizar extends javax.swing.JFrame {
    
     private final Cadastrar telaCadastro;
    
   
     private final ArrayList<Pessoa> array;

    public Visualizar() {
        initComponents();
        telaCadastro = new Cadastrar(this);
        
        this.array = new ArrayList<>();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setResizable(false);

        tabela1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "CPF", "Telefone", "Evento", "Data do Evento", "Horas", "Album", "Tipo do Papel", "Orientação", "Qtd de Páginas", "Tamanho", "Valor", "Endereço", "N°", "Baiiro", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabela1);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSair))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int selectedIndex = tabela1.getSelectedRow();
       
        
        if (selectedIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Selecione um item","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            
            this.removePessoa(selectedIndex);        
        }
      
    }
    public void addPessoa(Pessoa p){
        this.array.add(p);
        this.addPessoaToTable(p);
    }
       
    
          public void addPessoaToTable(Pessoa p){
        DefaultTableModel modelo1 = (DefaultTableModel)tabela1.getModel();
        modelo1.addRow(new Object[]{p.getNome(), p.getCpf(), p.getTel(), p.getEvento(), p.getData(), p.getHora(), p.getAlbum(),
            p.getTipoPapel(), p.getOrientacao(), p.getQtd(), p.getTamanho(), p.getValor(), p.getEndereco(), p.getNumCasa(), p.getBairro(), p.getCidade()});
        
        
        
    }
         
          
          public void removePessoa(int i){
        array.remove(i);
        removePessoaFromTable(i);
    }
          
           public void removePessoaFromTable(int i){
        DefaultTableModel modelo1 = (DefaultTableModel)tabela1.getModel();
        modelo1.removeRow(i);

    }
            public void redesenhaTabela(){
        DefaultTableModel modelo1 = (DefaultTableModel)tabela1.getModel();
        while (modelo1.getRowCount() > 0){
            modelo1.removeRow(0);

        }
        
        for (Pessoa p : array){
            modelo1.addRow(new Object[]{p.getNome(), p.getCpf(), p.getTel(), p.getEvento(), p.getData(), p.getHora(), p.getAlbum(), p.getTipoPapel(), p.getOrientacao(), p.getQtd(), p.getTamanho(), p.getValor(),
                p.getEndereco(), p.getNumCasa(), p.getBairro(), p.getCidade()});
            
        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       this.telaCadastro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        int linhaSelecionda = tabela1.getSelectedRow();
        
        
        if (linhaSelecionda < 0) {
           JOptionPane.showMessageDialog(this, "Selecione uma linha", "Aviso", JOptionPane.WARNING_MESSAGE); 
            
        }else{
            this.telaCadastro.mostrarPessoa(array.get(linhaSelecionda));
            this.setVisible(false);
        }
        
        
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables

   
}
