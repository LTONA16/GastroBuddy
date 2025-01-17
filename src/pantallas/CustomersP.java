/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

import Dialogos.BorrarConf;
import EnumPantalla.Pantalla;
import Main.VentanaPrincipal;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisi
 */
public class CustomersP extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form StaffP
     */
    public CustomersP(VentanaPrincipal v) {
        initComponents();
        this.ventana = v;
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeDatosStaff = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnNvoRegistro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        panelPrincipal.setBackground(new java.awt.Color(222, 247, 244));

        jPanel1.setBackground(new java.awt.Color(58, 58, 145));

        TablaDeDatosStaff.setBackground(new java.awt.Color(239, 239, 239));
        TablaDeDatosStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDeDatosStaff.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDeDatosStaff.setShowGrid(true);
        TablaDeDatosStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeDatosStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDeDatosStaff);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 86)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" Customers ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("id");

        txtId.setEditable(false);
        txtId.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("phone");

        btnNvoRegistro.setText("Nuevo Registro");
        btnNvoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoRegistroActionPerformed(evt);
            }
        });

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDeDatosStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeDatosStaffMouseClicked

        if (TablaDeDatosStaff.isFocusable()) {
            int row = TablaDeDatosStaff.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "No se Selecciono");
            } else {
                String code = (String) TablaDeDatosStaff.getValueAt(row, 0).toString();
                String roleName = (String) TablaDeDatosStaff.getValueAt(row, 1);
                String roleDes = (String) TablaDeDatosStaff.getValueAt(row, 2);
                //String roleCode = (String) TablaDeDatosStaff.getValueAt(row, 3);
                txtId.setText(code);
                txtName.setText(roleName);
                txtPhone.setText(roleDes);
            }
        }
    }//GEN-LAST:event_TablaDeDatosStaffMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarRegistro();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarTexts();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNvoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoRegistroActionPerformed

        nuevoRegistro();
    }//GEN-LAST:event_btnNvoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.PrincipalP);
    }//GEN-LAST:event_jButton1ActionPerformed

    void listar() {
        String sql = "SELECT id, name, phone FROM customers ORDER BY id;";
        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] meals = new Object[3];
            model = (DefaultTableModel) TablaDeDatosStaff.getModel();
            while (rs.next()) {
                meals[0] = rs.getInt("id");
                meals[1] = rs.getString("name");
                meals[2] = rs.getString("phone");
                model.addRow(meals);
            }
            TablaDeDatosStaff.setModel(model);
        } catch (Exception e) {

        }
    }

    void agregarRegistro() {
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, para agregar un registro es necesario un id.\nIntentelo de nuevo.", "Agregar registro", JOptionPane.ERROR_MESSAGE);
            deshabilitarTexts();
        } else {
            try {
                int code = Integer.parseInt(txtId.getText());
                String roleDes = txtPhone.getText();
                String roleName = txtName.getText();
                String sql = "INSERT INTO customers (id, name, phone) VALUES (" + code + ",'" + roleName + "', '" + roleDes + "');";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡Registro Agregado Exitosamente!", "Agregar registro", JOptionPane.INFORMATION_MESSAGE);
                deshabilitarTexts();
                limpiarTexts();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el registro: " + e.getMessage(), "Agregar registro", JOptionPane.ERROR_MESSAGE);
                deshabilitarTexts();
                limpiarTexts();
            }
        }
        actualizar();
    }

    void borrarRegistro() {
        if (!txtId.getText().equals("")) {
            BorrarConf bc = new BorrarConf(this.ventana, true);
            bc.setVisible(true);
            if (bc.getReturnStatus() == 1) {
                //
                int code = Integer.parseInt(txtId.getText());
                String sql = "DELETE FROM customers WHERE  id=" + code;
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                    limpiarTexts();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al borrar el registro: " + e.getMessage(), "Borrar registro", JOptionPane.ERROR_MESSAGE);
                }
                //
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, para borrar un registro es necesario un id.\nIntentelo de nuevo.", "Borrar registro", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
    }

    void modificarRegistro() {
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, Para modificar un registro es necesario un id.\nIntentelo de nuevo.", "Modificar registro", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // solicitando valores
                int code = Integer.parseInt(txtId.getText());
                String roleDes = txtPhone.getText();
                String roleName = txtName.getText();
                //sql
                String sql = "UPDATE customers SET phone='" + roleDes + "', name='" + roleName + "' WHERE code=" + code + ";";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡Registro modificado Exitosamente!", "Modificar registro", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro: " + e.getMessage(), "Modificar registro", JOptionPane.ERROR_MESSAGE);
            }
        }
        actualizar();
    }

    void limpiarTexts() {
        txtId.setText("");
        txtPhone.setText("");
        txtName.setText("");
    }

    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDeDatosStaff.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    void actualizar() {
        limpiarTabla(model);
        listar();
    }

    void nuevoRegistro() {
        if (btnNvoRegistro.getText().equals("Nuevo Registro")) {
            habilitarTexts();
            txtId.setText("");
            txtPhone.setText("");
            txtName.setText("");
            btnNvoRegistro.setText("Cancelar");
            txtId.requestFocus();
        } else {
            deshabilitarTexts();
            limpiarTexts();
        }
    }

    void habilitarTexts() {
        txtId.setEditable(true);
        txtPhone.setEditable(true);
        txtId.setFocusable(true);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnLimpiar.setEnabled(true);
        TablaDeDatosStaff.setFocusable(false);
    }

    void deshabilitarTexts() {
        txtId.setEditable(false);
        txtPhone.setEditable(false);
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnLimpiar.setEnabled(false);
        btnNvoRegistro.setText("Nuevo Registro");
        TablaDeDatosStaff.setFocusable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeDatosStaff;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNvoRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
