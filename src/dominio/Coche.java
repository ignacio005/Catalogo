package dominio;

import dominio.enun.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Coche {
    private String nombremarca;
    private String modelo;
    private BigDecimal preciobase;
    private Rueda rueda = null;
    private Combustible combustible;
    private Color color;
    private Asientos asientos;
    private Tipodecambio tipodecambio;

    /**
     * Este constructor almacena en las variables los valores que se les da al crear un coche.
     * @param nombremarca objeto que indica donde se va a guardar el valor de la variable nombremarca.
     * @param modelo objeto que indica donde se va a guardar el valor de la variable modelo.
     * @param preciobase objeto que indica donde se va a guardar el valor de la variable preciobase.
     */
    public Coche(String nombremarca, String modelo, BigDecimal preciobase){
        this.nombremarca=nombremarca;
        this.modelo=modelo;
        this.preciobase=preciobase.setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Genera la información del contenido del catalogo en una cadena de texto.
     * @return devuelve un String con el valor del nombremarca, modelo y preciobase para cada uno de los coches del catálogo.
     */
    @Override
    public String toString() {
        String str = this.nombremarca + " " + this.modelo + " y su precio base es de " + this.preciobase + " €.\n";
        return str;
    }

    /**
     *Este método calcula el precio total de un coche de la lista coches, indicándole previamente la posición en la que se encuentra dicho coche.
     * @param i es la posición a calcular el precio total de la lista coches y tiene que ser mayor o igual a 0.
     * @return
     */
    public BigDecimal PrecioTotal(int i){

        BigDecimal preciorueda = preciobase.multiply(new BigDecimal((rueda==null) ? 1 : rueda.Porcentaje()/100.0));
        BigDecimal preciocombustible = preciobase.multiply(new BigDecimal((combustible==null) ? 0 : combustible.Porcentaje()/100.0));
        BigDecimal preciocolor = preciobase.multiply(new BigDecimal((color==null) ? 0 : color.Porcentaje()/100.0));
        BigDecimal precioasientos = preciobase.multiply(new BigDecimal((asientos==null) ? 0 : asientos.Porcentaje()/100.0));
        BigDecimal preciotipodecambio = preciobase.multiply(new BigDecimal((tipodecambio==null) ? 0 : tipodecambio.Porcentaje()/100.0));
        BigDecimal preciototal = preciobase.add(preciorueda).add(preciocombustible).add(preciocolor).add(precioasientos).add(preciotipodecambio);

        return preciototal;
    }

    /**
     * Permite almacenar en la variable nombremarca el valor de nuevamarca.
     * @param nuevamarca contiene el valor de la nueva marca introducida por el usuario.
     */
    public void setnuevamarca(String nuevamarca){
        this.nombremarca=nuevamarca;
    }

    /**
     * Permite almacenar en la variable modelo el valor de nuevomodelo.
     * @param nuevomodelo contiene el valor del nuevo modelo introducido por el usuario.
     */
    public void setnuevomodelo(String nuevomodelo){
        this.modelo=nuevomodelo;
    }

    /**
     * Permite almacenar en la variable preciobase el valor de nuevopreciobase.
     * @param nuevopreciobase contiene el valor del nuevo preciobase introducido por el usuario.
     */
    public void setnuevopreciobase(BigDecimal nuevopreciobase){
        this.preciobase=nuevopreciobase;
    }

    public void setnuevaRueda(Rueda rueda){
        this.rueda=rueda;
    }

    public void setnuevoCombustible(Combustible nuevocombustible){
        this.combustible=nuevocombustible;
    }

    public void setnuevoColor(Color nuevocolor){
        this.color=nuevocolor;
    }

    public void setnuevosAsientos(Asientos nuevosasientos){
        this.asientos=nuevosasientos;
    }

    public void setnuevoTipoDeCambio(Tipodecambio nuevocambio){
        this.tipodecambio=nuevocambio;
    }
}
