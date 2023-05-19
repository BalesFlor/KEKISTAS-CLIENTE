/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author fbale
 */
public class VentanaReg extends javax.swing.JFrame {

    public VentanaReg() {
        initComponents();
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
        datePicker = new rojerusan.RSDateChooser();
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
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();

        buttonGroup1.add(this.RBtnMujer);
        buttonGroup1.add(this.RBtnHombre);
        buttonGroup1.add(this.RBtnNoBinario);
        buttonGroup1.add(this.RBtnOtro);
        this.RBtnOtro.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        datePicker.setColorBackground(new java.awt.Color(0, 173, 239));
        datePicker.setColorButtonHover(new java.awt.Color(0, 69, 95));
        datePicker.setColorDiaActual(new java.awt.Color(0, 204, 51));
        datePicker.setPlaceholder("Fecha de Nacimiento");

        txtDocumento.setForeground(new java.awt.Color(0, 69, 95));
        txtDocumento.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtDocumento.setBotonColor(new java.awt.Color(0, 173, 239));
        txtDocumento.setPlaceholder("Cédula de identidad*");
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
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

        txtNombre2.setForeground(new java.awt.Color(0, 69, 95));
        txtNombre2.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtNombre2.setBotonColor(new java.awt.Color(0, 173, 239));
        txtNombre2.setPlaceholder("Segundo Nombre");

        txtApellido1.setForeground(new java.awt.Color(0, 69, 95));
        txtApellido1.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtApellido1.setBotonColor(new java.awt.Color(0, 173, 239));
        txtApellido1.setPlaceholder("Primer Apellido*");

        txtApellido2.setForeground(new java.awt.Color(0, 69, 95));
        txtApellido2.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtApellido2.setBotonColor(new java.awt.Color(0, 173, 239));
        txtApellido2.setPlaceholder("Segundo Apellido*");
        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
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

        txtEmailPers.setForeground(new java.awt.Color(0, 69, 95));
        txtEmailPers.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtEmailPers.setBotonColor(new java.awt.Color(0, 173, 239));
        txtEmailPers.setPlaceholder("CorreoPersonal@Ejemplo.com*");
        txtEmailPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailPersActionPerformed(evt);
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
                            .addComponent(cmbbTipoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenero)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(txtContraseniaConfir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblNota))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        UsuarioBean userBean = new UsuarioBean();
        validador validador = new validador();

        String documento = this.txtDocumento.getText();
        String nombre1 = this.txtNombre1.getText();
        String nombre2 = this.txtNombre2.getText();
        String apellido1 = this.txtApellido1.getText();
        String apellido2 = this.txtApellido2.getText();
        String emailConsti = this.txtEmailConsti.getText();
        String emailPers = this.txtEmailPers.getText();
        String telefono = this.txtTelefono.getText();
        String contrasenia1 = this.txtContrasenia.getText();
        String contrasenia2 = this.txtContraseniaConfir.getText();
        String fecNac = this.datePicker.getFechaSeleccionada();
        BigInteger idEstado = BigInteger.valueOf(1L);
        EstadoUsuario estado = new EstadoUsuario(idEstado);

