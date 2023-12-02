package interfaz;

import dominio.Catalogo;
import dominio.Coche;
import dominio.enun.Asientos;
import dominio.enun.Color;
import dominio.enun.Combustible;
import dominio.enun.Rueda;

import java.math.BigDecimal;
import java.util.Scanner;

public class Interfaz {
    private static Scanner sc = new Scanner(System.in);

    public static boolean procesarPeticion(String peticion, Catalogo c) {
        if (peticion == null || peticion.isEmpty()) {
            System.out.println("Consulta ayuda.");
            return true;
        }

        if (peticion.equals("Ayuda")) {
            MostrarInstrucciones();
        } else if (peticion.equals("Mostrar catálogo")) {
            System.out.println(c.toString());
        } else if (peticion.equals("Salir")) {
            return false;
        }else if (peticion.equals("Añadir coche")) {
            annadirCoche(c);
        }else if (peticion.equals("Eliminar coche")) {
            //eliminarCoche(p[1], c);
        }else if (peticion.equals("Calcular el precio final de un coche")) {
            //sc.PrecioTotal();
        }else {

            System.out.println("Petición erronea. Pida ayuda.");
            return true;

        }

        return true;
    }

    public static String leerPeticion() {
        System.out.print("?>");
        String cadena = sc.nextLine();
        return cadena;
    }

    public static void annadirCoche(Catalogo c) {
        String nombremarca;
        String modelo;
        BigDecimal preciobase;
        int tamano;
        Rueda rueda;
        String combustible;
        Combustible combustible1;
        String color;
        Color color1;
        String materialasientos;
        Asientos asientos;

        nombremarca=PedirporConsola("Introduzca la marca:");
        modelo=PedirporConsola("Introduzca el modelo:");
        preciobase=new BigDecimal(PedirporConsola("Introduzca el preco base:"));
        tamano= Integer.parseInt(PedirporConsola("Introduzca el tamaño de la rueda: " + Rueda.GRANDE.getTamano() + " o " + Rueda.PEQUENO.getTamano()));
        combustible=PedirporConsola("Introduzca el combustible:");
        color=PedirporConsola("Introduzca el color:");
        materialasientos=PedirporConsola("Introduzca el tipo de material del asiento:");

        if(tamano==Rueda.GRANDE.getTamano()){
            rueda=Rueda.GRANDE;
        }else if (tamano==Rueda.PEQUENO.getTamano()){
            rueda=Rueda.PEQUENO;
        }else {
            System.out.println("Tamaño de rueda no reconocido.");
            return ;
        }

        if (combustible.equals(Combustible.GASOLINA.getCombustible())){
            combustible1=Combustible.GASOLINA;
        } else if (combustible.equals(Combustible.DIESEL.getCombustible())) {
            combustible1=Combustible.DIESEL;
        } else if (combustible.equals(Combustible.HIBRIDO.getCombustible())) {
            combustible1=Combustible.HIBRIDO;
        } else if (combustible.equals(Combustible.ELECTRICO.getCombustible())) {
            combustible1=Combustible.ELECTRICO;
        }else {
            System.out.println("Combustible no reconocido.");
            return;
        }
        
        if (color.equals(Color.BLANCO.getColor())){
            color1=Color.BLANCO;
        } else if (color.equals(Color.NEGRO.getColor())) {
            color1=Color.NEGRO;
        } else if (color.equals(Color.ROJO.getColor())) {
            color1=Color.ROJO;
        } else if (color.equals(Color.AZUL.getColor())) {
            color1=Color.ROJO;
        } else {
            System.out.println("Color no reconocido.");
            return;
        }

        if (materialasientos.equals(Asientos.CUERO.getMaterialasientos())){
            asientos=Asientos.CUERO;
        } else if (materialasientos.equals(Asientos.TELA.getMaterialasientos())) {
            asientos=Asientos.TELA;
        }else {
            System.out.println("Material de asiento no reconocido.");
            return;
        }

        Coche cocheannadido = new Coche(nombremarca, modelo, preciobase);
        c.annadirCoche(cocheannadido);

        System.out.println("Se añadió exitosamente el coche.");
    }

    public static void eliminarCoche(String peticion, Catalogo c, Coche coche) {
        String posicion;
        System.out.println(c.toString());
        Integer.parseInt(posicion)=PedirporConsola("Introduzca posición a eliminar:");
        c.eliminarCoche(coche);
    }

    public static void MostrarInstrucciones() {
        System.out.println("Introduzca una de las siguientes peticiones: "
                + "\n Añadir coche"
                + "\n Eliminar coche"
                + "\n Mostrar catálogo"
                + "\n Calcular precio"
                + "\n Ayuda"
                + "\n Salir");
    }

    public static String PedirporConsola(String solicitud) {
        System.out.println(solicitud);
        return leerPeticion();
    }


}

