package interfaz;

import dominio.Catalogo;

import java.util.Scanner;

public class Interfaz {
    private static Scanner sc = new Scanner(System.in);

    public static boolean procesarPeticion(String peticion, Catalogo c) {
        if (peticion == null) {
            System.out.println("Consulta ayuda.");
            return true;
        }
        String[] p = peticion.split(": ");
        if (p.length > 2) {
            System.out.println("Petición erronea.");
            return true;
        } else if (p.length == 1) {
            if (p[0].equals("Ayuda")) {
                System.out.println("Introduzca una de las siguientes peticiones: "
                        + "\n Anadir coche:(escribir marca, modelo y precio base del coche) "
                        + "\n Eliminar coche: (escribe marca, modelo y precio base del coche) "
                        + "\n Mostrar catálogo: (muestra contenido del catálogo) "
                        + "\n Calcular el precio final de un coche: (elección de componentes que desea en el coche y mostrar precio final) "
                        + "\n Ayuda: (vuelve a mostrar las peticiones) "
                        + "\n Salir: (escribe salir para terminar) ");

            } else if (p[0].equals("Mostrar catálogo")) {
                System.out.println(c.getCoches().toString());
            } else if (p[0].equals("Salir")) {
                return false;
            } else {

                System.out.println("Petición erronea. Pida ayuda.");
                return true;

            }
            if (p[0].equals("Anadir coche")) {

                //annadirCoche(p[1], c);
            }

            if (p[0].equals("Eliminar coche")) {

                //eliminarCoche(p[1], c);
            }

            if (p[0].equals("Calcular el precio final de un coche")) {

                //sc.PrecioTotal();
            }
            return true;
        }
        return true;
    }

    public static String leerPeticion() {

        System.out.print("?>");
        String cadena = sc.nextLine();
        return cadena;
    }
}

