package interfaz;

import dominio.Catalogo;
import dominio.Coche;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {

    public static void mostrarInterfaz(){

        Catalogo catalogo = new Catalogo();

        Coche coche1 = new Coche("BMW", "X4",new BigDecimal(60400));
        Coche coche2 = new Coche("BMW", "X5",new BigDecimal(86800));
        Coche coche3 = new Coche("BMW", "X6",new BigDecimal(96800));
        Coche coche4 = new Coche("Ford", "Kuga",new BigDecimal(38250.6));
        Coche coche5 = new Coche("Ford", "Explorer",new BigDecimal(91638.1));
        Coche coche6 = new Coche("Ford", "Mustang mach-e gt",new BigDecimal(55012));
        Coche coche7 = new Coche("Toyota", "Rav4",new BigDecimal(40100));
        Coche coche8 = new Coche("Toyota", "Highlander",new BigDecimal(64500));
        Coche coche9 = new Coche("Toyota", "Land cruiser",new BigDecimal(54300));

        catalogo.annadirCoche(coche1);
        catalogo.annadirCoche(coche2);
        catalogo.annadirCoche(coche3);
        catalogo.annadirCoche(coche5);
        catalogo.annadirCoche(coche6);
        catalogo.annadirCoche(coche7);
        catalogo.annadirCoche(coche8);
        catalogo.annadirCoche(coche9);




    }
}
