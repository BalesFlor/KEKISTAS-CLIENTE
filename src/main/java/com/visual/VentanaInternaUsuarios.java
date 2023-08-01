package com.visual;

import com.grsc.logica.ejb.EstadoUsuarioBean;
import com.grsc.logica.ejb.GeneracionBean;
import com.grsc.logica.ejb.ItrBean;
import com.grsc.logica.ejb.RoleBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.EstadoUsuario;
import com.grsc.modelo.entities.Generacion;
import com.grsc.modelo.entities.Itr;
import com.grsc.modelo.entities.Roles;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaInternaUsuarios extends javax.swing.JInternalFrame {

    Usuarios analista = new Usuarios();
    UsuarioBean userBean = new UsuarioBean();
    
    
    public VentanaInternaUsuarios(BigInteger idAnalista) {
        analista = userBean.buscarUsuario(idAnalista);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBtnConstancias2 = new javax.swing.JLabel();
        comboboxEstado = new RSMaterialComponent.RSComboBoxMaterial();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        botonEliminar = new rsbuttongradiente.RSButtonGradiente();
        botonModificar = new rsbuttongradiente.RSButtonGradiente();
        comboboxTipoUser1 = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxItr = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxGeneracion = new RSMaterialComponent.RSComboBoxMaterial();
        btnLimpiarFiltro = new rsbuttongradiente.RSButtonGradiente();
        btnFiltrar = new rsbuttongradiente.RSButtonGradiente();
        rSButtonGradiente1 = new rsbuttongradiente.RSButtonGradiente();

        setPreferredSize(new java.awt.Dimension(1340, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnConstancias2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias2.setText("Filtros");
        getContentPane().add(lblBtnConstancias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        comboboxEstado.setForeground(new java.awt.Color(13, 120, 161));

        EstadoUsuarioBean estadosBean= new EstadoUsuarioBean();

        DefaultComboBoxModel modeloEstados=new DefaultComboBoxModel();

        List<EstadoUsuario> listaEstados=estadosBean.listarEstadosUsuario();

        modeloEstados.addElement(" ESTADO USUARIO");

        for(int i = 0 ; i<listaEstados.size(); i++){
            modeloEstados.addElement(listaEstados.get(i).getEstadoUsuario());
        }

        comboboxEstado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxEstado.setModel(modeloEstados);
        getContentPane().add(comboboxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 56, 190, 30));

        tablaUsuarios.setModel(cargarTablaUsuarios(
        ));
        tablaUsuarios.setAutoscrolls(true);
        tablaUsuarios.setRowSelectionAllowed(true);
        tablaUsuarios.setSize(600, 600);
        jScrollPane2.setViewportView(tablaUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 92, 1000, 300));

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
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 410, 130, -1));

        botonModificar.setText("Modificar");
        botonModificar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 410, 130, -1));

        comboboxTipoUser1.setForeground(new java.awt.Color(13, 120, 161));

        RoleBean rolesBean= new RoleBean();

        DefaultComboBoxModel modeloRoles=new DefaultComboBoxModel();

        List<Roles> listaRoles=rolesBean.listarRoles();

        modeloRoles.addElement(" ROL");

        for(int i = 0 ; i<listaRoles.size(); i++){
            modeloRoles.addElement(listaRoles.get(i).getNombre());
        }

        comboboxTipoUser1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxTipoUser1.setModel(modeloRoles);
        comboboxTipoUser1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxTipoUser1ItemStateChanged(evt);
            }
        });
        getContentPane().add(comboboxTipoUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 56, 190, 30));

        comboboxItr.setForeground(new java.awt.Color(13, 120, 161));

        ItrBean itrsBean= new ItrBean();

        DefaultComboBoxModel modeloItrs=new DefaultComboBoxModel();

        List<Itr> listaItrs=itrsBean.listarItrs();

        modeloItrs.addElement(" ITR");

        for(int i = 0 ; i<listaItrs.size(); i++){
            modeloItrs.addElement(listaItrs.get(i).getNomItr());
        }

        comboboxItr.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxItr.setModel(modeloItrs);
        getContentPane().add(comboboxItr, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 56, 190, 30));

        comboboxGeneracion.setForeground(new java.awt.Color(13, 120, 161));

        GeneracionBean genBean= new GeneracionBean();

        DefaultComboBoxModel modeloGen=new DefaultComboBoxModel();

        List<Generacion> listaGeneracion=genBean.listarGeneracion();

        modeloGen.addElement(" GENERACIÓN");

        for(int i = 0 ; i<listaGeneracion.size(); i++){
            modeloGen.addElement(listaGeneracion.get(i).getAnio());
        }

        comboboxGeneracion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxGeneracion.setModel(modeloGen);

        comboboxGeneracion.setVisible(false);
        getContentPane().add(comboboxGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 56, 190, 30));

        btnLimpiarFiltro.setText("Limpiar Filtro");
        btnLimpiarFiltro.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltroMouseClicked(evt);
            }
        });
        btnLimpiarFiltro.setVisible(false);
        getContentPane().add(btnLimpiarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 56, 120, 30));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnFiltrar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnFiltrar.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnFiltrar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 12, 120, 30));

        rSButtonGradiente1.setText("Modificar Estado");
        rSButtonGradiente1.setColorPrimario(new java.awt.Color(105, 190, 228));
        rSButtonGradiente1.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente1.setColorSecundario(new java.awt.Color(213, 240, 252));
        rSButtonGradiente1.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        rSButtonGradiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonGradiente1MouseClicked(evt);
            }
        });
        getContentPane().add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel cargarTablaUsuarios() {

        List<Usuarios> listaUsuarios = userBean.listarUsuarios();

        String[] nombreColumnas = {"Estado", "Rol", "Documento", "nomUsuario", "ITR", "Generación"};

        /*
		 * El tamaño de la tabla es, 4 columnas (cantidad de datos a mostrar) y
		 * la cantidad de filas depende de la cantida de listaUsuarios
         */
        Object[][] datos = new Object[listaUsuarios.size()][6];

        /* Cargamos la matriz con todos los datos */
        int fila = 0;

        for (Usuarios u : listaUsuarios) {

            datos[fila][0] = u.getIdEstadoUsuario().getEstadoUsuario();
            datos[fila][1] = u.getRol().getNombre();
            datos[fila][2] = u.getDocumento();
            datos[fila][3] = u.getNomUsuario();
            datos[fila][4] = u.getItr().getNomItr();

            if (u.getEstudiante() != null) {
                datos[fila][5] = u.getEstudiante().getAnioGen().getAnio().toString();
            } else {
                datos[fila][5] = null;
            }

            fila++;

        }
        /*
		 * Este codigo indica que las celdas no son editables y que son todas
		 * del tipos String
         */
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

    
    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        int row = tablaUsuarios.getSelectedRow();

        if (row==-1) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar");
        } else {
            String cell = tablaUsuarios.getModel().getValueAt(row, 2).toString();
            Usuarios usuarioExterno = userBean.buscarUsuarioPorDocumento(cell);
            Object[] options = {"ELIMINAR", "CANCELAR"};
            int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar usuario " + usuarioExterno.getNomUsuario()
                + "?", "Eliminar usuario", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (respuesta == JOptionPane.YES_OPTION) {

                try {
                    userBean.eliminarUser(usuarioExterno.getIdUsuario());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se ha eliminado el Usuario dado un Error");
                }
                BigInteger estadoEliminado = BigInteger.valueOf(3L);
                if (userBean.obtenerEstado(usuarioExterno.getIdUsuario()).getIdEstado().equals(estadoEliminado)) {
                    tablaUsuarios.setModel(cargarTablaUsuarios());
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado correctamente");
                    tablaUsuarios.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado NO correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha eliminado el usuario");
            }
        }
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void comboboxTipoUser1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxTipoUser1ItemStateChanged
        BigInteger bi= BigInteger.valueOf(3L);
        if(tipoUserSeleccionado()==null){
            this.comboboxGeneracion.setVisible(false);
        }else if (tipoUserSeleccionado().getIdRol().equals(bi)) {
            this.comboboxGeneracion.setVisible(true);
        }else{
            this.comboboxGeneracion.setVisible(false);
        }
    }//GEN-LAST:event_comboboxTipoUser1ItemStateChanged

    private void btnLimpiarFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroMouseClicked
        accionLimpiarFiltro();
        this.btnLimpiarFiltro.setVisible(false);
        this.comboboxGeneracion.setVisible(false);
    }//GEN-LAST:event_btnLimpiarFiltroMouseClicked

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked
        accionFiltrar();
        this.btnLimpiarFiltro.setVisible(true);
    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
     
        int row = tablaUsuarios.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para modificar");
        }else{
            Usuarios usuario = userBean.buscarUsuarioPorDocumento(this.tablaUsuarios.getModel().getValueAt(row,2).toString());
            VentanaModificarAnalista modificar = new VentanaModificarAnalista(usuario.getIdUsuario(), analista.getIdUsuario(), this);
            modificar.setVisible(true);  
        }
        
    }//GEN-LAST:event_botonModificarMouseClicked

    private void rSButtonGradiente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonGradiente1MouseClicked
        Usuarios user = traerUserSeleccionada("Seleccione un usuario para modificar su estado");
        if (user == null) {
            JOptionPane.showMessageDialog(null, "No se puede cambiar el estado por un error");
        } else {
            VentanaSeleccionarEstadoUsuario ventanaSelEstado = new VentanaSeleccionarEstadoUsuario(analista.getIdUsuario(), user, this);
            ventanaSelEstado.setVisible(true);
        }
        
    }//GEN-LAST:event_rSButtonGradiente1MouseClicked

    private void accionLimpiarFiltro() {

        this.tablaUsuarios.setRowSorter(null);
        this.comboboxEstado.setSelectedIndex(0);
        this.comboboxGeneracion.setSelectedIndex(0);
        this.comboboxItr.setSelectedIndex(0);
        this.comboboxTipoUser1.setSelectedIndex(0);
    }

    private void accionFiltrar() {

        TableRowSorter<TableModel> filtro1 = new TableRowSorter<>(this.tablaUsuarios.getModel());
        TableRowSorter<TableModel> filtro2 = new TableRowSorter<>(this.tablaUsuarios.getModel());
        TableRowSorter<TableModel> filtro3 = new TableRowSorter<>(this.tablaUsuarios.getModel());
        TableRowSorter<TableModel> filtro4 = new TableRowSorter<>(this.tablaUsuarios.getModel());

        Roles rol = tipoUserSeleccionado();
        EstadoUsuario estado = estadoSeleccionado();
        Itr itr = itrSeleccionado();
        Generacion gen = genSeleccionada();

        if (estado != null) {

            String estadoString = estado.getEstadoUsuario();

            filtro1.setRowFilter(RowFilter.regexFilter(estadoString, 0));

            tablaUsuarios.setRowSorter(filtro1);
        }
        if (rol != null) {

            String rolString = rol.getNombre();

            filtro2.setRowFilter(RowFilter.regexFilter(rolString, 1));

            tablaUsuarios.setRowSorter(filtro2);

        }
        if (itr != null) {

            String itrString = itr.getNomItr();

            filtro3.setRowFilter(RowFilter.regexFilter(itrString, 4));

            tablaUsuarios.setRowSorter(filtro3);

        }

        if (gen != null) {

            String genAnio = gen.getAnio().toString();

            filtro4.setRowFilter(RowFilter.regexFilter(genAnio, 5));

            tablaUsuarios.setRowSorter(filtro4);
        }
    }

    public EstadoUsuario estadoSeleccionado() {
        /* Este método es para encontrar el localidad que ha sido seleccionado del comboBox de Localidades, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Localidad
        EstadoUsuarioBean estadoBean = new EstadoUsuarioBean();

        //Se carga una lista con todas las localidades
        List<EstadoUsuario> listaEstados = estadoBean.listarEstadosUsuario();
        EstadoUsuario estadoUsuario = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaEstados.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEstados.get(i).getEstadoUsuario().equals(this.comboboxEstado.getSelectedItem().toString())) {
                estadoUsuario = listaEstados.get(i);
            }

        }

        return estadoUsuario;
    }

    public Roles tipoUserSeleccionado() {
        /* Este método es para encontrar el rol que ha sido seleccionado del comboBox de roles, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Rol
        RoleBean rolBean = new RoleBean();

        //Se carga una lista con todos los roles
        List<Roles> listaRoles = rolBean.listarRoles();
        Roles rol = null;

        //En el siguiente for se pasa por todos los roles de la lista
        for (int i = 0; i < listaRoles.size(); i++) {
            //Si el nombre del rol coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaRoles.get(i).getNombre().equals(this.comboboxTipoUser1.getSelectedItem().toString())) {
                rol = listaRoles.get(i);
            }
        }

        return rol;
    }

    public Itr itrSeleccionado() {
        /* Este método es para encontrar el Itr que ha sido seleccionado del comboBox de Itrs, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Itr
        ItrBean itrBean = new ItrBean();

        //Se carga una lista con todos los Itrs
        List<Itr> listaItr = itrBean.listarItrs();
        Itr itr = null;

        //En el siguiente for se pasa por todos los itrs de la lista
        for (int i = 0; i < listaItr.size(); i++) {
            //Si el nombre del itr coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaItr.get(i).getNomItr().equals(this.comboboxItr.getSelectedItem().toString())) {
                itr = listaItr.get(i);
            }

        }

        return itr;
    }

    public Generacion genSeleccionada() {
        /* Este método es para encontrar el Area que ha sido seleccionado del comboBox de Area, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Area
        GeneracionBean genBean = new GeneracionBean();

        //Se carga una lista con todas las Areas
        List<Generacion> listaGeneracion = genBean.listarGeneracion();
        Generacion gen = null;

        //En el siguiente for se pasa por todas las areas de la lista
        for (int i = 0; i < listaGeneracion.size(); i++) {
            //Si el nombre de la Area coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaGeneracion.get(i).getAnio().equals(this.comboboxGeneracion.getSelectedItem().toString())) {
                gen = listaGeneracion.get(i);
            }
        }

        return gen;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente botonEliminar;
    private rsbuttongradiente.RSButtonGradiente botonModificar;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstado;
    private RSMaterialComponent.RSComboBoxMaterial comboboxGeneracion;
    private RSMaterialComponent.RSComboBoxMaterial comboboxItr;
    private RSMaterialComponent.RSComboBoxMaterial comboboxTipoUser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBtnConstancias2;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
public void actualizar(){
        this.tablaUsuarios.setModel(cargarTablaUsuarios());
    }

private Usuarios traerUserSeleccionada(String msg) {
        int row = tablaUsuarios.getSelectedRow();
        
        String nombre = null;       
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String cellName= tablaUsuarios.getModel().getValueAt(row, 3).toString();
            
            nombre = cellName;
        }   
        return userBean.buscarUserByNombre(nombre);
       
    } 
}
