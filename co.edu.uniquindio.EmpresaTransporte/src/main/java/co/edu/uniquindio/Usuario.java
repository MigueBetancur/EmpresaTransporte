package co.edu.uniquindio;

public class Usuario {

    public String nombre;
    public int edad;
    public double peso;
    public Vehiculo vehiculoAsociado;

    /**
     * Constructor de la clase Usuario
     * @param nombre
     * @param edad
     * @param peso
     */
    Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Método get para obtener el nombre del usuario
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para modificar el nombre del usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para obtener la edad del usuario
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set para modificar la edad del usuario
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método get para obtener el peso del usuario
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método set para modificar el peso del usuario
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método to String para obtener la información del usuario
     * @return
     */
    public String toString() {
        return "Usuario: " + nombre + ", Edad: " + edad + ", Peso: " + peso;
    }
}
