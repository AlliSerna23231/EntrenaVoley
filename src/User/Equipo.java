package User;

import java.util.ArrayList; 

public class Equipo {
    private String codigo;
    private String nombreEquipo;
    private String tipoEquipo;
    private int cantidadJugadores;
    private ArrayList<String> listaJugadores; // Lista de jugadores

    // Constructor
    public Equipo(String codigo, String nombreEquipo, String tipoEquipo, int cantidadJugadores) {
        this.codigo = null;
        this.nombreEquipo = nombreEquipo;
        this.cantidadJugadores = 0;
        this.tipoEquipo = tipoEquipo;
        // falta agregar el JOptionMesssageInput para agregar el tipo de equipo
    }

   
    /*public Equipo(String codigoEquipo, String nombreEquipo, int i) {
        this.codigo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.cantidadJugadores = 0;
    }*/

    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    
    public void incrementarCantidadJugadores() {
        cantidadJugadores++;
    }

    public ArrayList<String> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<String> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
    
}
