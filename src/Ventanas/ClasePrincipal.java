
package Ventanas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class ClasePrincipal {
    
    static int contador = 0;
    
    public static void main(String[] args) {
        int velocidad = 5;
        
        Timer timer;
        TimerTask tarea;
        
        int velmil = velocidad * 1000;
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
        tarea = new TimerTask(){
            @Override
            public void run() {
                Icon icono;
                switch(contador){
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/img/image1.png"));
                        menu.jLabel10.setIcon(icono);
                    break;
                    
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/img/image2.png"));
                        menu.jLabel10.setIcon(icono);
                    break;
                    
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/img/image3.png"));
                        menu.jLabel10.setIcon(icono);
                    break;
                }
                
            }
            
        };
        
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
    
}
