package com.visual;

import com.grsc.logica.ejb.AnalistaBean;
import com.grsc.logica.ejb.DocenteBean;
import com.grsc.logica.ejb.EstadoUsuarioBean;
import com.grsc.logica.ejb.EstudianteBean;
import com.grsc.logica.ejb.GeneracionBean;
import com.grsc.logica.ejb.ItrBean;
import com.grsc.logica.ejb.RoleBean;
import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.EstadoUsuario;
import com.grsc.modelo.entities.Generacion;
import com.grsc.modelo.entities.Itr;
import com.grsc.modelo.entities.Roles;
import com.grsc.modelo.entities.Usuarios;
import java.awt.Color;
import java.math.BigInteger;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Home extends javax.swing.JFrame {
    
    Usuarios usuario;
    UsuarioBean userBean= new UsuarioBean();
    
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
        panelUsuarios = new javax.swing.JPanel();
        lblBtnConstancias2 = new javax.swing.JLabel();
        comboboxGeneracion = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxTipoUser1 = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxEstado = new RSMaterialComponent.RSComboBoxMaterial();
        comboboxItr = new RSMaterialComponent.RSComboBoxMaterial();
        btnFiltrar = new rsbuttongradiente.RSButtonGradiente();
        btnLimpiarFiltro = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiarFiltro1 = new rsbuttongradiente.RSButtonGradiente();
        botonSolicitudesConstancias = new rsbuttongradiente.RSButtonGradiente();
        botonEliminar = new rsbuttongradiente.RSButtonGradiente();
        botonModificar = new rsbuttongradiente.RSButtonGradiente();
        botonReclamos = new rsbuttongradiente.RSButtonGradiente();
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

        btnUsuario.setBackground(new java.awt.Color(47, 165, 217));
        btnUsuario.setForeground(new java.awt.Color(105, 190, 228));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        btnUsuarioLayout.setVerticalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgBtnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBtnUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnEventos.setBackground(new java.awt.Color(105, 190, 228));
        btnEventos.setForeground(new java.awt.Color(105, 190, 228));

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
                .addGap(18, 18, 18)
                .addComponent(lblBtnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEventosLayout.setVerticalGroup(
            btnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBtnEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblBtnEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnConstancias.setBackground(new java.awt.Color(105, 190, 228));
        btnConstancias.setForeground(new java.awt.Color(105, 190, 228));

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
                .addGap(18, 18, 18)
                .addComponent(lblBtnConstancias1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnConstanciasLayout.setVerticalGroup(
            btnConstanciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConstanciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnConstanciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBtnConstancias1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgBtnConstancias, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnReclamos.setBackground(new java.awt.Color(105, 190, 228));
        btnReclamos.setForeground(new java.awt.Color(105, 190, 228));

        imgBtnReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1reclamos-icon.png"))); // NOI18N

        lblBtnReclamos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblBtnReclamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnReclamos.setText("Reclamos");

        javax.swing.GroupLayout btnReclamosLayout = new javax.swing.GroupLayout(btnReclamos);
        btnReclamos.setLayout(btnReclamosLayout);
        btnReclamosLayout.setHorizontalGroup(
            btnReclamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReclamosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgBtnReclamos)
                .addGap(18, 18, 18)
                .addComponent(lblBtnReclamos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnReclamosLayout.setVerticalGroup(
            btnReclamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReclamosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnReclamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBtnReclamos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblBtnReclamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnJustificaciones.setBackground(new java.awt.Color(105, 190, 228));
        btnJustificaciones.setForeground(new java.awt.Color(105, 190, 228));

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
                .addGap(18, 18, 18)
                .addComponent(lblBtnJustificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnJustificacionesLayout.setVerticalGroup(
            btnJustificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnJustificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnJustificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBtnJustificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgBtnJustificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnReportes.setBackground(new java.awt.Color(105, 190, 228));
        btnReportes.setForeground(new java.awt.Color(105, 190, 228));

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
                .addGap(18, 18, 18)
                .addComponent(lblBtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblBtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConstancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnJustificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReclamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addComponent(imgUTECLogo)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgUTECLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
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
                .addContainerGap(98, Short.MAX_VALUE))
        );

        background.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 660));
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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        background.add(titlepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1050, 120));

        lblRuta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblRuta.setText("Home/");
        background.add(lblRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        panelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnConstancias2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblBtnConstancias2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias2.setText("Filtros");
        panelUsuarios.add(lblBtnConstancias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 20));

        comboboxGeneracion.setForeground(new java.awt.Color(13, 120, 161));

        GeneracionBean genBean= new GeneracionBean();

        DefaultComboBoxModel modeloGen=new DefaultComboBoxModel();

        List<Generacion> listaGeneracion=genBean.listarGeneracion();

        modeloGen.addElement(" GENERACIÓN");

        for(int i = 0 ; i<listaGeneracion.size(); i++){
            modeloGen.addElement(listaGeneracion.get(i).getAnio());
        }

        comboboxGeneracion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxGeneracion.setModel(modeloGen);

        comboboxGeneracion.setVisible(false);
        panelUsuarios.add(comboboxGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 190, 30));

        comboboxTipoUser1.setForeground(new java.awt.Color(13, 120, 161));

        RoleBean rolesBean= new RoleBean();

        DefaultComboBoxModel modeloRoles=new DefaultComboBoxModel();

        List<Roles> listaRoles=rolesBean.listarRoles();

        modeloRoles.addElement(" ROL");

        for(int i = 0 ; i<listaRoles.size(); i++){
            modeloRoles.addElement(listaRoles.get(i).getNombre());
        }

        comboboxTipoUser1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxTipoUser1.setModel(modeloRoles);
        comboboxTipoUser1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxTipoUser1ItemStateChanged(evt);
            }
        });
        panelUsuarios.add(comboboxTipoUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 190, 30));

        comboboxEstado.setForeground(new java.awt.Color(13, 120, 161));

        EstadoUsuarioBean estadosBean= new EstadoUsuarioBean();

        DefaultComboBoxModel modeloEstados=new DefaultComboBoxModel();

        List<EstadoUsuario> listaEstados=estadosBean.listarEstadosUsuario();

        modeloEstados.addElement(" ESTADO USUARIO");

        for(int i = 0 ; i<listaEstados.size(); i++){
            modeloEstados.addElement(listaEstados.get(i).getEstadoUsuario());
        }

        comboboxEstado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxEstado.setModel(modeloEstados);
        panelUsuarios.add(comboboxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 30));

        comboboxItr.setForeground(new java.awt.Color(13, 120, 161));

        ItrBean itrsBean= new ItrBean();

        DefaultComboBoxModel modeloItrs=new DefaultComboBoxModel();

        List<Itr> listaItrs=itrsBean.listarItrs();

        modeloItrs.addElement(" ITR");

        for(int i = 0 ; i<listaItrs.size(); i++){
            modeloItrs.addElement(listaItrs.get(i).getNomItr());
        }

        comboboxItr.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15));

        comboboxItr.setModel(modeloItrs);
        panelUsuarios.add(comboboxItr, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 190, 30));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17));
        btnFiltrar.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnFiltrar.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnFiltrar.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnFiltrar.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
        });
        panelUsuarios.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 120, 30));

        btnLimpiarFiltro.setText("Limpiar Filtro");
        btnLimpiarFiltro.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltroMouseClicked(evt);
            }
        });
        btnLimpiarFiltro.setVisible(false);
        panelUsuarios.add(btnLimpiarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 120, 30));

        jTable1.setModel(cargarTablaUsuarios(
        ));
        jTable1.setAutoscrolls(true);
        jTable1.setRowSelectionAllowed(true);
        jTable1.setSize(600, 600);
        jScrollPane2.setViewportView(jTable1);

        panelUsuarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1000, 320));

        btnLimpiarFiltro1.setText("Limpiar Filtro");
        btnLimpiarFiltro1.setColorPrimario(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro1.setColorPrimarioHover(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro1.setColorSecundario(new java.awt.Color(105, 190, 228));
        btnLimpiarFiltro1.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        btnLimpiarFiltro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFiltro1MouseClicked(evt);
            }
        });
        btnLimpiarFiltro.setVisible(false);
        panelUsuarios.add(btnLimpiarFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 120, 30));

        botonSolicitudesConstancias.setText("Solicitudes de Constancias");
        botonSolicitudesConstancias.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonSolicitudesConstancias.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonSolicitudesConstancias.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonSolicitudesConstancias.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        panelUsuarios.add(botonSolicitudesConstancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 250, 40));

        botonEliminar.setText("Eliminar");
        botonEliminar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonEliminar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonEliminar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonEliminar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        panelUsuarios.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 40));

        botonModificar.setText("Modificar");
        botonModificar.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        panelUsuarios.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 130, 40));

        botonReclamos.setText("Reclamos");
        botonReclamos.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonReclamos.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonReclamos.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonReclamos.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        panelUsuarios.add(botonReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 130, 40));

        background.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 1050, 490));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  
        
    }//GEN-LAST:event_formWindowActivated

    private void comboboxTipoUser1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxTipoUser1ItemStateChanged
        BigInteger bi= BigInteger.valueOf(3L);
        if (tipoUserSeleccionado().getIdRol().equals(bi)) {
            this.comboboxGeneracion.setVisible(true);
        }else{
            this.comboboxGeneracion.setVisible(false);
        }
    }//GEN-LAST:event_comboboxTipoUser1ItemStateChanged

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked
        accionFiltrar();
        this.btnLimpiarFiltro.setVisible(true);
    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void btnLimpiarFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroMouseClicked
        accionLimpiarFiltro();
        this.btnLimpiarFiltro.setVisible(false);
        this.comboboxGeneracion.setVisible(false);
    }//GEN-LAST:event_btnLimpiarFiltroMouseClicked

    private void lblNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseClicked
        dispose();
        VentanaIniciarSesion VentanaInicioSesion= new VentanaIniciarSesion();
        VentanaInicioSesion.setVisible(true);
    }//GEN-LAST:event_lblNombreUsuarioMouseClicked

    private void lblNombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseEntered
        lblNombreUsuario.setForeground(new Color(0,0,51));
        lblNombreUsuario.setText("<HTML><u>"+ usuario.getNomUsuario() +"</u></HTML>");
    }//GEN-LAST:event_lblNombreUsuarioMouseEntered

    private void lblNombreUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseExited
        lblNombreUsuario.setForeground(new Color(13,120,161));
        lblNombreUsuario.setText(usuario.getNomUsuario());
    }//GEN-LAST:event_lblNombreUsuarioMouseExited

    private void btnLimpiarFiltro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFiltro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarFiltro1MouseClicked

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        int row = jTable1.getSelectedRow();
        
        if (row==-1) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar");
        } else {
            String cell = jTable1.getModel().getValueAt(row, 2).toString();
            Usuarios usuarioExterno = userBean.buscarUsuarioPorDocumento(cell);
            Object[] options = {"ELIMINAR", "CANCELAR"};
            int respuesta = JOptionPane.showOptionDialog(null, "¿Estás seguro de eliminar usuario " + usuarioExterno.getNomUsuario()
                    + "?", "Eliminar usuario", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (respuesta == JOptionPane.YES_OPTION) {

                try {
                    userBean.eliminarUser(usuarioExterno.getIdUsuario());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se ha eliminado el Usuario dado un Error");
                }
                BigInteger estadoEliminado = BigInteger.valueOf(3L);
                if (userBean.obtenerEstado(usuarioExterno.getIdUsuario()).getIdEstado().equals(estadoEliminado)) {
                    jTable1.setModel(cargarTablaUsuarios());
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado correctamente");
                    jTable1.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado NO correctamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha eliminado el usuario");
            }
        }
    }//GEN-LAST:event_botonEliminarMouseClicked

    private DefaultTableModel cargarTablaUsuarios() {

        List<Usuarios> listaUsuarios = userBean.listarUsuarios();

        String[] nombreColumnas = {"Estado", "Rol", "Documento", "nomUsuario", "ITR", "Generación"};

        /*
		 * El tamaño de la tabla es, 4 columnas (cantidad de datos a mostrar) y
		 * la cantidad de filas depende de la cantida de listaUsuarios
         */
        Object[][] datos = new Object[listaUsuarios.size()][6];

        /* Cargamos la matriz con todos los datos */
        int fila = 0;

        for (Usuarios u:listaUsuarios) {

            datos[fila][0] = u.getIdEstadoUsuario().getEstadoUsuario();
            datos[fila][1] = u.getRol().getNombre();
            datos[fila][2] = u.getDocumento();
            datos[fila][3] = u.getNomUsuario();
            datos[fila][4] = u.getItr().getNomItr();
            
            if(u.getEstudiante()!=null){
                datos[fila][5] = u.getEstudiante().getAnioGen().getAnio().toString();
            }else{
                datos[fila][5] = null;
            }
            
            fila++;

        }
        /*
		 * Este codigo indica que las celdas no son editables y que son todas
		 * del tipos String
         */
        DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }
        };

        return model;

    }

    private void accionLimpiarFiltro() {

        this.jTable1.setRowSorter(null);
        this.comboboxEstado.setSelectedIndex(0);
        this.comboboxGeneracion.setSelectedIndex(0);
        this.comboboxItr.setSelectedIndex(0);
        this.comboboxTipoUser1.setSelectedIndex(0);
    }

    private void accionFiltrar() {

        TableRowSorter<TableModel> filtro1 = new TableRowSorter<>(this.jTable1.getModel());
        TableRowSorter<TableModel> filtro2 = new TableRowSorter<>(this.jTable1.getModel());
        TableRowSorter<TableModel> filtro3 = new TableRowSorter<>(this.jTable1.getModel());
        TableRowSorter<TableModel> filtro4 = new TableRowSorter<>(this.jTable1.getModel());

        Roles rol = tipoUserSeleccionado();
        EstadoUsuario estado = estadoSeleccionado();
        Itr itr = itrSeleccionado();
        Generacion gen = genSeleccionada();

        if (estado != null) {

            String estadoString = estado.getEstadoUsuario();

            filtro1.setRowFilter(RowFilter.regexFilter(estadoString, 0));

            jTable1.setRowSorter(filtro1);
        }
        if (rol != null) {

            String rolString = rol.getNombre();

            filtro2.setRowFilter(RowFilter.regexFilter(rolString, 1));

            jTable1.setRowSorter(filtro2);

        }
        if (itr != null) {

            String itrString = itr.getNomItr();

            filtro3.setRowFilter(RowFilter.regexFilter(itrString, 4));

            jTable1.setRowSorter(filtro3);

        }

        if (gen != null) {

            String genAnio = gen.getAnio().toString();

            filtro4.setRowFilter(RowFilter.regexFilter(genAnio, 5));

            jTable1.setRowSorter(filtro4);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private rsbuttongradiente.RSButtonGradiente botonEliminar;
    private rsbuttongradiente.RSButtonGradiente botonModificar;
    private rsbuttongradiente.RSButtonGradiente botonReclamos;
    private rsbuttongradiente.RSButtonGradiente botonSolicitudesConstancias;
    private javax.swing.JPanel btnConstancias;
    private javax.swing.JPanel btnEventos;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar;
    private javax.swing.JPanel btnJustificaciones;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro1;
    private javax.swing.JPanel btnReclamos;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnUsuario;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstado;
    private RSMaterialComponent.RSComboBoxMaterial comboboxGeneracion;
    private RSMaterialComponent.RSComboBoxMaterial comboboxItr;
    private RSMaterialComponent.RSComboBoxMaterial comboboxTipoUser1;
    private javax.swing.JLabel imgBtnConstancias;
    private javax.swing.JLabel imgBtnEvento;
    private javax.swing.JLabel imgBtnJustificaciones;
    private javax.swing.JLabel imgBtnReclamos;
    private javax.swing.JLabel imgBtnReportes;
    private javax.swing.JLabel imgBtnUsuario;
    private javax.swing.JLabel imgBtnUsuario1;
    private javax.swing.JLabel imgUTECLogo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBtnConstancias1;
    private javax.swing.JLabel lblBtnConstancias2;
    private javax.swing.JLabel lblBtnEventos;
    private javax.swing.JLabel lblBtnJustificaciones;
    private javax.swing.JLabel lblBtnReclamos;
    private javax.swing.JLabel lblBtnReportes;
    private javax.swing.JLabel lblBtnUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelUsuarios;
    private rspanelgradiente.RSPanelGradiente sidepanel;
    private rspanelgradiente.RSPanelGradiente titlepanel;
    // End of variables declaration//GEN-END:variables
    
      public EstadoUsuario estadoSeleccionado() {
        /* Este método es para encontrar el localidad que ha sido seleccionado del comboBox de Localidades, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/
        
        //Invocamos al bean de Localidad
        EstadoUsuarioBean estadoBean = new EstadoUsuarioBean();
        
        //Se carga una lista con todas las localidades
        List<EstadoUsuario> listaEstados = estadoBean.listarEstadosUsuario();
        EstadoUsuario estadoUsuario = null;

        //En el siguiente for se pasa por todas las localidades de la lista
        for (int i = 0; i < listaEstados.size(); i++) {
            //Si el nombre de la localidad coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaEstados.get(i).getEstadoUsuario().equals(this.comboboxEstado.getSelectedItem().toString())) {
                estadoUsuario = listaEstados.get(i);
            }

        }

        return estadoUsuario;
    }

    public Roles tipoUserSeleccionado() {
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
            if (listaRoles.get(i).getNombre().equals(this.comboboxTipoUser1.getSelectedItem().toString())) {
                rol = listaRoles.get(i);
            }
        }

        return rol;
    }

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
            if (listaItr.get(i).getNomItr().equals(this.comboboxItr.getSelectedItem().toString())) {
                itr = listaItr.get(i);
            }

        }

        return itr;
    }

    public Generacion genSeleccionada() {
        /* Este método es para encontrar el Area que ha sido seleccionado del comboBox de Area, ya que 
        el combobox tiene cargados solo los nombres asique lo tenemos que buscar por el nombre al objeto*/

        //Invocamos al bean de Area
        GeneracionBean genBean = new GeneracionBean();

        //Se carga una lista con todas las Areas
        List<Generacion> listaGeneracion = genBean.listarGeneracion();
        Generacion gen = null;

        //En el siguiente for se pasa por todas las areas de la lista
        for (int i = 0; i < listaGeneracion.size(); i++) {
            //Si el nombre de la Area coincide con el seleccionado del combobox se carga en la variable a retornar
            if (listaGeneracion.get(i).getAnio().equals(this.comboboxGeneracion.getSelectedItem().toString())) {
                gen = listaGeneracion.get(i);
            }
        }

        return gen;
    }

}
