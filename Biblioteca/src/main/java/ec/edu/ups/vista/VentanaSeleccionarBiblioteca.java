/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.BibliotecaControlador;
import ec.edu.ups.controlador.LibroControlador;
import ec.edu.ups.controlador.PrestamoControlador;
import ec.edu.ups.controlador.UsuarioControlador;
import ec.edu.ups.interfaces.BibliotecaListener;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.vista.libro.*;
import ec.edu.ups.vista.libro.VentanaListarLibros;
import ec.edu.ups.vista.prestamo.*;
import ec.edu.ups.vista.usuario.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author karen
 */
public class VentanaSeleccionarBiblioteca extends javax.swing.JInternalFrame implements BibliotecaListener{
    private VentanaBuscarBiblioteca ventanaBuscarBiblioteca;
    
    private VentanaActualizarLibro ventanaActualizarLibro;
    private VentanaBuscarLibro ventanaBuscarLIbro;
    private VentanaCrearLibro ventanaCrearLibro;
    private VentanaEliminarLibro ventanaEliminarLibro;
    private VentanaListarLibros ventanaListarLibros;
    
    private VentanaDevolverLibro ventanaDevolverLibro;
    private VentanaSolicitarLibro ventanaSolicitarLibro;
    
    private VentanaActualizarUsuario ventanaActualizarUsuario;
    private VentanaBuscarUsuario ventanaBuscarUsuario;
    private VentanaCrearUsuario ventanaCrearUsurio;
    private VentanaEliminarUsuario ventanaEliminarUsuario;
    private VentanaListarUsuario ventanaListarUsuario;
    
    private int codigo;
    
