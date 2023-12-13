package dominio.enun;

/**
 * El enum combustible contiene los cuatro tipos de combustibles disponibles para un coche.
 */
public enum Combustible {

    GASOLINA("Gasolina"),
    ELECTRICO("Eléctrico"),
    HIBRIDO("Híbrido"),
    DIESEL("Diesel");
    private String combustible;

    /**
     * Permite almacenar en la variable combustible el valor de combustible.
     * @param combustible contiene el valor del combustible.
     */
    Combustible(String combustible){
        this.combustible=combustible;
    }

    /**
     * Permite recuperar el String combustible.
     * @return devuelve el String combustible.
     */
    public String getCombustible(){
        return combustible;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada combustible.
     * @return devuelve un int que es el porcentaje.
     */
    public int Porcentaje(){
        switch (combustible){
            case "Gasolina":
                return 1;
            case "Eléctrico":
                return 21;
            case "Híbrido":
                return 11;
            case "Diesel":
                return 2;
            default:
                return 0;
        }
    }
}
