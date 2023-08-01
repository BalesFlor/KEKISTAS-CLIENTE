package com.visual;

import com.grsc.logica.ejb.AreaBean;
import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.ItrBean;
import com.grsc.logica.ejb.RoleBean;
import com.grsc.logica.ejb.DepartamentoBean;
import com.grsc.logica.ejb.DocenteBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.GeneracionBean;
import com.grsc.logica.ejb.LocalidadBean;
import com.grsc.logica.ejb.TipoTutorBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.logica.validador.validador;
import com.grsc.modelo.entities.Area;
import com.grsc.modelo.entities.Departamento;
import com.grsc.modelo.entities.EstadoUsuario;
import com.grsc.modelo.entities.Generacion;
import com.grsc.modelo.entities.Itr;
import com.grsc.modelo.entities.Localidad;
import com.grsc.modelo.entities.Roles;
import com.grsc.modelo.entities.TipoTutor;
import com.grsc.modelo.entities.Usuarios;
import com.visual.fuentes.FuenteRoboto;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.math.BigInteger;
import java.text.DateFormat;
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

public class VentanaModificarUsuario extends javax.swing.JFrame {

    UsuarioBean userBean = new UsuarioBean();
    Usuarios usuario = new Usuarios();

    public VentanaModificarUsuario(BigInteger idUser) {        
        usuario=traerUserPorID(idUser);
        initComponents();
        
        this.cmbRol.setSelectedItem(usuario.getRol().getNombre());
        this.txtDocumento.setText(usuario.getDocumento());
        this.txtNombre1.setText(usuario.getNombre1());  
        this.txtNombre2.setText(usuario.getNombre2());
        this.txtApellido1.setText(usuario.getApellido1());
        this.txtApellido2.setText(usuario.getApellido2());
        this.cmbbDeptos.setSelectedItem(usuario.getDepartamento().getNomDepartamento());
        this.cmbbLocals.setSelectedItem(usuario.getLocalidad().getNomLocalidad());
        this.cmbbItr.setSelectedItem(usuario.getItr().getNomItr());
        this.txtTelefono.setText(usuario.getTelefono());
        this.txtEmailConsti.setText(usuario.getMailInstitucional());
        this.txtEmailPers.setText(usuario.getMailPersonal());
        this.txtContrasenia.setText(usuario.getContrasenia());
        if (usuario.getGenero()=='M'){
            this.RBtnHombre.setSelected(true);
            this.RBtnMujer.setSelected(false);
            this.RBtnNoBinario.setSelected(false);
            this.RBtnOtro.setSelected(false);
        }
        if (usuario.getGenero()=='F'){
            this.RBtnHombre.setSelected(false);
            this.RBtnMujer.setSelected(true);
            this.RBtnNoBinario.setSelected(false);
            this.RBtnOtro.setSelected(false);
        }
        if (usuario.getGenero()=='N'){
            this.RBtnHombre.setSelected(false);
            this.RBtnMujer.setSelected(false);
            this.RBtnNoBinario.setSelected(true);
            this.RBtnOtro.setSelected(false);
        }
        if (usuario.getGenero()=='O'){
            this.RBtnHombre.setSelected(false);
            this.RBtnMujer.setSelected(false);
            this.RBtnNoBinario.setSelected(false);
            this.RBtnOtro.setSelected(true);
        }
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNac = dateFormat.format(usuario.getFecNac());
        this.datePicker.setTextoFecha(fechaNac);

    }
      public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelShadow1 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSLabelSombra1 = new rojeru_san.rslabel.RSLabelSombra();
        cmbRol = new RSMaterialComponent.RSComboBoxMaterial();
        cmbbDeptos = new RSMaterialComponent.RSComboBoxMaterial();
        cmbbLocals = new RSMaterialComponent.RSComboBoxMaterial();
        txtDocumento = new rojeru_san.RSMTextFull();
        txtNombre1 = new rojeru_san.RSMTextFull();
        txtNombre2 = new rojeru_san.RSMTextFull();
        txtApellido1 = new rojeru_san.RSMTextFull();
        txtApellido2 = new rojeru_san.RSMTextFull();
        txtEmailConsti = new rojeru_san.RSMTextFull();
        txtEmailPers = new rojeru_san.RSMTextFull();
        botonConfirmar = new rsbuttongradiente.RSButtonGradiente();
        txtContrasenia = new rojeru_san.RSMPassView();
        txtContraseniaConfir = new rojeru_san.RSMPassView();
        lblGenero = new javax.swing.JLabel();
        RBtnHombre = new javax.swing.JRadioButton();
        RBtnMujer = new javax.swing.JRadioButton();
        RBtnNoBinario = new javax.swing.JRadioButton();
        RBtnOtro = new javax.swing.JRadioButton();
        lblAnioIngreso = new javax.swing.JLabel();
        TipoTutorBean tipoTutorBean= new TipoTutorBean();

