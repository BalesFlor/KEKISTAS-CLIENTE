package com.visual;

public class InternalFrameListasMantenimiento extends javax.swing.JInternalFrame {

    public InternalFrameListasMantenimiento() {
        initComponents();
    }
/*Holi*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnListaITRs = new rsbuttongradiente.RSButtonGradiente();
        btnListaTiposUsuarios = new rsbuttongradiente.RSButtonGradiente();

        btnListaITRs.setText("Lista ITRs");
        btnListaITRs.setColorPrimario(new java.awt.Color(105, 190, 228));
        btnListaITRs.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        btnListaITRs.setColorSecundario(new java.awt.Color(213, 240, 252));
        btnListaITRs.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        btnListaITRs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaITRsMouseClicked(evt);
            }
        });

        btnListaTiposUsuarios.setText("Lista Tipos de Usuarios");
        btnListaTiposUsuarios.setColorPrimario(new java.awt.Color(105, 190, 228));
        btnListaTiposUsuarios.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        btnListaTiposUsuarios.setColorSecundario(new java.awt.Color(213, 240, 252));
        btnListaTiposUsuarios.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        btnListaTiposUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaTiposUsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnListaITRs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnListaTiposUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaITRs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaTiposUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaITRsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaITRsMouseClicked
        InternalFrameITRs ventanaITRs = new InternalFrameITRs();
        background.add(ventanaITRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaITRs.setVisible(true);
    }//GEN-LAST:event_btnListaITRsMouseClicked

    private void btnListaTiposUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaTiposUsuariosMouseClicked
        ventanaInternaTiposUsuarios ventanaTiposUsuarios = new ventanaInternaTiposUsuarios();
        background.add(ventanaTiposUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaTiposUsuarios.setVisible(true);
    }//GEN-LAST:event_btnListaTiposUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private rsbuttongradiente.RSButtonGradiente btnListaITRs;
    private rsbuttongradiente.RSButtonGradiente btnListaTiposUsuarios;
    // End of variables declaration//GEN-END:variables
}
