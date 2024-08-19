package co.edu.uniquindio;

import java.util.Collection;
import java.util.LinkedList;

public class Vehiculo {

    public String placa;
    public String modelo;
    public String marca;
    public String color;
    public Propietario propietarioAsociado;
    public Collection <Propietario> listPropietariosAsociados;

    /**
     * Constructor de la clase Vehículo
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     */
    Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.listPropietariosAsociados = new LinkedList<>();
    }

    /**
     * Método get para obtener la placa del vehículo
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método set para modificar la placa del vehículo
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Método get para obtener el modelo del vehículo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método set para modificar el modelo del vehículo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método get para obtener la marca del vehículo
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método set para modificar la marca del vehículo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el color del vehículo
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para modificar el color del vehículo
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }


}
