package co.edu.uniquindio;

public class VehiculoCarga extends Vehiculo{

    public double capacidadCarga;
    public int numeroEjes;

    /**
     * Constructor de la clase VehiculoCarga
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     * @param capacidadCarga
     * @param numeroEjes
     */
    VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método get para obtener la capacidad de carga del vehículo
     * @return
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método set para modificar la capacidad de carga del vehículo
     * @param capacidadCarga
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método get para obtener el número de ejes del vehículo
     * @return
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Método set para modificar el número de ejes del vehículo
     * @param numeroEjes
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método toString para mostrar la información de un vehículo de carga
     * @return
     */
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca + ", Color: " + color + ", Capacidad: " + capacidadCarga + ", Numero de Ejes: " + numeroEjes;
    }
}
