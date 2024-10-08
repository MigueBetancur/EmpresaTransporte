package co.edu.uniquindio;

import javax.swing.JOptionPane;
import java.util.Collection;
import java.util.LinkedList;

public class MainTransporte {
    public static Empresa empresa = new Empresa("Movilidad SA");

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
    }

    /*
     * Método para crear instancias de las clases
     */
    public static void inicializarDatos() {

        VehiculoTransporte vehiculo1 = new VehiculoTransporte("NEM31D", "2024", "Toyota", "Azul", 30);
        VehiculoTransporte vehiculo2 = new VehiculoTransporte("RHW56E", "2022", "Mazda", "Rojo", 24);
        VehiculoTransporte vehiculo3 = new VehiculoTransporte("URQ23L", "2019", "Suzuki", "Blanco", 20);

        Usuario usuario1 = new Usuario("Camila", 23, 62.4);
        Usuario usuario2 = new Usuario("Miguel", 19, 70.2);
        Usuario usuario3 = new Usuario("Santiago", 18, 71.1);

        empresa.agregarVehiculoTransporte(vehiculo1);
        empresa.agregarVehiculoTransporte(vehiculo2);
        empresa.agregarVehiculoTransporte(vehiculo3);

        empresa.agregarUsuario(usuario1);
        empresa.agregarUsuario(usuario2);
        empresa.agregarUsuario(usuario3);

        vehiculo1.agregarUsuario(usuario1);
        vehiculo1.agregarUsuario(usuario2);
        vehiculo1.agregarUsuario(usuario3);
    }

    /*
     * Método para mostrar un menú interactivo
     */
    public static void mostrarMenu() {
        String opcion = "0";
        while (!opcion.equals("6")) {
            String menu = """
                        Menu de registro
                        1. Registrar Propietario con Vehículo
                        2. Contar pasajeros transportados
                        3. Obtener lista de usuarios mayores a un peso determinado
                        4. Obtener cantidad de propietarios mayores de 40 años
                        5. Obtener cantidad de usuarios en un rango de edad determinado
                        6. Salir""";
            opcion = JOptionPane.showInputDialog(null, menu, "Seleccione una opción", JOptionPane.QUESTION_MESSAGE);

            switch (opcion) {
                case "1":
                    registrarPropietarioConVehiculoDeCarga();
                    break;
                case "2":
                    contarPasajerosTransportados();
                    break;
                case "3":
                    obtenerListaUsuariosMayorPeso();
                    break;
                case "4":
                    obtenerListaPropietariosMayores();
                    break;
                case "5":
                    obtenerCantidadUsuariosRangoEdad();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }

    /*
     * Método para contar los pasajeros transportados por un vehículo en específico
     */
    public static void contarPasajerosTransportados() {
        int pasajerosTransportados = 0;
        if(!empresa.listVehiculosTransporte.isEmpty()) {
            String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo de transporte");
            boolean vehiculoEncontrado = false;

            for(VehiculoTransporte vehiculoTransporte : empresa.listVehiculosTransporte) {
                if(vehiculoTransporte.getPlaca().equals(placa)) {
                    vehiculoEncontrado = true;

                    if(!vehiculoTransporte.listUsuariosAsociados.isEmpty()) {
                        pasajerosTransportados = vehiculoTransporte.listUsuariosAsociados.size();
                        JOptionPane.showMessageDialog(null, "Los pasajeros transportados por el vehículo: " + vehiculoTransporte.getPlaca() + " son: " + pasajerosTransportados);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La lista de usuarios del vehículo " + placa + " esta vacía");
                    }
                    break;
                }
            }
            if(!vehiculoEncontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró un vehículo con la placa: " + placa);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay vehículos de transporte en la empresa");
        }
    }

    /*
     * Método para registrar un propietario con un vehículo de carga
     */
    public static void registrarPropietarioConVehiculoDeCarga() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula del propietario");
        String email = JOptionPane.showInputDialog(null, "Ingrese el email del propietario");
        String celular = JOptionPane.showInputDialog(null, "Ingrese el celular del propietario");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del propietario"));

        Propietario propietario = new Propietario(nombre, cedula, email, celular, edad);

        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo de carga");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo de carga");
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del vehículo de carga");
        String color = JOptionPane.showInputDialog(null, "Ingrese el color del vehículo de carga");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga del vehículo de carga"));
        int numeroEjes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de ejes del vehículo de carga"));

        VehiculoCarga vehiculo = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);

        empresa.agregarPropietario(propietario);

        JOptionPane.showMessageDialog(null, propietario);
        JOptionPane.showMessageDialog(null, vehiculo);
    }

    /*
     * Método para obtener una lista de los usuarios que superan un peso dado
     */
    public static void obtenerListaUsuariosMayorPeso() {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso a superar"));

        Collection<Usuario> nuevaLista = new LinkedList<>();
        if(!empresa.getUsuarios().isEmpty()) {
            for(Usuario usuario : empresa.getUsuarios()) {
                if(usuario.getPeso() > peso) {
                    nuevaLista.add(usuario);
                }
            }
            JOptionPane.showMessageDialog(null, nuevaLista);
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay usuarios en la empresa");
        }
    }

    /*
     * Método para obtener cuantos propietarios son mayores de 40 años
     */
    public static void obtenerListaPropietariosMayores() {
        int propietariosMayores = 0;
        for(Propietario propietario : empresa.listPropietarios) {
            if(propietario.getEdad() > 40) {
                propietariosMayores++;
            }
            else {
                propietariosMayores += 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Los propietarios mayores de 40 años son: " + propietariosMayores);
    }

    /*
     * Método para obtener la cantidad de usuarios que se encuentra en un rango de edad dado
     */
    public static void obtenerCantidadUsuariosRangoEdad() {
        int valorInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor inicial del rango"));
        int valorFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor final del rango"));

        int usuariosRangoEdad = 0;
        for(Usuario usuario : empresa.getUsuarios()) {
            if(usuario.getEdad() >= valorInicial && usuario.getEdad() <= valorFinal) {
                usuariosRangoEdad ++;
            }
            else {
                usuariosRangoEdad += 0;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de usuarios que están en el rango de edad entre " + valorInicial + " y " + valorFinal + " años son: " + usuariosRangoEdad);
    }
}