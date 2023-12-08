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

    public Coche(String nombremarca, String modelo, BigDecimal preciobase){
        this.nombremarca=nombremarca;
        this.modelo=modelo;
        this.preciobase=preciobase.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        String str = this.nombremarca + " " + this.modelo + " y su precio base es de " + this.preciobase + " €.\n";
        return str;
    }

    public BigDecimal PrecioTotal(int i){

        BigDecimal preciorueda = preciobase.multiply(new BigDecimal((rueda==null) ? 1 : rueda.Porcentaje()/100.0));
        BigDecimal preciocombustible = preciobase.multiply(new BigDecimal((combustible==null) ? 0 : combustible.Porcentaje()/100.0));
        BigDecimal preciocolor = preciobase.multiply(new BigDecimal((color==null) ? 0 : color.Porcentaje()/100.0));
        BigDecimal precioasientos = preciobase.multiply(new BigDecimal((asientos==null) ? 0 : asientos.Porcentaje()/100.0));
        BigDecimal preciotipodecambio = preciobase.multiply(new BigDecimal((tipodecambio==null) ? 0 : tipodecambio.Porcentaje()/100.0));
        BigDecimal preciototal = preciobase.add(preciorueda).add(preciocombustible).add(preciocolor).add(precioasientos).add(preciotipodecambio);

        return preciototal;
    }

    public void setnuevamarca(String nuevamarca){
        this.nombremarca=nuevamarca;
    }

    public void setnuevomodelo(String nuevomodelo){
        this.modelo=nuevomodelo;
    }

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
