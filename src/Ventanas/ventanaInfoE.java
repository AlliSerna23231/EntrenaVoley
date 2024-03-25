/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Metodos.Imagenes;
import Metodos.MEquipos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author allil
 */
public class ventanaInfoE extends javax.swing.JFrame {
    
    private String codEquipo; // Atributo para almacenar el código del equipo seleccionado
    
    /**
     * Creates new form ventanaInfoE
     */
    public ventanaInfoE(String codEquipo) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Train Volley");
        // Cargar una imagen como icono desde el paquete "img" y establecerla en la ventana
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Logon_sinFondo.png"));
        this.setIconImage(icono.getImage());
        Imagenes icon = new Imagenes();
        System.out.println("Código de equipo SELECCIONADO: " + codEquipo);
        this.codEquipo = codEquipo; // Almacena el código del equipo seleccionado

        
       MEquipos metodos = new MEquipos();
        String[] datosEquipo = metodos.cargarEquipo(codEquipo);
        if (datosEquipo != null) {
            jNombreE.setText(datosEquipo[0]);
            jCodigoE.setText(codEquipo);
            jTipoE.setText(datosEquipo[1]);
            jCantJ.setText(datosEquipo[2]);
        }
    }
    
    public ventanaInfoE() {
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
        jInfoE = new javax.swing.JPanel();
        jNombreE = new javax.swing.JLabel();
        jCodigoE = new javax.swing.JLabel();
        jTipoE = new javax.swing.JLabel();
        jCantJ = new javax.swing.JLabel();
        jAsistencia = new javax.swing.JButton();
        jListaJ = new javax.swing.JScrollPane();
        jAgregarEstudiante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInfoE.setBackground(new java.awt.Color(255, 255, 255));
        jInfoE.setForeground(new java.awt.Color(204, 204, 255));
        jInfoE.setOpaque(false);
        jInfoE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNombreE.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jNombreE.setText("Nombre Equipo:");
        jInfoE.add(jNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jCodigoE.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jCodigoE.setText("Codigo:");
        jInfoE.add(jCodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, -1));

        jTipoE.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jTipoE.setText("Tipo de Equipo");
        jInfoE.add(jTipoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jCantJ.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jCantJ.setText("Cjugadore");
        jInfoE.add(jCantJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, 30));

        jAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Asistencias.png"))); // NOI18N
        jAsistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInfoE.add(jAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, 50));
        jInfoE.add(jListaJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 470, 160));

        jAgregarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AgregarEstudiante.png"))); // NOI18N
        jAgregarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarEstudianteActionPerformed(evt);
            }
        });
        jInfoE.add(jAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 110, 50));

        jPanel1.add(jInfoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 470, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/RFondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 800, 510));

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

    private void jAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarEstudianteActionPerformed
        ventanaRJugador frame = new ventanaRJugador(codEquipo);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jAgregarEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInfoE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInfoE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInfoE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInfoE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInfoE();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarEstudiante;
    private javax.swing.JButton jAsistencia;
    private javax.swing.JLabel jCantJ;
    private javax.swing.JLabel jCodigoE;
    private javax.swing.JPanel jInfoE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jListaJ;
    private javax.swing.JLabel jNombreE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTipoE;
    // End of variables declaration//GEN-END:variables
}
