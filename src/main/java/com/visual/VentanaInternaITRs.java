package com.visual;
import com.grsc.logica.ejb.EstadoItrBean;
import com.grsc.logica.ejb.ItrBean;
import com.grsc.modelo.entities.EstadoItr;
import com.grsc.modelo.entities.Itr;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaInternaITRs extends javax.swing.JInternalFrame {

    ItrBean itrBean = new ItrBean();
    
    public VentanaInternaITRs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tablaItrs = new javax.swing.JTable();
        lblBtnConstancias3 = new javax.swing.JLabel();
        cmbEstadoItrs = new RSMaterialComponent.RSComboBoxMaterial();
        btnLimpiarFiltro = new rsbuttongradiente.RSButtonGradiente();
        btnFiltrar = new rsbuttongradiente.RSButtonGradiente();
        btnAgregar = new rsbuttongradiente.RSButtonGradiente();
        btnModificar = new rsbuttongradiente.RSButtonGradiente();
        btnEliminar = new rsbuttongradiente.RSButtonGradiente();
        rSTextField1 = new rojeru_san.rsfield.RSTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaItrs.setModel(cargarTablaItrs(
        ));
        tablaItrs.setAutoscrolls(true);
        tablaItrs.setRowSelectionAllowed(true);
        tablaItrs.setSize(600, 600);
        jScrollPane3.setViewportView(tablaItrs);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 90, 630, 250));

        lblBtnConstancias3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias3.setText("ITRs");
        getContentPane().add(lblBtnConstancias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 130, 20));

        cmbEstadoItrs.setForeground(new java.awt.Color(13, 120, 161));

        EstadoItrBean estadoItrBean= new EstadoItrBean();

        DefaultComboBoxModel modeloEstadoItr=new DefaultComboBoxModel();

        List<EstadoItr> listaEstadoItrs=estadoItrBean.listarEstados();

        modeloEstadoItr.addElement(" ESTADO ITR");

        for(int i = 0 ; i<listaEstadoItrs.size(); i++){
            modeloEstadoItr.addElement(listaEstadoItrs.get(i).getNomEstado());
        }

        cmbEstadoItrs.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        cmbEstadoItrs.setModel(modeloEstadoItr);
        getContentPane().add(cmbEstadoItrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 190, 30));

        btnLimpiarFiltro.setText("Limpiar Filtro");
        btnLimpiarFiltro.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.setVisible(false);
        btnLimpiarFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltroMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 50, 130, 30));

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
        getContentPane().add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 10, 130, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnAgregar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnAgregar.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnAgregar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 130, -1));

        btnModificar.setText("Modificar");
        btnModificar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnModificar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnModificar.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnModificar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 137, 130, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnEliminar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnEliminar.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnEliminar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 203, 130, -1));

        rSTextField1.setPlaceholder("Nombre de nuevo ITR...");
        getContentPane().add(rSTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 623, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private DefaultTableModel cargarTablaItrs() { 
         
        List<Itr> listaItrs = itrBean.listarItrs();
    
        String[] nombreColumnas = {"Nombre Itr"};
    
        Object[][] datos = new Object[listaItrs.size()][1];

        int fila = 0;

        for (Itr u:listaItrs) {
            datos[fila][0] = u.getNomItr();
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

    private void btnLimpiarFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroMouseClicked
        accionLimpiarFiltro();
        this.btnLimpiarFiltro.setVisible(false);
    }//GEN-LAST:event_btnLimpiarFiltroMouseClicked

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked
        accionFiltrar();
        this.btnLimpiarFiltro.setVisible(true);
    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        Itr itr = traerItrSeleccionado("Seleccione un itr para eliminar");
        
        Object[] options = {"ELIMINAR", "CANCELAR"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar el itr?",
                "Eliminar Itr", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (respuesta == JOptionPane.YES_OPTION) {
            Boolean eliminado = false;
            try {
                eliminado = itrBean.borrarItr(itr.getIdItr());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha eliminado el Itr dado un Error");
            }
            if (eliminado) {
                actualizar();
                JOptionPane.showMessageDialog(null, "Itr Eliminado correctamente");
                tablaItrs.clearSelection();
            } else {
                JOptionPane.showMessageDialog(null, "Itr Eliminado NO correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha eliminado el reclamo");
        }

    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnAgregar;
    private rsbuttongradiente.RSButtonGradiente btnEliminar;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro;
    private rsbuttongradiente.RSButtonGradiente btnModificar;
    private RSMaterialComponent.RSComboBoxMaterial cmbEstadoItrs;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnConstancias3;
    private rojeru_san.rsfield.RSTextField rSTextField1;
    private javax.swing.JTable tablaItrs;
    // End of variables declaration//GEN-END:variables

    private void accionLimpiarFiltro() {

        this.tablaItrs.setRowSorter(null);
        this.cmbEstadoItrs.setSelectedIndex(0);
    }
 
    private void accionFiltrar() {

        TableRowSorter<TableModel> filtro1 = new TableRowSorter<>(this.tablaItrs.getModel());

        EstadoItr estado = estadoSeleccionado();
        
        if (estado != null) {

            String estadoString = estado.getNomEstado();

            filtro1.setRowFilter(RowFilter.regexFilter(estadoString, 4));

            tablaItrs.setRowSorter(filtro1);
        }
        
    }
    
    public void actualizar(){
        this.tablaItrs.setModel(cargarTablaItrs());
    }

    public EstadoItr estadoSeleccionado() {
        EstadoItrBean estadoBean = new EstadoItrBean();

        List<EstadoItr> listaEstados = estadoBean.listarEstados();
        EstadoItr estadoItrs = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaEstados.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEstados.get(i).getNomEstado().equals(this.cmbEstadoItrs.getSelectedItem().toString())) {
                estadoItrs = listaEstados.get(i);
            }

        }

        return estadoItrs;
    }
 
    public Itr traerItrSeleccionado(String msg){
            int row = tablaItrs.getSelectedRow();

            Itr itr = null;
            if (row == -1) {
                JOptionPane.showMessageDialog(null, msg);
            } else {
                String nomItr = tablaItrs.getModel().getValueAt(row, 0).toString();
                
                itr = itrBean.buscarItr(nomItr);

            }
            return itr;
        }

}
