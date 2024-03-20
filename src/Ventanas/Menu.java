package Ventanas;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        transparenciaButton();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar-jugadores.png"))); // NOI18N
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });
        jPanel2.add(botonJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 60));

        botonAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/asistencia.png"))); // NOI18N
        botonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsistenciaActionPerformed(evt);
            }
        });
        jPanel2.add(botonAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 60));

        botonPlanificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/planificacion.png"))); // NOI18N
        botonPlanificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlanificacionActionPerformed(evt);
            }
        });
        jPanel2.add(botonPlanificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 60));

        botonSeguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/seguimiento.png"))); // NOI18N
        botonSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguimientoActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/opciones.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 500, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJugadoresActionPerformed

    private void botonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAsistenciaActionPerformed

    private void botonPlanificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlanificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPlanificacionActionPerformed

    private void botonSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguimientoActionPerformed

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
    
    public void transparenciaButton(){
        botonJugadores.setOpaque(false);
        botonJugadores.setContentAreaFilled(false);
        botonJugadores.setBorderPainted(false);
        
        botonAsistencia.setOpaque(false);
        botonAsistencia.setContentAreaFilled(false);
        botonAsistencia.setBorderPainted(false);
        
        botonPlanificacion.setOpaque(false);
        botonPlanificacion.setContentAreaFilled(false);
        botonPlanificacion.setBorderPainted(false);
        
        botonSeguimiento.setOpaque(false);
        botonSeguimiento.setContentAreaFilled(false);
        botonSeguimiento.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsistencia;
    private javax.swing.JButton botonJugadores;
    private javax.swing.JButton botonPlanificacion;
    private javax.swing.JButton botonSeguimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
