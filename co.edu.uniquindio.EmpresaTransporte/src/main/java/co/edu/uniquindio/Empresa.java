package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    public String nombre;
    public Collection<Propietario> listPropietarios;
    public Collection<VehiculoCarga> listVehiculosCarga;
    public Collection<VehiculoTransporte> listVehiculosTransporte;
    public Collection<Usuario> listUsuarios;

    /**
     * Constructor de la clase Empresa
     * @param nombre {string} - El nombre de la empresa
     */
    Empresa(String nombre) {
        this.nombre = nombre;
        this.listPropietarios = new LinkedList<Propietario>();
        this.listVehiculosCarga = new LinkedList<VehiculoCarga>();
        this.listVehiculosTransporte = new LinkedList<VehiculoTransporte>();
        this.listUsuarios = new LinkedList<Usuario>();
    }

    /**
     * Método get para obtener el nombre de la empresa
     * @return {Object} - Un objeto con el nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre de la empresa
     * @param nombre {string} - El nombre de la empresa a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para agregar un propietario a la lista
     * @param propietario {Propietario} - El propietario que se va a agregar a la lista de propietarios
     */
    public void agregarPropietario(Propietario propietario) {
        this.listPropietarios.add(propietario);
    }

    /**
     * Método get para obtener la lista de propietarios
     * @return {Collection} - Una lista con los propietarios de la empresa
     */
    public Collection<Propietario> getPropietarios() {
        return listPropietarios;
    }

    /**
     * Método para agregar un usuario  a la lista
     * @param usuario {Usuario} - El usuario que se va a agregar a la lista de propietarios
     */
    public void agregarUsuario(Usuario usuario) {
        this.listUsuarios.add(usuario);
    }

    /**
     * Método get para obtener la lista de usuarios
     * @return {Collection} - Una lista con los usuarios de la empresa
     */
    public Collection<Usuario> getUsuarios() {
        return listUsuarios;
    }

    /**
     * Método para agregar un vehículo de carga a la lista
     * @param vehiculoCarga {VehiculoCarga} - El vehículo de carga que se va a agregar a la lista de vehículos de carga
     */
    public void agregarVehiculoCarga(VehiculoCarga vehiculoCarga) {
        this.listVehiculosCarga.add(vehiculoCarga);
    }

    /**
     * Método get para obtener la lista de vehículos de carga
     * @return {Collection} - Una lista con los vehículos de carga de la empresa
     */
    public Collection<VehiculoCarga> getVehiculosCarga() {
        return listVehiculosCarga;
    }

    /**
     * Método para agregar un vehículo de transporte a la lista
     * @param vehiculoTransporte {VehiculoTransporte} - El vehículo de transporte que se va a agregar a la lista de vehículos de transporte
     */
    public void agregarVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        this.listVehiculosTransporte.add(vehiculoTransporte);
    }

    /**
     * Método get para obtener la lista de vehículos de transporte
     * @return {Collection} - Una lista con los vehículos de transporte de la empresa
     */
    public Collection<VehiculoTransporte> getVehiculosTransporte() {
        return listVehiculosTransporte;
    }

    /**
     * Método para obtener un vehículo de transporte con su placa
     * @param placa {string} - La placa por la cual se obtiene el vehículo de transporte
     * @return
     */
    public VehiculoTransporte obtenerVehiculoTransportePorPlaca(String placa) {
        for(VehiculoTransporte vehiculoTransporte: listVehiculosTransporte) {
            if(vehiculoTransporte.placa.equals(placa)) {
                return vehiculoTransporte;
            }
        }
        return  null;
    }
}
