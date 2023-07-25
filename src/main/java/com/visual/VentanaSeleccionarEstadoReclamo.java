package com.visual;

import com.correo.EnvioDeCorreo;
import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.EstadoPeticionBean;
import com.grsc.logica.ejb.ReclamoBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Analista;
import com.grsc.modelo.entities.EstadoPeticion;
import com.grsc.modelo.entities.Reclamo;
import com.grsc.modelo.entities.Usuarios;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VentanaSeleccionarEstadoReclamo extends javax.swing.JFrame {

    private VentanaInternaReclamos ventanaInternaReclamos;
    Analista analista;
    Reclamo reclamo;
    ReclamoBean recBean = new ReclamoBean();
   
    public VentanaSeleccionarEstadoReclamo(BigInteger idUser, Reclamo reclamo, VentanaInternaReclamos ventanaInternaRec) {
        analista = traerUserPorID(idUser);
        this.reclamo = reclamo;
        this.ventanaInternaReclamos = ventanaInternaRec;
        initComponents();
    }
    
    public Analista traerUserPorID(BigInteger idUser) {
        UsuarioBean userBean = new UsuarioBean();
        AnalistaBean anaBean = new AnalistaBean();
        return anaBean.buscarAnalista(userBean.buscarUsuario(idUser).getIdUsuario());
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
        labelRegistradoPor = new javax.swing.JLabel();
        labelFechaHora = new javax.swing.JLabel();
        cmbEstado = new RSMaterialComponent.RSComboBoxMaterial();
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

        iconReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_rsz_justificacion-icon2.png"))); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(817, 400));

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

        cmbEstado.setForeground(new java.awt.Color(13, 120, 161));

        EstadoPeticionBean estadoPeticionBean= new EstadoPeticionBean();

        DefaultComboBoxModel modeloEstado =new DefaultComboBoxModel();

        List<EstadoPeticion> listaEstado=estadoPeticionBean.listarEstados();

        for(int i = 0 ; i<listaEstado.size(); i++){
            modeloEstado.addElement(listaEstado.get(i).getNomEstado());
        }

        cmbEstado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        cmbEstado.setModel(modeloEstado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRegistradoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(labelRegistradoPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFechaHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Modificar Estado");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(iconUtec)
                        .addGap(18, 18, 18)
                        .addComponent(lblReportesTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(iconReclamos))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUtec)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconReclamos)
                            .addComponent(lblReportesTitulo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        if (cmbEstado.getSelectedItem().equals(reclamo.getIdEstadoPeticion().getNomEstado())) {
            
            JOptionPane.showMessageDialog(this, "Debe seleccionar un estado diferente al actual para modificar la Reclamos",
                    "Error", JOptionPane.WARNING_MESSAGE);
            
        } else {
            Boolean seModifico = false;
            EstadoPeticionBean estadoBean = new EstadoPeticionBean();
            EstadoPeticion estado = estadoBean.buscarPorNom(cmbEstado.getSelectedItem().toString());

            try {
                Date date = Calendar.getInstance().getTime();
                seModifico = recBean.modificarEstado(reclamo, estado, date);
                this.reclamo.setIdEstadoPeticion(estado);
                this.reclamo.setFechaHora(date);
            } catch (Exception ex) {
                Logger.getLogger(VentanaSeleccionarEstadoReclamo.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (seModifico) {
                JOptionPane.showMessageDialog(this, "Estado de Reclamo modificado con exito",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                ventanaInternaReclamos.actualizar();
                clearObject(recBean.buscarReclamoPorId(reclamo.getIdReclamo()));  
                
                UsuarioBean userBean = new UsuarioBean();
                EnvioDeCorreo enviarCorreo = new EnvioDeCorreo();
                Usuarios user = userBean.buscarUsuario(reclamo.getIdUsuario().getIdUsuario()); 
                enviarCorreo.transfer_to_email(user.getMailInstitucional(), "Estimado/a "+ user.getNombre1()+" "+ user.getApellido1() +", \n"
                        + "Le informamos que se ha modificado el estado de su reclamo llamado: " + reclamo.getTitulo() + " a "+estado.getNomEstado(),
                        "Cambio de Estado en su reclamo");
                           
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error en la modificación del estado del Reclamo",
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cmbEstado.setSelectedItem(reclamo.getIdEstadoPeticion().getNomEstado());
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnCancelar;
    private rsbuttongradiente.RSButtonGradiente btnEnviar;
    private RSMaterialComponent.RSComboBoxMaterial cmbEstado;
    private javax.swing.JLabel iconReclamos;
    private javax.swing.JLabel iconUtec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFechaHora;
    private javax.swing.JLabel labelRegistradoPor;
    private javax.swing.JLabel lblReportesTitulo;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    // End of variables declaration//GEN-END:variables

     public void clearObject(Reclamo rec) {
        labelRegistradoPor.setText("Registrado por: "+analista.getUsuarios().getNomUsuario());
        labelRegistradoPor.setVisible(true);
        labelFechaHora.setText("Fecha Hora: "+rec.getFechaHora().toString());
        labelFechaHora.setVisible(true);
        cmbEstado.setSelectedItem(rec.getIdEstadoPeticion().getNomEstado());
    }
     
}
