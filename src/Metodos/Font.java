package Metodos;

import java.awt.Component;
import java.awt.Container;
//import java.awt.Font;

/**
 *
 * @author allil
 */
public class Font {
    public static void setFontToComponents(Container container, java.awt.Font font) {
        for (Component comp : container.getComponents()) {
            if (comp instanceof Container) {
                setFontToComponents((Container) comp, font);
            }
            comp.setFont(font);
        }
    }
}
