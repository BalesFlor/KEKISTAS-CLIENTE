package com.visual;

import com.visual.fuentes.FuenteRoboto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class VentanaInicial extends javax.swing.JFrame {
    
    private Timer t;
    private int n=0;
    
    public VentanaInicial() {
        initComponents();
        
        progressBar.setValue(0);
        progressBar.setColorBackground(new Color(0,0,0,0));
        progressBar.setBackground(new Color(0,0,0,0));
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this,false);

        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n <= 100) {
                    progressBar.setValue(n);
                    n = n + 10;
                } else {
                    t.stop();
                    dispose();
                    VentanaIniciarSesion ventanaIniciarSesion = new VentanaIniciarSesion();
                    ventanaIniciarSesion.setVisible(true);
                }
            }
        };
        
        t= new Timer(300,accion);
        t.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelCircleBorder1 = new rspanelcircleborder.RSPanelCircleBorder();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();
        progressBar = new rojerusan.componentes.RSProgressBarSinText();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelCircleBorder1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelCircleBorder1.setColorBorde(new java.awt.Color(105, 190, 228));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTEC Logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleBorder1Layout = new javax.swing.GroupLayout(rSPanelCircleBorder1);
        rSPanelCircleBorder1.setLayout(rSPanelCircleBorder1Layout);
        rSPanelCircleBorder1Layout.setHorizontalGroup(
            rSPanelCircleBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelCircleBorder1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rSPanelCircleBorder1Layout.setVerticalGroup(
            rSPanelCircleBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelCircleBorder1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        rSPanelGradiente1.add(rSPanelCircleBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 204, 192));

        progressBar.setForeground(new java.awt.Color(0, 68, 158));
        progressBar.setValue(20);
        progressBar.setColorForeground(new java.awt.Color(71, 129, 155));
        progressBar.setGrosorBorde(0);
        rSPanelGradiente1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 339, 531, 12));

        FuenteRoboto fuenteImport= new FuenteRoboto();
        jLabel1.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,20));
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("de Reclamos y Solicitudes de Constancias");
        rSPanelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 530, 50));

        jLabel2.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,20));
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplicación de Gestión");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 530, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private rojerusan.componentes.RSProgressBarSinText progressBar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    private rspanelcircleborder.RSPanelCircleBorder rSPanelCircleBorder1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    // End of variables declaration//GEN-END:variables
}
