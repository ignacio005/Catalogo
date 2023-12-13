package dominio.enun;

/**
 * El enum color contiene los cuatro tipos de colores disponibles para un coche.
 */
public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    ROJO("Rojo"),
    AZUL("Azul");
    private String color;

    /**
     * Permite almacenar en la variable color el valor de color.
     * @param color contiene el valor del color.
     */
    Color(String color){
        this.color=color;
    }

    /**
     * Permite recuperar el String color.
     * @return devuelve el String color.
     */
    public String getColor(){
        return color;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada color.
     * @return devuelve un int que es el porcentaje.
     */
    public int Porcentaje(){
        switch (color){
            case "Blanco":
                return 1;
            case "Negro":
                return 1;
            case "Rojo":
                return 1;
            case "Azul":
                return 1;
            default:
                return 0;

        }
    }
}
