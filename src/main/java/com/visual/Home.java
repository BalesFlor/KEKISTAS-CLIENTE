package com.visual;

import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Usuarios;
import java.awt.Color;
import java.math.BigInteger;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {
    
    Usuarios usuario;
    UsuarioBean userBean= new UsuarioBean();
    String[] ventanasInternas = new String[] {"Usuarios","Constancias","Eventos","Justificaciones","Reportes","Reclamos", "Listas Mantenimiento", "Usuario Propio"};
    String ventanaAbierta = "";
    VentanaInternaUsuarios ventanaUsers;
    VentanaInternaReclamos ventanaReclamos;
    VentanaInternaJustificaciones ventanaJustificaciones;
    InternalFrameListasMantenimiento ventanaListasM;
    
    public Home(BigInteger idUser) {
        usuario=traerUserPorID(idUser);
        initComponents();
    }
    
    public Usuarios traerUserPorID(BigInteger idUser){
        return userBean.buscarUsuario(idUser);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidepanel = new rspanelgradiente.RSPanelGradiente();
        imgUTECLogo = new javax.swing.JLabel();
        btnListasMantenimiento = new javax.swing.JPanel();
        lblBtnReclamos1 = new javax.swing.JLabel();
        imgBtnReclamos1 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        imgBtnUsuario = new javax.swing.JLabel();
        lblBtnUsuario = new javax.swing.JLabel();
        btnEventos = new javax.swing.JPanel();
        imgBtnEvento = new javax.swing.JLabel();
        lblBtnEventos = new javax.swing.JLabel();
        btnConstancias = new javax.swing.JPanel();
        imgBtnConstancias = new javax.swing.JLabel();
        lblBtnConstancias1 = new javax.swing.JLabel();
        btnReclamos = new javax.swing.JPanel();
        imgBtnReclamos = new javax.swing.JLabel();
        lblBtnReclamos = new javax.swing.JLabel();
        btnJustificaciones = new javax.swing.JPanel();
        imgBtnJustificaciones = new javax.swing.JLabel();
        lblBtnJustificaciones = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        imgBtnReportes = new javax.swing.JLabel();
        lblBtnReportes = new javax.swing.JLabel();
        titlepanel = new rspanelgradiente.RSPanelGradiente();
        lblTitle = new javax.swing.JLabel();
        lblRuta = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        imgBtnUsuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(105, 190, 228));
        sidepanel.setForeground(new java.awt.Color(105, 190, 228));
        sidepanel.setColorPrimario(new java.awt.Color(105, 190, 228));
        sidepanel.setColorSecundario(new java.awt.Color(105, 190, 228));
        sidepanel.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        imgUTECLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1utec_logo.png"))); // NOI18N

        btnListasMantenimiento.setBackground(new java.awt.Color(105, 190, 228));
        btnListasMantenimiento.setForeground(new java.awt.Color(105, 190, 228));
        btnListasMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListasMantenimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListasMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListasMantenimientoMouseExited(evt);
            }
        });

        lblBtnReclamos1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnReclamos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnReclamos1.setText("Listas Mantenimiento");

        imgBtnReclamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1reclamos-icon.png"))); // NOI18N

        javax.swing.GroupLayout btnListasMantenimientoLayout = new javax.swing.GroupLayout(btnListasMantenimiento);
        btnListasMantenimiento.setLayout(btnListasMantenimientoLayout);
        btnListasMantenimientoLayout.setHorizontalGroup(
            btnListasMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListasMantenimientoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(imgBtnReclamos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnReclamos1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        btnListasMantenimientoLayout.setVerticalGroup(
            btnListasMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListasMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnReclamos1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btnListasMantenimientoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblBtnReclamos1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUsuario.setBackground(new java.awt.Color(105, 190, 228));
        btnUsuario.setForeground(new java.awt.Color(105, 190, 228));
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseExited(evt);
            }
        });

        imgBtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_users-icon.png"))); // NOI18N

        lblBtnUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnUsuario.setText("Usuarios");

        javax.swing.GroupLayout btnUsuarioLayout = new javax.swing.GroupLayout(btnUsuario);
        btnUsuario.setLayout(btnUsuarioLayout);
        btnUsuarioLayout.setHorizontalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imgBtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnUsuario)
                .addGap(216, 216, 216))
        );
        btnUsuarioLayout.setVerticalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(btnUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBtnUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEventos.setBackground(new java.awt.Color(105, 190, 228));
        btnEventos.setForeground(new java.awt.Color(105, 190, 228));
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEventosMouseExited(evt);
            }
        });

        imgBtnEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1calendar_icon.png"))); // NOI18N

        lblBtnEventos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnEventos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnEventos.setText("Eventos");

        javax.swing.GroupLayout btnEventosLayout = new javax.swing.GroupLayout(btnEventos);
        btnEventos.setLayout(btnEventosLayout);
        btnEventosLayout.setHorizontalGroup(
            btnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEventosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imgBtnEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnEventos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEventosLayout.setVerticalGroup(
            btnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEventosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnEventos)
                .addGap(21, 21, 21))
        );

        btnConstancias.setBackground(new java.awt.Color(105, 190, 228));
        btnConstancias.setForeground(new java.awt.Color(105, 190, 228));
        btnConstancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConstanciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConstanciasMouseExited(evt);
            }
        });

        imgBtnConstancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/constancia-icon.png"))); // NOI18N

        lblBtnConstancias1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnConstancias1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias1.setText("Constancias");

        javax.swing.GroupLayout btnConstanciasLayout = new javax.swing.GroupLayout(btnConstancias);
        btnConstancias.setLayout(btnConstanciasLayout);
        btnConstanciasLayout.setHorizontalGroup(
            btnConstanciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConstanciasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imgBtnConstancias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnConstancias1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnConstanciasLayout.setVerticalGroup(
            btnConstanciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConstanciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnConstancias, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btnConstanciasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblBtnConstancias1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReclamos.setBackground(new java.awt.Color(105, 190, 228));
        btnReclamos.setForeground(new java.awt.Color(105, 190, 228));
        btnReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReclamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReclamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReclamosMouseExited(evt);
            }
        });

        imgBtnReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1reclamos-icon.png"))); // NOI18N

        lblBtnReclamos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnReclamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnReclamos.setText("Reclamos");

        javax.swing.GroupLayout btnReclamosLayout = new javax.swing.GroupLayout(btnReclamos);
        btnReclamos.setLayout(btnReclamosLayout);
        btnReclamosLayout.setHorizontalGroup(
            btnReclamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReclamosLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(imgBtnReclamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnReclamos)
                .addGap(156, 156, 156))
        );
        btnReclamosLayout.setVerticalGroup(
            btnReclamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReclamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnReclamos, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReclamosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnReclamos)
                .addGap(27, 27, 27))
        );

        btnJustificaciones.setBackground(new java.awt.Color(105, 190, 228));
        btnJustificaciones.setForeground(new java.awt.Color(105, 190, 228));
        btnJustificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJustificacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJustificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJustificacionesMouseExited(evt);
            }
        });

        imgBtnJustificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_rsz_justificacion-icon2.png"))); // NOI18N

        lblBtnJustificaciones.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnJustificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnJustificaciones.setText("Justificaciones");

        javax.swing.GroupLayout btnJustificacionesLayout = new javax.swing.GroupLayout(btnJustificaciones);
        btnJustificaciones.setLayout(btnJustificacionesLayout);
        btnJustificacionesLayout.setHorizontalGroup(
            btnJustificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnJustificacionesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imgBtnJustificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnJustificaciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnJustificacionesLayout.setVerticalGroup(
            btnJustificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnJustificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnJustificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnJustificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnJustificaciones)
                .addGap(17, 17, 17))
        );

        btnReportes.setBackground(new java.awt.Color(105, 190, 228));
        btnReportes.setForeground(new java.awt.Color(105, 190, 228));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });

        imgBtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_report.png"))); // NOI18N

        lblBtnReportes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnReportes.setText("Reportes");

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imgBtnReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnReportes)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnReportes)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConstancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnJustificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListasMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgUTECLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addComponent(imgUTECLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConstancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJustificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListasMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        background.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 270, 660));
        sidepanel.getAccessibleContext().setAccessibleDescription("");

        titlepanel.setColorPrimario(new java.awt.Color(213, 240, 252));
        titlepanel.setColorSecundario(new java.awt.Color(105, 190, 228));
        titlepanel.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_3);

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 51));
        lblTitle.setText("Home");

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addContainerGap(901, Short.MAX_VALUE))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(titlepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1050, 120));

        lblRuta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblRuta.setText("Home/");
        background.add(lblRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(26, 73, 94));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreUsuario.setText(usuario.getNomUsuario());
        lblNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNombreUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNombreUsuarioMouseExited(evt);
            }
        });
        background.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 4, 142, 40));

        imgBtnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_2user-icon.png"))); // NOI18N
        background.add(imgBtnUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  
        
    }//GEN-LAST:event_formWindowActivated

    private void lblNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseClicked
        dispose();
        /*
        VentanaModificarUsuario VentanaModUsuario= new VentanaModificarUsuario();
        
        VentanaModUsuario.setVisible(true);
        */
    }//GEN-LAST:event_lblNombreUsuarioMouseClicked

    private void lblNombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseEntered
        lblNombreUsuario.setForeground(new Color(0,0,51));
        lblNombreUsuario.setText("<HTML><u>"+ usuario.getNomUsuario() +"</u></HTML>");
    }//GEN-LAST:event_lblNombreUsuarioMouseEntered

    private void lblNombreUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseExited
        lblNombreUsuario.setForeground(new Color(13,120,161));
        lblNombreUsuario.setText(usuario.getNomUsuario());
    }//GEN-LAST:event_lblNombreUsuarioMouseExited

    private void btnConstanciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConstanciasMouseEntered
        arribaDeBoton(btnConstancias);
    }//GEN-LAST:event_btnConstanciasMouseEntered

    private void btnConstanciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConstanciasMouseExited
        fueraDeBoton(btnConstancias);
    }//GEN-LAST:event_btnConstanciasMouseExited

    private void btnEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseEntered
        arribaDeBoton(btnEventos);
    }//GEN-LAST:event_btnEventosMouseEntered

    private void btnEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseExited
        fueraDeBoton(btnEventos);
    }//GEN-LAST:event_btnEventosMouseExited

    private void btnJustificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJustificacionesMouseEntered
        arribaDeBoton(btnJustificaciones);
    }//GEN-LAST:event_btnJustificacionesMouseEntered

    private void btnJustificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJustificacionesMouseExited
        fueraDeBoton(btnJustificaciones);
    }//GEN-LAST:event_btnJustificacionesMouseExited

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        fueraDeBoton(btnReportes);
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        arribaDeBoton(btnReportes);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReclamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamosMouseEntered
        arribaDeBoton(btnReclamos);
    }//GEN-LAST:event_btnReclamosMouseEntered

    private void btnReclamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamosMouseExited
        fueraDeBoton(btnReclamos);
    }//GEN-LAST:event_btnReclamosMouseExited

    private void btnUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseEntered
        arribaDeBoton(btnUsuario);
    }//GEN-LAST:event_btnUsuarioMouseEntered

    private void btnUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseExited
       fueraDeBoton(btnUsuario);        
    }//GEN-LAST:event_btnUsuarioMouseExited

    private void arribaDeBoton(JPanel boton){
        Color color= new Color(47,165,217);
        boton.setBackground(color);
    }
    
    private void fueraDeBoton(JPanel boton){
        Color color= new Color(105,190,228);
        boton.setBackground(color);
    }
    
    private void btnListasMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListasMantenimientoMouseEntered
        arribaDeBoton(btnListasMantenimiento);
    }//GEN-LAST:event_btnListasMantenimientoMouseEntered

    private void btnListasMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListasMantenimientoMouseExited
        fueraDeBoton(btnListasMantenimiento);
    }//GEN-LAST:event_btnListasMantenimientoMouseExited

    private void btnReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamosMouseClicked
        cerrarVentanas(ventanaAbierta);
        this.ventanaAbierta = ventanasInternas[5];
        ventanaReclamos = new VentanaInternaReclamos();
        background.add(ventanaReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaReclamos.setVisible(true);
    }//GEN-LAST:event_btnReclamosMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        cerrarVentanas(ventanaAbierta);
        this.ventanaAbierta = ventanasInternas[0];
        ventanaUsers = new VentanaInternaUsuarios();
        background.add(ventanaUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaUsers.setVisible(true);
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnListasMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListasMantenimientoMouseClicked
        cerrarVentanas(ventanaAbierta);
        this.ventanaAbierta = ventanasInternas[6];
        ventanaListasM = new InternalFrameListasMantenimiento();
        background.add(ventanaListasM, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaListasM.setVisible(true);
    }//GEN-LAST:event_btnListasMantenimientoMouseClicked

    private void btnJustificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJustificacionesMouseClicked
        cerrarVentanas(ventanaAbierta);
        this.ventanaAbierta = ventanasInternas[5];
        ventanaJustificaciones = new VentanaInternaJustificaciones();
        background.add(ventanaJustificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 1060, 490));
        ventanaJustificaciones.setVisible(true);
    }//GEN-LAST:event_btnJustificacionesMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnConstancias;
    private javax.swing.JPanel btnEventos;
    private javax.swing.JPanel btnJustificaciones;
    private javax.swing.JPanel btnListasMantenimiento;
    private javax.swing.JPanel btnReclamos;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JLabel imgBtnConstancias;
    private javax.swing.JLabel imgBtnEvento;
    private javax.swing.JLabel imgBtnJustificaciones;
    private javax.swing.JLabel imgBtnReclamos;
    private javax.swing.JLabel imgBtnReclamos1;
    private javax.swing.JLabel imgBtnReportes;
    private javax.swing.JLabel imgBtnUsuario;
    private javax.swing.JLabel imgBtnUsuario1;
    private javax.swing.JLabel imgUTECLogo;
    private javax.swing.JLabel lblBtnConstancias1;
    private javax.swing.JLabel lblBtnEventos;
    private javax.swing.JLabel lblBtnJustificaciones;
    private javax.swing.JLabel lblBtnReclamos;
    private javax.swing.JLabel lblBtnReclamos1;
    private javax.swing.JLabel lblBtnReportes;
    private javax.swing.JLabel lblBtnUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTitle;
    private rspanelgradiente.RSPanelGradiente sidepanel;
    private rspanelgradiente.RSPanelGradiente titlepanel;
    // End of variables declaration//GEN-END:variables

    public void cerrarVentanas(String ventanaAbierta){
        ventanaAbierta = this.ventanaAbierta;
        
        if(ventanaAbierta!=null){
           if(ventanaAbierta.equals(this.ventanasInternas[0])){
               ventanaUsers.dispose();
           }else if(ventanaAbierta.equals(this.ventanasInternas[1])){
           
           }else if(ventanaAbierta.equals(this.ventanasInternas[2])){
           
           }else if(ventanaAbierta.equals(this.ventanasInternas[3])){
           
           }else if(ventanaAbierta.equals(this.ventanasInternas[4])){
           
           }else if(ventanaAbierta.equals(this.ventanasInternas[5])){
               ventanaReclamos.dispose();
           }else if(ventanaAbierta.equals(this.ventanasInternas[6])){
               ventanaListasM.dispose();
           }else if(ventanaAbierta.equals(this.ventanasInternas[7])){
               
           }             
        }
    }
    
}
