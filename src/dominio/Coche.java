/*
Copyright [2023] [Ignacio Tirado Meza]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package dominio;

import dominio.enun.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * La clase coche se encarga de gestionar los atributos que definen un coche.
 */
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
     * Este método calcula el precio total de un coche de la lista coches, indicándole previamente la posición en la que se encuentra dicho coche.
     * @param i es la posición a calcular el precio total de la lista coches y tiene que ser mayor o igual a 0.
     * @return devuelve un int con el valor de preciototal.
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
     * @param nuevamarca contiene el valor de la nueva marca, introducido por el usuario.
     */
    public void setnuevamarca(String nuevamarca){
        this.nombremarca=nuevamarca;
    }

    /**
     * Permite almacenar en la variable modelo el valor de nuevomodelo.
     * @param nuevomodelo contiene el valor del nuevo modelo, introducido por el usuario.
     */
    public void setnuevomodelo(String nuevomodelo){
        this.modelo=nuevomodelo;
    }

    /**
     * Permite almacenar en la variable preciobase el valor de nuevopreciobase.
     * @param nuevopreciobase contiene el valor del nuevo preciobase, introducido por el usuario.
     */
    public void setnuevopreciobase(BigDecimal nuevopreciobase){
        this.preciobase=nuevopreciobase;
    }

    /**
     * Permite almacenar en la variable rueda el valor de rueda.
     * @param rueda contiene el valor de la nueva rueda, introducido por el usuario.
     */
    public void setnuevaRueda(Rueda rueda){
        this.rueda=rueda;
    }

    /**
     * Permite almacenar en la variable combustible el valor de nuevocombustible.
     * @param nuevocombustible contiene el valor del nuevo combustible, introducido por el usuario.
     */
    public void setnuevoCombustible(Combustible nuevocombustible){
        this.combustible=nuevocombustible;
    }

    /**
     * Permite almacenar en la variable color el valor de nuevocolor.
     * @param nuevocolor contiene el valor del nuevo color, introducido por el usuario.
     */
    public void setnuevoColor(Color nuevocolor){
        this.color=nuevocolor;
    }

    /**
     * Permite almacenar en la variable asientos el valor de nuevosasientos.
     * @param nuevosasientos contiene el valor de los nuevos asientos, introducido por el usuario.
     */
    public void setnuevosAsientos(Asientos nuevosasientos){
        this.asientos=nuevosasientos;
    }

    /**
     * Permite almacenar en la variable tipodecambio el valor de nuevocambio.
     * @param nuevocambio contiene el valor del nuevo tipo de cambio, introducido por el usuario.
     */
    public void setnuevoTipoDeCambio(Tipodecambio nuevocambio){
        this.tipodecambio=nuevocambio;
    }
}
