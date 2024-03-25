package Ventanas;

import javax.swing.ImageIcon;

public class ventanaInicial extends javax.swing.JFrame {

    public ventanaInicial() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Train Volley");
        // Cargar una imagen como icono desde el paquete "img" y establecerla en la ventana
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Logon_sinFondo.png"));
        this.setIconImage(icono.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEntrar = new javax.swing.JButton();
        BotonRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEntrar.setBackground(new java.awt.Color(255, 153, 51));
        botonEntrar.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        botonEntrar.setText("Iniciar Sesión");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 150, 40));

        BotonRegistro.setBackground(new java.awt.Color(255, 153, 51));
        BotonRegistro.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        BotonRegistro.setText("Registrarse");
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Bienvenida.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        ventanaLogin frame = new ventanaLogin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        ventanaRegistro frame = new ventanaRegistro();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