    private BibliotecaControlador bibliotecaControlador;
    private LibroControlador libroControlador;
    private UsuarioControlador usuarioControlador;
    private PrestamoControlador prestamoControlador;
    /**
     * Creates new form VentanaSeleccionarBiblioteca
     */
    public VentanaSeleccionarBiblioteca(BibliotecaControlador bibliotecaControlador, LibroControlador libroControlador, UsuarioControlador usuarioControlador, PrestamoControlador prestamoControlador) {
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
        this.libroControlador = libroControlador;
        this.usuarioControlador = usuarioControlador;
        this.prestamoControlador = prestamoControlador;
        codigo=0;
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
        jPanel2 = new javax.swing.JPanel();
        btnSeleccionarBiblioteca = new javax.swing.JButton();
        txtNombreBiblio = new javax.swing.JTextField();
        lblSeleccionarBiblio = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        librosMenu = new javax.swing.JMenu();
        crearLibroMenuItem = new javax.swing.JMenuItem();
        editarLibroMenuItem = new javax.swing.JMenuItem();
        buscarLibroMenuItem = new javax.swing.JMenuItem();
        eliminarLibroMenuItem = new javax.swing.JMenuItem();
        listarLibroMenuItem = new javax.swing.JMenuItem();
        usuariosMenu = new javax.swing.JMenu();
        crearUsuarioMenuItem = new javax.swing.JMenuItem();
        editarUsuarioMenuItem = new javax.swing.JMenuItem();
        buscarUsuarioMenuItem = new javax.swing.JMenuItem();
        eliminarUsuarioMenuItem = new javax.swing.JMenuItem();
        listarUsuarioMenuItem = new javax.swing.JMenuItem();
        prestamoMenu = new javax.swing.JMenu();
        solicitarPrestamoMenuItem = new javax.swing.JMenuItem();
        devolverPrestamoMenuItem = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnSeleccionarBiblioteca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSeleccionarBiblioteca.setText("Seleccionar");
        btnSeleccionarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarBibliotecaActionPerformed(evt);
            }
        });

        txtNombreBiblio.setEditable(false);
        txtNombreBiblio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSeleccionarBiblio.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        lblSeleccionarBiblio.setText("Seleccionar Biblioteca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccionarBiblio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionarBiblioteca)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarBiblioteca)
                    .addComponent(lblSeleccionarBiblio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        jMenuBar1.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N

        librosMenu.setText("Libros");

        crearLibroMenuItem.setText("Crear");
        crearLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLibroMenuItemActionPerformed(evt);
            }
        });
        librosMenu.add(crearLibroMenuItem);

        editarLibroMenuItem.setText("Editar");
        editarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLibroMenuItemActionPerformed(evt);
            }
        });
        librosMenu.add(editarLibroMenuItem);

        buscarLibroMenuItem.setText("Buscar");
        buscarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibroMenuItemActionPerformed(evt);
            }
        });
        librosMenu.add(buscarLibroMenuItem);

        eliminarLibroMenuItem.setText("Eliminar");
        eliminarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroMenuItemActionPerformed(evt);
            }
        });
        librosMenu.add(eliminarLibroMenuItem);

        listarLibroMenuItem.setText("Listar");
        listarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLibroMenuItemActionPerformed(evt);
            }
        });
        librosMenu.add(listarLibroMenuItem);

        jMenuBar1.add(librosMenu);

        usuariosMenu.setText("Usuarios");

        crearUsuarioMenuItem.setText("Crear");
        crearUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioMenuItemActionPerformed(evt);
            }
        });
        usuariosMenu.add(crearUsuarioMenuItem);

        editarUsuarioMenuItem.setText("Editar");
        editarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioMenuItemActionPerformed(evt);
            }
        });
        usuariosMenu.add(editarUsuarioMenuItem);

        buscarUsuarioMenuItem.setText("Buscar");
        buscarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioMenuItemActionPerformed(evt);
            }
        });
        usuariosMenu.add(buscarUsuarioMenuItem);

        eliminarUsuarioMenuItem.setText("Eliminar");
        eliminarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioMenuItemActionPerformed(evt);
            }
        });
        usuariosMenu.add(eliminarUsuarioMenuItem);

        listarUsuarioMenuItem.setText("Listar");
        listarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuarioMenuItemActionPerformed(evt);
            }
        });
        usuariosMenu.add(listarUsuarioMenuItem);

        jMenuBar1.add(usuariosMenu);

        prestamoMenu.setText("Préstamo");

        solicitarPrestamoMenuItem.setText("Solicitar Libro");
        solicitarPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(solicitarPrestamoMenuItem);

        devolverPrestamoMenuItem.setText("Devolver Libro");
        devolverPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(devolverPrestamoMenuItem);

        jMenuBar1.add(prestamoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarBibliotecaActionPerformed
        if(ventanaBuscarBiblioteca==null){
            ventanaBuscarBiblioteca = new VentanaBuscarBiblioteca(bibliotecaControlador,codigo);
            ventanaBuscarBiblioteca.setBibliotecaListener(this);
        }
            
        if(!ventanaBuscarBiblioteca.isVisible()){
            jDesktopPane1.remove(ventanaBuscarBiblioteca);
            ventanaBuscarBiblioteca.setVisible(true);
            jDesktopPane1.add(ventanaBuscarBiblioteca);
        }  
        
    }//GEN-LAST:event_btnSeleccionarBibliotecaActionPerformed

    private void crearUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioMenuItemActionPerformed
        if(ventanaCrearUsurio==null)
            ventanaCrearUsurio = new VentanaCrearUsuario(bibliotecaControlador);
        if(!ventanaCrearUsurio.isVisible()){
            
            ventanaCrearUsurio.setVisible(true);
            jDesktopPane1.add(ventanaCrearUsurio);
        }
    }//GEN-LAST:event_crearUsuarioMenuItemActionPerformed

    private void crearLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLibroMenuItemActionPerformed
        if(ventanaCrearLibro==null)
            ventanaCrearLibro = new VentanaCrearLibro(bibliotecaControlador);
        if(!ventanaCrearLibro.isVisible()){
            
            ventanaCrearLibro.setVisible(true);
            jDesktopPane1.add(ventanaCrearLibro);
        }
    }//GEN-LAST:event_crearLibroMenuItemActionPerformed

    private void editarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLibroMenuItemActionPerformed
        if(ventanaActualizarLibro==null)
            ventanaActualizarLibro = new VentanaActualizarLibro(bibliotecaControlador);
        if(!ventanaActualizarLibro.isVisible()){
            
            ventanaActualizarLibro.setVisible(true);
            jDesktopPane1.add(ventanaActualizarLibro);
        }
    }//GEN-LAST:event_editarLibroMenuItemActionPerformed

    private void buscarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibroMenuItemActionPerformed
        if(ventanaBuscarLIbro==null)
            ventanaBuscarLIbro = new VentanaBuscarLibro(bibliotecaControlador);
        if(!ventanaBuscarLIbro.isVisible()){
            
            ventanaBuscarLIbro.setVisible(true);
            jDesktopPane1.add(ventanaBuscarLIbro);
        }
    }//GEN-LAST:event_buscarLibroMenuItemActionPerformed

    private void eliminarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroMenuItemActionPerformed
        if(ventanaEliminarLibro==null)
            ventanaEliminarLibro = new VentanaEliminarLibro(bibliotecaControlador);
        if(!ventanaEliminarLibro.isVisible()){
            
            ventanaEliminarLibro.setVisible(true);
            jDesktopPane1.add(ventanaEliminarLibro);
        }
    }//GEN-LAST:event_eliminarLibroMenuItemActionPerformed

    private void listarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLibroMenuItemActionPerformed
        if(ventanaListarLibros==null)
            ventanaListarLibros = new VentanaListarLibros(bibliotecaControlador);
        if(!ventanaListarLibros.isVisible()){
            ventanaListarLibros.listarLibros();
            ventanaListarLibros.setVisible(true);
            jDesktopPane1.add(ventanaListarLibros);
        }
    }//GEN-LAST:event_listarLibroMenuItemActionPerformed

    private void editarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioMenuItemActionPerformed
        if(ventanaActualizarUsuario==null)
            ventanaActualizarUsuario = new VentanaActualizarUsuario(bibliotecaControlador);
        if(!ventanaActualizarUsuario.isVisible()){
            
            ventanaActualizarUsuario.setVisible(true);
            jDesktopPane1.add(ventanaActualizarUsuario);
        }
    }//GEN-LAST:event_editarUsuarioMenuItemActionPerformed

    private void buscarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioMenuItemActionPerformed
        if(ventanaBuscarUsuario==null)
            ventanaBuscarUsuario = new VentanaBuscarUsuario(bibliotecaControlador);
        if(!ventanaBuscarUsuario.isVisible()){
            
            ventanaBuscarUsuario.setVisible(true);
            jDesktopPane1.add(ventanaBuscarUsuario);
        }
    }//GEN-LAST:event_buscarUsuarioMenuItemActionPerformed

    private void eliminarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioMenuItemActionPerformed
        if(ventanaEliminarUsuario==null)
            ventanaEliminarUsuario = new VentanaEliminarUsuario(bibliotecaControlador);
        if(!ventanaEliminarUsuario.isVisible()){
            
            ventanaEliminarUsuario.setVisible(true);
            jDesktopPane1.add(ventanaEliminarUsuario);
        }
    }//GEN-LAST:event_eliminarUsuarioMenuItemActionPerformed

    private void solicitarPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarPrestamoMenuItemActionPerformed
        if(ventanaSolicitarLibro==null)
            ventanaSolicitarLibro = new VentanaSolicitarLibro(prestamoControlador,usuarioControlador,libroControlador,bibliotecaControlador);
        if(!ventanaSolicitarLibro.isVisible()){
            
            ventanaSolicitarLibro.setVisible(true);
            jDesktopPane1.add(ventanaSolicitarLibro);
        }
    }//GEN-LAST:event_solicitarPrestamoMenuItemActionPerformed

    private void devolverPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverPrestamoMenuItemActionPerformed
        if(ventanaDevolverLibro==null)
            ventanaDevolverLibro = new VentanaDevolverLibro(prestamoControlador,usuarioControlador,libroControlador);
        if(!ventanaDevolverLibro.isVisible()){
            
            ventanaDevolverLibro.setVisible(true);
            jDesktopPane1.add(ventanaDevolverLibro);
        }
    }//GEN-LAST:event_devolverPrestamoMenuItemActionPerformed

    private void listarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuarioMenuItemActionPerformed
        if(ventanaListarUsuario==null)
            ventanaListarUsuario = new VentanaListarUsuario(bibliotecaControlador);
        if(!ventanaListarUsuario.isVisible()){
            ventanaListarUsuario.listarUsuarios();
            ventanaListarUsuario.setVisible(true);
            jDesktopPane1.add(ventanaListarUsuario);
        }
    }//GEN-LAST:event_listarUsuarioMenuItemActionPerformed

    public void cambiarIdioma(Locale locale){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        crearLibroMenuItem.setText(mensajes.getString("crear"));
        editarLibroMenuItem.setText(mensajes.getString("editar"));
        buscarLibroMenuItem.setText(mensajes.getString("buscar"));
        eliminarLibroMenuItem.setText(mensajes.getString("eliminar"));
        listarLibroMenuItem.setText(mensajes.getString("listar"));
        crearUsuarioMenuItem.setText(mensajes.getString("crear"));
        editarUsuarioMenuItem.setText(mensajes.getString("editar"));
        buscarUsuarioMenuItem.setText(mensajes.getString("buscar"));
        eliminarUsuarioMenuItem.setText(mensajes.getString("eliminar"));
        librosMenu.setText(mensajes.getString("libros"));
        usuariosMenu.setText(mensajes.getString("usuarios"));
        prestamoMenu.setText(mensajes.getString("prestamo"));
        solicitarPrestamoMenuItem.setText(mensajes.getString("solicitarLibro"));
        devolverPrestamoMenuItem.setText(mensajes.getString("devolverLibro"));
        lblSeleccionarBiblio.setText(mensajes.getString("seleccionarBiblioteca"));
        btnSeleccionarBiblioteca.setText(mensajes.getString("seleccionar"));
        listarUsuarioMenuItem.setText(mensajes.getString("listar"));
        
        if(ventanaBuscarBiblioteca != null){
            ventanaBuscarBiblioteca.cambiarIdioma(locale);
        }
        
        if(ventanaActualizarLibro != null){
            ventanaActualizarLibro.cambiarIdioma(locale);
        }
        
        if(ventanaActualizarUsuario != null){
            ventanaActualizarUsuario.cambiarIdioma(locale);
        }
        
        if(ventanaBuscarLIbro != null){
            ventanaBuscarLIbro.cambiarIdioma(locale);
        }
        
        if(ventanaBuscarUsuario != null){
            ventanaBuscarUsuario.cambiarIdioma(locale);
        }
        
        if(ventanaCrearLibro != null){
            ventanaCrearLibro.cambiarIdioma(locale);
        }
        
        if(ventanaCrearUsurio != null){
            ventanaCrearUsurio.cambiarIdioma(locale);
        }
        
        if(ventanaDevolverLibro != null){
            ventanaDevolverLibro.cambiarIdioma(locale);
        }
        
        if(ventanaEliminarLibro != null){
            ventanaEliminarLibro.cambiarIdioma(locale);
        }
        
        if(ventanaEliminarUsuario != null){
            ventanaEliminarUsuario.cambiarIdioma(locale);
        }
        
        if(ventanaListarLibros != null){
            ventanaListarLibros.cambiarIdioma(locale);
        }
        
        if(ventanaSolicitarLibro != null){
            ventanaSolicitarLibro.cambiarIdioma(locale);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarBiblioteca;
    private javax.swing.JMenuItem buscarLibroMenuItem;
    private javax.swing.JMenuItem buscarUsuarioMenuItem;
    private javax.swing.JMenuItem crearLibroMenuItem;
    private javax.swing.JMenuItem crearUsuarioMenuItem;
    private javax.swing.JMenuItem devolverPrestamoMenuItem;
    private javax.swing.JMenuItem editarLibroMenuItem;
    private javax.swing.JMenuItem editarUsuarioMenuItem;
    private javax.swing.JMenuItem eliminarLibroMenuItem;
    private javax.swing.JMenuItem eliminarUsuarioMenuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSeleccionarBiblio;
    private javax.swing.JMenu librosMenu;
    private javax.swing.JMenuItem listarLibroMenuItem;
    private javax.swing.JMenuItem listarUsuarioMenuItem;
    private javax.swing.JMenu prestamoMenu;
    private javax.swing.JMenuItem solicitarPrestamoMenuItem;
    private javax.swing.JTextField txtNombreBiblio;
    private javax.swing.JMenu usuariosMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onBibliotecaSeleccionada(BibliotecaControlador bibliotecaControlador, int codigo) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca=bibliotecaControlador.read(codigo);
        txtNombreBiblio.setText(biblioteca.getNombre());
        this.bibliotecaControlador=bibliotecaControlador;
        bibliotecaControlador.leerArchivoLibro();
        bibliotecaControlador.leerArchivoUsuario();
    }
}
