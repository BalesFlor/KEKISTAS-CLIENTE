package com.visual;

import com.correo.EnvioDeCorreo;
import com.grsc.logica.ejb.AccionJustificacionBean;
import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.AccionJustificacion;
import com.grsc.modelo.entities.Analista;
import com.grsc.modelo.entities.Justificacion;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ventanaRegAccionJus extends javax.swing.JFrame {
    Analista analista;
    Justificacion justificacion;
    Boolean existe = false;

    public ventanaRegAccionJus(BigInteger idUser, Justificacion justificacion) {
        analista = traerUserPorID(idUser);
        this.justificacion = justificacion;
        initComponents();
    }
    
    public Analista traerUserPorID(BigInteger idUser) {
        UsuarioBean userBean = new UsuarioBean();
        AnalistaBean anaBean = new AnalistaBean();
        Analista analista = anaBean.buscarAnalista(userBean.buscarUsuario(idUser).getIdUsuario());
        return analista;
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
        btnCancelar = new rsbuttongradiente.RSButtonGradiente();
        btnEnviar = new rsbuttongradiente.RSButtonGradiente();
        labelRegistradoPor = new javax.swing.JLabel();
        labelFechaHora = new javax.swing.JLabel();
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

        iconReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_rsz_justificacion-icon2.png"))); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(817, 400));

        txtDetalles.setColumns(20);
        txtDetalles.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDetalles.setRows(5);
        txtDetalles.setText("Detalle de acción sobre justificacion...");
        jScrollPane1.setViewportView(txtDetalles);

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

        labelRegistradoPor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelRegistradoPor.setText("Registrado por:");
        labelRegistradoPor.setVisible(false);

        labelFechaHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFechaHora.setText("Fecha Hora:");
        labelFechaHora.setToolTipText("");
        labelFechaHora.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRegistradoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(265, 265, 265)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(labelRegistradoPor)
                .addGap(7, 7, 7)
                .addComponent(labelFechaHora)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Realizar acción sobre Justificación");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(iconUtec)
                        .addGap(113, 113, 113)
                        .addComponent(lblReportesTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconReclamos)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                        .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconReclamos)
                            .addComponent(lblReportesTitulo))))
                .addGap(18, 18, 18)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        AccionJustificacionBean accJusBean = new AccionJustificacionBean();
        if (txtDetalles.getText().equals("") || txtDetalles.getText().isBlank() || txtDetalles.getText().equals("Detalle de acción sobre justificacion...")) {

            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción de su acción", "Datos incompletos!",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            Object[] options = {"REGISTRAR ACCIÓN", "CANCELAR"};
            int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de las acciones realizadas?",
                    "Confirme antes de seguir...", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (respuesta == JOptionPane.YES_OPTION) {
                if (existe) {
                    Boolean seModifico = false;
                    seModifico = accJusBean.modificarAccion(justificacion, analista, txtDetalles.getText(), Calendar.getInstance().getTime());
                    if (seModifico) {
                        JOptionPane.showMessageDialog(this, "Accion sobre Justificación modificada con exito",
                                "exito", JOptionPane.INFORMATION_MESSAGE);
                        clearObject(accJusBean.buscarAccionJustificacion(justificacion, analista));
                    } else {
                        JOptionPane.showMessageDialog(this, "Hubo un error en la modificación de su Acción en la Justificacion",
                                "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {

                    Boolean seCreo = false;
                    seCreo = accJusBean.registrarAccion(justificacion, analista, txtDetalles.getText(), Calendar.getInstance().getTime());

                    if (seCreo) {
                        JOptionPane.showMessageDialog(this, "Accion sobre Justificacion enviado con exito",
                                "exito", JOptionPane.INFORMATION_MESSAGE);
                        AccionJustificacion accJus = accJusBean.buscarAccionJustificacion(justificacion, analista);
                        clearObject(accJus);
                        UsuarioBean userBean = new UsuarioBean();
                        EnvioDeCorreo enviarCorreo = new EnvioDeCorreo();
                        Usuarios user = userBean.buscarUsuario(justificacion.getIdUsuario().getIdUsuario());
                        enviarCorreo.transfer_to_email(user.getMailInstitucional(), "Estimado/a " + user.getNombre1() + " " + user.getApellido1() + ", \n"
                                + "Le informamos que se ha registrado una acción sobre su justificación relacionada al evento: " + justificacion.getIdEvento().getTitulo() + "\n resultado: " + accJus.getDetalle(),
                                "Registro de acción en su Justificación");
                    } else {
                        JOptionPane.showMessageDialog(this, "Hubo un error en el envía de su Justificacion",
                                "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Acción no realizada");
            }
        }

    }//GEN-LAST:event_btnEnviarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        AccionJustificacionBean accJusBean = new AccionJustificacionBean();
        AccionJustificacion accJus = accJusBean.buscarAccionJustificacion(justificacion, analista);
         if(accJus.getAccionJustificacionPK() != null){
             txtDetalles.setText(accJus.getDetalle());
             existe = true;
             labelRegistradoPor.setText("Registrado por: "+accJus.getAnalista().getUsuarios().getNomUsuario());
             labelRegistradoPor.setVisible(true);
             labelFechaHora.setText("Fecha Hora: "+accJus.getFechaHora().toString());
             labelFechaHora.setVisible(true);
         }
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnCancelar;
    private rsbuttongradiente.RSButtonGradiente btnEnviar;
    private javax.swing.JLabel iconReclamos;
    private javax.swing.JLabel iconUtec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFechaHora;
    private javax.swing.JLabel labelRegistradoPor;
    private javax.swing.JLabel lblReportesTitulo;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    private javax.swing.JTextArea txtDetalles;
    // End of variables declaration//GEN-END:variables

    
    public void clearObject(AccionJustificacion accJus) {
        labelRegistradoPor.setText("Registrado por: "+accJus.getAnalista().getUsuarios().getNomUsuario());
        labelRegistradoPor.setVisible(true);
        labelFechaHora.setText("Fecha Hora: "+accJus.getFechaHora().toString());
        labelFechaHora.setVisible(true);
    }
}
