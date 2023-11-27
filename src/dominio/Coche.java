package dominio;

import dominio.enun.*;

import java.math.BigDecimal;

public class Coche {
    private String nombremarca;
    private String modelo;
    private BigDecimal preciobase;
    private Rueda rueda;
    private Combustible combustible;
    private Color color;
    private Asientos asientos;
    private Tipodecambio tipodecambio;

    public Coche(String nombremarca, String modelo, BigDecimal preciobase){
        this.nombremarca=nombremarca;
        this.modelo=modelo;
        this.preciobase=preciobase;
    }
}
