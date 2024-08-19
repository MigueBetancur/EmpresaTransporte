package co.edu.uniquindio;

import javax.swing.JOptionPane;

public class MainTransporte {
    public static Empresa empresa = new Empresa("Movilidad SA");

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
    }

    public static void inicializarDatos() {

        VehiculoTransporte vehiculo1 = new VehiculoTransporte("NEM31D", "2024", "Toyota", "Azul", 30);
        VehiculoTransporte vehiculo2 = new VehiculoTransporte("RHW56E", "2022", "Mazda", "Rojo", 24);
        VehiculoTransporte vehiculo3 = new VehiculoTransporte("URQ23L", "2019", "Suzuki", "Blanco", 20);

        Usuario usuario1 = new Usuario("Camila", 23);
        Usuario usuario2 = new Usuario("Miguel", 19);
        Usuario usuario3 = new Usuario("Santiago", 18);

        empresa.agregarVehiculoTransporte(vehiculo1);
        empresa.agregarVehiculoTransporte(vehiculo2);
        empresa.agregarVehiculoTransporte(vehiculo3);

        vehiculo1.agregarUsuario(usuario1);
        vehiculo1.agregarUsuario(usuario2);
        vehiculo1.agregarUsuario(usuario3);
    }

    public static void mostrarMenu() {
        String opcion = "0";
        while (!opcion.equals("3")) {
            String menu = """
                        Menu de registro
                        1. Registrar Propietario con Vehículo
                        2. Contar pasajeros transportados
                        3. Salir""";
            opcion = JOptionPane.showInputDialog(null, menu, "Seleccione una opción", JOptionPane.QUESTION_MESSAGE);

            switch (opcion) {
                case "1":
                    registrarPropietarioConVehiculoDeCarga();
                    break;
                case "2":
                    contarPasajerosTransportados();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }

    public static void contarPasajerosTransportados() {
        int pasajerosTransportados = 0;
        if(!empresa.listVehiculosTransporte.isEmpty()) {
            for(VehiculoTransporte vehiculoTransporte : empresa.listVehiculosTransporte) {
                if(!vehiculoTransporte.listUsuariosAsociados.isEmpty()) {
                    for(Usuario usuario : vehiculoTransporte.listUsuariosAsociados) {
                        pasajerosTransportados++;
                    }
                    JOptionPane.showMessageDialog(null, "Los pasajeros transportados por el vehículo: " + vehiculoTransporte.getPlaca() + " son: " + pasajerosTransportados);
                }
                else {
                    JOptionPane.showMessageDialog(null, "La lista de usuarios del vehículo " + vehiculoTransporte.getPlaca() + " esta vacía");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay vehículos de transporte en la empresa");
        }
    }

    public static void registrarPropietarioConVehiculoDeCarga() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula del propietario");
        String email = JOptionPane.showInputDialog(null, "Ingrese el email del propietario");
        String celular = JOptionPane.showInputDialog(null, "Ingrese el celular del propietario");

        Propietario propietario = new Propietario(nombre, cedula, email, celular);

        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo de carga");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo de carga");
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del vehículo de carga");
        String color = JOptionPane.showInputDialog(null, "Ingrese el color del vehículo de carga");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga del vehículo de carga"));
        int numeroEjes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de ejes del vehículo de carga"));

        VehiculoCarga vehiculo = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);

        JOptionPane.showMessageDialog(null, propietario);
        JOptionPane.showMessageDialog(null, vehiculo);
    }
}