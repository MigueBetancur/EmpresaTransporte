package co.edu.uniquindio;

public class Usuario {

    public String nombre;
    public int edad;
    public double peso;
    public Vehiculo vehiculoAsociado;

    /**
     * Constructor de la clase Usuario
     * @param nombre {string} - El nombre de un usuario
     * @param edad {int} - La edad de un usuario
     * @param peso {double} - El peso de un usuario
     */
    Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Método get para obtener el nombre del usuario
     * @return {Object} - Un objeto con el nombre de un usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre del usuario
     * @param nombre {string} - El nombre de un usuario a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener la edad del usuario
     * @return {Object} - Un objeto con la edad de un usuario
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set para modificar la edad del usuario
     * @param edad {int} - La edad de un usuario a modificar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método get para obtener el peso del usuario
     * @return {Object} - Un objeto con el peso de un usuario
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método set para modificar el peso del usuario
     * @param peso {double} - El peso de un usuario a modificar
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método to String para obtener la información del usuario
     * @return {Object} - Un objeto con la información de un usuario
     */
    public String toString() {
        return "Usuario: " + nombre + ", Edad: " + edad + ", Peso: " + peso;
    }
}
