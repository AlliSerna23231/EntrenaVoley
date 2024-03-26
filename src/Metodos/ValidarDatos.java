package Metodos;

import User.Docente;
import User.Jugador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
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
                System.out.println("Línea leída: " + linea); // Imprimir la línea leída
                String[] partes = linea.split(",");
                System.out.println("Partes divididas:");
                for (String parte : partes) {
                    System.out.println(parte); // Imprimir cada parte dividida
                }

                // Comparar los datos con los ingresados por el usuario
                String correoAlmacenado = partes[1].trim();
                String contraAlmacenada = partes[4].trim();
                String credencialesAlmacenadas = partes[3].trim();

                // Verificar el dominio del correo
                if (!correoInstitucional.endsWith("@elpoli.edu.co")) {
                    JOptionPane.showMessageDialog(null, "El correo debe ser institucional de @elpoli.edu.co.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                if (correoInstitucional.equals(correoAlmacenado)
                        && contra.equals(contraAlmacenada)
                        && credenciales.equals(credencialesAlmacenadas)) {
                    // Coincidencia encontrada, devolvemos true
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Docente.txt: " + e.getMessage());
            e.printStackTrace();
        }

// Si no se encontró una coincidencia, devolvemos false
        JOptionPane.showMessageDialog(null, "Credenciales o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;

    }

    public String retornarNombreC(String correoInstitucional, String contra, String credenciales) {
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

    public String obtenerIdUsuarioDesdeArchivo(String correoInstitucional, String credenciales, String contra) {
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
                    return partes[2].trim();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Docente.txt: " + e.getMessage());
        }
        return null;
    }

    public String retornarNombreCJ(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("Jugadores.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String idAlmacenado = partes[1].trim(); // Recuperamos el documento almacenado
                if (id.equals(idAlmacenado)) {
                    return partes[0].trim(); // Devolvemos el nombre del jugador
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo Jugadores.txt: " + e.getMessage());
        }
        return null;
    }

    public boolean validarDatosJ(String nombreCompletoJ, String documento, Date fechaNacimiento, String nivelRendimiento, String posición, List<Jugador> listaJugadores) {
        // Obtener el año actual
        Calendar calendar = Calendar.getInstance();
        int añoActual = calendar.get(Calendar.YEAR);

        // Verificar si algún campo está vacío o nulo
        if (nombreCompletoJ.isEmpty() || documento.isEmpty() || nivelRendimiento.isEmpty() || fechaNacimiento == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios, incluida la fecha de nacimiento.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Si algún campo está vacío, retornar falso
        }

        // Verificar si el documento contiene solo números
        if (!documento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Si el documento no contiene solo números, retornar falso
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

        // Obtener el año de nacimiento del jugador
        Calendar calNacimiento = Calendar.getInstance();
        calNacimiento.setTime(fechaNacimiento);
        int añoNacimiento = calNacimiento.get(Calendar.YEAR);

        // Verificar si la fecha de nacimiento es de hace muchos años atrás o del año actual
        if (añoNacimiento < añoActual - 100 || añoNacimiento > añoActual) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (añoNacimiento >= añoActual || añoActual - añoNacimiento < 15) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
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
