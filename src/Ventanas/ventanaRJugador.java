/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Metodos.GuardarDatos;
import Metodos.Imagenes;
import Metodos.MEquipos;
import Metodos.ValidarDatos;
import User.Docente;
import User.Jugador;
import static User.Jugador.obtenerListaUsuariosExistenteJ;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author allil
 */
public class ventanaRJugador extends javax.swing.JFrame {
    private String rutaFoto;
    private String nombreFoto;
    private String codEquipo;


    /**
     * Creates new form ventanaRJugador
     */
    public ventanaRJugador(String codEquipo) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Train Volley");
        // Cargar una imagen como icono desde el paquete "img" y establecerla en la ventana
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Logon_sinFondo.png"));
        this.setIconImage(icono.getImage());
        this.codEquipo = codEquipo; // Almacena el código del equipo seleccionado

        System.out.println("codexx:" + codEquipo);
        
        MEquipos metodos = new MEquipos();
        String[] datosEquipo = metodos.cargarEquipo(codEquipo);
        if (datosEquipo != null) {
            CodigoE.setText(codEquipo);
        }
        
    
    }

    private ventanaRJugador() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_NombreCJ = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        btn_Registrarse = new javax.swing.JButton();
        CodigoE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        lbl_ImgJugador = new javax.swing.JLabel();
        txt_NRA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        txt_cbo_Posiciones = new javax.swing.JComboBox<>();
        txt_jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(374, 393));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Jugador");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel3.setText("Documento");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });

        btn_Registrarse.setBackground(new java.awt.Color(250, 190, 149));
        btn_Registrarse.setText("Registrar");
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });

        CodigoE.setFont(new java.awt.Font("Rockwell", 0, 17)); // NOI18N
        CodigoE.setText("Código");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel6.setText("Posición");

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha.png"))); // NOI18N
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        lbl_ImgJugador.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ImgJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 190, 149), 2));

        txt_NRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NRAActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel7.setText("NRA");

        btn_foto.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_foto.setForeground(new java.awt.Color(79, 86, 89));
        btn_foto.setText("Agregar foto");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        txt_cbo_Posiciones.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_cbo_Posiciones.setForeground(new java.awt.Color(79, 86, 89));
        txt_cbo_Posiciones.setMaximumRowCount(12);
        txt_cbo_Posiciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Armador", "Atacante", "Libero", "Central", "Opuesto" }));
        txt_cbo_Posiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cbo_PosicionesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel4.setText("Código del Equipo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ImgJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_NombreCJ, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(txt_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(txt_jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_cbo_Posiciones, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_NRA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ImgJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_foto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cbo_Posiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NRA, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(txt_jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 620, 370));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoRJugador.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed
        String nombreCompletoJ = txt_NombreCJ.getText();
        String documento = txt_Id.getText();
        Date fechaNacimiento = txt_jDateChooser.getDate();
        String posición = (String) txt_cbo_Posiciones.getSelectedItem();
        String nivelRendimiento = txt_NRA.getText();
  
        
      


        
       
        //Lista Jugadores
        List<Jugador> listaJugadores = obtenerListaUsuariosExistenteJ();
        
        ValidarDatos validadorJ = new ValidarDatos();
        if (validadorJ.validarDatosJ(nombreCompletoJ, documento, fechaNacimiento, nivelRendimiento, posición, listaJugadores)) {
            
             // Formatear la fecha en el formato deseado
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String aNacimiento = sdf.format(fechaNacimiento);
       
            Jugador nuevoJugador = new Jugador(nombreCompletoJ, documento, aNacimiento, nivelRendimiento, posición, codEquipo, rutaFoto, nombreFoto);

            GuardarDatos guardadorJ = new GuardarDatos();
            guardadorJ.guardarJugadoresEnArchivo(List.of(nuevoJugador));
            JOptionPane.showMessageDialog(this, "El jugador: " + validadorJ.retornarNombreCJ(documento) + " ha sido registrado" );
            
            // Limpiar campos de texto después de guardar
            txt_NombreCJ.setText("");
            txt_Id.setText("");
            txt_NRA.setText("");
            
            
            // Limpiar el JLabel que muestra la imagen del jugador
            lbl_ImgJugador.setIcon(null);

            // Limpiar variables de la ruta y nombre de la foto
            rutaFoto = null;
            nombreFoto = null;
        } else {
            // Manejar la situación en la que los datos no son válidos
        }
    }//GEN-LAST:event_btn_RegistrarseActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        ventanaInfoE frame = new ventanaInfoE();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void txt_NRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NRAActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
        Imagenes fondos = new Imagenes();
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            rutaFoto = archivoSeleccionado.getAbsolutePath();
            nombreFoto = archivoSeleccionado.getName();
            
            // Mostrar la imagen en el JLabel
            Image mImagen = new ImageIcon(rutaFoto).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lbl_ImgJugador.getWidth(), lbl_ImgJugador.getHeight(), Image.SCALE_SMOOTH));
            lbl_ImgJugador.setText(null);
            lbl_ImgJugador.setIcon(mIcono);
        }
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void txt_cbo_PosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cbo_PosicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cbo_PosicionesActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaRJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaRJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaRJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaRJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaRJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoE;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_ImgJugador;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_NRA;
    private javax.swing.JTextField txt_NombreCJ;
    private javax.swing.JComboBox<String> txt_cbo_Posiciones;
    private com.toedter.calendar.JDateChooser txt_jDateChooser;
    // End of variables declaration//GEN-END:variables
}
