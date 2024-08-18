package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo {

    public int maxPasajeros;
    public Collection<Usuario> listUsuariosAsociados;

    /**
     * Constructor de la clase VehiculoTransporte
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     * @param maxPasajeros
     */
    VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;;
        this.listUsuariosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener el número máximo de pasajeros del vehículo
     * @return
     */
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    /**
     * Método set para modificar el número máximo de pasajeros del vehículo
     * @param maxPasajeros
     */
    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public void agregarUsuario(Usuario usuario) {
        listUsuariosAsociados.add(usuario);
    }

    /**
     * Método toString para mostrar la información de un vehículo de transporte
     * @return
     */
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca + ", Color: " + color + ", Pasajeros máximos: " + maxPasajeros;
    }
}
