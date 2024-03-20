package Metodos;

import User.Docente;
import User.Jugador;
import static User.Jugador.obtenerListaUsuariosExistenteJ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    
    public String retornarNombreCJ(String id, String codigo) {
        try (BufferedReader br = new BufferedReader(new FileReader("Jugadores.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String idAlmacenado = partes[1].trim(); // Recuperamos el documento almacenado
                String codigoAlmacenado = partes[5].trim(); // Recuperamos el código almacenado
                if (id.equals(idAlmacenado) && codigo.equals(codigoAlmacenado)) {
                    return partes[0].trim(); // Devolvemos el nombre del jugador
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Jugadores.txt: " + e.getMessage());
        }
        return null;
    }

    
    public boolean validarDatosJ(String nombreCompletoJ, String documento, String añoNacimiento, String nivelRendimiento, String posición, String codigo, List<Jugador> listaJugadores) {
        // Verificar si algún campo está vacío o nulo
        if (nombreCompletoJ.isEmpty() || documento.isEmpty() || añoNacimiento.isEmpty() || nivelRendimiento.isEmpty() ||  codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Si algún campo está vacío, retornar falso
        }
        
        // Verificar si el documento contiene solo números
        if (!documento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Si el documento no contiene solo números, retornar falso
        }
        
        // Verificar si el código es un entero de 4 dígitos
        if (!codigo.matches("\\d{4}")) {
            JOptionPane.showMessageDialog(null, "El código debe ser un número de 4 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Si el código no es un entero de 4 dígitos, retornar falso
        }
        
        // Verificar si el jugador ya existe en la lista de jugadores
        for (Jugador jugador : listaJugadores) {
            if (jugador.getDocumento().equals(documento)) {
                JOptionPane.showMessageDialog(null, "El jugador ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return false; // Si el jugador ya existe, retornar falso
            }
        }
        
        // Verificar si la posición del jugador ha sido seleccionada
        if ("Seleccionar".equals(posición)) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la posición del jugador.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (añoNacimiento == null || añoNacimiento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de nacimiento.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Verificar si el año de nacimiento es un número válido
        try {
            int añoNac = Integer.parseInt(añoNacimiento);
            // Resto del código de validación aquí
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un año de nacimiento válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Si todas las validaciones pasan, retornar true
        return true;
    }

    private boolean validarExistenciaJugador(String documento) {
        // Leer el archivo de jugadores y verificar si el documento ya existe
        try (BufferedReader br = new BufferedReader(new FileReader("Jugadores.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String documentoAlmacenado = partes[1].trim(); // Obtener el documento almacenado en el archivo
                if (documento.equals(documentoAlmacenado)) {
                    // Si el documento coincide con uno almacenado, mostrar mensaje y retornar true
                    JOptionPane.showMessageDialog(null, "El jugador ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Jugadores.txt: " + e.getMessage());
        }
        return false; // Si no se encontró el documento, retornar false
    }
    

    
    
}


