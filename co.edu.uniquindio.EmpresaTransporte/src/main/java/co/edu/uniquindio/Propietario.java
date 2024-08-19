package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Propietario {

    public String nombre;
    public String cedula;
    public String email;
    public String celular;
    public Vehiculo vehiculoAsociado;
    public Collection<Vehiculo> listVehiculosAsociados;

    /**
     * Constructor de la clase Propietario
     * @param nombre
     * @param cedula
     * @param email
     * @param celular
     */
    Propietario(String nombre, String cedula, String email, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.listVehiculosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener el nombre del propietario
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre del propietario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener la cédula del propietario
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método set para modificar la cédula del propietario
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método get para obtener el email del propietario
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método set para modificar el email del propietario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get para obtener el celular del propietario
     * @return
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método set para modificar el celular del propietario
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculoAsociado = vehiculo;
    }

    /**
     * Método toString para mostrar la información de un propietario
     * @return
     */
    public String toString() {
        return "Propietario: " + nombre + ", Cédula: " + cedula + ", Email: " + email + ", Celular: " + celular;
    }
}
