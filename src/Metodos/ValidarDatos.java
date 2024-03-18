package Metodos;

import User.Docente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.List;

public class ValidarDatos {
    
    public boolean validarDatos(String nombreCompleto, String credenciales, String documento, String correoInstitucional, String contra, String contra2, List<Docente> listaUsuarios) {
        // Verificar que no haya campos vacíos
        if (nombreCompleto.isEmpty() || credenciales.isEmpty() || documento.isEmpty() || correoInstitucional.isEmpty() || contra.isEmpty() || contra2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verificar que las contraseñas sean iguales
        if (!contra.equals(contra2)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verificar que el documento sea numérico
        if (!documento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verificar que las credenciales tengan números y letras al mismo tiempo
        if (!credenciales.matches("^(?=.*[a-zA-Z])(?=.*\\d).+$")) {
            JOptionPane.showMessageDialog(null, "Las credenciales deben contener al menos una letra y un número.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verificar el dominio del correo
        if (!correoInstitucional.endsWith("@elpoli.edu.co")) {
            JOptionPane.showMessageDialog(null, "El correo debe ser institucional de @elpoli.edu.co.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Verificar si ya existe un usuario con la misma credencial
        for (Docente usuario : listaUsuarios) {
            if (usuario.getCredenciales().equals(credenciales)) {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con la misma credencial.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        // Verificar si ya existe un usuario con la misma credencial o correo institucional
        for (Docente usuario : listaUsuarios) {
            if (usuario.getCredenciales().equals(credenciales)) {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con la misma credencial.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (usuario.getCorreoInstitucional().equals(correoInstitucional)) {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con el mismo correo institucional.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        return true; // Todos los datos son válidos
    }
    
    
    
    public boolean validarDatosInicio(String correoInstitucional, String contra, String credenciales) {
        // Verificar que no haya campos vacíos
        if (correoInstitucional.isEmpty() || credenciales.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Leer el archivo Docente.txt y comparar los datos
        try (BufferedReader br = new BufferedReader(new FileReader("Docente.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String correoAlmacenado = partes[1].trim(); // Recuperamos el correo almacenado
                String contraAlmacenada = partes[4].trim(); // Recuperamos la contraseña almacenada
                String credencialesAlmacenadas = partes[3].trim(); // Recuperamos las credenciales almacenadas
                // Comparamos los datos ingresados con los almacenados
                if (correoInstitucional.equals(correoAlmacenado) && contra.equals(contraAlmacenada) && credenciales.equals(credencialesAlmacenadas)) {
                    // Coincidencia encontrada, devolvemos true
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Docente.txt: " + e.getMessage());
        }
        
        // Si no se encontró una coincidencia, devolvemos false
        JOptionPane.showMessageDialog(null, "Correo institucional, credenciales o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public String retornarNombreC(String correoInstitucional, String contra, String credenciales){
        // Leer el archivo Docente.txt y comparar los datos
        try (BufferedReader br = new BufferedReader(new FileReader("Docente.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String correoAlmacenado = partes[1].trim(); // Recuperamos el correo almacenado
                String contraAlmacenada = partes[4].trim(); // Recuperamos la contraseña almacenada
                String credencialesAlmacenadas = partes[3].trim(); // Recuperamos las credenciales almacenadas
                // Comparamos los datos ingresados con los almacenados
                if (correoInstitucional.equals(correoAlmacenado) && contra.equals(contraAlmacenada) && credenciales.equals(credencialesAlmacenadas)) {
                    // Coincidencia encontrada, devolvemos true
                    return partes[0].trim();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Docente.txt: " + e.getMessage());
        }
        return null;
        
    }
}


