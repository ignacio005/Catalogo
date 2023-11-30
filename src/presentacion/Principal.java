package presentacion;

import dominio.Catalogo;
import dominio.Coche;
import dominio.enun.Rueda;
import interfaz.Interfaz;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        Coche coche1 = new Coche("BMW", "X5", new BigDecimal(86800));
        Coche coche2 = new Coche("Ford", "Explorer", new BigDecimal(91638.1));
        Coche coche3 = new Coche("Toyota", "Rav4", new BigDecimal(40100));

        catalogo.annadirCoche(coche1);
        catalogo.annadirCoche(coche2);
        catalogo.annadirCoche(coche3);

        System.out.println("Introduzca una de las siguientes peticiones: "
                + "\n Anadir coche:(escribir marca, modelo y precio base del coche) "
                + "\n Eliminar coche: (escribe marca, modelo y precio base del coche) "
                + "\n Mostrar catálogo: (muestra contenido del catálogo) "
                + "\n Calcular el precio final de un coche: (elección de componentes que desea en el coche y mostrar precio final) "
                + "\n Ayuda: (vuelve a mostrar las peticiones) "
                + "\n Salir: (escribe salir para terminar) ");

        String p;
        Boolean seguir;
        do {
            p=Interfaz.leerPeticion();
            seguir=Interfaz.procesarPeticion(p, catalogo);
        }
        while(seguir);
    }
}
