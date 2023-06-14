package com.visual;

import com.grsc.logica.ejb.ItrBean;
import com.grsc.modelo.entities.Itr;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class InternalFrameITRs extends javax.swing.JInternalFrame {

    public InternalFrameITRs() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBtnConstancias4 = new javax.swing.JLabel();
        comboboxEstadoITRs = new RSMaterialComponent.RSComboBoxMaterial();
        btnFiltrar2 = new rsbuttongradiente.RSButtonGradiente();
        btnLimpiarFiltro2 = new rsbuttongradiente.RSButtonGradiente();
        botonAltaITR = new rsbuttongradiente.RSButtonGradiente();
        botonModificar2 = new rsbuttongradiente.RSButtonGradiente();
        botonEliminar2 = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1001, 100));

        lblBtnConstancias4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias4.setText("ITRs");

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

        botonModificar2.setText("Modificar");
        botonModificar2.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar2.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundarioHover(new java.awt.Color(105, 190, 228));

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
        botonEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar2ActionPerformed(evt);
            }
        });

        jTable1.setModel(this.cargarTablaITR()

        );
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

     
    private void btnFiltrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrar2MouseClicked

    private void btnLimpiarFiltro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarFiltro2MouseClicked

    private void botonAltaITRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaITRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAltaITRActionPerformed

    private void botonEliminar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar2MouseClicked

    private void botonEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar2ActionPerformed

    private DefaultTableModel cargarTablaITR() {
    
      ItrBean itrBean = new ItrBean();
      List<Itr> listaItr = itrBean.listarItrs();
    
        String[] nombreColumnas = {"Itr", "Departamento"};
    
       Object[][] datos = new Object[listaItr.size()][2];

        int fila = 0;

        for (Itr u:listaItr) {
            datos[fila][0] = u.getNomItr();
            datos[fila][1] = u.getIdDepartamento();
            fila++;
        }
    
        DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }
        
        };
        return model;
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente botonAltaITR;
    private rsbuttongradiente.RSButtonGradiente botonEliminar2;
    private rsbuttongradiente.RSButtonGradiente botonModificar2;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar2;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro2;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoITRs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBtnConstancias4;
    // End of variables declaration//GEN-END:variables



}