        // Verificamos que ninguno de los campos está en blanco
        if (nombre1.isBlank() || apellido1.isBlank() || apellido2.isBlank() || emailConsti.isBlank() || emailPers.isBlank()
                || telefono.isBlank() || fecNac.isBlank() || contrasenia1.isBlank() || contrasenia2.isBlank()
                || documento.isBlank()) {

            JOptionPane.showMessageDialog(this, "Debe completar todos los datos solicitados.", "Datos incompletos!",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            /*si no hay campos en blanco...
            ...verificamos que un apellido tenga un largo entre 21 y 3 caracteres*/

            if (!validador.validarLargoCampos(nombre1, apellido1, apellido2, contrasenia1)) {

                JOptionPane.showMessageDialog(this, "Largo de campos incorrectos:"
                        + "\nTodos los campos de texto exceptuando la contraseña deben tener de 3 a 30 caracteres."
                        + " \nLa contraseña debe tener de 3 a 50 caracteres", "Datos Erroneos!",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                /*si el largo de los campos es correcto...
                ...verificamos el formato de la cédula*/

                if (!validador.validarCi(documento)) {

                    JOptionPane.showMessageDialog(this, "Formato de campo Documento incorrecto, formato esperado 1.111.111-1", "Datos Erroneos!",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    /*si la cedula es correcta...
                    ...verificamos el formato del celular*/

                    if (!validador.validarTelefono(telefono)) {

                        JOptionPane.showMessageDialog(this, "Formato de campo Telefono incorrecto, formato esperado +598 99 999 999", "Datos Erroneos!",
                                JOptionPane.WARNING_MESSAGE);

                    } else {
                        /*si el celular es correcto...
                        ...verificamos el formato del mail
                         */
                        if (!validador.validarMailConsti(emailConsti)) {
                            JOptionPane.showMessageDialog(this, "Correo Constitucional inválido, solo se permite el ingreso de los correos: "
                                    + "\n@estudiantes.utec.edu.uy "
                                    + "\n@utec.edu.uy", "Datos Erroneos!",
                                    JOptionPane.WARNING_MESSAGE);

                        } else {
                            /*si el mail constitucional es correcto...
                            ...verificamos el mail personal*/

                            if (!validador.validarMailPers(emailPers)) {

                                JOptionPane.showMessageDialog(this, "Correo Personal inválido, solo se permite el ingreso de los correos: "
                                        + "\n@gmail.com"
                                        + "\n@hotmail.com"
                                        + "\n@outlook.com", "Datos Erroneos!",
                                        JOptionPane.WARNING_MESSAGE);

                            } else {
                                /*si el mail personal es correcto...
                                ...validamos que las contraseñas sean iguales*/

                                if (!validador.validarContrasenia(contrasenia1, contrasenia2)) {

                                    JOptionPane.showMessageDialog(this, "Contraseña inválida, las contraseñas no coinciden"
                                            + "\npor favor, vuelva a ingresar la contraseña", "Datos Erroneos!",
                                            JOptionPane.WARNING_MESSAGE);

                                } else {
                                    /*si la contraseña es correcta...
                                    ...validamos que la fecha de nacimiento ingresada sea la de una persona mayor de edad*/

                                    Calendar c1 = Calendar.getInstance();
                                    Integer anioCalendario = c1.get(Calendar.YEAR);
                                    int anioNac = obtenerAnioNac(fecNac);
                                    Integer anioIngreso = this.anioPicker.getYear();

                                    if (!esMayor(anioCalendario, anioNac)) {

                                        JOptionPane.showMessageDialog(this, "Fecha de Nacimiento erronea, debe tener 18 años,"
                                                + " o más, para registrarse", "Datos Erroneos!",
                                                JOptionPane.WARNING_MESSAGE);

                                    } else {
                                        /*si la persona es mayor...
                                        ...validamos que se seleccionen los combobox*/

                                        if (cmbbDeptos.getSelectedItem().equals("Seleccione un Departamento*") || cmbbLocals.getSelectedItem().equals("Seleccione una localidad*")
                                                || cmbbItr.getSelectedItem().equals("Seleccione un ITR*")) {

                                            JOptionPane.showMessageDialog(this, "Asegurese de seleccionar una localidad, un itr, un departamento!",
                                                    "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                        } else {
                                            /*si las combobox se seleccionaron...
                                            ...validamos que no exista un usuario ya registrado con la cédula ingresada*/

                                            if (userBean.existeUserByDoc(documento)) {

                                                JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con esa cédula!",
                                                        "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                            } else {
                                                /*si la cedula no existe en la base de datos...
                                                ...validamos que no exista un usuario ya registrado con el mail constitucional ingresado*/

                                                if (userBean.existeUserByMailC(emailConsti)) {

                                                    JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con ese mail constitucional!",
                                                            "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                                } else {
                                                    /*si el mail constitucional no existe en la base de datos...
                                                    ...validamos que no exista un usuario ya registrado con el mail personal ingresado*/

                                                    if (userBean.existeUserByMailP(emailPers)) {

                                                        JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con ese mail personal!",
                                                                "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                                    } else {
                                                        /*si el mail personal no existe en la base de datos...
                                                        ...validamos que no exista un usuario ya registrado con el telefono ingresado*/

                                                        if (userBean.existeUserByTel(telefono)) {

                                                            JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con ese telefono!",
                                                                    "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                                        } else {
                                                            /*si no existe un usuario que exista en la base de datos con ese telefono, 
                                                            se ejecuta el siguiente código*/

                                                            boolean registroHabilitado = false;

                                                            //Si es un Docente, tendrá que seleccionar un tipo de tutor y un area.
                                                            if (cmbRol.getSelectedItem().equals("DOCENTE")) {

                                                                //Aparecerá mensaje de "Datos Incompletos!" si el docente no ingresa el Tipo de Tutor
                                                                if (cmbbTipoTutor.getSelectedItem().equals("Seleccione Tipo de Tutor*")) {

                                                                    JOptionPane.showMessageDialog(this, "Asegurese de seleccionar un Tipo Tutor!",
                                                                            "Datos Incompletos!", JOptionPane.WARNING_MESSAGE);

                                                                    //Aparecerá mensaje de "Datos Incompletos!" si el docente no ingresa el Area
                                                                } else if (cmbbArea.getSelectedItem().equals("Seleccione Area*")) {

                                                                    JOptionPane.showMessageDialog(this, "Asegurese de seleccionar una Area!",
                                                                            "Datos Incompletos!", JOptionPane.WARNING_MESSAGE);

                                                                    //Si completa los datos de "Area" y "Tipo de Tutor" se le habilitará el registro al docente
                                                                } else {

                                                                    registroHabilitado = true;
                                                                }

                                                            } //Si es un Estudiante, tendrá que poner el año de ingreso a la facultad
                                                            else if (cmbRol.getSelectedItem().equals("ESTUDIANTE")) {

                                                                //Si el año ingresado es mayor al año del calendario aparecerá un mensaje de error
                                                                if (anioIngreso > anioCalendario || anioIngreso < 2012) {
                                                                    JOptionPane.showMessageDialog(this, "Asegurese de seleccionar un año de ingreso correcto!",
                                                                            "Datos Erroneos!", JOptionPane.WARNING_MESSAGE);

                                                                    //Si el año ingresado es menor al año de nacido del estudiante aparecerá un mensaje de error
                                                                } else if (!esMayor(anioIngreso, anioNac)) {
                                                                    JOptionPane.showMessageDialog(this, "Fecha de Nacimiento erronea, debe haber una diferencia de 18 años,"
                                                                            + " o más, con el año en que se registró a la carrera", "Datos Erroneos!",
                                                                            JOptionPane.WARNING_MESSAGE);

                                                                    //Si el año ingresado es válido el registro del estudiante será válido
                                                                } else {
                                                                    registroHabilitado = true;
                                                                }

                                                            } /*Si es un Analista, no tendrá que completar ningún campo además
                                                            de los que tiene en común con el resto de roles*/ else if (cmbRol.getSelectedItem().equals("ANALISTA")) {
                                                                registroHabilitado = true;

                                                            } //Si no selecciona ningún rol aparecerá un mensaje de "Datos Incompletos!"
                                                            else {
                                                                JOptionPane.showMessageDialog(this, "Asegurese de seleccionar un rol!",
                                                                        "Datos Incompletos!", JOptionPane.WARNING_MESSAGE);
                                                            }

                                                            //Este valor determinara si el usuario tiene permitido registrarse
                                                            if (registroHabilitado) {

                                                                Roles rol = rolSeleccionado();
                                                                Character genero = generoSeleccionado();
                                                                Itr itr = itrSeleccionado();
                                                                Departamento depto = deptoSeleccionado();
                                                                Localidad local = localSeleccionada();

                                                                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
                                                                Date fechaNac = null;

                                                                try {
                                                                    fechaNac = formatter.parse(fecNac);
                                                                } catch (ParseException ex) {
                                                                    Logger.getLogger(VentanaReg.class.getName()).log(Level.SEVERE, null, ex);
                                                                }

                                                                String nomUser = obtenerNomUser(emailConsti);

                                                                System.out.println(nomUser);
                                                                boolean almacenado = false;

                                                                try {
                                                                    almacenado = userBean.registrarUsuario(nomUser, apellido1, nombre2, nombre1, fechaNac, contrasenia1, genero, emailConsti,
                                                                            telefono, documento, apellido2, emailPers, estado, depto, itr, local, rol);
                                                                } catch (ParseException ex) {
                                                                    Logger.getLogger(VentanaReg.class.getName()).log(Level.SEVERE, null, ex);
                                                                }
                                                                /*String nomUsuario, String apellido1, String nombre2, 
                                                                String nombre1, Date fecNac, String contrasenia, Character genero,
                                                                String mailInstitucional, String telefono, String documento, String apellido2, 
                                                                String mailPersonal, EstadoUsuario idEstadoUsuario,  
                                                                        Departamento departamento, Itr Itr, Localidad Localidad, Roles Rol) {*/

                                                                //Si se logra almacenar el usuario se muestra mensaje de éxito
                                                                if (!almacenado) {

                                                                    JOptionPane.showMessageDialog(this, "No se ha podido registrar el usuario, verifique los datos", "Datos Erroneos!",
                                                                            JOptionPane.WARNING_MESSAGE);
                                                                } else {
                                                                    String documento2 = this.txtDocumento.getText();

                                                                    Usuarios user = userBean.obtenerPorCI(documento2);

                                                                    //Si el usuario es un docente se llama a un bean de sesion remoto DocenteBean
                                                                    if (rol.getNombre().equals("DOCENTE")) {

                                                                        DocenteBean docenteBean = new DocenteBean();

                                                                        TipoTutor tipo = TipoTutorSeleccionado();
                                                                        Area area = areaSeleccionada();

                                                                        //Intentamos ingresar al docente en la Base de Datos
                                                                        try {
                                                                            boolean docenteIngresado = docenteBean.ingresarDocente(user.getIdUsuario(), tipo, area);

                                                                            if (docenteIngresado) {
                                                                                //Si el docente se ingresa exitosamente, se llama al método "exito()" que manda un mensaje de éxito.
                                                                                exito(user);

                                                                            } else {
                                                                                /*Si el docente no se ingresa exitosamente, aparece un mensaje de fracaso y se elimina el usuario
                                                                                previamente creado.*/

                                                                                userBean.eliminarUser(user.getIdUsuario());

                                                                                JOptionPane.showMessageDialog(null, "No se ha podido registrar el docente, "
                                                                                        + "verifique los datos", "Datos erroneos!", 0);

                                                                            }
                                                                        } catch (Exception e) {
                                                                            /*Si ocurre un error cuando se llame al método del bean de sesión aparecerá este mensaje en pantalla
                                                                            y posteriormente se borrará el usuario preeviamente creado.*/

                                                                            userBean.eliminarUser(user.getIdUsuario());

                                                                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el ingreso del docente "
                                                                                    + "a la Base de Datos", "Datos erroneos!", 0);

                                                                        }

                                                                    } //Si el usuario es un estudiante se llama a un bean de sesion remoto EstudianteBean
                                                                    else if (rol.getNombre().equals("ESTUDIANTE")) {

                                                                        EstudianteBean estudianteBean = new EstudianteBean();

                                                                        BigInteger anioBigInt = BigInteger.valueOf(anioIngreso);
                                                                        GeneracionBean genBean = new GeneracionBean();
                                                                        Generacion gen = genBean.buscarGen(anioBigInt);

                                                                        //Intentamos ingresar al estudiante en la Base de Datos
                                                                        try {
                                                                            boolean estudianteIngresado = estudianteBean.ingresarEstudiante(user.getIdUsuario(), gen);

                                                                            if (estudianteIngresado) {
                                                                                //Si el estudiante se ingresa exitosamente, se llama al método "exito()" que manda un mensaje de éxito.
                                                                                exito(user);

                                                                            } else {
                                                                                /*Si el estudiante no se ingresa exitosamente, aparece un mensaje de fracaso y se elimina el usuario 
                                                                                previamente creado.*/

                                                                                userBean.eliminarUser(user.getIdUsuario());

                                                                                JOptionPane.showMessageDialog(null, "No se ha podido registrar el estudiante, "
                                                                                        + "verifique los datos", "Datos erroneos!", 0);

                                                                            }
                                                                        } catch (Exception e) {
                                                                            /*Si ocurre un error cuando se llame al método del bean de sesión aparecerá este mensaje en pantalla 
                                                                            y posteriormente se borrará el usuario preeviamente creado.*/

                                                                            userBean.eliminarUser(user.getIdUsuario());

                                                                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el ingreso del estudiante "
                                                                                    + "a la Base de Datos", "Datos erroneos!", 0);

                                                                        }
                                                                    } //Si el usuario es un analista se llama a un bean de sesion remoto AnalistaBean
                                                                    else if (rol.getNombre().equals("ANALISTA")) {

                                                                        AnalistaBean analistaBean = new AnalistaBean();

                                                                        try {
                                                                            boolean analistaIngresado = analistaBean.ingresarAnalista(user.getIdUsuario());

                                                                            if (analistaIngresado) {
                                                                                //Si el analista se ingresa exitosamente, se llama al método "exito()" que manda un mensaje de éxito.
                                                                                exito(user);

                                                                            } else {
                                                                                /*Si el analista no se ingresa exitosamente, aparece un mensaje de fracaso y se elimina el usuario 
                                                                                previamente creado.*/
                                                                                userBean.eliminarUser(user.getIdUsuario());

                                                                                JOptionPane.showMessageDialog(null, "No se ha podido registrar el analista, "
                                                                                        + "verifique los datos", "Datos erroneos!", 0);

                                                                            }
                                                                        } catch (Exception e) {
                                                                            /*Si ocurre un error cuando se llame al método del bean de sesión aparecerá este mensaje en pantalla 
                        y posteriormente se borrará el usuario preeviamente creado.*/

                                                                            userBean.eliminarUser(user.getIdUsuario());

                                                                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el ingreso del analista "
                                                                                    + "a la Base de Datos", "Datos erroneos!", 0);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReg().setVisible(true);
            }
        });
    }

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

        System.out.println(itr.getNomItr());
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

        System.out.println(depto.getNomDepartamento());
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

        System.out.println(local.getNomLocalidad());

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

        System.out.println(tipoTutor.getNomTipoTutor());

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

        System.out.println(area.getNomArea());

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
