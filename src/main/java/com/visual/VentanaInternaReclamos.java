package com.visual;

import com.grsc.logica.ejb.EstadoPeticionBean;
import com.grsc.logica.ejb.ReclamoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Reclamo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import com.grsc.modelo.entities.Usuarios;
import com.grsc.modelo.entities.EstadoPeticion;

public class VentanaInternaReclamos extends javax.swing.JInternalFrame {

    public VentanaInternaReclamos() {
        initComponents();
    }

     UsuarioBean userBean= new UsuarioBean();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar1 = new rsbuttongradiente.RSButtonGradiente();
        botonModificar1 = new rsbuttongradiente.RSButtonGradiente();
        botonReclamar = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaReclamos = new javax.swing.JTable();
        lblBtnConstancias3 = new javax.swing.JLabel();
        comboboxEstadoReclamo = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxUsuarioReclamo = new RSMaterialComponent.RSComboBoxMaterial();
        btnLimpiarFiltroReclamos = new rsbuttongradiente.RSButtonGradiente();
        btnFiltrarReclamos = new rsbuttongradiente.RSButtonGradiente();

        botonEliminar1.setText("Eliminar");
        botonEliminar1.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonEliminar1.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonEliminar1.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonEliminar1.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminar1MouseClicked(evt);
            }
        });

        botonModificar1.setText("Modificar");
        botonModificar1.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar1.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar1.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar1.setColorSecundarioHover(new java.awt.Color(105, 190, 228));

        botonReclamar.setText("Hacer un Reclamo");
        botonReclamar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonReclamar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonReclamar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonReclamar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonReclamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonReclamarMouseClicked(evt);
            }
        });
        botonReclamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReclamarActionPerformed(evt);
            }
        });

        tablaReclamos.setModel(cargarTablaReclamos(
        ));
        tablaReclamos.setAutoscrolls(true);
        tablaReclamos.setRowSelectionAllowed(true);
        tablaReclamos.setSize(600, 600);
        jScrollPane3.setViewportView(tablaReclamos);

        lblBtnConstancias3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias3.setText("Reclamos");

        comboboxEstadoReclamo.setForeground(new java.awt.Color(13, 120, 161));

        EstadoPeticionBean estadoPeticionBean= new EstadoPeticionBean();

        DefaultComboBoxModel modeloEstadoReclamo=new DefaultComboBoxModel();

        List<EstadoPeticion> listaEstadoReclamo=estadoPeticionBean.listarEstados();

        modeloEstadoReclamo.addElement(" ESTADO RECLAMO");

        for(int i = 0 ; i<listaEstadoReclamo.size(); i++){
            modeloEstadoReclamo.addElement(listaEstadoReclamo.get(i).getNomEstado());
        }

        comboboxEstadoReclamo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxEstadoReclamo.setModel(modeloEstadoReclamo);

        comboboxUsuarioReclamo.setForeground(new java.awt.Color(13, 120, 161));

        UsuarioBean userBean= new UsuarioBean();

        DefaultComboBoxModel modeloUsuarioReclamo=new DefaultComboBoxModel();

        List<Usuarios> listaUsuarioReclamo=userBean.listarUsuarios();

        modeloUsuarioReclamo.addElement(" USUARIOS");

        for(int i = 0 ; i<listaUsuarioReclamo.size(); i++){
            modeloUsuarioReclamo.addElement(listaUsuarioReclamo.get(i).getNomUsuario());
        }

        comboboxUsuarioReclamo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxUsuarioReclamo.setModel(modeloUsuarioReclamo);

        comboboxUsuarioReclamo.setVisible(false);

        btnLimpiarFiltroReclamos.setText("Limpiar Filtro");
        btnLimpiarFiltroReclamos.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltroReclamos.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltroReclamos.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltroReclamos.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltroReclamos.setVisible(false);
        btnLimpiarFiltroReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltroReclamosMouseClicked(evt);
            }
        });

        btnFiltrarReclamos.setText("Filtrar");
        btnFiltrarReclamos.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnFiltrarReclamos.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnFiltrarReclamos.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnFiltrarReclamos.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnFiltrarReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarReclamosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblBtnConstancias3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(872, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(comboboxEstadoReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(comboboxUsuarioReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(botonReclamar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 16, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblBtnConstancias3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboboxEstadoReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboboxUsuarioReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonReclamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminar1MouseClicked

    private void botonReclamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReclamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReclamarActionPerformed

    private void btnLimpiarFiltroReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroReclamosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarFiltroReclamosMouseClicked

    private void btnFiltrarReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarReclamosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarReclamosMouseClicked

    private void botonReclamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReclamarMouseClicked
        ventanaAltaReclamo ventanaReclamo = new ventanaAltaReclamo();
        ventanaReclamo.setVisible(true);
    }//GEN-LAST:event_botonReclamarMouseClicked

    
    private DefaultTableModel cargarTablaReclamos() {
    
       ReclamoBean reclamoBean = new ReclamoBean();
        
        List<Reclamo> listaReclamos = reclamoBean.listaTodosReclamos();
    
        String[] nombreColumnas = {"Fecha/Hora", "Usuario", "Titulo", "Detalle", "Estado", "Semestre", "Créditos"};
    
        Object[][] datos = new Object[listaReclamos.size()][7];

        int fila = 0;

        for (Reclamo u:listaReclamos) {

            if(u.getFecha().toString()!=null){
                datos[fila][0] = u.getFecha().toString()+"/"+u.getFechaHora().toString();
            }else{
                datos[fila][0] = u.getFechaHora().toString();
            }
            
            datos[fila][1] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
            datos[fila][2] = u.getTitulo();
            datos[fila][3] = u.getDetalle();
            datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
            
            if(u.getSemestre()!=null){
                 datos[fila][5] = u.getSemestre();
            }else{
                datos[fila][5] = null;
            }
            
            if(u.getCreditos()!=null){
                 datos[fila][6] = u.getCreditos();
            }else{
                datos[fila][6] = null;
            }
            
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
    private rsbuttongradiente.RSButtonGradiente botonEliminar1;
    private rsbuttongradiente.RSButtonGradiente botonModificar1;
    private rsbuttongradiente.RSButtonGradiente botonReclamar;
    private rsbuttongradiente.RSButtonGradiente btnFiltrarReclamos;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltroReclamos;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoReclamo;
    private RSMaterialComponent.RSComboBoxMaterial comboboxUsuarioReclamo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnConstancias3;
    private javax.swing.JTable tablaReclamos;
    // End of variables declaration//GEN-END:variables
}
