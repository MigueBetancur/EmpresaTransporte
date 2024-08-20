package co.edu.uniquindio;

public class VehiculoCarga extends Vehiculo{

    public double capacidadCarga;
    public int numeroEjes;

    /**
     * Constructor de la clase VehiculoCarga
     * @param placa {string} - La placa de un vehículo de carga
     * @param modelo {string} - El modelo de un vehículo de carga
     * @param marca {string} - La marca de un vehículo de carga
     * @param color {string} - El color de un vehículo de carga
     * @param capacidadCarga {double} - La capacidad de carga de un vehículo de carga
     * @param numeroEjes {int} - El número de ejes de un vehículo de carga
     */
    VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método get para obtener la capacidad de carga del vehículo
     * @return {Object} - Un objeto con la capacidad de carga de un vehículo de carga
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método set para modificar la capacidad de carga del vehículo
     * @param capacidadCarga {double} - La capacidad de carga a modificar
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método get para obtener el número de ejes del vehículo
     * @return {Object} - Un objeto con el número de ejes de un vehículo de carga
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Método set para modificar el número de ejes del vehículo
     * @param numeroEjes {int} - El número de ejes a modificar
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método toString para mostrar la información de un vehículo de carga
     * @return {Object} - Un objeto con la información de un vehículo de carga
     */
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca + ", Color: " + color + ", Capacidad: " + capacidadCarga + ", Numero de Ejes: " + numeroEjes;
    }
}