        DefaultComboBoxModel modeloTipoTutor=new DefaultComboBoxModel();

        List<TipoTutor> listaTipoTutor=tipoTutorBean.listarTipoTutor();

        modeloTipoTutor.addElement("Seleccione Tipo de Tutor*");

        for(int i = 0 ; i<listaTipoTutor.size(); i++){
            modeloTipoTutor.addElement(listaTipoTutor.get(i).getNomTipoTutor());
        }
        cmbbTipoTutor = new RSMaterialComponent.RSComboBoxMaterial();
        AreaBean areaBean= new AreaBean();

        DefaultComboBoxModel modeloArea=new DefaultComboBoxModel();

        List<Area> listaArea=areaBean.listarArea();

        modeloArea.addElement("Seleccione Area*");

        for(int i = 0 ; i<listaArea.size(); i++){
            modeloArea.addElement(listaArea.get(i).getNomArea());
        }
        cmbbArea = new RSMaterialComponent.RSComboBoxMaterial();
        lblNota = new javax.swing.JLabel();
        cmbbItr = new RSMaterialComponent.RSComboBoxMaterial();
        txtTelefono = new rojeru_san.RSMTextFull();
        anioPicker = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();
        datePicker = new rojerusan.RSDateChooser();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();

        buttonGroup1.add(this.RBtnMujer);
        buttonGroup1.add(this.RBtnHombre);
        buttonGroup1.add(this.RBtnNoBinario);
        buttonGroup1.add(this.RBtnOtro);
        this.RBtnOtro.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        rSPanelShadow1.setPreferredSize(new java.awt.Dimension(838, 668));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 173, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(838, 668));

        rSLabelSombra1.setForeground(new java.awt.Color(0, 173, 239));
        rSLabelSombra1.setText("Solicitud de Registro");
        rSLabelSombra1.setColorDeSombra(new java.awt.Color(239, 239, 239));
        FuenteRoboto fuenteImport= new FuenteRoboto();
        rSLabelSombra1.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,24));

        cmbRol.setForeground(new java.awt.Color(13, 120, 161));
        RoleBean rolBean= new RoleBean();

        DefaultComboBoxModel modeloRol=new DefaultComboBoxModel();

        List<Roles> listaRoles=rolBean.listarRoles();

        modeloRol.addElement("Seleccione un Rol*");

        for(int i = 0 ; i<listaRoles.size(); i++){
            modeloRol.addElement(listaRoles.get(i).getNombre());
        }
        cmbRol.setModel(modeloRol);
        cmbRol.setColorMaterial(new java.awt.Color(0, 173, 239));
        cmbRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRolItemStateChanged(evt);
            }
        });

        cmbbDeptos.setForeground(new java.awt.Color(13, 120, 161));
        DepartamentoBean deptoBean= new DepartamentoBean();

        DefaultComboBoxModel modeloDeptos=new DefaultComboBoxModel();

        List<Departamento> listaDeptos=deptoBean.listarDepartamento();

        modeloDeptos.addElement("Seleccione un Departamento*");

        for(int i = 0 ; i<listaDeptos.size(); i++){
            modeloDeptos.addElement(listaDeptos.get(i).getNomDepartamento());
        }
        cmbbDeptos.setModel(modeloDeptos);
        cmbbDeptos.setColorMaterial(new java.awt.Color(0, 173, 239));
        cmbbDeptos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbDeptosItemStateChanged(evt);
            }
        });

        cmbbLocals.setForeground(new java.awt.Color(13, 120, 161));
        LocalidadBean localsBean= new LocalidadBean();
        DefaultComboBoxModel modeloLocal=new DefaultComboBoxModel();

        List<Localidad> listalocals=localsBean.listarLocals();

        modeloLocal.addElement("Seleccione una Localidad*");

        for(int i = 0 ; i<listalocals.size(); i++){
            modeloLocal.addElement(listalocals.get(i).getNomLocalidad());
        }
        cmbbLocals.setModel(modeloLocal);
        cmbbLocals.setColorMaterial(new java.awt.Color(0, 173, 239));

        txtDocumento.setEditable(false);
        txtDocumento.setForeground(new java.awt.Color(0, 69, 95));
        txtDocumento.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtDocumento.setBotonColor(new java.awt.Color(0, 173, 239));
        txtDocumento.setPlaceholder("Cédula de identidad*");
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        txtNombre1.setForeground(new java.awt.Color(0, 69, 95));
        txtNombre1.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtNombre1.setBotonColor(new java.awt.Color(0, 173, 239));
        txtNombre1.setPlaceholder("Primer Nombre*");
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre1KeyTyped(evt);
            }
        });

        txtNombre2.setForeground(new java.awt.Color(0, 69, 95));
        txtNombre2.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtNombre2.setBotonColor(new java.awt.Color(0, 173, 239));
        txtNombre2.setPlaceholder("Segundo Nombre");
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        txtApellido1.setForeground(new java.awt.Color(0, 69, 95));
        txtApellido1.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtApellido1.setBotonColor(new java.awt.Color(0, 173, 239));
        txtApellido1.setPlaceholder("Primer Apellido*");
        txtApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido1KeyTyped(evt);
            }
        });

        txtApellido2.setForeground(new java.awt.Color(0, 69, 95));
        txtApellido2.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtApellido2.setBotonColor(new java.awt.Color(0, 173, 239));
        txtApellido2.setPlaceholder("Segundo Apellido*");
        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });
        txtApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido2KeyTyped(evt);
            }
        });

        txtEmailConsti.setForeground(new java.awt.Color(0, 69, 95));
        txtEmailConsti.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtEmailConsti.setBotonColor(new java.awt.Color(0, 173, 239));
        txtEmailConsti.setPlaceholder("CorreoConstitucional@utec.edu.uy*");
        txtEmailConsti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailConstiActionPerformed(evt);
            }
        });
        txtEmailConsti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailConstiKeyTyped(evt);
            }
        });

        txtEmailPers.setForeground(new java.awt.Color(0, 69, 95));
        txtEmailPers.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtEmailPers.setBotonColor(new java.awt.Color(0, 173, 239));
        txtEmailPers.setPlaceholder("CorreoPersonal@Ejemplo.com*");
        txtEmailPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailPersActionPerformed(evt);
            }
        });
        txtEmailPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailPersKeyTyped(evt);
            }
        });

        botonConfirmar.setText("Confirmar");
        botonConfirmar.setColorPrimario(new java.awt.Color(213, 240, 252));
        botonConfirmar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        botonConfirmar.setColorSecundario(new java.awt.Color(105, 190, 228));
        botonConfirmar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        botonConfirmar.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        txtContrasenia.setBorder(null);
        txtContrasenia.setForeground(new java.awt.Color(13, 120, 161));
        txtContrasenia.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtContrasenia.setBotonColor(new java.awt.Color(0, 173, 239));
        txtContrasenia.setPlaceholder("Campo contraseña*");

        txtContraseniaConfir.setBorder(null);
        txtContraseniaConfir.setForeground(new java.awt.Color(13, 120, 161));
        txtContraseniaConfir.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtContraseniaConfir.setBotonColor(new java.awt.Color(0, 173, 239));
        txtContraseniaConfir.setPlaceholder("Campo confirmación de contraseña*");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(13, 120, 161));
        lblGenero.setText("Género*");

        RBtnHombre.setForeground(new java.awt.Color(13, 120, 161));
        RBtnHombre.setText("Hombre");

        RBtnMujer.setForeground(new java.awt.Color(13, 120, 161));
        RBtnMujer.setText("Mujer");

        RBtnNoBinario.setForeground(new java.awt.Color(13, 120, 161));
        RBtnNoBinario.setText("No Binario");

        RBtnOtro.setForeground(new java.awt.Color(13, 120, 161));
        RBtnOtro.setText("Otro");

        lblAnioIngreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAnioIngreso.setForeground(new java.awt.Color(13, 120, 161));
        lblAnioIngreso.setText("Año de ingreso a la carrera*");
        lblAnioIngreso.setVisible(false);

        cmbbTipoTutor.setForeground(new java.awt.Color(13, 120, 161));
        cmbbTipoTutor.setModel(modeloTipoTutor);
        cmbbTipoTutor.setColorMaterial(new java.awt.Color(0, 173, 239));
        cmbbTipoTutor.setVisible(false);

        cmbbArea.setForeground(new java.awt.Color(13, 120, 161));
        cmbbArea.setModel(modeloArea);
        cmbbArea.setColorMaterial(new java.awt.Color(0, 173, 239));
        cmbbArea.setVisible(false);

        lblNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNota.setForeground(new java.awt.Color(0, 69, 95));
        lblNota.setText("Los campos con * son obligatorios");

        cmbbItr.setForeground(new java.awt.Color(13, 120, 161));
        ItrBean itrBean= new ItrBean();

        DefaultComboBoxModel modeloItr=new DefaultComboBoxModel();

        List<Itr> listaItr=itrBean.listarItrs();

        modeloItr.addElement("Seleccione un ITR*");

        for(int i = 0 ; i<listaItr.size(); i++){
            modeloItr.addElement(listaItr.get(i).getNomItr());
        }
        cmbbItr.setModel(modeloItr);
        cmbbItr.setColorMaterial(new java.awt.Color(0, 173, 239));

        txtTelefono.setForeground(new java.awt.Color(0, 69, 95));
        txtTelefono.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtTelefono.setBotonColor(new java.awt.Color(0, 173, 239));
        txtTelefono.setPlaceholder("Celular* (ej:+598 99 123 456)");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        anioPicker.setVisible(false);

        jLabel1.setForeground(new java.awt.Color(13, 120, 161));
        jLabel1.setText("Volver al inicio de sesión");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        datePicker.setFormatoFecha("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(rSLabelSombra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAnioIngreso)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(anioPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtApellido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApellido2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbbDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbbLocals, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbbItr, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailConsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenero)
                            .addComponent(cmbbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RBtnHombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBtnMujer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBtnNoBinario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBtnOtro))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addComponent(txtContraseniaConfir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbbTipoTutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblNota))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rSLabelSombra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cmbbDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtContraseniaConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbbLocals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RBtnHombre)
                            .addComponent(RBtnMujer)
                            .addComponent(RBtnNoBinario)
                            .addComponent(RBtnOtro)))
                    .addComponent(cmbbItr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbbTipoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmailConsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbbArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblAnioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anioPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNota)
                .addContainerGap())
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTEC Logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        validador Validador = new validador();
        if (!Validador.validarContrasenia(this.txtContrasenia.getText(),this.txtContraseniaConfir.getText())) {
            JOptionPane.showMessageDialog(this, "Contraseña inválida, las contraseñas no coinciden"
                                            + "\npor favor, vuelva a ingresar la contraseña", "Datos Erroneos!",
                                            JOptionPane.WARNING_MESSAGE);
        }
        else {
        userBean.editarUser(usuario, this.deptoSeleccionado(), this.localSeleccionada(), this.txtTelefono.getText(), this.txtEmailPers.getText(), this.txtContrasenia.getText());
        this.dispose();
        }        
        
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void cmbbDeptosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbDeptosItemStateChanged
        /*Con este método cada vez que se seleccione un departamento diferente (sin haber apretado el boton de registrar aún) 
        se cambiará el contenido del comboBox de Localidad según las localidades correspondientes al depto seleccionado*/
        
        //Invocamos al bean de Localidad
        
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //Si el estado del combobox depto cambia porque se selecciona otro depto, se ejecutará este bloque de código
            
            if (this.cmbbDeptos.getSelectedIndex() > 0) {
                /*Si el Departamento seleccionado está en una posición mayor que 0 (es decir: no es el mensaje Default del comboBox),
                se ejecutará este bloque de código*/
                
                //Se cargara el id del departamento seleccionado en esta variable idDepto
                DepartamentoBean deptoBean= new DepartamentoBean();

                LocalidadBean localsBean = new LocalidadBean();
                DefaultComboBoxModel modeloLocal = new DefaultComboBoxModel();

                BigInteger idDepto = this.deptoSeleccionado().getIdDepartamento();
                
                List<Localidad> listalocals = localsBean.listarLocalsByDepto(idDepto);
                
                modeloLocal.addElement("Seleccione una Localidad*");

                for (int i = 0; i < listalocals.size(); i++) {
                    modeloLocal.addElement(listalocals.get(i).getNomLocalidad());
                }
                cmbbLocals.setModel(modeloLocal);
                /*
                BigInteger idDepto = this.deptoSeleccionado().getIdDepartamento();

                //Creamos otra lista solo para los nombres de las localidades, que va a tener el tamaño de la listaLocals
                String[] listaNomLocals = localsBean.listarNomLocalsByDepto(idDepto);

                //Finalmente creamos un modelo para la comboBox de localidades con la listaNomLocals de item
                modeloLocal = new DefaultComboBoxModel(listaNomLocals);

                //le seteamos el modelo a comboBoxLocals
                this.cmbbLocals.setModel(modeloLocal);
*/
            } else {
                //Si no se selecciona ningún depto válido la combobox de Localidades se mantendrá vacía
                String[] listaNomLocals = {"--"};
                DefaultComboBoxModel modeloLocal = new DefaultComboBoxModel(listaNomLocals);

                this.cmbbLocals.setModel(modeloLocal);
            }
        }
    }//GEN-LAST:event_cmbbDeptosItemStateChanged

    private void cmbRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRolItemStateChanged
       //Con este método cada vez que se seleccione un rol diferente se cambiarán los requisitos para registrarse en la app
       
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //Si el estado del combobox rol cambia porque se selecciona un rol, se ejecutará este bloque de código
            
            if (cmbRol.getSelectedItem().equals("Seleccione un Rol*")) {
                /*Si se selecciona el item del combobox que solo sirve para indicar que se tiene que seleccionar, 
                aparecerá el sig mensaje*/
                
                JOptionPane.showMessageDialog(this, "Asegurese de seleccionar un rol!",
                        "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);
            } else {
                if (cmbRol.getSelectedItem().equals("DOCENTE")) {
                    //Si se selecciona el rol docente, serán visible los campos Area y TipoTutor
                    
                    cmbbTipoTutor.setVisible(true);
                    cmbbArea.setVisible(true);
                    
                    //Mientras que el campo para el estudiante y su etiqueta no serán visibles.
                    lblAnioIngreso.setVisible(false);
                    anioPicker.setVisible(false);
                    
                } else if (cmbRol.getSelectedItem().equals("ESTUDIANTE")) {
                    //Si se selecciona el rol estudiante, serán visibles el campos Año Ingreso y su etiqueta.
                    lblAnioIngreso.setVisible(true);
                    anioPicker.setVisible(true);
                    
                    //Mientras que los campos para el docente no serán visibles.
                    cmbbTipoTutor.setVisible(false);
                    cmbbArea.setVisible(false);
                    
                } else {
                    //Si en su defecto se selecciona el rol Analista, no será visible ningún campo.
                    
                    cmbbTipoTutor.setVisible(false);
                    cmbbArea.setVisible(false);
                    lblAnioIngreso.setVisible(false);
                    anioPicker.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_cmbRolItemStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        VentanaIniciarSesion VentanaInicioSesion= new VentanaIniciarSesion();
        VentanaInicioSesion.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(0,0,51));
        jLabel1.setText("<HTML><u>Volver al inicio de sesión</u></HTML>");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(13,120,161));
        jLabel1.setText("Volver al inicio de sesión");
    }//GEN-LAST:event_jLabel1MouseExited

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
      
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtEmailConstiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailConstiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailConstiActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void txtEmailPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailPersActionPerformed

    private void txtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyTyped
       char c = evt.getKeyChar();
    if (!Character.isLetter(c)) {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombre1KeyTyped

    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isLetter(c)) {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombre2KeyTyped

    private void txtApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido1KeyTyped
    char c = evt.getKeyChar();
    if (!Character.isLetter(c)) {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellido1KeyTyped

    private void txtApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido2KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isLetter(c)) {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellido2KeyTyped

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
      char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != '.' && c != '-') {
        evt.consume();
    }
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != '+' && c != ' ') {
        evt.consume();
    }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailConstiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailConstiKeyTyped
        char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || Character.isDigit(c) || c == '.' || c == '@')) {
        evt.consume();
    }
    }//GEN-LAST:event_txtEmailConstiKeyTyped

    private void txtEmailPersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailPersKeyTyped
      char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || Character.isDigit(c) || c == '.' || c == '@')) {
        evt.consume();
    }
    }//GEN-LAST:event_txtEmailPersKeyTyped

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBtnHombre;
    private javax.swing.JRadioButton RBtnMujer;
    private javax.swing.JRadioButton RBtnNoBinario;
    private javax.swing.JRadioButton RBtnOtro;
    private com.toedter.calendar.JYearChooser anioPicker;
    private rsbuttongradiente.RSButtonGradiente botonConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSComboBoxMaterial cmbRol;
    private RSMaterialComponent.RSComboBoxMaterial cmbbArea;
    private RSMaterialComponent.RSComboBoxMaterial cmbbDeptos;
    private RSMaterialComponent.RSComboBoxMaterial cmbbItr;
    private RSMaterialComponent.RSComboBoxMaterial cmbbLocals;
    private RSMaterialComponent.RSComboBoxMaterial cmbbTipoTutor;
    private rojerusan.RSDateChooser datePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnioIngreso;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNota;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    private rojeru_san.rslabel.RSLabelSombra rSLabelSombra1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSMTextFull txtApellido1;
    private rojeru_san.RSMTextFull txtApellido2;
    private rojeru_san.RSMPassView txtContrasenia;
    private rojeru_san.RSMPassView txtContraseniaConfir;
    private rojeru_san.RSMTextFull txtDocumento;
    private rojeru_san.RSMTextFull txtEmailConsti;
    private rojeru_san.RSMTextFull txtEmailPers;
    private rojeru_san.RSMTextFull txtNombre1;
    private rojeru_san.RSMTextFull txtNombre2;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables

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
            if (listaItr.get(i).getNomItr().equals(cmbbItr.getSelectedItem().toString())) {
                itr = listaItr.get(i);
            }
        }

        return itr;
    }

    public Departamento deptoSeleccionado() {
        /* Este método es para encontrar el depto que ha sido seleccionado del comboBox de departamentos, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
       
        //Invocamos al bean de Depto
        DepartamentoBean deptoBean = new DepartamentoBean();
        
        //Se carga una lista con todos los Deptos
        List<Departamento> listaDepto = deptoBean.listarDepartamento();
        Departamento depto = null;

        //En el siguiente for se pasa por todos los Deptos de la lista
        for (int i = 0; i < listaDepto.size(); i++) {
            //Si el nombre del depto coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaDepto.get(i).getNomDepartamento().equals(cmbbDeptos.getSelectedItem().toString())) {
                depto = listaDepto.get(i);
            }
        }

        return depto;
    }

    public Localidad localSeleccionada() {
        /* Este método es para encontrar el localidad que ha sido seleccionado del comboBox de Localidades, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de Localidad
        LocalidadBean localBean = new LocalidadBean();
        
        //Se carga una lista con todas las localidades
        List<Localidad> listaLocals = localBean.listarLocals();
        Localidad local = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaLocals.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaLocals.get(i).getNomLocalidad().equals(cmbbLocals.getSelectedItem().toString())) {
                local = listaLocals.get(i);
            }
        }


        return local;
    }

    public Roles rolSeleccionado() {
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
            if (listaRoles.get(i).getNombre().equals(cmbRol.getSelectedItem().toString())) {
                rol = listaRoles.get(i);
            }
        }

        return rol;
    }

    public TipoTutor TipoTutorSeleccionado() {
        /* Este método es para encontrar el Tipo Tutor que ha sido seleccionado del comboBox de Tipo de Tutor, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de Tipo Tutor
        TipoTutorBean tipoTutorBean = new TipoTutorBean();
        
        //Se carga una lista con todos los Tipos de Tutores
        List<TipoTutor> listaTipoTutor = tipoTutorBean.listarTipoTutor();
        TipoTutor tipoTutor = null;

        //En el siguiente for se pasa por todos los Tipos de Tutores de la lista
        for (int i = 0; i < listaTipoTutor.size(); i++) {
            //Si el nombre del Tipo de Tutor coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaTipoTutor.get(i).getNomTipoTutor().equals(cmbbTipoTutor.getSelectedItem().toString())) {
                tipoTutor = listaTipoTutor.get(i);
            }
        }


        return tipoTutor;
    }

    public Area areaSeleccionada() {
        /* Este método es para encontrar el Area que ha sido seleccionado del comboBox de Area, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de Area
        AreaBean areaBean = new AreaBean();
        
        //Se carga una lista con todas las Areas
        List<Area> listaArea = areaBean.listarArea();
        Area area = null;

        //En el siguiente for se pasa por todas las areas de la lista
        for (int i = 0; i < listaArea.size(); i++) {
            //Si el nombre de la Area coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaArea.get(i).getNomArea().equals(cmbbArea.getSelectedItem().toString())) {
                area = listaArea.get(i);
            }
        }


        return area;
    }

    public void clearObject() {
        //Este procedimiento sirve para limpiar todos los campos de la ventana registro
        Calendar c1 = Calendar.getInstance();
        Integer anioCalendario = c1.get(Calendar.YEAR);

        txtNombre1.setText("");
        txtNombre2.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtTelefono.setText("+598 ");
        txtEmailConsti.setText("");
        txtEmailPers.setText("");
        txtContrasenia.setText("");
        txtContraseniaConfir.setText("");
        txtDocumento.setText("");
        cmbbTipoTutor.setSelectedIndex(0);
        cmbbArea.setSelectedIndex(0);
        anioPicker.setStartYear(anioCalendario);
        RBtnOtro.setSelected(true);
        datePicker.setLimpiarFecha(false);
        cmbbLocals.removeAllItems();
        cmbbDeptos.setSelectedIndex(0);
        cmbbItr.setSelectedIndex(0);
    }

    public boolean esMayor(int anioActual, int anioNac) {
        //Esta funcion es para devolver si una persona ya es mayor de edad
        boolean resultado = false;
        int anioLimite = anioActual - 18;
        if (anioNac <= anioLimite) {
            resultado = true;
        }
        return resultado;
    }

    public String obtenerNomUser(String mail) {
        //Esta funcion devuelve el nombre del usuario en base al mail constitucional del mismo
        String nomUsuario = "";
        mail = mail.toLowerCase();
        if (mail.contains("@estudiantes.utec.edu.uy")) {

            nomUsuario = mail.replace("@estudiantes.utec.edu.uy", "");

        } else if (mail.contains("@utec.edu.uy")) {

            nomUsuario = mail.replace("@utec.edu.uy", "");

        }
        return nomUsuario;
    }

    public int obtenerAnioNac(String fechaStr) {
        //Esta funcion devuelve el anio de nacimiento del usuario en formato int
        String anioStr = "";

        int i;
        for (i = 0; i < fechaStr.length(); i++) {
            if (i < 4) {
                anioStr = anioStr + fechaStr.charAt(i);
            }
        }
        int anio = Integer.valueOf(anioStr);

        return anio;
    }
    
    public Character generoSeleccionado() {
        //Esta funcion devuelve el genero seleccionado en formato de caracter
        
        Character genero = 'O';
        
        if (RBtnMujer.isSelected()) {
            genero ='F';
        } else if (RBtnHombre.isSelected()) {
            genero = 'M';
        } else if (RBtnNoBinario.isSelected()) {
            genero = 'N';
        }
        return genero;
    }

    public void exito(Usuarios user) {
        //Este procedimiento devuelve un mensaje de exito si el usuario ha sido habilitado y se borraran todos los datos ingresados
        
        JOptionPane.showMessageDialog(this, "Su solicitud de registro será revisada por un analista para la activación de su cuenta",
                "Usuario Registrado!", JOptionPane.INFORMATION_MESSAGE);
        
        clearObject();
    }


}
