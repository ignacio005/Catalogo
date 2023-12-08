package presentacion;

import dominio.Catalogo;
import dominio.Coche;
import dominio.enun.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
            eliminarCoche(c);
        }else if (peticion.equals("Calcular precio")) {
            calcularPrecio(c);
        }else if (peticion.equals("Modificar coche")) {
            modificarCoche(c);
        }else {

            System.out.println("Petición erronea. Pida ayuda.");
            return true;

        }

        return true;
    }

    public static String leerPeticion() {
        System.out.print("?> ");
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
        String tipodecambio;
        Tipodecambio cambios;

        nombremarca=PedirporConsola("Introduzca la marca:");
        modelo=PedirporConsola("Introduzca el modelo:");
        preciobase=new BigDecimal(PedirporConsola("Introduzca el preco base:"));
        tamano= Integer.parseInt(PedirporConsola("Introduzca el tamaño de la rueda: " + Rueda.GRANDE.getTamano() + " o " + Rueda.PEQUENO.getTamano()));
        combustible=PedirporConsola("Introduzca el combustible: " + Combustible.GASOLINA.getCombustible() + ", " + Combustible.DIESEL.getCombustible() + ", " + Combustible.HIBRIDO.getCombustible() + " o " + Combustible.ELECTRICO.getCombustible());
        color=PedirporConsola("Introduzca el color: " + Color.BLANCO.getColor() + ", " + Color.NEGRO.getColor() + ", " + Color.ROJO.getColor() + " o " + Color.AZUL.getColor());
        materialasientos=PedirporConsola("Introduzca el tipo de material del asiento: " + Asientos.CUERO.getMaterialasientos() + " o " + Asientos.TELA.getMaterialasientos());
        tipodecambio=PedirporConsola("Introduzca el tipo de cambio: " + Tipodecambio.MANUAL.getTipodecambio() + " o " + Tipodecambio.AUTOMATICO.getTipodecambio());

        if(tamano==Rueda.GRANDE.getTamano()){
            rueda=Rueda.GRANDE;
        }else if (tamano==Rueda.PEQUENO.getTamano()){
            rueda=Rueda.PEQUENO;
        }else {
            System.out.println("Rueda no reconocida.");
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
        if (tipodecambio.equals(Tipodecambio.MANUAL.getTipodecambio())){
            cambios=Tipodecambio.MANUAL;
        } else if (tipodecambio.equals(Tipodecambio.AUTOMATICO.getTipodecambio())) {
            cambios=Tipodecambio.AUTOMATICO;
        }else {
            System.out.println("Tipo de cambio no reconocido.");
            return;
        }

        Coche cocheannadido = new Coche(nombremarca, modelo, preciobase);
        c.annadirCoche(cocheannadido);

        System.out.println("Se añadió exitosamente el coche.");
    }

    public static void eliminarCoche(Catalogo c) {
        String posicion;
        System.out.println(c.toString());
        posicion = PedirporConsola("Introduzca posición a eliminar:");
        int i = Integer.parseInt(posicion);
        c.eliminarCoche(i);
        System.out.println("Se eliminó exitosamente el coche.");
    }

    public static void modificarCoche(Catalogo c) {

        String posicion;
        System.out.println(c.toString());
        posicion = PedirporConsola("Introduzca posición a modificar:");
        int i = Integer.parseInt(posicion);
        Coche coche= c.getCoches().get(i);
        boolean seguir;
        do {
           seguir = modificar(coche);
        }
        while (seguir);

    }

    public static boolean modificar(Coche coche){
        System.out.println("Indicar propiedad a modificar: "
            + "\n Marca"
            + "\n Modelo"
            + "\n Precio base"
            + "\n Rueda"
            + "\n Combustible"
            + "\n Color"
            + "\n Asientos"
            + "\n Tipo de cambio"
            + "\n Salir");
        String peticion = leerPeticion();
        if(peticion.equals("Marca")){
            String nuevamarca=PedirporConsola("Introduzca nueva marca: ");
            coche.setnuevamarca(nuevamarca);
        }
        if (peticion.equals("Modelo")){
            String nuevomodelo=PedirporConsola("Introduzca nuevo modelo: ");
            coche.setnuevomodelo(nuevomodelo);
        }
        if (peticion.equals("Precio base")){
            String preciobase=PedirporConsola("Introduzca nuevo precio base: ");
            BigDecimal nuevopreciobase=new BigDecimal(preciobase);
            coche.setnuevopreciobase(nuevopreciobase);
        }
        if (peticion.equals("Rueda")){
            String nuevarueda=PedirporConsola("Introduzca nueva rueda: " + Rueda.GRANDE.getTamano() + " o " + Rueda.PEQUENO.getTamano());
            int tamano = Integer.parseInt(nuevarueda);
            if (tamano==Rueda.GRANDE.getTamano()){
                coche.setnuevaRueda(Rueda.GRANDE);
            }else if (tamano==Rueda.PEQUENO.getTamano()) {
                coche.setnuevaRueda(Rueda.PEQUENO);
            }
        }
        if (peticion.equals("Combustible")){
            String nuevocombustible=PedirporConsola("Introduzca nuevo combustible: " + Combustible.GASOLINA.getCombustible() + ", " + Combustible.DIESEL.getCombustible() + ", " + Combustible.HIBRIDO.getCombustible() + " o " + Combustible.ELECTRICO.getCombustible());
            if (nuevocombustible.equals(Combustible.GASOLINA.getCombustible())){
                coche.setnuevoCombustible(Combustible.GASOLINA);
            } else if (nuevocombustible.equals(Combustible.DIESEL.getCombustible())) {
                coche.setnuevoCombustible(Combustible.DIESEL);
            } else if (nuevocombustible.equals(Combustible.HIBRIDO.getCombustible())) {
                coche.setnuevoCombustible(Combustible.HIBRIDO);
            } else if (nuevocombustible.equals(Combustible.ELECTRICO.getCombustible())) {
                coche.setnuevoCombustible(Combustible.ELECTRICO);
            }
        }
        if (peticion.equals("Color")){
            String nuevocolor=PedirporConsola("Introduzca nuevo color: " + Color.BLANCO.getColor() + ", " + Color.NEGRO.getColor() + ", " + Color.ROJO.getColor() + " o " + Color.AZUL.getColor());
            if (nuevocolor.equals(Color.BLANCO.getColor())){
                coche.setnuevoColor(Color.BLANCO);
            } else if (nuevocolor.equals(Color.NEGRO.getColor())) {
                coche.setnuevoColor(Color.NEGRO);
            } else if (nuevocolor.equals(Color.ROJO.getColor())) {
                coche.setnuevoColor(Color.ROJO);
            } else if (nuevocolor.equals(Color.AZUL.getColor())) {
                coche.setnuevoColor(Color.AZUL);
            }
        }
        if (peticion.equals("Asientos")){
            String nuevosasientos=PedirporConsola("Introduzca nuevo tipo de material del asiento: " + Asientos.CUERO.getMaterialasientos() + " o " + Asientos.TELA.getMaterialasientos());
            if (nuevosasientos.equals(Asientos.CUERO.getMaterialasientos())){
                coche.setnuevosAsientos(Asientos.CUERO);
            } else if (nuevosasientos.equals(Asientos.TELA.getMaterialasientos())) {
                coche.setnuevosAsientos(Asientos.TELA);
            }
        }
        if (peticion.equals("Tipo de cambio")) {
            String nuevotipodecambio=PedirporConsola("Introduzca nuevo tipo de cambio: " + Tipodecambio.MANUAL.getTipodecambio() + " o " + Tipodecambio.AUTOMATICO.getTipodecambio());
            if (nuevotipodecambio.equals(Tipodecambio.MANUAL.getTipodecambio())){
                coche.setnuevoTipoDeCambio(Tipodecambio.MANUAL);
            } else if (nuevotipodecambio.equals(Tipodecambio.AUTOMATICO.getTipodecambio())) {
                coche.setnuevoTipoDeCambio(Tipodecambio.AUTOMATICO);
            }
        } else if (peticion.equals("Salir")) {
            return false;
        }
        return true;
    }

    public static void MostrarInstrucciones() {
        System.out.println("Introduzca una de las siguientes peticiones: "
                + "\n Añadir coche"
                + "\n Eliminar coche"
                + "\n Mostrar catálogo"
                + "\n Calcular precio"
                + "\n Modificar coche"
                + "\n Ayuda"
                + "\n Salir");
    }

    /**
     *
     * @param solicitud
     * @return
     */
    public static String PedirporConsola(String solicitud) {
        System.out.println(solicitud);
        return leerPeticion();
    }

    public static void calcularPrecio(Catalogo c){
        String posicion;
        System.out.println(c.toString());
        posicion = PedirporConsola("Introduzca posición a calcular:");
        int i = Integer.parseInt(posicion);
        Coche coche= c.getCoches().get(i);
        System.out.println("El precio total del coche es " + coche.PrecioTotal(i).setScale(2, RoundingMode.HALF_UP) + " €.");

    }


}

