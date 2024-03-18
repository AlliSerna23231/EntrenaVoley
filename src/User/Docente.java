/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allil
 */
public class Docente {
    // Atributos
    private String nombreCompleto;
    private String correoInstitucional;
    private String documento;
    private String credenciales;
    private String contra;
    private String contra2;

    // Constructor
    public Docente(String nombreCompleto, String correoInstitucional, String documento, String credenciales, String contra, String contra2) {
        this.nombreCompleto = nombreCompleto;
        this.correoInstitucional = correoInstitucional;
        this.documento = documento;
        this.credenciales = credenciales;
        this.contra = contra;
        this.contra2 = contra2;
        
    }
    
    //Contructor 2 para iniciar de sesión

    public Docente(String correoInstitucional, String credenciales, String contra) {
        this.correoInstitucional = correoInstitucional;
        this.credenciales = credenciales;
        this.contra = contra;
    }
    

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public String getContraseña() {
        return contra;
    }

    public String getContra2() {
        return contra2;
    }

    
    
    

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    public void setContraseña(String contra) {
        this.contra = contra;
    }
    
    public void setContra2(String contra2) {
        this.contra2 = contra2;
    }
    
    // Método estático para obtener la lista de usuarios existentes desde un archivo de texto
    public static List<Docente> obtenerListaUsuariosExistente() {
        List<Docente> listaUsuarios = new ArrayList<>();
        
        //abrir y leer el archivo Docente.txt
        try (BufferedReader br = new BufferedReader(new FileReader("Docente.txt"))) {
            String linea;
            // Leemos cada línea del archivo
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                // Creamos un nuevo objeto Docente con los datos de la línea y lo agregamos a la lista
                listaUsuarios.add(new Docente(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]));
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores de lectura del archivo
        }
        
        return listaUsuarios;
    }
}