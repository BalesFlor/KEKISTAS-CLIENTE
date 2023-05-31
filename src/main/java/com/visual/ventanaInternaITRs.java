package com.visual;

import com.grsc.logica.ejb.ItrBean;
import com.grsc.modelo.entities.Itr;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ventanaInternaITRs extends javax.swing.JInternalFrame {

    public ventanaInternaITRs() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBtnConstancias4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaITRs = new javax.swing.JTable();
        comboboxEstadoITRs = new RSMaterialComponent.RSComboBoxMaterial();
        btnFiltrar2 = new rsbuttongradiente.RSButtonGradiente();
        btnLimpiarFiltro2 = new rsbuttongradiente.RSButtonGradiente();
        botonEliminar2 = new rsbuttongradiente.RSButtonGradiente();
        botonModificar2 = new rsbuttongradiente.RSButtonGradiente();
        botonAltaITR = new rsbuttongradiente.RSButtonGradiente();

        lblBtnConstancias4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias4.setText("ITRs");

        tablaITRs.setModel(cargarTablaITRs(
        ));
        tablaITRs.setAutoscrolls(true);
        tablaITRs.setRowSelectionAllowed(true);
        tablaITRs.setSize(600, 600);
        jScrollPane4.setViewportView(tablaITRs);

        /*comboboxEstadoITRs.setForeground(new java.awt.Color(13, 120, 161));

        EstadoPeticionBean estadoPeticionBean= new EstadoPeticionBean();

        DefaultComboBoxModel modeloEstadoITRs=new DefaultComboBoxModel();

        List<EstadoPeticion> listaEstadoReclamo=estadoPeticionBean.listarEstados();

        modeloEstadoReclamo.addElement(" ESTADO RECLAMO");

        for(int i = 0 ; i<listaEstadoITRs.size(); i++){
            modeloEstadoITRs.addElement(listaEstadoITRs.get(i).getNomEstado());
        }

        comboboxEstadoITRs.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxEstadoITRs.setModel(modeloEstadoITRs);
        */

        btnFiltrar2.setText("Filtrar");
        btnFiltrar2.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnFiltrar2.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnFiltrar2.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnFiltrar2.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnFiltrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrar2MouseClicked(evt);
            }
        });

        btnLimpiarFiltro2.setText("Limpiar Filtro");
        btnLimpiarFiltro2.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro2.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro2.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro2.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltro2MouseClicked(evt);
            }
        });
        btnLimpiarFiltro2.setVisible(false);

        botonEliminar2.setText("Eliminar");
        botonEliminar2.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonEliminar2.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonEliminar2.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonEliminar2.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonEliminar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminar2MouseClicked(evt);
            }
        });

        botonModificar2.setText("Modificar");
        botonModificar2.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar2.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundarioHover(new java.awt.Color(105, 190, 228));

        botonAltaITR.setText("Alta");
        botonAltaITR.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonAltaITR.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonAltaITR.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonAltaITR.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonAltaITR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaITRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(867, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 21, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(560, 560, 560)))
                            .addGap(0, 13, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel cargarTablaITRs() {

        ItrBean itrBean = new ItrBean();
        
        List<Itr> listaITRs = itrBean.listarItrs();

        String[] nombreColumnas = {"Nombre de ITR"};

        /*
		 * El tamaño de la tabla es,  1 columna (cantidad de datos a mostrar) y
		 * la cantidad de filas depende de la cantida de listaITRs
         */
        Object[][] datos = new Object[listaITRs.size()][1];

        /* Cargamos la matriz con todos los datos */
        int fila = 0;

        for (Itr u: listaITRs) {

            datos[fila][0] = u.getNomItr();
            fila++;

        }
        /*
		 * Este codigo indica que las celdas Son editables y que son todas
		 * del tipos String
         */
        DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }
        };

        return model;

    }
    
    private void btnFiltrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrar2MouseClicked

    private void btnLimpiarFiltro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarFiltro2MouseClicked

    private void botonEliminar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar2MouseClicked

    private void botonAltaITRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaITRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAltaITRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente botonAltaITR;
    private rsbuttongradiente.RSButtonGradiente botonEliminar2;
    private rsbuttongradiente.RSButtonGradiente botonModificar2;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar2;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro2;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoITRs;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBtnConstancias4;
    private javax.swing.JTable tablaITRs;
    // End of variables declaration//GEN-END:variables
}
