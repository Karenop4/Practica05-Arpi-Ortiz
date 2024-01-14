/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.*;
import ec.edu.ups.idao.*;
import ec.edu.ups.vista.biblioteca.VentanaCrudBiblioteca;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author karen
 */
public class Inicio extends javax.swing.JFrame {
    private  VentanaCrudBiblioteca ventanaCrudBiblioteca;
    private VentanaSeleccionarBiblioteca ventanaSeleccionarBiblioteca;
    
    private BibliotecaIDAO bibliotecaDAO;
    private BibliotecaControlador bibliotecaControlador;
    private LibroIDAO libroDAO;
    private LibroControlador libroControlador;
    private Locale locale;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        bibliotecaDAO = new BibliotecaDAO();
        libroDAO = new LibroDAO();
        libroControlador = new LibroControlador(libroDAO);
        bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO,libroDAO);
        locale = new Locale("es", "EC");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblGestionBiblio = new javax.swing.JLabel();
        btnCrudBiblioteca = new javax.swing.JButton();
        btnSeleccionarBiblioteca = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        inglesRadioButton = new javax.swing.JRadioButton();
        espanolRadioButton = new javax.swing.JRadioButton();
        lblIdioma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblGestionBiblio.setFont(new java.awt.Font("Righteous", 0, 25)); // NOI18N
        lblGestionBiblio.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionBiblio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionBiblio.setText("GESTIÓN DE BIBLIOTECA");

        btnCrudBiblioteca.setBackground(new java.awt.Color(217, 217, 217));
        btnCrudBiblioteca.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnCrudBiblioteca.setText("Opciones Biblioteca");
        btnCrudBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudBibliotecaActionPerformed(evt);
            }
        });

        btnSeleccionarBiblioteca.setBackground(new java.awt.Color(217, 217, 217));
        btnSeleccionarBiblioteca.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnSeleccionarBiblioteca.setText("Seleccionar Biblioteca");
        btnSeleccionarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarBibliotecaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(217, 217, 217));
        btnSalir.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        buttonGroup2.add(inglesRadioButton);
        inglesRadioButton.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        inglesRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        inglesRadioButton.setText("ENGLISH");
        inglesRadioButton.setToolTipText("");
        inglesRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inglesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(espanolRadioButton);
        espanolRadioButton.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        espanolRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        espanolRadioButton.setText("ESPAÑOL");
        espanolRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espanolRadioButtonActionPerformed(evt);
            }
        });

        lblIdioma.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 255));
        lblIdioma.setText("IDIOMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGestionBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrudBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espanolRadioButton)
                            .addComponent(inglesRadioButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(inglesRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblGestionBiblio)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrudBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeleccionarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(lblIdioma)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espanolRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void btnCrudBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudBibliotecaActionPerformed
        if(ventanaCrudBiblioteca==null)
            ventanaCrudBiblioteca = new VentanaCrudBiblioteca(bibliotecaControlador);
        if(!ventanaCrudBiblioteca.isVisible()){
            
            ventanaCrudBiblioteca.setVisible(true);
            jDesktopPane1.add(ventanaCrudBiblioteca);
        }
    }//GEN-LAST:event_btnCrudBibliotecaActionPerformed

    private void btnSeleccionarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarBibliotecaActionPerformed
        if(ventanaSeleccionarBiblioteca==null)
            ventanaSeleccionarBiblioteca = new VentanaSeleccionarBiblioteca(bibliotecaControlador, libroControlador);
        if(!ventanaSeleccionarBiblioteca.isVisible()){
            
            ventanaSeleccionarBiblioteca.setVisible(true);
            jDesktopPane1.add(ventanaSeleccionarBiblioteca);
        }
    }//GEN-LAST:event_btnSeleccionarBibliotecaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void inglesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesRadioButtonActionPerformed
        if(inglesRadioButton.isSelected()){
            locale = new Locale("en", "US");
            cambiarIdioma(); 
        }
        
    }//GEN-LAST:event_inglesRadioButtonActionPerformed

    private void espanolRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espanolRadioButtonActionPerformed
        if(espanolRadioButton.isSelected()){
            locale = new Locale("es", "EC");
            cambiarIdioma(); 
        }
         
    }//GEN-LAST:event_espanolRadioButtonActionPerformed
    
    
    public void cambiarIdioma(){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        lblGestionBiblio.setText(mensajes.getString("lblGestionBiblio"));
        btnCrudBiblioteca.setText(mensajes.getString("btnCrudBiblioteca"));
        btnSeleccionarBiblioteca.setText(mensajes.getString("seleccionarBiblioteca"));
        btnSalir.setText(mensajes.getString("btnSalir"));
        lblIdioma.setText(mensajes.getString("lblIdioma"));
        
        if(ventanaCrudBiblioteca != null){
            ventanaCrudBiblioteca.cambiarIdioma(locale);
        }
        
        if(ventanaSeleccionarBiblioteca != null){
            ventanaSeleccionarBiblioteca.cambiarIdioma(locale);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrudBiblioteca;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionarBiblioteca;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton espanolRadioButton;
    private javax.swing.JRadioButton inglesRadioButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGestionBiblio;
    private javax.swing.JLabel lblIdioma;
    // End of variables declaration//GEN-END:variables
}
