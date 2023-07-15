package com.visual;

import com.visual.fuentes.FuenteRoboto;

public class VentanaAnalista extends javax.swing.JFrame {

    public VentanaAnalista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        rSPanelGradiente2 = new rspanelgradiente.RSPanelGradiente();
        rSLabelSombra1 = new rojeru_san.rslabel.RSLabelSombra();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        rSComboBox1 = new rojerusan.RSComboBox();
        rSComboBox2 = new rojerusan.RSComboBox();
        rSComboBox3 = new rojerusan.RSComboBox();
        rSComboBox4 = new rojerusan.RSComboBox();
        rSButtonGradiente2 = new rsbuttongradiente.RSButtonGradiente();
        rSButtonGradiente3 = new rsbuttongradiente.RSButtonGradiente();
        rSButtonGradiente4 = new rsbuttongradiente.RSButtonGradiente();
        rSButtonGradiente5 = new rsbuttongradiente.RSButtonGradiente();
        jLabel1 = new javax.swing.JLabel();
        rSButtonGradiente6 = new rsbuttongradiente.RSButtonGradiente();
        rSMenuBar1 = new rojerusan.RSMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));

        jInternalFrame1.setVisible(true);

        rSPanelGradiente2.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente2.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente2.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        rSLabelSombra1.setBackground(new java.awt.Color(105, 190, 228));
        rSLabelSombra1.setForeground(new java.awt.Color(0, 67, 135));
        rSLabelSombra1.setText("Usuarios");
        rSLabelSombra1.setColorDeSombra(new java.awt.Color(105, 190, 228));
        FuenteRoboto fuenteImport= new FuenteRoboto();
        rSLabelSombra1.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,24));

        rSTableMetro1.setForeground(new java.awt.Color(13, 120, 161));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Estado", "Tipo Usuario", "ITR"
            }
        ));
        rSTableMetro1.setCellSelectionEnabled(true);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(13, 120, 161));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(8, 73, 99));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(8, 73, 99));
        jScrollPane1.setViewportView(rSTableMetro1);

        rSComboBox1.setBackground(new java.awt.Color(13, 120, 161));
        rSComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Tipo Usuario-", "Analista", "Estudiante", "Tutor" }));
        rSComboBox1.setColorArrow(new java.awt.Color(13, 120, 161));
        rSComboBox1.setColorBorde(new java.awt.Color(13, 120, 161));
        rSComboBox1.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBox1.setColorFondo(new java.awt.Color(13, 120, 161));
        rSComboBox1.setColorSeleccion(new java.awt.Color(13, 120, 161));

        rSComboBox2.setBackground(new java.awt.Color(13, 120, 161));
        rSComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-ITR-", "SUROESTE", "SURESTE", "NORTE" }));
        rSComboBox2.setColorArrow(new java.awt.Color(13, 120, 161));
        rSComboBox2.setColorBorde(new java.awt.Color(13, 120, 161));
        rSComboBox2.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBox2.setColorFondo(new java.awt.Color(13, 120, 161));
        rSComboBox2.setColorSeleccion(new java.awt.Color(13, 120, 161));

        rSComboBox3.setBackground(new java.awt.Color(13, 120, 161));
        rSComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Generación-", "2018", "2019", "2020" }));
        rSComboBox3.setColorArrow(new java.awt.Color(13, 120, 161));
        rSComboBox3.setColorBorde(new java.awt.Color(13, 120, 161));
        rSComboBox3.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBox3.setColorFondo(new java.awt.Color(13, 120, 161));
        rSComboBox3.setColorSeleccion(new java.awt.Color(13, 120, 161));

        rSComboBox4.setBackground(new java.awt.Color(13, 120, 161));
        rSComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Estado-", "Activo", "No activo" }));
        rSComboBox4.setColorArrow(new java.awt.Color(13, 120, 161));
        rSComboBox4.setColorBorde(new java.awt.Color(13, 120, 161));
        rSComboBox4.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBox4.setColorFondo(new java.awt.Color(13, 120, 161));
        rSComboBox4.setColorSeleccion(new java.awt.Color(13, 120, 161));

        rSButtonGradiente2.setText("Modificar");
        rSButtonGradiente2.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente2.setColorPrimarioHover(new java.awt.Color(0, 173, 239));
        rSButtonGradiente2.setColorSecundario(new java.awt.Color(13, 120, 161));
        rSButtonGradiente2.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente2.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,18));
        rSButtonGradiente2.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente2ActionPerformed(evt);
            }
        });

        rSButtonGradiente3.setText("Eliminar");
        rSButtonGradiente3.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente3.setColorPrimarioHover(new java.awt.Color(0, 173, 239));
        rSButtonGradiente3.setColorSecundario(new java.awt.Color(13, 120, 161));
        rSButtonGradiente3.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente3.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,18));
        rSButtonGradiente3.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente3ActionPerformed(evt);
            }
        });

        rSButtonGradiente4.setText("Reclamos");
        rSButtonGradiente4.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente4.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        rSButtonGradiente4.setColorSecundario(new java.awt.Color(13, 120, 161));
        rSButtonGradiente4.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente4.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,18));
        rSButtonGradiente4.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente4ActionPerformed(evt);
            }
        });

        rSButtonGradiente5.setText("Solicitudes de Constancias");
        rSButtonGradiente5.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente5.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        rSButtonGradiente5.setColorSecundario(new java.awt.Color(13, 120, 161));
        rSButtonGradiente5.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente5.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,18));
        rSButtonGradiente5.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 120, 161));
        jLabel1.setText("Filtros");

        rSButtonGradiente6.setText("Filtrar");
        rSButtonGradiente6.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente6.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        rSButtonGradiente6.setColorSecundario(new java.awt.Color(13, 120, 161));
        rSButtonGradiente6.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente6.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,16));
        rSButtonGradiente6.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente2Layout = new javax.swing.GroupLayout(rSPanelGradiente2);
        rSPanelGradiente2.setLayout(rSPanelGradiente2Layout);
        rSPanelGradiente2Layout.setHorizontalGroup(
            rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                        .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                                .addComponent(rSButtonGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonGradiente4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonGradiente5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rSLabelSombra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rSComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                                .addComponent(rSButtonGradiente6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
        );
        rSPanelGradiente2Layout.setVerticalGroup(
            rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rSLabelSombra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelGradiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonGradiente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonGradiente5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rSPanelGradiente2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rSComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rSComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(rSComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(rSComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonGradiente6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(rSPanelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        rSMenuBar1.setBackground(new java.awt.Color(8, 73, 99));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Perfil");
        jMenu1.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,16));

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        rSMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Usuarios");
        jMenu2.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,16));

        jMenuItem2.setText("Listar...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        rSMenuBar1.add(jMenu2);

        setJMenuBar(rSMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void rSButtonGradiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente2ActionPerformed
        
    }//GEN-LAST:event_rSButtonGradiente2ActionPerformed

    private void rSButtonGradiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente3ActionPerformed
        
    }//GEN-LAST:event_rSButtonGradiente3ActionPerformed

    private void rSButtonGradiente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente4ActionPerformed
        
    }//GEN-LAST:event_rSButtonGradiente4ActionPerformed

    private void rSButtonGradiente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente5ActionPerformed
        
    }//GEN-LAST:event_rSButtonGradiente5ActionPerformed

    private void rSButtonGradiente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente6ActionPerformed
        
    }//GEN-LAST:event_rSButtonGradiente6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente2;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente3;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente4;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente5;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente6;
    private rojerusan.RSComboBox rSComboBox1;
    private rojerusan.RSComboBox rSComboBox2;
    private rojerusan.RSComboBox rSComboBox3;
    private rojerusan.RSComboBox rSComboBox4;
    private rojeru_san.rslabel.RSLabelSombra rSLabelSombra1;
    private rojerusan.RSMenuBar rSMenuBar1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente2;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
