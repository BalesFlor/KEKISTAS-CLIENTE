package com.visual;

import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.JustificacionBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Estudiante;
import com.grsc.modelo.entities.Evento;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ventanaAltaJustificacion extends javax.swing.JFrame {
    private VentanaInternaJustificaciones ventanaInternaJustificaciones;
    Usuarios usuario;
    UsuarioBean userBean = new UsuarioBean();

    public ventanaAltaJustificacion(BigInteger idUser, VentanaInternaJustificaciones ventanaInternaJus) {
        usuario = traerUserPorID(idUser);
        this.ventanaInternaJustificaciones = ventanaInternaJus;
        initComponents();
    }

    public Usuarios traerUserPorID(BigInteger idUser) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        cmbEvento = new RSMaterialComponent.RSComboBoxMaterial();
        btnCancelar = new rsbuttongradiente.RSButtonGradiente();
        btnEnviar = new rsbuttongradiente.RSButtonGradiente();
        lblReportesTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        iconUtec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utec_logo_chikito.png"))); // NOI18N

        iconReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_rsz_justificacion-icon2.png"))); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(817, 400));

        txtDetalles.setColumns(20);
        txtDetalles.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDetalles.setRows(5);
        txtDetalles.setText("Aclaraciones incluyendo enlaces adjuntos...");
        jScrollPane1.setViewportView(txtDetalles);

        cmbEvento.setForeground(new java.awt.Color(0, 112, 192));
        EventoBean eventoBean= new EventoBean();

        DefaultComboBoxModel modeloEvento=new DefaultComboBoxModel();

        List<Evento> listaEventos = eventoBean.listarEventos();

        modeloEvento.addElement("Seleccione un Evento*");

        for(int i = 0 ; i<listaEventos.size(); i++){
            modeloEvento.addElement(listaEventos.get(i).getTitulo());
        }
        cmbEvento.setModel(modeloEvento);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addComponent(cmbEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cmbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Realizar Justificacion");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(iconUtec)
                        .addGap(192, 192, 192)
                        .addComponent(lblReportesTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconReclamos)))
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        JustificacionBean jusBean = new JustificacionBean();

        EstudianteBean estBean = new EstudianteBean();
        Estudiante est = estBean.buscarEstudiante(usuario.getIdUsuario());

        if (eventoSeleccionado() == null) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un evento", "Datos incompletos!",
                    JOptionPane.WARNING_MESSAGE);

        } else {

            if (txtDetalles.getText().equals("") || txtDetalles.getText().isBlank() || txtDetalles.getText().equals("Aclaraciones incluyendo enlaces adjuntos...")) {

                JOptionPane.showMessageDialog(this, "Debe ingresar una aclaración con su justificación", "Datos incompletos!",
                        JOptionPane.WARNING_MESSAGE);

            } else {

                Boolean seCreo = false;
                try {
                    seCreo = jusBean.hacerJustificacion(Calendar.getInstance().getTime(), txtDetalles.getText(), eventoSeleccionado(), est);
                } catch (ParseException ex) {
                    Logger.getLogger(ventanaAltaReclamo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (seCreo) {
                    JOptionPane.showMessageDialog(this, "Justificacion enviado con exito",
                            "exito", JOptionPane.INFORMATION_MESSAGE);
                    clearObject();
                    ventanaInternaJustificaciones.actualizar();
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error en el envía de su Justificacion",
                            "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       ventanaInternaJustificaciones.actualizar();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnCancelar;
    private rsbuttongradiente.RSButtonGradiente btnEnviar;
    private RSMaterialComponent.RSComboBoxMaterial cmbEvento;
    private javax.swing.JLabel iconReclamos;
    private javax.swing.JLabel iconUtec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReportesTitulo;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    private javax.swing.JTextArea txtDetalles;
    // End of variables declaration//GEN-END:variables

    public Evento eventoSeleccionado() {
        /* Este método es para encontrar el Area que ha sido seleccionado del comboBox de Area, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Area
        EventoBean eventoBean = new EventoBean();

        //Se carga una lista con todas las Areas
        List<Evento> listaEvento = eventoBean.listarEventos();
        Evento evento = null;

        //En el siguiente for se pasa por todas las areas de la lista
        for (int i = 0; i < listaEvento.size(); i++) {
            //Si el nombre de la Area coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEvento.get(i).getTitulo().equals(cmbEvento.getSelectedItem().toString())) {
                evento = listaEvento.get(i);
            }
        }

        return evento;
    }
    
    public void clearObject() {
        txtDetalles.setText("Aclaraciones incluyendo enlaces adjuntos...");
        cmbEvento.setSelectedIndex(0);
    }
}
