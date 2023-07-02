package com.visual;

import com.grsc.logica.ejb.EstadoPeticionBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.ReclamoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Reclamo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import com.grsc.modelo.entities.Usuarios;
import com.grsc.modelo.entities.EstadoPeticion;
import com.grsc.modelo.entities.Estudiante;
import java.math.BigInteger;
import javax.swing.JOptionPane;

public class VentanaInternaReclamos extends javax.swing.JInternalFrame {
    
    UsuarioBean userBean= new UsuarioBean();
    Usuarios usuario = new Usuarios();
    
    public VentanaInternaReclamos(BigInteger idUser) {
        usuario = traerUserPorID(idUser);
        initComponents();
    }
    
    public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
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
        int row = tablaReclamos.getSelectedRow();

        if (row==-1) {
            JOptionPane.showMessageDialog(null, "Seleccione un reclamo para eliminar");
        } else {
            String cellTitle = tablaReclamos.getModel().getValueAt(row, 2).toString();
            String cellUsername = tablaReclamos.getModel().getValueAt(row, 1).toString();
            
            ReclamoBean reclamoBean = new ReclamoBean();
            
            Usuarios userSelected = userBean.buscarUserByNombre(cellUsername);
            
            EstudianteBean estBean = new EstudianteBean();
            Estudiante est = estBean.buscarEstudiante(userSelected.getIdUsuario());
            
            Reclamo reclamo = reclamoBean.buscarReclamo(est, cellTitle);
            Object[] options = {"ELIMINAR", "CANCELAR"};
            int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar reclamo " + reclamo.getTitulo() +
                    "del Estudiante "+ userSelected.getNomUsuario() + "?", "Eliminar Reclamo", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (respuesta == JOptionPane.YES_OPTION) {

                try {
                    reclamoBean.
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se ha eliminado el Usuario dado un Error");
                }
                BigInteger estadoEliminado = BigInteger.valueOf(3L);
                if (userBean.obtenerEstado(usuarioExterno.getIdUsuario()).getIdEstado().equals(estadoEliminado)) {
                    jTable1.setModel(cargarTablaUsuarios());
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado correctamente");
                    jTable1.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado NO correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha eliminado el usuario");
            }
        }
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
        ventanaAltaReclamo ventanaReclamo = new ventanaAltaReclamo(usuario.getIdUsuario(), this);
        ventanaReclamo.setVisible(true);
    }//GEN-LAST:event_botonReclamarMouseClicked
    
    private DefaultTableModel cargarTablaReclamos() {
    
        ReclamoBean reclamoBean = new ReclamoBean();
        EventoBean eventoBean = new EventoBean();
                
        List<Reclamo> listaReclamos = reclamoBean.listaTodosReclamos();
    
        String[] nombreColumnas = {"Fecha/Hora", "Usuario", "Titulo", "Detalle", "Estado", "Evento Relacionado", "Fecha Evento", "Semestre", "Créditos"};
    
        Object[][] datos = new Object[listaReclamos.size()][9];

        int fila = 0;

        for (Reclamo u:listaReclamos) {

            
            datos[fila][0] = u.getFechaHora().toString();
            datos[fila][1] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
            datos[fila][2] = u.getTitulo();
            datos[fila][3] = u.getDetalle();
            datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
            
            if(u.getIdEvento()!=null){
                 datos[fila][5] = eventoBean.buscarEventoPorId(u.getIdEvento().getIdEvento()).getTitulo();
                 datos[fila][6] = u.getFecha().toString();
                 datos[fila][7] = u.getSemestre();
                 datos[fila][8] = u.getCreditos();
            }else{
                datos[fila][5] = "No tiene";
                 datos[fila][6] = "-";
                 datos[fila][7] = "-";
                 datos[fila][8] = "-";
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

public void actualizar(){
        tablaReclamos.setModel(cargarTablaReclamos());
    }
}
