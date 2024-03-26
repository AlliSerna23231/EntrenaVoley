package User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jugador {
    private String nombreCompletoJ;
    private String documento;
    private String aNacimiento;
    private String nivelRendimiento;
    private String posición;
    private String ruta;
    private String nombreFoto;
    private String codigo;

    public Jugador(String nombreCompletoJ, String documento, String aNacimiento, String nivelRendimiento, String posición, String ruta, String nombreFoto, String codigo) {
        this.nombreCompletoJ = nombreCompletoJ;
        this.documento = documento;
        this.aNacimiento = aNacimiento;
        this.nivelRendimiento = nivelRendimiento;
        this.posición = posición;
        this.ruta = ruta;
        this.nombreFoto = nombreFoto;
        this.codigo = codigo;
    }

    public Jugador() {
    }

    public Jugador(String nombreCompletoJ, String documento, Date aNacimiento, String nivelRendimiento, String posición, String codigos, String rutaFoto, String nombreFoto) {
    }

   

    public String getNombreCompletoJ() {
        return nombreCompletoJ;
    }

    public void setNombreCompletoJ(String nombreCompletoJ) {
        this.nombreCompletoJ = nombreCompletoJ;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getANacimiento() {
        return aNacimiento;
    }

    public void setNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getNivelRendimiento() {
        return nivelRendimiento;
    }

    public void setNivelRendimiento(String nivelRendimiento) {
        this.nivelRendimiento = nivelRendimiento;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    // Método estático para obtener la lista de usuarios existentes desde un archivo de texto
    public static List<Jugador> obtenerListaUsuariosExistenteJ() {
        List<Jugador> listaJugadores = new ArrayList<>();
        
        //abrir y leer el archivo Docente.txt
        try (BufferedReader br = new BufferedReader(new FileReader("Jugadores.txt"))) {
            String linea;
            // Leemos cada línea del archivo
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                // Creamos un nuevo objeto Docente con los datos de la línea y lo agregamos a la lista
                listaJugadores.add(new Jugador(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6], partes[7]));            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores de lectura del archivo
        }
        
        return listaJugadores;
    }
    
    
    /*
    NombreCompleto,Documento,AñoNacimiento,Codigo,Posición,NivelRendimiento,RutaFoto,NombreFoto
Juan Perez,12345678,1990,ABC123,Delantero,Alto,/ruta/a/la/foto1.jpg,foto1.jpg
Maria Rodriguez,98765432,1995,DEF456,Defensa,Medio,/ruta/a/la/foto2.jpg,foto2.jpg
*/

   
    
    

   
   
    
   
}
