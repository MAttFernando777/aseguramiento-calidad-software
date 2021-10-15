/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorProveedor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.vo.Proveedor;

/**
 *
 * @author krypt97
 */
public class PanelProveedores extends javax.swing.JPanel {

    /**
     * Creates new form NewPanelUsuarios
     */
    ControladorProveedor miControladorProveedor;
    private DefaultTableModel miDefaultTableModel;

    public PanelProveedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panDatos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = tblProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;//Disallow the editing of any cell
            }
        };

        setMinimumSize(new java.awt.Dimension(1150, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1120, 690));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panEncabezado.setBackground(new java.awt.Color(3, 44, 75));
        panEncabezado.setMaximumSize(null);
        panEncabezado.setMinimumSize(new java.awt.Dimension(1120, 40));
        panEncabezado.setPreferredSize(new java.awt.Dimension(1120, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedores");

        javax.swing.GroupLayout panEncabezadoLayout = new javax.swing.GroupLayout(panEncabezado);
        panEncabezado.setLayout(panEncabezadoLayout);
        panEncabezadoLayout.setHorizontalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEncabezadoLayout.setVerticalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.add(panEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 56));

        panDatos.setBackground(new java.awt.Color(57, 103, 196));
        panDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(70, 106, 124));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Proveedor       :");
        panDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 72, 148, 22));

        jLabel11.setBackground(new java.awt.Color(70, 106, 124));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre               :");
        panDatos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 152, 137, 22));

        jLabel12.setBackground(new java.awt.Color(70, 106, 124));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dirección     :");
        panDatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 152, 113, 22));

        jLabel13.setBackground(new java.awt.Color(70, 106, 124));
        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Teléfono      :");
        panDatos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 72, 116, 22));

        BtnAgregar.setBackground(new java.awt.Color(102, 102, 102));
        BtnAgregar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar.png"))); // NOI18N
        BtnAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        panDatos.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 10, 65, 65));

        BtnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        BtnEliminar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eliminar.png"))); // NOI18N
        BtnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        BtnEliminar.setBorderPainted(false);
        BtnEliminar.setContentAreaFilled(false);
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEliminar.setFocusPainted(false);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        panDatos.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 90, 65, 65));

        BtnModificar.setBackground(new java.awt.Color(102, 102, 102));
        BtnModificar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/editar.png"))); // NOI18N
        BtnModificar.setToolTipText("Editar");
        BtnModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        BtnModificar.setBorderPainted(false);
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        panDatos.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 170, 65, 65));

        txtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorActionPerformed(evt);
            }
        });
        panDatos.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 63, 350, 40));
        panDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 143, 350, 40));
        panDatos.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 63, 350, 40));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        panDatos.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 143, 350, 40));

        jPanel2.add(panDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 1150, 246));

        panTable.setBackground(new java.awt.Color(57, 103, 196));
        panTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1105, 372));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1105, 372));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1105, 372));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProveedores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblProveedoresFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        panTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, 1105, 372));

        jPanel2.add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 1150, 418));

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        miControladorProveedor.modificarProveedor();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        miControladorProveedor.eliminarProveedor();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        miControladorProveedor.registrarProveedor();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void tblProveedoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblProveedoresFocusGained
        // TODO add your handling code here:
        miControladorProveedor.cargarProveedorSeleccionado();
    }//GEN-LAST:event_tblProveedoresFocusGained

    private void txtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panDatos;
    private javax.swing.JPanel panEncabezado;
    private javax.swing.JPanel panTable;
    private javax.swing.JTable tblProveedores;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorProveedor miControladorProveedor) {
        this.miControladorProveedor = miControladorProveedor;
    }

    public Proveedor empaquetarDatosProveedor() {
        Proveedor miProveedor = new Proveedor();
        miProveedor.setIdProveedor(Integer.parseInt(txtIdProveedor.getText()));
        miProveedor.setNombre(txtNombre.getText());
        miProveedor.setDireccion(txtDireccion.getText());
        miProveedor.setTelefono(txtTelefono.getText());
        return miProveedor;
    }

    public void setTablaProveedores(ArrayList<Proveedor> miArrayList) {
        String[] columnas = {"ID", "Nombre", "Dirección", "Telefono"};
        Object[][] miData = new Object[miArrayList.size()][4];

        for (int i = 0; i < miArrayList.size(); i++) {
            miData[i][0] = miArrayList.get(i).getIdProveedor();
            miData[i][1] = miArrayList.get(i).getNombre();
            miData[i][2] = miArrayList.get(i).getDireccion();
            miData[i][3] = miArrayList.get(i).getTelefono();
        }

        miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tblProveedores.setModel(miDefaultTableModel);
    }

    public void limpiarCampos() {
        txtIdProveedor.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtIdProveedor.requestFocus();
    }

    public void desempaquetarDatosProveedor(Proveedor miProveedor) {
        txtNombre.setText(miProveedor.getNombre());
        txtDireccion.setText(miProveedor.getDireccion());
        txtTelefono.setText(miProveedor.getTelefono());
    }

    public int idSeleccionado() {
        int id = 0;
        if (tblProveedores.getSelectedRow() != -1) {
            id = (int) tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 0);
        }
        return id;
    }
}
