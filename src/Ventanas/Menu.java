package Ventanas;

import Metodos.Imagenes;
import User.Docente;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    private String id;

    public Menu(String id) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Train Volley");
        this.id = id;
        System.out.println("Id del docente:" + id);
        // Cargar una imagen como icono desde el paquete "img" y establecerla en la ventana
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Logon_sinFondo.png"));
        this.setIconImage(icono.getImage());
        
        Imagenes icon = new Imagenes();
        Icon agregarEquipo = icon.setIcono("/img/profile.png",50, 50);
        botonPerfil.setIcon(agregarEquipo);
        
        Icon salir = icon.setIcono("/img/logout.png",50, 50);
        botonSalir.setIcon(salir);
        Icon asistencia = icon.setIcono("/img/attendance.png",99, 99);
        botonAsistencia.setIcon(asistencia);
        
        Icon rendimiento = icon.setIcono("/img/performance.png",99, 99);
        botonSeguimiento.setIcon(rendimiento);
        
        Icon formar = icon.setIcono("/img/create-folder.png",99, 99);
        botonJugadores.setIcon(formar);
        
        Icon planificar = icon.setIcono("/img/calendar.png",99, 99);
        botonPlanificacion.setIcon(planificar);
        
        
        
        //Aplicar transparencia a los botones
        Imagenes botonesTrans = new Imagenes();
        botonesTrans.transparenciaButton(botonJugadores, botonAsistencia, botonPlanificacion, botonSeguimiento, botonPerfil, botonSalir);
        
        //jDocenteN
        Docente usuario = Docente.obtenerUsuarioPorID(id);
        if (usuario != null) {
            jDocenteN.setText("Bienvenid@: " + usuario.getNombreCompleto());
            
        }
    }
        
    

    private Menu() {
    }

 

  
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonJugadores = new javax.swing.JButton();
        botonAsistencia = new javax.swing.JButton();
        botonPlanificacion = new javax.swing.JButton();
        botonSeguimiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botonPerfil = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jDocenteN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/create-folder.png"))); // NOI18N
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });
        jPanel2.add(botonJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 100));

        botonAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/attendance.png"))); // NOI18N
        botonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsistenciaActionPerformed(evt);
            }
        });
        jPanel2.add(botonAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 100, 100));

        botonPlanificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendar.png"))); // NOI18N
        botonPlanificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlanificacionActionPerformed(evt);
            }
        });
        jPanel2.add(botonPlanificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 100));

        botonSeguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/performance.png"))); // NOI18N
        botonSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguimientoActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 100, 100));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Formar equipos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 140, 110, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("Asistencia");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("Planificar entrenamiento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 160, 20));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel9.setText("Rendimientos");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu-parte2.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 800, 170));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/profile.png"))); // NOI18N
        botonPerfil.setBorder(null);
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });
        jPanel3.add(botonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 60, 60));

        botonSalir.setBackground(new java.awt.Color(252, 252, 215));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        botonSalir.setBorder(null);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel3.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 60, 60));

        jDocenteN.setFont(new java.awt.Font("Rockwell", 0, 25)); // NOI18N
        jDocenteN.setText("Bienvenido ");
        jPanel3.add(jDocenteN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 60));

        jLabel3.setBackground(new java.awt.Color(252, 252, 215));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu-parte1.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/image1.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 300, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void botonJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresActionPerformed
        ventanaCrearEquipo frame = new ventanaCrearEquipo(id);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonJugadoresActionPerformed

    private void botonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAsistenciaActionPerformed

    private void botonPlanificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlanificacionActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_botonPlanificacionActionPerformed

    private void botonSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguimientoActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        ventanaPerfil frame = new ventanaPerfil(id);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Object[] options = {"Sí", "Cancelar"};
        int choice = JOptionPane.showOptionDialog(this, "¿Estás seguro de cerrar sesión?", "Confirmación",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == 0) { // El índice 0 corresponde a "Sí"
            ventanaLogin newframe = new ventanaLogin();
            newframe.setVisible(true);
            this.setVisible(false);
        } else if (choice == 1) { // El índice 1 corresponde a "Cancelar"
            // Realiza las acciones correspondientes si el usuario elige "Cancelar"
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsistencia;
    private javax.swing.JButton botonJugadores;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonPlanificacion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSeguimiento;
    private javax.swing.JLabel jDocenteN;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
