/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author allil
 */
public class Imagenes {
    
    public Icon setIcono(String ulr, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(ulr));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    
    FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JGP, PNG & GIF", "jpg", "png", "gif");

    public JFileChooser getFileChooserWithFilter() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG, GIF Images", "jpg", "png", "gif");
        fileChooser.setFileFilter(filter);
        return fileChooser;
    }
    
    
    public void transparenciaButton(JButton botonJugadores, JButton  botonAsistencia, JButton botonPlanificacion, JButton botonSeguimiento, JButton botonPerfil, JButton botonSalir){
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
        
        botonPerfil.setOpaque(false);
        botonPerfil.setContentAreaFilled(false);
        botonPerfil.setBorderPainted(false);
        
        botonSalir.setOpaque(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setBorderPainted(false);
        
    }
    
    
    
    
    
    
    
}
