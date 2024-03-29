/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.vista.usuario;

import ec.edu.ups.controlador.BibliotecaControlador;
import ec.edu.ups.controlador.UsuarioControlador;
import ec.edu.ups.modelo.Usuario;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author arpi
 */
public class VentanaActualizarUsuario extends javax.swing.JInternalFrame {

    private BibliotecaControlador bibliotecaControlador;
    
    public VentanaActualizarUsuario(BibliotecaControlador bibliotecaControlador) {
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblActualizarDatos = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txt_cod_us = new javax.swing.JTextField();
        txt_nom_us = new javax.swing.JTextField();
        txt_dir_us = new javax.swing.JTextField();
        txt_num_us = new javax.swing.JTextField();
        btnActualizarUsuario = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Usuario");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblNombre.setFont(new java.awt.Font("Righteous", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblActualizarDatos.setFont(new java.awt.Font("Righteous", 0, 25)); // NOI18N
        lblActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarDatos.setText("ACTUALIZAR DATOS");

        lblCedula.setFont(new java.awt.Font("Righteous", 0, 20)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula:");

        lblTelefono.setFont(new java.awt.Font("Righteous", 0, 20)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono:");

        lblDireccion.setFont(new java.awt.Font("Righteous", 0, 20)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección:");

        txt_nom_us.setEditable(false);

        txt_dir_us.setEditable(false);

        txt_num_us.setEditable(false);

        btnActualizarUsuario.setBackground(new java.awt.Color(217, 217, 217));
        btnActualizarUsuario.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnActualizarUsuario.setText("Actualizar Usuario");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(217, 217, 217));
        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(217, 217, 217));
        btnCancelar.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nom_us, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dir_us, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_num_us, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_cod_us, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(lblActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txt_cod_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txt_nom_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txt_dir_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txt_num_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(lblActualizarDatos)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        String id = txt_cod_us.getText();
        Usuario usuario = new Usuario();
        usuario = bibliotecaControlador.readUsuario(id.trim());
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        }
        else
        {
            String nombre = txt_nom_us.getText().trim();
            String direccion = txt_dir_us.getText().trim();
            String telefono = txt_num_us.getText().trim();
            
            bibliotecaControlador.updateUsuario(id, nombre, direccion, telefono);
            JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente!");
        }
        
        txt_cod_us.setText("");
        txt_nom_us.setText("");
        txt_dir_us.setText("");
        txt_num_us.setText("");
        txt_cod_us.setEditable(true);
        txt_nom_us.setEditable(false);
        txt_dir_us.setEditable(false);
        txt_num_us.setEditable(false);
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Usuario usuario = new Usuario();
        usuario = bibliotecaControlador.readUsuario(txt_cod_us.getText().trim());
        
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "No existe el Usuario");
        }
        else
        {
            txt_cod_us.setText(usuario.getIdentificacion());
            txt_nom_us.setText(usuario.getNombre());
            txt_dir_us.setText(usuario.getDireccion());
            txt_num_us.setText(usuario.getTelefono());
        }
        
        txt_cod_us.setEditable(false);
        txt_nom_us.setEditable(true);
        txt_dir_us.setEditable(true);
        txt_num_us.setEditable(true);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txt_cod_us.setText("");
        txt_nom_us.setText("");
        txt_dir_us.setText("");
        txt_num_us.setText("");
        
        txt_cod_us.setEditable(true);
        txt_nom_us.setEditable(false);
        txt_dir_us.setEditable(false);
        txt_num_us.setEditable(false);        
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        lblActualizarDatos.setText(mensajes.getString("lblActualizarDatos"));
        lblCedula.setText(mensajes.getString("cedula"));
        lblNombre.setText(mensajes.getString("nombre"));
        lblDireccion.setText(mensajes.getString("direccion"));
        lblTelefono.setText(mensajes.getString("telefono"));
        btnActualizarUsuario.setText(mensajes.getString("btnActualizarUsuario"));
        btnCancelar.setText(mensajes.getString("cancelar"));
        btnBuscar.setText(mensajes.getString("buscar"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActualizarDatos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txt_cod_us;
    private javax.swing.JTextField txt_dir_us;
    private javax.swing.JTextField txt_nom_us;
    private javax.swing.JTextField txt_num_us;
    // End of variables declaration//GEN-END:variables
}
