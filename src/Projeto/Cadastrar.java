
package Projeto;

import javax.swing.JOptionPane;




public class Cadastrar extends javax.swing.JFrame {
    
    private final Visualizar telaVisualizar;

      
    public Cadastrar(Visualizar telaVisualizar) {
        initComponents();
        this.telaVisualizar = telaVisualizar;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JFormattedTextField();
        jComboBoxEvento = new javax.swing.JComboBox<>();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldTel = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxTipoDePapel = new javax.swing.JComboBox<>();
        jComboBoxQtd = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxValor = new javax.swing.JComboBox<>();
        jComboBoxAlbum = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxOrientacao = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxTamanho = new javax.swing.JComboBox<>();
        jTextFieldNumCasa = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(51, 153, 255));
        setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Evento:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Data do Evento:");

        try {
            jTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                          ", "Casamento", "Pré Casamento", "Aniversário de 15 Anos", "Ensaio Externo", "Ensaio Studio", "Gestante" }));
        jComboBoxEvento.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBoxEventoComponentAdded(evt);
            }
        });
        jComboBoxEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEventoActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Horas:");

        try {
            jTextFieldHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##h")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHora.setToolTipText("");
        jTextFieldHora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Endereço:");

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Nº:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Bairro:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Tel :");

        try {
            jTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        try {
            jTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Album:");

        jComboBoxTipoDePapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                                                               ", "Papel couché equivalente a 390 g/m2 (espessura de 0,38 mm)", "Papel couché equivalente a 740g/m2 (espessura: 1,00 mm)", "Papel couché equivalente a 600g/m2 (espessura com laminação: 0,62 mm)", "Papel Lustre HD a 725g/m2 (espessura: 0,74 mm)" }));

        jComboBoxQtd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      ", "20", "26", "30", " ", " " }));
        jComboBoxQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQtdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Qtd de Páginas:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Tipo do Papél:");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Cidade:");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setText("Valor:");

        jComboBoxValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       ", "R$ 150,00", "R$ 180,00", "R$ 200,00" }));
        jComboBoxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValorActionPerformed(evt);
            }
        });

        jComboBoxAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "           ", "Fotolivro 180° ", "Foto impressa", "Foto no CD", " ", " " }));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setText("Orientação:");

        jComboBoxOrientacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "             ", "Retrato", "Paisagem" }));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel19.setText("Tamanho:");

        jComboBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "            ", "29,7 x 21 cm (A4 G)", "21 x 14,8 cm (A5 M)", " " }));

        jTextFieldNumCasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jTextFieldNumCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumCasaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Estojo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          ", "Foto Estojo", "Estojo Revestido em Tecido", "Estojo Revestido em Couro", "Estojo Tradicional" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOrientacao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jComboBoxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoDePapel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addGap(71, 71, 71))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(272, 272, 272)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(382, 382, 382)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(80, 80, 80)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jComboBoxQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar)
                                .addGap(101, 101, 101)
                                .addComponent(jButtonLimpar)
                                .addGap(109, 109, 109)
                                .addComponent(jButtonVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(499, 499, 499)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel15)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTipoDePapel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrientacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonVoltar))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEventoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBoxEventoComponentAdded
        
    }//GEN-LAST:event_jComboBoxEventoComponentAdded

    private void jComboBoxEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEventoActionPerformed
        String evento = jComboBoxEvento.getSelectedItem().toString();
        String album = jComboBoxAlbum.getSelectedItem().toString();
        String tipoPapel = jComboBoxTipoDePapel.getSelectedItem().toString();
        String orientacao = jComboBoxOrientacao.getSelectedItem().toString();
        String qtd = jComboBoxQtd.getSelectedItem().toString();
        String valor = jComboBoxValor.getSelectedItem().toString();
        String tamanho = jComboBoxTamanho.getSelectedItem().toString();
        
    }//GEN-LAST:event_jComboBoxEventoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

     private void limparCampos(){
        jTextFieldCliente.setText("");
        jTextFieldCPF.setText("");
        jTextFieldData.setText("");
        jTextFieldHora.setText("");
        jTextFieldTel.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumCasa.setText("");
        jTextFieldCidade.setText("");
        jTextFieldBairro.setText("");
      
        
    }
     
     public void mostrarPessoa(Pessoa p){
         this.jTextFieldCliente.setText(p.getNome());
         this.jTextFieldCPF.setText(p.getCpf());
         this.jTextFieldTel.setText(p.getTel());
         this.jComboBoxEvento.setSelectedItem(p.getEvento());
         this.jTextFieldData.setText(p.getData());
         this.jTextFieldHora.setText(p.getHora());
         this.jTextFieldEndereco.setText(p.getEndereco());
         this.jTextFieldNumCasa.setText(p.getNumCasa());
         this.jTextFieldBairro.setText(p.getBairro());
         this.jTextFieldCidade.setText(p.getCidade());
         this.jComboBoxAlbum.setSelectedItem(p.getAlbum());
         this.jComboBoxOrientacao.setSelectedItem(p.getOrientacao());
         this.jComboBoxQtd.setSelectedItem(p.getQtd());
         this.jComboBoxTamanho.setSelectedItem(p.getTamanho());
         this.jComboBoxTipoDePapel.setSelectedItem(p.getTipoPapel());
         this.jComboBoxValor.setSelectedItem(p.getValor());
         desabilitarCampos();
         this.setVisible(true);
     }
     
     public void desabilitarCampos(){
         this.jTextFieldCliente.setEditable(false);
         this.jTextFieldCPF.setEditable(false);
         this.jButtonCadastrar.setEnabled(false);
         this.jButtonLimpar.setEnabled(false);
        
     }
     
     public void habilitarCampos(){
         this.jTextFieldCliente.setEditable(true);
         this.jTextFieldCPF.setEditable(true);
         this.jTextFieldCidade.setEditable(true);
         this.jTextFieldData.setEditable(true);
         this.jTextFieldBairro.setEditable(true);
         this.jTextFieldEndereco.setEditable(true);
         this.jTextFieldHora.setEditable(true);
         this.jTextFieldNumCasa.setEditable(true);
         this.jTextFieldTel.setEditable(true);
         this.jComboBoxEvento.setEnabled(true);
         this.jComboBoxAlbum.setEditable(true);
         this.jComboBoxOrientacao.setEditable(true);
         this.jComboBoxQtd.setEditable(true);
         this.jComboBoxTamanho.setEditable(true);
         this.jComboBoxTipoDePapel.setEditable(true);
         this.jComboBoxValor.setEditable(true);
         
         
     }

     
     
     
     
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.setVisible(false);
        this.telaVisualizar.setVisible(true);
        this.habilitarCampos();
        limparCampos();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jComboBoxQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQtdActionPerformed
       
    }//GEN-LAST:event_jComboBoxQtdActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Pessoa p = new Pessoa();
        p.setNome(jTextFieldCliente.getText());
        p.setCpf(jTextFieldCPF.getText());
        p.setTel(jTextFieldTel.getText());
        p.setEvento(jComboBoxEvento.getSelectedItem().toString());
        p.setData(jTextFieldData.getText());
        p.setHora(jTextFieldHora.getText());
        p.setEndereco(jTextFieldEndereco.getText());
        p.setNumCasa(jTextFieldNumCasa.getText());
        p.setBairro(jTextFieldBairro.getText());
        p.setCidade(jTextFieldCidade.getText());
        p.setAlbum(jComboBoxAlbum.getSelectedItem().toString());
        p.setTipoPapel(jComboBoxTipoDePapel.getSelectedItem().toString());
        p.setOrientacao(jComboBoxOrientacao.getSelectedItem().toString());
        p.setQtd(jComboBoxQtd.getSelectedItem().toString());
        p.setValor(jComboBoxValor.getSelectedItem().toString());
        p.setTamanho(jComboBoxTamanho.getSelectedItem().toString());
       
        
        
        this.telaVisualizar.addPessoa(p);
        
               
        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    private void jComboBoxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValorActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldNumCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumCasaActionPerformed


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAlbum;
    private javax.swing.JComboBox<String> jComboBoxEvento;
    private javax.swing.JComboBox<String> jComboBoxOrientacao;
    private javax.swing.JComboBox<String> jComboBoxQtd;
    private javax.swing.JComboBox<String> jComboBoxTamanho;
    private javax.swing.JComboBox<String> jComboBoxTipoDePapel;
    private javax.swing.JComboBox<String> jComboBoxValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JFormattedTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JFormattedTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JFormattedTextField jTextFieldHora;
    private javax.swing.JFormattedTextField jTextFieldNumCasa;
    private javax.swing.JFormattedTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
  
}
