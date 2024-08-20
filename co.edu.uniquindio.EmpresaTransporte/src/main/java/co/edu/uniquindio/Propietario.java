package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Propietario {

    public String nombre;
    public String cedula;
    public String email;
    public String celular;
    public int edad;
    public Vehiculo vehiculoAsociado;
    public Collection<Vehiculo> listVehiculosAsociados;

    /**
     * Constructor de la clase Propietario
     * @param nombre {string} - El nombre del propietario
     * @param cedula {string} - La cédula del propietario
     * @param email {string} - El email del propietario
     * @param celular {string} - El celular del propietario
     * @param edad {int} - La edad del propietario
     */
    Propietario(String nombre, String cedula, String email, String celular, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
        this.listVehiculosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener el nombre de un propietario
     * @return {Object} - Un objeto con el nombre de un propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre de un propietario
     * @param nombre {string} - El nombre de un propietario a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener la cédula de un propietario
     * @return {Object} - Un objeto con la cédula de un propietario
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método set para modificar la cédula de un propietario
     * @param cedula {string} - La cédula de un propietario a modificar
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método get para obtener el email de un propietario
     * @return {Object} - Un objeto con el email de un propietario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método set para modificar el email de un propietario
     * @param email {string} - El email de un propietario a modificar
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get para obtener el celular de un propietario
     * @return {Object} - Un objeto con el celular de un propietario
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método set para modificar el celular de un propietario
     * @param celular {string} - El celular de un propietario a modificar
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método get para obtener la edad de un propietario
     * @return {Object} - Un objeto con la edad de un propietario
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set para modificar la edad de un propietario
     * @param edad {int} - La edad de un propietario a modificar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para asociar un vehiculo a un propietario
     * @param vehiculo {Vehiculo} - El vehículo que se va a asociar con un propietario
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculoAsociado = vehiculo;
    }

    /**
     * Método toString para mostrar la información de un propietario
     * @return {Object} - Un objeto con la información de un propietario
     */
    public String toString() {
        return "Propietario: " + nombre + ", Cédula: " + cedula + ", Email: " + email + ", Celular: " + celular;
    }
}
