package Metodos;

import User.Docente;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GuardarDatos {
    public void guardarDocentesEnArchivo(List<Docente> docentes) {
        try {
            FileWriter writer = new FileWriter("Docente.txt", true); // Abre el archivo en modo de agregar (append)
            for (Docente docente : docentes) {
                String linea = docente.getNombreCompleto() + "," +
                               docente.getCorreoInstitucional() + "," +
                               docente.getDocumento() + "," +
                               docente.getCredenciales() + "," +
                               docente.getContraseña() + "," +
                               docente.getContra2()+ "\n";

                writer.write(linea);
            }
            writer.close();
            System.out.println("Datos de docentes guardados correctamente en el archivo Docente.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos de docentes: " + e.getMessage());
        }
    }
}

