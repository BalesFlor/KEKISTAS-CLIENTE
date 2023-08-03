package com.visual;

import com.grsc.logica.ejb.AnalistaBean;
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
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaInternaReclamos extends javax.swing.JInternalFrame {
    
    UsuarioBean userBean= new UsuarioBean();
    Usuarios usuario = new Usuarios();
    ReclamoBean reclamoBean = new ReclamoBean();
    
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(botonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, -1));

        botonModificar1.setText("Modificar");
        botonModificar1.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar1.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar1.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar1.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonModificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificar1MouseClicked(evt);
            }
        });
        getContentPane().add(botonModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 40));

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
        getContentPane().add(botonReclamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 190, -1));

        tablaReclamos.setModel(cargarTablaReclamos(
        ));
        tablaReclamos.setAutoscrolls(true);
        tablaReclamos.setRowSelectionAllowed(true);
        tablaReclamos.setSize(600, 600);
        jScrollPane3.setViewportView(tablaReclamos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 90, 980, 290));

        lblBtnConstancias3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias3.setText("Reclamos");
        getContentPane().add(lblBtnConstancias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 130, 20));

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
        getContentPane().add(comboboxEstadoReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 190, 30));

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
        getContentPane().add(comboboxUsuarioReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 190, 30));

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
        getContentPane().add(btnLimpiarFiltroReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 50, 120, 30));

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
        getContentPane().add(btnFiltrarReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 10, 120, 30));

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
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

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
        getContentPane().add(btnModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminar1MouseClicked
        Reclamo reclamo = traerRecSeleccionado("Seleccione un reclamo para eliminar");
        
        Object[] options = {"ELIMINAR", "CANCELAR"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar el reclamo?",
                "Eliminar Reclamo", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (respuesta == JOptionPane.YES_OPTION) {
            Boolean eliminado = false;
            try {
                eliminado = reclamoBean.borrarReclamo(reclamo.getIdReclamo());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha eliminado el Reclamo dado un Error");
            }
            if (eliminado) {
                actualizar();
                JOptionPane.showMessageDialog(null, "Reclamo Eliminado correctamente");
                tablaReclamos.clearSelection();
            } else {
                JOptionPane.showMessageDialog(null, "Reclamo Eliminado NO correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha eliminado el reclamo");
        }

    }//GEN-LAST:event_botonEliminar1MouseClicked

    private void botonReclamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReclamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReclamarActionPerformed

    private void btnLimpiarFiltroReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroReclamosMouseClicked
        accionLimpiarFiltro();
        this.btnLimpiarFiltroReclamos.setVisible(false);
    }//GEN-LAST:event_btnLimpiarFiltroReclamosMouseClicked

    private void btnFiltrarReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarReclamosMouseClicked
        accionFiltrar();
        this.btnLimpiarFiltroReclamos.setVisible(true);
    }//GEN-LAST:event_btnFiltrarReclamosMouseClicked

    private void accionLimpiarFiltro() {

        this.tablaReclamos.setRowSorter(null);
        this.comboboxEstadoReclamo.setSelectedIndex(0);
        this.comboboxUsuarioReclamo.setSelectedIndex(0);
    }

    
    private void accionFiltrar() {

        TableRowSorter<TableModel> filtro1 = new TableRowSorter<>(this.tablaReclamos.getModel());
        TableRowSorter<TableModel> filtro2 = new TableRowSorter<>(this.tablaReclamos.getModel());

        Usuarios user = userSeleccionado();
        EstadoPeticion estado = estadoSeleccionado();
        
        if (estado != null) {

            String estadoString = estado.getNomEstado();

            filtro1.setRowFilter(RowFilter.regexFilter(estadoString, 4));

            tablaReclamos.setRowSorter(filtro1);
        }
        if (user != null) {

            String rolString = user.getNomUsuario();

            filtro2.setRowFilter(RowFilter.regexFilter(rolString, 1));

            tablaReclamos.setRowSorter(filtro2);

        }
        
    }

    
    private void botonReclamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReclamarMouseClicked
        ventanaAltaReclamo ventanaReclamo = new ventanaAltaReclamo(usuario.getIdUsuario(), this);
        ventanaReclamo.setVisible(true);
    }//GEN-LAST:event_botonReclamarMouseClicked

    private void btnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseClicked
        Reclamo reclamo = traerRecSeleccionado("Seleccione un reclamo para registrar una acción");
        ventanaRegAccionReclamo ventanaRegAccion= new ventanaRegAccionReclamo(usuario.getIdUsuario(), reclamo);
        ventanaRegAccion.setVisible(true);        
    }//GEN-LAST:event_btnAccionMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        EstudianteBean estBean = new EstudianteBean();
        if(estBean.existeEstudiante(usuario.getIdUsuario())){
            botonReclamar.setVisible(true);
            botonEliminar1.setVisible(true);
             botonModificar1.setVisible(true);
        }else{
            botonReclamar.setVisible(false);
            botonEliminar1.setVisible(false);
            botonModificar1.setVisible(false);
        }
        AnalistaBean analistaBean = new AnalistaBean();
        if(analistaBean.existeAnalista(usuario.getIdUsuario())){
            btnAccion.setVisible(true);
            btnModificarEstado.setVisible(true);
        }else{
            btnAccion.setVisible(false);
            btnModificarEstado.setVisible(false);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnModificarEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEstadoMouseClicked
        Reclamo reclamo = traerRecSeleccionado("Seleccione un reclamo para modificar el estado");
        if (reclamo == null){
            JOptionPane.showMessageDialog(null, "No se puede cambiar el estado por un error");
        } else {
            VentanaSeleccionarEstadoReclamo ventanaSelEstado = new VentanaSeleccionarEstadoReclamo(usuario.getIdUsuario(), reclamo, this);
            ventanaSelEstado.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarEstadoMouseClicked

    private void botonModificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificar1MouseClicked
        
        Reclamo reclamo = traerRecSeleccionado("Seleccione un reclamo para modificar");
        
       ventanaModificarReclamo ventanaModificar = new ventanaModificarReclamo(usuario.getIdUsuario(),reclamo, this);
       ventanaModificar.setVisible(true);
    }//GEN-LAST:event_botonModificar1MouseClicked
    
    private DefaultTableModel cargarTablaReclamos() {
        EventoBean eventoBean = new EventoBean();
                
        List<Reclamo> listaReclamos = null;
    
        String[] nombreColumnas = {"Fecha/Hora", "Usuario", "Titulo", "Detalle", "Estado", "Evento Relacionado", "Fecha Evento", "Semestre", "Créditos"};
    
        Object[][] datos = null;

        int fila = 0;

        EstudianteBean estBean = new EstudianteBean();
        if (estBean.existeEstudiante(usuario.getIdUsuario())) {
            Estudiante est = estBean.buscarEstudiante(usuario.getIdUsuario());
            listaReclamos = reclamoBean.listaReclamosByUser(est);
            datos = new Object[listaReclamos.size()][9];
            for (Reclamo u : listaReclamos) {

                datos[fila][0] = u.getFechaHora().toString();
                datos[fila][1] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
                datos[fila][2] = u.getTitulo();
                datos[fila][3] = u.getDetalle();
                datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
                datos[fila][5] = (u.getIdEvento() != null) ? eventoBean.buscarEventoPorId(u.getIdEvento().getIdEvento()).getTitulo() : "No tiene";
                datos[fila][6] = (u.getFecha() != null) ? u.getFecha().toString() : "-";
                datos[fila][7] = (u.getSemestre() != null) ? u.getSemestre() : "-";
                datos[fila][8] = (u.getCreditos() != null) ? u.getCreditos() : "-";
                fila++;
            }
        }
        AnalistaBean analistaBean = new AnalistaBean();
        if (analistaBean.existeAnalista(usuario.getIdUsuario())) {
            listaReclamos = reclamoBean.listaTodosReclamos();
            datos = new Object[listaReclamos.size()][9];
            for (Reclamo u : listaReclamos) {

                datos[fila][0] = u.getFechaHora().toString();
                datos[fila][1] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
                datos[fila][2] = u.getTitulo();
                datos[fila][3] = u.getDetalle();
                datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
                datos[fila][5] = (u.getIdEvento() != null) ? eventoBean.buscarEventoPorId(u.getIdEvento().getIdEvento()).getTitulo() : "No tiene";
                datos[fila][6] = (u.getFecha() != null) ? u.getFecha().toString() : "-";
                datos[fila][7] = (u.getSemestre() != null) ? u.getSemestre() : "-";
                datos[fila][8] = (u.getCreditos() != null) ? u.getCreditos() : "-";
                fila++;
            }
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
    private rsbuttongradiente.RSButtonGradiente btnAccion;
    private rsbuttongradiente.RSButtonGradiente btnFiltrarReclamos;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltroReclamos;
    private rsbuttongradiente.RSButtonGradiente btnModificarEstado;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoReclamo;
    private RSMaterialComponent.RSComboBoxMaterial comboboxUsuarioReclamo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnConstancias3;
    private javax.swing.JTable tablaReclamos;
    // End of variables declaration//GEN-END:variables

public void actualizar(){
        tablaReclamos.setModel(cargarTablaReclamos());
    }

public Reclamo traerRecSeleccionado(String msg){
        int row = tablaReclamos.getSelectedRow();

        Estudiante est = new Estudiante();
        String titulo = "";
        if (row == -1) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String cellTitle = tablaReclamos.getModel().getValueAt(row, 2).toString();
            String cellUsername = tablaReclamos.getModel().getValueAt(row, 1).toString();

            Usuarios userSelected = userBean.buscarUserByNombre(cellUsername);

            EstudianteBean estBean = new EstudianteBean();
            est = estBean.buscarEstudiante(userSelected.getIdUsuario());
            titulo = cellTitle;
        }
        return reclamoBean.buscarReclamo(est, titulo);
    }

    public EstadoPeticion estadoSeleccionado() {
        EstadoPeticionBean estadoBean = new EstadoPeticionBean();

        List<EstadoPeticion> listaEstados = estadoBean.listarEstados();
        EstadoPeticion estadoPeticion = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaEstados.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEstados.get(i).getNomEstado().equals(this.comboboxEstadoReclamo.getSelectedItem().toString())) {
                estadoPeticion = listaEstados.get(i);
            }

        }

        return estadoPeticion;
    }

    public Usuarios userSeleccionado() {
        UsuarioBean userBean = new UsuarioBean();

        List<Usuarios> listaUsuarios =userBean.listarUsuarios();
        Usuarios usuario = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaUsuarios.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaUsuarios.get(i).getNomUsuario().equals(this.comboboxEstadoReclamo.getSelectedItem().toString())) {
                usuario = listaUsuarios.get(i);
            }

        }

        return usuario;
    }
}
