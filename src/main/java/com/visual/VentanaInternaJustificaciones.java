package com.visual;

import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.EstadoPeticionBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.JustificacionBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.EstadoPeticion;
import com.grsc.modelo.entities.Estudiante;
import com.grsc.modelo.entities.Evento;
import com.grsc.modelo.entities.Justificacion;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaInternaJustificaciones extends javax.swing.JInternalFrame {

    UsuarioBean userBean= new UsuarioBean();
    Usuarios usuario = new Usuarios();
    JustificacionBean jusBean = new JustificacionBean();
    
    public VentanaInternaJustificaciones(BigInteger idUser) {
        usuario = traerUserPorID(idUser);
        initComponents();
    }
    
    public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar = new rsbuttongradiente.RSButtonGradiente();
        botonModificar = new rsbuttongradiente.RSButtonGradiente();
        botonJustificar = new rsbuttongradiente.RSButtonGradiente();
        lblBtnConstancias3 = new javax.swing.JLabel();
        comboboxEstadoJustificacion = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxUsuarioJustificacion = new RSMaterialComponent.RSComboBoxMaterial();
        btnFiltrarReclamos = new rsbuttongradiente.RSButtonGradiente();
        btnLimpiarFiltroReclamos = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaJustificaciones = new javax.swing.JTable();
        btnAccion = new rsbuttongradiente.RSButtonGradiente();
        btnModificarEstado = new rsbuttongradiente.RSButtonGradiente();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonEliminar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonEliminar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonEliminar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));

        botonJustificar.setText("Realizar Justificación");
        botonJustificar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonJustificar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonJustificar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonJustificar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonJustificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonJustificarMouseClicked(evt);
            }
        });
        botonJustificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJustificarActionPerformed(evt);
            }
        });

        lblBtnConstancias3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias3.setText("Justificaciones");

        comboboxEstadoJustificacion.setForeground(new java.awt.Color(13, 120, 161));

        EstadoPeticionBean estadoPeticionBean= new EstadoPeticionBean();

        DefaultComboBoxModel modeloEstadoJus=new DefaultComboBoxModel();

        List<EstadoPeticion> listaEstadoJus=estadoPeticionBean.listarEstados();

        modeloEstadoJus.addElement(" ESTADO JUSTIFICACION");

        for(int i = 0 ; i<listaEstadoJus.size(); i++){
            modeloEstadoJus.addElement(listaEstadoJus.get(i).getNomEstado());
        }

        comboboxEstadoJustificacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxEstadoJustificacion.setModel(modeloEstadoJus);

        comboboxUsuarioJustificacion.setForeground(new java.awt.Color(13, 120, 161));

        UsuarioBean userBean= new UsuarioBean();

        DefaultComboBoxModel modeloUsuarioJus=new DefaultComboBoxModel();

        List<Usuarios> listaUsuarioJus= userBean.listarUsuarios();

        modeloUsuarioJus.addElement(" USUARIOS");

        for(int i = 0 ; i<listaUsuarioJus.size(); i++){
            modeloUsuarioJus.addElement(listaUsuarioJus.get(i).getNomUsuario());
        }

        comboboxUsuarioJustificacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxUsuarioJustificacion.setModel(modeloUsuarioJus);

        comboboxUsuarioJustificacion.setVisible(false);

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

        tablaJustificaciones.setModel(cargarTablaJustificaciones(
        ));
        tablaJustificaciones.setAutoscrolls(true);
        tablaJustificaciones.setRowSelectionAllowed(true);
        tablaJustificaciones.setSize(600, 600);
        jScrollPane3.setViewportView(tablaJustificaciones);

        btnAccion.setText("Registrar una acción");
        btnAccion.setColorPrimario(new java.awt.Color(105, 190, 228));
        btnAccion.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        btnAccion.setColorSecundario(new java.awt.Color(213, 240, 252));
        btnAccion.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        btnAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccionMouseClicked(evt);
            }
        });

        btnModificarEstado.setText("Modificar Estado");
        btnModificarEstado.setColorPrimario(new java.awt.Color(105, 190, 228));
        btnModificarEstado.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        btnModificarEstado.setColorSecundario(new java.awt.Color(213, 240, 252));
        btnModificarEstado.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        btnModificarEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblBtnConstancias3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboboxUsuarioJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboboxEstadoJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonJustificar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnModificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBtnConstancias3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboboxUsuarioJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboboxEstadoJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonJustificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        Justificacion justificacion = traerJusSeleccionada("Seleccione una justificacion para eliminar");
        
        Object[] options = {"ELIMINAR", "CANCELAR"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar justificacion de inasistencia del Estudiante?", 
                "Eliminar Justificacion", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (respuesta == JOptionPane.YES_OPTION) {
            Boolean eliminado = false;
            try {
                eliminado = jusBean.borrarJustificacion(justificacion.getIdJustificacion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha eliminado la Justificación dado un Error");
            }
            if (eliminado) {
                actualizar();
                JOptionPane.showMessageDialog(null, "Justificacion Eliminada correctamente");
                tablaJustificaciones.clearSelection();
            } else {
                JOptionPane.showMessageDialog(null, "Justificacion Eliminado NO correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha eliminado la Justificacion");
        }

    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonJustificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJustificarMouseClicked
        ventanaAltaJustificacion ventanaJustificacion = new ventanaAltaJustificacion(usuario.getIdUsuario(), this);
        ventanaJustificacion.setVisible(true);
    }//GEN-LAST:event_botonJustificarMouseClicked

    private void botonJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJustificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJustificarActionPerformed

    private void btnLimpiarFiltroReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroReclamosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarFiltroReclamosMouseClicked

    private void btnFiltrarReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarReclamosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarReclamosMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        EstudianteBean estBean = new EstudianteBean();
        if(estBean.existeEstudiante(usuario.getIdUsuario())){
            botonJustificar.setVisible(true);
            botonEliminar.setVisible(true);
            botonModificar.setVisible(true);
        }else{
            botonJustificar.setVisible(false);
            botonEliminar.setVisible(false);
            botonModificar.setVisible(false);
        }
        AnalistaBean analistaBean = new AnalistaBean();
        if(analistaBean.existeAnalista(usuario.getIdUsuario())){
            comboboxUsuarioJustificacion.setVisible(true);
            btnAccion.setVisible(true);
            btnModificarEstado.setVisible(true);
        }else{
            comboboxUsuarioJustificacion.setVisible(false);
            btnAccion.setVisible(false);
            btnModificarEstado.setVisible(false);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseClicked
        Justificacion justificacion = traerJusSeleccionada("Seleccione una justificación para registrar o modificar su acción sobre él");
        ventanaRegAccionJus ventanaRegAccion = new ventanaRegAccionJus(usuario.getIdUsuario(), justificacion);
        ventanaRegAccion.setVisible(true);

    }//GEN-LAST:event_btnAccionMouseClicked

    private void btnModificarEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEstadoMouseClicked
        Justificacion justificacion = traerJusSeleccionada("Seleccione una justificación para modificar su estado");
 
        if (justificacion == null) {
            
            JOptionPane.showMessageDialog(null, "No se puede cambiar el estado por un error");
        } else {
            VentanaSeleccionarEstadoJustificacion ventanaSelEstado = new VentanaSeleccionarEstadoJustificacion(usuario.getIdUsuario(), justificacion, this);
            ventanaSelEstado.setVisible(true);
        }
        
    }//GEN-LAST:event_btnModificarEstadoMouseClicked

     
    private DefaultTableModel cargarTablaJustificaciones() {
    
       JustificacionBean justificacionBean = new JustificacionBean();
        
        List<Justificacion> listaJustificacions = justificacionBean.listarJustificacions();
    
        String[] nombreColumnas = {"Fecha/Hora", "Usuario", "Evento", "Info Adjunta", "Estado Justificación"};
    
        Object[][] datos = new Object[listaJustificacions.size()][5];

        int fila = 0;

        for (Justificacion u:listaJustificacions) {

            datos[fila][0] = u.getFechaHora().toString();            
            datos[fila][1] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
            datos[fila][2] = u.getIdEvento().getTitulo();
            datos[fila][3] = u.getDetalle();
            datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
            
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
    private rsbuttongradiente.RSButtonGradiente botonEliminar;
    private rsbuttongradiente.RSButtonGradiente botonJustificar;
    private rsbuttongradiente.RSButtonGradiente botonModificar;
    private rsbuttongradiente.RSButtonGradiente btnAccion;
    private rsbuttongradiente.RSButtonGradiente btnFiltrarReclamos;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltroReclamos;
    private rsbuttongradiente.RSButtonGradiente btnModificarEstado;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoJustificacion;
    private RSMaterialComponent.RSComboBoxMaterial comboboxUsuarioJustificacion;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnConstancias3;
    private javax.swing.JTable tablaJustificaciones;
    // End of variables declaration//GEN-END:variables

public void actualizar(){
        tablaJustificaciones.setModel(cargarTablaJustificaciones());
    }

private Justificacion traerJusSeleccionada(String msg) {
        int row = tablaJustificaciones.getSelectedRow();
        
        String detalle = null;       
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String cellDetalle = tablaJustificaciones.getModel().getValueAt(row, 3).toString();
            
            detalle = cellDetalle;
        }   
        return jusBean.buscarJustificacion(detalle);
       
    }
}
