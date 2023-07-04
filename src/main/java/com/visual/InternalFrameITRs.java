package com.visual;

import com.grsc.logica.ejb.ItrBean;
import com.grsc.modelo.entities.Itr;
import java.math.BigInteger;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class InternalFrameITRs extends javax.swing.JInternalFrame {

    ItrBean itrBean = new ItrBean();

    public InternalFrameITRs() {
        initComponents();
    }

    private void initComponents() {
        lblBtnConstancias4 = new javax.swing.JLabel();
        comboboxEstadoITRs = new RSMaterialComponent.RSComboBoxMaterial();
        btnFiltrar2 = new rsbuttongradiente.RSButtonGradiente();
        btnLimpiarFiltro2 = new rsbuttongradiente.RSButtonGradiente();
        botonAltaITR = new rsbuttongradiente.RSButtonGradiente();
        botonModificar2 = new rsbuttongradiente.RSButtonGradiente();
        botonEliminar2 = new rsbuttongradiente.RSButtonGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1001, 100));

        lblBtnConstancias4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18));
        lblBtnConstancias4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBtnConstancias4.setText("ITRs");


        botonAltaITR.setText("Alta");
        botonAltaITR.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonAltaITR.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonAltaITR.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonAltaITR.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonAltaITR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaITRActionPerformed(evt);
                
            }
        });

        botonModificar2.setText("Modificar");
        botonModificar2.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonModificar2.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonModificar2.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar2ActionPerformed(evt);
            }
        });

        botonEliminar2.setText("Eliminar");
        botonEliminar2.setColorPrimario(new java.awt.Color(105, 190, 228));
        botonEliminar2.setColorPrimarioHover(new java.awt.Color(213, 240, 252));
        botonEliminar2.setColorSecundario(new java.awt.Color(213, 240, 252));
        botonEliminar2.setColorSecundarioHover(new java.awt.Color(105, 190, 228));
        botonEliminar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminar2MouseClicked(evt);
            }
        });
        botonEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar2ActionPerformed(evt);
            }
        });

        jTable1.setModel(cargarTablaITR());
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBtnConstancias4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboboxEstadoITRs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAltaITR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }


    private void botonAltaITRActionPerformed(java.awt.event.ActionEvent evt) {
                VentanaAltaITR ventanaITR = new VentanaAltaITR();
                ventanaITR.setVisible(true);        

    }

    private void botonEliminar2MouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un ITR para eliminar");
        } else {
            String cellId = jTable1.getModel().getValueAt(row, 0).toString();
            BigInteger idITR = new BigInteger(cellId);

            boolean eliminado = itrBean.eliminarITR(idITR);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "ITR eliminado correctamente");
                actualizarTablaITR();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el ITR");
            }
        }
    }

    private void botonEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void botonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un ITR para modificar");
        } else {
            String cellId = jTable1.getModel().getValueAt(row, 0).toString();
            BigInteger idITR = new BigInteger(cellId);

            // Aquí debes implementar la lógica para modificar un ITR según tus necesidades
        }
    }

    private DefaultTableModel cargarTablaITR() {
        List<Itr> listaItrs = itrBean.listarItrs();

        String[] nombreColumnas = {"ID", "Departamento"};

        Object[][] datos = new Object[listaItrs.size()][2];

        int fila = 0;

        for (Itr itr : listaItrs) {
            datos[fila][0] = itr.getIdItr();
            datos[fila][1] = itr.getNomItr();
            fila++;
        }

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

    private void actualizarTablaITR() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        List<Itr> listaItrs = itrBean.listarItrs();

        for (Itr itr : listaItrs) {
            Object[] row = {itr.getIdItr(), itr.getNomItr()};
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify                     
    private rsbuttongradiente.RSButtonGradiente botonAltaITR;
    private rsbuttongradiente.RSButtonGradiente botonEliminar2;
    private rsbuttongradiente.RSButtonGradiente botonModificar2;
    private rsbuttongradiente.RSButtonGradiente btnFiltrar2;
    private rsbuttongradiente.RSButtonGradiente btnLimpiarFiltro2;
    private RSMaterialComponent.RSComboBoxMaterial comboboxEstadoITRs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBtnConstancias4;
    // End of variables declaration                   
}

