package com.visual;

import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.GeneracionBean;
import com.grsc.logica.ejb.ItrBean;
import com.grsc.logica.ejb.ReclamoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.EstadoUsuario;
import com.grsc.modelo.entities.Reclamo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import com.grsc.modelo.entities.Usuarios;
import com.grsc.modelo.entities.Generacion;
import com.grsc.modelo.entities.Itr;
import com.pdf.GenerarPDF;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class VentanaInternaReportes extends javax.swing.JInternalFrame {
    
    UsuarioBean userBean= new UsuarioBean();
    Usuarios usuario = new Usuarios();
    String filtrosSeleccionados = "Los filtros seleccionados fueron:";
    
    public VentanaInternaReportes(BigInteger idUser) {
        this.usuario = traerUserPorID(idUser);
        initComponents();
    }
    
    public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tablaReclamos = new javax.swing.JTable();
        lblReportes = new javax.swing.JLabel();
        cmbITR = new RSMaterialComponent.RSComboBoxMaterial();
        btnLimpiarFiltroReclamos = new rsbuttongradiente.RSButtonGradiente();
        btnFiltrarReclamos = new rsbuttongradiente.RSButtonGradiente();
        cmbGeneracion = new RSMaterialComponent.RSComboBoxMaterial();
        cmbMes = new RSMaterialComponent.RSComboBoxMaterial();
        cmbTipo = new RSMaterialComponent.RSComboBoxMaterial();
        btnPDF = new rsbuttongradiente.RSButtonGradiente();
        resultado = new javax.swing.JLabel();

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

        tablaReclamos.setModel(cargarTablaReclamos(
        ));
        tablaReclamos.setAutoscrolls(true);
        tablaReclamos.setRowSelectionAllowed(true);
        tablaReclamos.setSize(600, 600);
        jScrollPane3.setViewportView(tablaReclamos);

        lblReportes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportes.setText("Reportes");

        cmbITR.setForeground(new java.awt.Color(13, 120, 161));
        cmbITR.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        ItrBean itrBean= new ItrBean();

        DefaultComboBoxModel modeloItr=new DefaultComboBoxModel();

        List<Itr> listaItr=itrBean.listarItrs();

        modeloItr.addElement("ITR");

        for(int i = 0 ; i<listaItr.size(); i++){
            modeloItr.addElement(listaItr.get(i).getNomItr());
        }

        cmbITR.setModel(modeloItr);
        cmbITR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbITRItemStateChanged(evt);
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

        cmbGeneracion.setForeground(new java.awt.Color(13, 120, 161));
        cmbGeneracion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        GeneracionBean genBean= new GeneracionBean();

        DefaultComboBoxModel modeloGen=new DefaultComboBoxModel();

        List<Generacion> listaGeneracion=genBean.listarGeneracion();

        modeloGen.addElement(" GENERACIÓN");

        for(int i = 0 ; i<listaGeneracion.size(); i++){
            modeloGen.addElement(listaGeneracion.get(i).getAnio());
        }

        cmbGeneracion.setModel(modeloGen);
        cmbGeneracion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGeneracionItemStateChanged(evt);
            }
        });

        cmbMes.setForeground(new java.awt.Color(13, 120, 161));
        cmbMes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        DefaultComboBoxModel modeloMeses = new DefaultComboBoxModel();

        List<String> listaMeses = new ArrayList<>(Arrays.asList(
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        ));

        modeloMeses.addElement("Mes");

        for(int i = 0 ; i<listaMeses.size(); i++){
            modeloMeses.addElement(listaMeses.get(i));
        }

        cmbMes.setModel(modeloMeses);
        cmbMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMesItemStateChanged(evt);
            }
        });

        cmbTipo.setForeground(new java.awt.Color(13, 120, 161));
        cmbTipo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        DefaultComboBoxModel modeloTipo = new DefaultComboBoxModel();

        List<String> listaTipo = new ArrayList<>(Arrays.asList(
            "VME", "Optativas", "APE", "Otros"));

    modeloTipo.addElement("Tipo Evento");

    for(int i = 0 ; i<listaTipo.size(); i++){
        modeloTipo.addElement(listaTipo.get(i));
    }

    cmbTipo.setModel(modeloTipo);
    cmbTipo.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbTipoItemStateChanged(evt);
        }
    });

    btnPDF.setText("Descargar como PDF");
    btnPDF.setColorPrimario(new java.awt.Color(213, 240, 252));
    btnPDF.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
    btnPDF.setColorSecundario(new java.awt.Color(105, 190, 228));
    btnPDF.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
    btnLimpiarFiltroReclamos.setVisible(false);
    btnPDF.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnPDFMouseClicked(evt);
        }
    });

    resultado.setText("Resultado: ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(cmbITR, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cmbGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(119, 119, 119)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(136, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmbITR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmbGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resultado))
            .addGap(8, 8, 8))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnFiltrarReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnLimpiarFiltroReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarFiltroReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroReclamosMouseClicked
        accionLimpiarFiltro();
    }//GEN-LAST:event_btnLimpiarFiltroReclamosMouseClicked

    private void btnFiltrarReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarReclamosMouseClicked
        accionFiltrar();
        resultado.setText("Se han encontrado "+tablaReclamos.getRowCount()+" Reclamos con los filtros seleccionados");
        this.btnLimpiarFiltroReclamos.setVisible(true);
    }//GEN-LAST:event_btnFiltrarReclamosMouseClicked

    private void accionLimpiarFiltro() {

        this.tablaReclamos.setRowSorter(null);
        this.cmbGeneracion.setSelectedIndex(0);
        this.cmbITR.setSelectedIndex(0);
        this.cmbMes.setSelectedIndex(0);
        this.cmbTipo.setSelectedIndex(0);
        resultado.setText(" ");
    }

    private void accionFiltrar() {

        TableRowSorter<TableModel> filtro1 = new TableRowSorter<>(this.tablaReclamos.getModel());
        TableRowSorter<TableModel> filtro2 = new TableRowSorter<>(this.tablaReclamos.getModel());
        TableRowSorter<TableModel> filtro3 = new TableRowSorter<>(this.tablaReclamos.getModel());
        TableRowSorter<TableModel> filtro4 = new TableRowSorter<>(this.tablaReclamos.getModel());

        String mes = mesSeleccionado();
        String tipo = tipoUserSeleccionado();
        Itr itr = itrSeleccionado();
        Generacion gen = genSeleccionada();

        if (mes != null) {

            filtro1.setRowFilter(RowFilter.regexFilter(mes, 3));

            tablaReclamos.setRowSorter(filtro1);
        }
        if (tipo != null) {

            filtro2.setRowFilter(RowFilter.regexFilter(tipo, 7));

            tablaReclamos.setRowSorter(filtro2);

        }
        if (itr != null) {

            String itrString = itr.getNomItr();

            filtro3.setRowFilter(RowFilter.regexFilter(itrString, 8));

            tablaReclamos.setRowSorter(filtro3);

        }

        if (gen != null) {

            String genAnio = gen.getAnio().toString();

            filtro4.setRowFilter(RowFilter.regexFilter(genAnio, 9));

            tablaReclamos.setRowSorter(filtro4);
        }
    }

    
    private void btnPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseClicked
        List<Object> celdasUsers = convertirTableModelALista(tablaReclamos, 0);

        List<String> listaNombresUsers = new ArrayList<>();

        for (Object obj : celdasUsers) {
            listaNombresUsers.add(obj.toString());
        }

        List<Usuarios> listaUsers = new ArrayList<>();
        for (String s : listaNombresUsers) {
            Usuarios user = userBean.buscarUserByNombre(s);
            listaUsers.add(user);
        }
        
        if (listaUsers == null) {
            JOptionPane.showMessageDialog(null, "No hay valores para generar PDF!");

        } else {

            List<Object> celdasTitulos = convertirTableModelALista(tablaReclamos, 1);

            List<String> listaTitulos = new ArrayList<>();

            for (Object obj : celdasTitulos) {
                listaTitulos.add(obj.toString());
            }

            List<Reclamo> listaReclamos =new ArrayList<>();
            ReclamoBean recBean = new ReclamoBean();
            EstudianteBean estBean = new EstudianteBean();

            for (int i = 0; i < listaUsers.size(); i++) {
                listaReclamos.add(recBean.buscarReclamo(estBean.buscarEstudiante(listaUsers.get(i).getIdUsuario()), listaTitulos.get(i)));
            }
            JOptionPane.showMessageDialog(null, listaReclamos.toString(),
                    "Se está generando el PDF", JOptionPane.INFORMATION_MESSAGE);
            
            if (resultado.getText().isBlank()) {
                GenerarPDF crearPDF = new GenerarPDF();
                crearPDF.generar("Reporte de Reclamos", "No se ha seleccionado ningún filtro", listaReclamos, "/UTEC Logo.png");
            } else {
                GenerarPDF crearPDF = new GenerarPDF();
                crearPDF.generar("Reporte de Reclamos", resultado.getText() + " " + filtrosSeleccionados, listaReclamos, "/UTEC Logo.png");
            }
        }
        
    }//GEN-LAST:event_btnPDFMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        resultado.setText(" ");
    }//GEN-LAST:event_formInternalFrameActivated

    private void cmbITRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbITRItemStateChanged
        if(cmbITR.getSelectedIndex()!=0){
            filtrosSeleccionados = filtrosSeleccionados + "" + "ITR: "+ cmbITR.getSelectedItem().toString() +"\n";
        }
    }//GEN-LAST:event_cmbITRItemStateChanged

    private void cmbMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMesItemStateChanged
        if(cmbMes.getSelectedIndex()!=0){
            filtrosSeleccionados = filtrosSeleccionados + "" + "MES: "+ cmbMes.getSelectedItem().toString() +"\n";
        }
    }//GEN-LAST:event_cmbMesItemStateChanged

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if(cmbTipo.getSelectedIndex()!=0){
            filtrosSeleccionados = filtrosSeleccionados + "" + "Tipo Evento: "+ cmbTipo.getSelectedItem().toString() +"\n";
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void cmbGeneracionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGeneracionItemStateChanged
        if(cmbGeneracion.getSelectedIndex()!=0){
            filtrosSeleccionados = filtrosSeleccionados + "" + "Generación: "+ cmbGeneracion.getSelectedItem().toString() +"\n";
        }
    }//GEN-LAST:event_cmbGeneracionItemStateChanged


    public List<Object> convertirTableModelALista(javax.swing.JTable table, int x) {
        List<Object> primerosValores = new ArrayList<>();

        TableModel tableModel = table.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(rowSorter);

        // Obtener los filtros actualmente aplicados
        RowFilter<? super TableModel, ? super Integer> currentFilter = rowSorter.getRowFilter();

        // Si hay filtros aplicados, desactivarlos temporalmente para obtener solo las filas visibles
        if (currentFilter != null) {
            rowSorter.setRowFilter(null);
        }

        // Recorrer todas las filas y obtener el valor de la primera celda de la primera columna de cada fila
        int rowCount = table.getRowCount();
        int columnCount = table.getColumnCount();

        for (int i = 0; i < rowCount; i++) {
            Object primerValor = table.getValueAt(i, x); // Obtener el valor de la primera celda (columna 0)
            primerosValores.add(primerValor);
        }

        // Restaurar el filtro original si estaba activo
        if (currentFilter != null) {
            rowSorter.setRowFilter(currentFilter);
        }

        return primerosValores;
    }
    
    private DefaultTableModel cargarTablaReclamos() {
    
        ReclamoBean reclamoBean = new ReclamoBean();
        EventoBean eventoBean = new EventoBean();
                
        List<Reclamo> listaReclamos = reclamoBean.listaTodosReclamos();
    
        String[] nombreColumnas = {"Usuario", "Titulo", "Detalle", "Mes", "Estado", "Evento Relacionado", "Fecha Evento", "Tipo Evento", "ITR","Generacion"};
    
        Object[][] datos = new Object[listaReclamos.size()][10];

        int fila = 0;

        for (Reclamo u:listaReclamos) {
            
            datos[fila][0] = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario()).getNomUsuario();
            datos[fila][1] = u.getTitulo();
            datos[fila][2] = u.getDetalle();
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(u.getFechaHora());
            int numMes = cal.get(Calendar.MONTH) + 1;

            datos[fila][3] = obtenerNombreMes(numMes);
           
            if(u.getIdEvento()!=null){
                datos[fila][4] = u.getIdEstadoPeticion().getNomEstado();
                datos[fila][5] = u.getIdEvento().getTitulo();
                datos[fila][6] = u.getFecha();
                datos[fila][7] = u.getIdEvento().getTipoEvento().getNombreTipoEvento();
            } else {
                datos[fila][4] = "No tiene";
                datos[fila][5] = "-";
                datos[fila][6] = "-";
                datos[fila][7] = "-";
            }
            
            Usuarios user = userBean.buscarUsuario(u.getIdUsuario().getIdUsuario());
            datos[fila][8] = user.getItr().getNomItr();
            datos[fila][9] = u.getIdUsuario().getAnioGen().getAnio().toString();
            
            
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
    private rsbuttongradiente.RSButtonGradiente btnFiltrarReclamos;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltroReclamos;
    private rsbuttongradiente.RSButtonGradiente btnPDF;
    private RSMaterialComponent.RSComboBoxMaterial cmbGeneracion;
    private RSMaterialComponent.RSComboBoxMaterial cmbITR;
    private RSMaterialComponent.RSComboBoxMaterial cmbMes;
    private RSMaterialComponent.RSComboBoxMaterial cmbTipo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel resultado;
    private javax.swing.JTable tablaReclamos;
    // End of variables declaration//GEN-END:variables

public void actualizar(){
        tablaReclamos.setModel(cargarTablaReclamos());
    }

    public String obtenerMes(int numMes) {
        List<String> listaMeses = new ArrayList<>(Arrays.asList(
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        ));
        String mes = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaMeses.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (numMes==this.cmbMes.getSelectedIndex()) {
                mes = listaMeses.get(i);
            }

        }

        return mes;
    }

    public static String obtenerNombreMes(int numMes) {
    String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    if (numMes >= 1 && numMes <= 12) {
        return nombresMeses[numMes - 1];
    } else {
        return "Mes inválido";
    }
}

    
    public String mesSeleccionado() {
        List<String> listaMeses = new ArrayList<>(Arrays.asList(
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        ));
        String mes = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaMeses.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaMeses.get(i).equals(this.cmbMes.getSelectedItem() ) ) {
                mes = listaMeses.get(i);
            }

        }

        return mes;
    }
    
    public String tipoUserSeleccionado() {
        //Se carga una lista con todos los roles
        List<String> listaTipo = new ArrayList<>(Arrays.asList(
                "VME", "Optativas", "APE", "Otros"));

        String tipoEvento = null;

        //En el siguiente for se pasa por todos los roles de la lista
        for (int i = 0; i < listaTipo.size(); i++) {
            //Si el nombre del rol coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaTipo.get(i).equals(this.cmbTipo.getSelectedItem().toString())) {
                tipoEvento = listaTipo.get(i);
            }
        }

        return tipoEvento;
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
            if (listaItr.get(i).getNomItr().equals(this.cmbITR.getSelectedItem().toString())) {
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
            if (listaGeneracion.get(i).getAnio().equals(this.cmbGeneracion.getSelectedItem().toString())) {
                gen = listaGeneracion.get(i);
            }
        }

        return gen;
    }

}
