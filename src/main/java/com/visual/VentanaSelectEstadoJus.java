package com.visual;

import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.EstadoPeticionBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Analista;
import com.grsc.modelo.entities.EstadoPeticion;
import com.grsc.modelo.entities.Justificacion;
import java.math.BigInteger;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class VentanaSelectEstadoJus extends javax.swing.JFrame {

    Analista analista;
    Justificacion justificacion;
    Boolean existe = false;

    public VentanaSelectEstadoJus(BigInteger idUser, Justificacion justificacion) {
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
        setPreferredSize(new java.awt.Dimension(600, 311));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRegistradoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRegistradoPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFechaHora)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        lblReportesTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lblReportesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportesTitulo.setText("Modificar Estado de Justificación");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblReportesTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconReclamos)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconReclamos)
                    .addComponent(lblReportesTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        
    }//GEN-LAST:event_btnEnviarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttongradiente.RSButtonGradiente btnCancelar;
    private rsbuttongradiente.RSButtonGradiente btnEnviar;
    private RSMaterialComponent.RSComboBoxMaterial cmbEstado;
    private javax.swing.JLabel iconReclamos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFechaHora;
    private javax.swing.JLabel labelRegistradoPor;
    private javax.swing.JLabel lblReportesTitulo;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    // End of variables declaration//GEN-END:variables
}
