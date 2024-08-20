package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo {

    public int maxPasajeros;
    public Collection<Usuario> listUsuariosAsociados;

    /**
     * Constructor de la clase VehiculoTransporte
     * @param placa {string} - La placa de un vehículo de transporte
     * @param modelo {string} - El modelo de un vehículo de transporte
     * @param marca {string} - La marca de un vehículo de transporte
     * @param color {string} - El color de un vehículo de transporte
     * @param maxPasajeros {int} - El número máximo de pasajeros de un vehículo de transporte
     */
    VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;;
        this.listUsuariosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener el número máximo de pasajeros del vehículo
     * @return {Object} - Un objeto con el número máximo de pasajer de un vehículo de transporte
     */
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    /**
     * Método set para modificar el número máximo de pasajeros del vehículo
     * @param maxPasajeros {int} - El número máximo de pasajeros a modificar
     */
    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    /**
     * Método para agregar un usuario a la lista de usuarios asociados
     * @param usuario {Usuario} - El usuario que se va a agregar a la lista
     */
    public void agregarUsuario(Usuario usuario) {
        listUsuariosAsociados.add(usuario);
    }

    /**
     * Método toString para mostrar la información de un vehículo de transporte
     * @return {Object} - Un objeto con la información de un vehículo de transporte
     */
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca + ", Color: " + color + ", Pasajeros máximos: " + maxPasajeros;
    }
}
