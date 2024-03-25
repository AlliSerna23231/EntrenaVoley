package Metodos;

import User.Equipo;
import Ventanas.ventanaInfoE;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MEquipos {


    public MEquipos(String codEquipo) {
    }

    
    
    private List<Equipo> equipos;

    public MEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    //Método vacío para invicar desde la otra clase
    public MEquipos() {

    }

    // Método para agregar un equipo
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para buscar un equipo por su código
    public Equipo buscarEquipoPorCodigo(String codigo) {
        for (Equipo equipo : equipos) {
            if (equipo.getCodigo() == codigo) {
                return equipo;
            }
        }
        return null; // Devuelve null si no se encuentra ningún equipo con el código especificado
    }

    // Método para obtener todos los equipos
    public List<Equipo> obtenerTodosLosEquipos() {
        return equipos;
    }

    public String obtenerCodEquipo(String nombreEquipo) {
    try (BufferedReader equipoReader = new BufferedReader(new FileReader("equipo.txt"))) {
        String lineaEquipo;
        while ((lineaEquipo = equipoReader.readLine()) != null) {
            String[] datosEquipo = lineaEquipo.split(";");
            String nombreCompleto = datosEquipo[1]; // Suponiendo que el nombre del equipo está en la segunda posición de cada línea

            if (nombreCompleto.equals(nombreEquipo)) {
                return datosEquipo[0]; // Devuelve el código del equipo
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return null; // Si no se encuentra el equipo
}

    
    public String[] cargarEquipo(String codEquipo) {
    try (BufferedReader br = new BufferedReader(new FileReader("equipo.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            if (datos.length >= 4 && datos[0].equals(codEquipo)) {
                String nombre = datos[1];
                String tipoEquipo = datos[2];
                String cantidadJugadores = datos[3];
                return new String[]{nombre, tipoEquipo, cantidadJugadores};
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}


    public void abrirInfoE(String codEquipo) {
        ventanaInfoE frame = new ventanaInfoE(codEquipo);
        frame.setVisible(true);
    }

    
    
    public List<String> Jugadores(String nombreEquipo) {
        List<String> nombresCompletos = new ArrayList<>();
        try {
            BufferedReader cursoReader = new BufferedReader(new FileReader("equipo.txt"));
            String lineaCurso;
            while ((lineaCurso = cursoReader.readLine()) != null) {
                String[] datosEquipo = lineaCurso.split(";");
                if (datosEquipo.length >= 1 && datosEquipo[1].equals(nombreEquipo)) {
                    for (int i = 0; i < datosEquipo.length; i++) {
                        String codeEquipo = datosEquipo[i];
                        String nombreCompleto = NombreCompletoEquipo(codeEquipo);

                        if (!nombreCompleto.isEmpty()) {
                            nombresCompletos.add(nombreCompleto);
                            List<String> nombresEstudiantes = new ArrayList<>();
                            nombresEstudiantes.add(nombreCompleto);
                        }

                    }
                    break;
                }
            }
            cursoReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombresCompletos;
    }

    public String NombreCompletoEquipo(String codEquipo) {
        String nombreCompleto = "";

        try {
            BufferedReader cursoReader = new BufferedReader(new FileReader("equipo.txt"));
            String lineaE;
            while ((lineaE = cursoReader.readLine()) != null) {
                String[] datosCurso = lineaE.split(";");
                if (datosCurso.length >= 4 && datosCurso[0].equals(codEquipo)) {
                    String nombre = datosCurso[1];
                    nombreCompleto = nombre;

                    break; // Se encontró el ID del estudiante, se detiene la búsqueda
                }
            }
            cursoReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombreCompleto;
    }

    public static List<Equipo> leerArchivoEquipos(String nombreArchivo) {
        List<Equipo> equipos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(";");
                if (datos.length >= 4) {
                    String codigo = datos[0];
                    int cantidadEstudiantes = Integer.parseInt(datos[3]);
                    String nombre = datos[1];
                    String tipoEquipo = datos[2];
                    Equipo equipo = new Equipo(codigo, nombre, tipoEquipo, cantidadEstudiantes);
                    equipos.add(equipo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return equipos;
    }
}
