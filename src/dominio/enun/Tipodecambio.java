package dominio.enun;

/**
 * El enum tipodecambio contiene los dos tipos de cambio disponibles para un coche.
 */
public enum Tipodecambio {
    MANUAL("Manual"),
    AUTOMATICO("Automatico");
    private String tipodecambio;

    /**
     * Permite almacenar en la variable tipodecambio el valor de tipodecambio.
     * @param tipodecambio contiene el valor del tipodecambio.
     */
    Tipodecambio(String tipodecambio){
        this.tipodecambio=tipodecambio;
    }

    /**
     * Permite recuperar el String tipodecambio.
     * @return devuelve el String tipodecambio.
     */
    public String getTipodecambio() {
        return tipodecambio;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada tipo de cambio.
     * @return devuelve un int que es el porcentaje.
     */
    public int Porcentaje(){
        switch (tipodecambio){
            case "Manual":
                return 1;
            case "Automatico":
                return 2;
            default:
                return 0;

        }
    }

}
