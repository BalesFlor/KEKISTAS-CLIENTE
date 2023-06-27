package com.visual;

import com.grsc.logica.ejb.DocenteBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.ReclamoBean;
import com.grsc.logica.ejb.TipoEventoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Evento;
import com.grsc.modelo.entities.TipoEvento;
import com.grsc.modelo.entities.Tutor;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ventanaAltaReclamo extends javax.swing.JFrame {

    Usuarios usuario;
    UsuarioBean userBean= new UsuarioBean();
    
    public ventanaAltaReclamo(BigInteger idUser) {
        usuario=traerUserPorID(idUser);
        initComponents();
    }
    
    public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        iconUtec = new javax.swing.JLabel();
        iconReclamos = new javax.swing.JLabel();
        rSPanelShadow1 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbTipoEvento = new RSMaterialComponent.RSComboBoxMaterial();
        cmbSemestre = new RSMaterialComponent.RSComboBoxMaterial();
        dateEvento = new rojerusan.RSDateChooser();
        cmbDocente = new RSMaterialComponent.RSComboBoxMaterial();
        spinnerCreditos = new javax.swing.JSpinner();
        lblCreditos = new javax.swing.JLabel();
        btnCancelar = new rsbuttongradiente.RSButtonGradiente();
        btnEnviar = new rsbuttongradiente.RSButtonGradiente();
        cmbEvento = new RSMaterialComponent.RSComboBoxMaterial();
        lblReportesTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        iconUtec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utec_logo_chikito.png"))); // NOI18N

        iconReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1reclamos-icon.png"))); // NOI18N

        txtTitulo.setPlaceholder("Título");
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Descripción de Reclamo...");
        jScrollPane1.setViewportView(txtDescripcion);

        cmbTipoEvento.setForeground(new java.awt.Color(0, 112, 192));
        TipoEventoBean tipoEventoBean= new TipoEventoBean();

        DefaultComboBoxModel modeloTipoEvento=new DefaultComboBoxModel();

        List<TipoEvento> listaTipoEvento = tipoEventoBean.listaTipos();

        modeloTipoEvento.addElement("Seleccione un Tipo de Evento*");

        for(int i = 0 ; i<listaTipoEvento.size(); i++){
            modeloTipoEvento.addElement(listaTipoEvento.get(i).getNombreTipoEvento());
        }
        cmbTipoEvento.setModel(modeloTipoEvento);
        cmbTipoEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoEventoItemStateChanged(evt);
            }
        });

        cmbSemestre.setForeground(new java.awt.Color(0, 112, 192));
        DefaultComboBoxModel modeloSemestre = new DefaultComboBoxModel();

        modeloSemestre.addElement("Seleccione un Semestre*");

        int contador = 1;
        for(int i = 0 ; i < 9; i++){
            modeloSemestre.addElement(contador);
            contador++;
        }
        cmbSemestre.setModel(modeloSemestre);

        dateEvento.setPlaceholder("Fecha Evento");

        cmbDocente.setForeground(new java.awt.Color(0, 112, 192));
        DocenteBean docenteBean= new DocenteBean();

        DefaultComboBoxModel modeloDocente = new DefaultComboBoxModel();

        List<Tutor> listaDocentes = docenteBean.listarDocentes();

        modeloDocente.addElement("Seleccione un Docente Encargado*");

        for(int i = 0 ; i<listaDocentes.size(); i++){
            modeloDocente.addElement(listaDocentes.get(i).getUsuarios().getNombre1()+" "
                +listaDocentes.get(i).getUsuarios().getApellido1());
        }
        cmbDocente.setModel(modeloDocente);

        lblCreditos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(13, 120, 161));
        lblCreditos.setText("Créditos");
        lblCreditos.setVisible(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnCancelar.setColorPrimarioHover(new java.awt.Color(0, 173, 239));
        btnCancelar.setColorSecundario(new java.awt.Color(0, 173, 239));
        btnCancelar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnCancelar.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnEnviar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        btnEnviar.setColorSecundario(new java.awt.Color(0, 173, 239));
        btnEnviar.setColorSecundarioHover(new java.awt.Color(0, 173, 239));
        btnEnviar.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });

        cmbEvento.setForeground(new java.awt.Color(0, 112, 192));
        EventoBean eventoBean = new EventoBean();

        DefaultComboBoxModel modeloEvento=new DefaultComboBoxModel();

        List<Evento> listaEvento = eventoBean.listarEventos();

        modeloEvento.addElement("Seleccione un Evento*");

        for(int i = 0 ; i<listaEvento.size(); i++){
            modeloEvento.addElement(listaEvento.get(i).getTitulo());
        }
        cmbEvento.setModel(modeloEvento);
        cmbEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoEventoItemStateChanged(evt);
            }
        });
        cmbEvento.setModel(modeloEvento);
        cmbEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEventoItemStateChanged(evt);
            }
        });
        cmbEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCreditos)
                                    .addGap(12, 12, 12)
                                    .addComponent(spinnerCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreditos)
                            .addComponent(spinnerCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Hacer un Reporte");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(iconUtec)
                        .addGap(192, 192, 192)
                        .addComponent(lblReportesTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconReclamos)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconUtec))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblReportesTitulo)
                            .addComponent(iconReclamos))))
                .addGap(18, 18, 18)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        ReclamoBean reclamoBean = new ReclamoBean();
        //validador validador = new validador();
        EstudianteBean estBean = new EstudianteBean();
        
            if(txtTitulo.getText().equals("")||txtDescripcion.getText().equals("")||cmbTipoEvento.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Recuerde que debe poner un titulo, /n"
                        + "una descripción de su reclamo y debe seleccionar un tipo de evento", "Datos incompletos!",
                    JOptionPane.WARNING_MESSAGE);
            }else{
                if(cmbTipoEvento.getSelectedIndex()!=4){
                    //En caso de que seleccione una VME, APE u OPTATIVA, se validarán todos estos datos antes de permitir que se envíe su reclamo
                    
                    if(cmbEvento.getSelectedIndex()==0){
                        JOptionPane.showMessageDialog(this, "Recuerde que poner el nombre del Evento correspondiente a su reclamo",
                        "Datos incompletos!",JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(dateEvento.getFechaSeleccionada().equals("")){
                            JOptionPane.showMessageDialog(this, "Recuerde que seleccionar la fecha correspondiente al evento correspondiente a su reclamo",
                            "Datos incompletos!",JOptionPane.WARNING_MESSAGE);
                        }else{
                            if(cmbSemestre.getSelectedIndex()==0){
                                JOptionPane.showMessageDialog(this, "Recuerde que seleccionar el semestre correspondiente al evento correspondiente a su reclamo",
                                "Datos incompletos!",JOptionPane.WARNING_MESSAGE);
                            }else{
                                if(cmbDocente.getSelectedIndex()==0){
                                    JOptionPane.showMessageDialog(this, "Recuerde que seleccionar el semestre correspondiente al evento correspondiente a su reclamo",
                                    "Datos incompletos!",JOptionPane.WARNING_MESSAGE);
                                }else{
                                    Boolean seCreo;
                                    try {
                                        seCreo = reclamoBean.altaReclamo(txtTitulo.getText(), txtDescripcion.getText(),
                                                eventoSeleccionado(), semestreSeleccionado(),
                                                estBean.buscarEstudiante(usuario.getIdUsuario()), 
                                                Calendar.getInstance().getTime(), fechaSeleccionada());
                                    } catch (ParseException ex) {
                                        Logger.getLogger(ventanaAltaReclamo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        }
                    }
                
                }else{
                    //En caso de que seleccione un evento como OTRO no se mostrarán y por lo tanto no será necesario que complete los demás datos
                    
                }
            }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void cmbTipoEventoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoEventoItemStateChanged
        if(cmbTipoEvento.getSelectedItem().equals("VME")){
            cmbSemestre.setVisible(true);
            dateEvento.setVisible(true);
            cmbDocente.setVisible(true);
            spinnerCreditos.setVisible(true);
            lblCreditos.setVisible(true);
            
        }else if(cmbTipoEvento.getSelectedItem().equals("APE")||cmbTipoEvento.getSelectedItem().equals("OPTATIVA")){
            cmbSemestre.setVisible(true);
            dateEvento.setVisible(true);
            cmbDocente.setVisible(true);
            spinnerCreditos.setVisible(true);
            lblCreditos.setVisible(true);
        }else{
            cmbSemestre.setVisible(false);
            dateEvento.setVisible(false);
            cmbDocente.setVisible(false);
            spinnerCreditos.setVisible(false);
            lblCreditos.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoEventoItemStateChanged

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void cmbEventoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEventoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEventoItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cmbSemestre.setVisible(false);
        dateEvento.setVisible(false);
        cmbDocente.setVisible(false);
        spinnerCreditos.setVisible(false);
        lblCreditos.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void cmbEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEventoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnCancelar;
    private rsbuttongradiente.RSButtonGradiente btnEnviar;
    private RSMaterialComponent.RSComboBoxMaterial cmbDocente;
    private RSMaterialComponent.RSComboBoxMaterial cmbEvento;
    private RSMaterialComponent.RSComboBoxMaterial cmbSemestre;
    private RSMaterialComponent.RSComboBoxMaterial cmbTipoEvento;
    private rojerusan.RSDateChooser dateEvento;
    private javax.swing.JLabel iconReclamos;
    private javax.swing.JLabel iconUtec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblReportesTitulo;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    private javax.swing.JSpinner spinnerCreditos;
    private javax.swing.JTextArea txtDescripcion;
    private rojeru_san.RSMTextFull txtTitulo;
    // End of variables declaration//GEN-END:variables

    
    public Tutor docenteSeleccionado() {
        /* Este método es para encontrar el docente que ha sido seleccionado del comboBox de docente, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de docente
        DocenteBean docenteBean = new DocenteBean();
        
        //Se carga una lista con todas los docentes
        List<Tutor> listaDocentes = docenteBean.listarDocentes();
        
        Tutor tutor = null;

        //En el siguiente for se pasa por todas los docente de la lista
        for (int i = 0; i < listaDocentes.size(); i++) {
            //Si el nombre del docente coincide con el seleccionado del combobox se carga en la variable a retornar
            String str = listaDocentes.get(i).getUsuarios().getNombre1()+" "
                +listaDocentes.get(i).getUsuarios().getApellido1();
            if (str.equals(cmbDocente.getSelectedItem().toString())) {
                tutor = listaDocentes.get(i);
            }
        }

        return tutor;
    }            
            
    public BigInteger semestreSeleccionado() {
        String semStr = cmbSemestre.getSelectedItem().toString();
        int semInt = Integer.parseInt(semStr);
        return BigInteger.valueOf(semInt);
    }      
            
    public TipoEvento tipoEventoSeleccionado() {
        /* Este método es para encontrar el tipo Evento que ha sido seleccionado del comboBox de tipo Evento, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de tipo Evento
        TipoEventoBean tipoEventoBean = new TipoEventoBean();
        
        //Se carga una lista con todos los tipo Evento
        List<TipoEvento> listaTipoEvento = tipoEventoBean.listaTipos();
        TipoEvento tipoEvento = null;

        //En el siguiente for se pasa por todos los tipo Evento de la lista
        for (int i = 0; i < listaTipoEvento.size(); i++) {
            //Si el nombre de la tipo Evento coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaTipoEvento.get(i).getNombreTipoEvento().equals(cmbTipoEvento.getSelectedItem().toString())) {
                tipoEvento = listaTipoEvento.get(i);
            }
        }

        return tipoEvento;
    }
    
    public Evento eventoSeleccionado() {
        /* Este método es para encontrar el Evento que ha sido seleccionado del comboBox de Evento, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de Evento
        EventoBean eventoBean = new EventoBean();
        
        //Se carga una lista con todas las Evento
        List<Evento> listaEvento = eventoBean.listarEventos();
        Evento evento = null;

        //En el siguiente for se pasa por todas las Evento de la lista
        for (int i = 0; i < listaEvento.size(); i++) {
            //Si el nombre de la Evento coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEvento.get(i).getTitulo().equals(cmbEvento.getSelectedItem().toString())) {
                evento = listaEvento.get(i);
            }
        }
        return evento;
    }

    public Date fechaSeleccionada() throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String fechaStr = dateEvento.getTextoFecha();
        return formatter.parse(fechaStr);
    }

    public BigInteger creditos(){
        return BigInteger.valueOf((Integer) spinnerCreditos.getValue());
    }
}
