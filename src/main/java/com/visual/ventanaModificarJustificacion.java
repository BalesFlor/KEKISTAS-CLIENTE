 package com.visual;

import com.grsc.logica.ejb.DocenteBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.EventoBean;
import com.grsc.logica.ejb.JustificacionBean;
import com.grsc.logica.ejb.TipoEventoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Estudiante;
import com.grsc.modelo.entities.Evento;
import com.grsc.modelo.entities.Justificacion;
import com.grsc.modelo.entities.TipoEvento;
import com.grsc.modelo.entities.Tutor;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class ventanaModificarJustificacion extends javax.swing.JFrame {

    private VentanaInternaJustificaciones ventanaInternaJustificacion;
    Usuarios usuario;
    UsuarioBean userBean= new UsuarioBean();
    Justificacion justificacion;
    Boolean seCreo = false;
    
    public ventanaModificarJustificacion(BigInteger idUser, Justificacion justificacion,VentanaInternaJustificaciones ventanaInternaJustificacion) {
        usuario = traerUserPorID(idUser);
        this.justificacion = justificacion;
        this.ventanaInternaJustificacion = ventanaInternaJustificacion;
        initComponents();
        this.cmbEvento.setSelectedItem(justificacion.getIdEvento().getTitulo());
        this.txtDetalles.setText(justificacion.getDetalle());
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
        btnCancelar = new rsbuttongradiente.RSButtonGradiente();
        btnEnviar = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        cmbEvento = new RSMaterialComponent.RSComboBoxMaterial();
        lblReportesTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        iconUtec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utec_logo_chikito.png"))); // NOI18N

        iconReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1reclamos-icon.png"))); // NOI18N

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
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                            .addComponent(cmbEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cmbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Modificar un Justificación");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(iconUtec)
                        .addGap(135, 135, 135)
                        .addComponent(lblReportesTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconReclamos)))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        JustificacionBean justificacionBean = new JustificacionBean();
        EstudianteBean estBean = new EstudianteBean();
        Estudiante est = estBean.buscarEstudiante(usuario.getIdUsuario());
        if (txtDetalles.getText().equals("") || txtDetalles.getText().equals("Aclaraciones incluyendo enlaces adjuntos...")
                || cmbEvento.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Recuerde que debe seleccionar un evento relacionado a la justificación de asistencia\n"
                    + "y una descripción de su justificacion ", "Datos incompletos!",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (cmbEvento.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Recuerde que poner el nombre del Evento correspondiente a su justificacion",
                        "Datos incompletos!", JOptionPane.WARNING_MESSAGE);
            } else {
                this.justificacion.setDetalle(this.txtDetalles.getText());
                this.justificacion.setIdEvento(eventoSeleccionado());
                this.justificacion.setFechaHora(Calendar.getInstance().getTime());
                seCreo = justificacionBean.modificarJustificacion(justificacion);
                if (seCreo) {
                    JOptionPane.showMessageDialog(this, "Justificacion modificado con exito",
                            "exito", JOptionPane.INFORMATION_MESSAGE);
                    ventanaInternaJustificacion.actualizar();
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error al modificar de su justificacion",
                            "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ventanaInternaJustificacion.actualizar();
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
    
    
}
