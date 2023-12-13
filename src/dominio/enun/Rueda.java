package dominio.enun;

/**
 * El enum rueda contiene los dos tipos de tamaño disponibles para un coche.
 */
public enum Rueda {

    PEQUENO(19),
    GRANDE(20);
    private int tamano;

    /**
     * Permite almacenar en la variable tamano el valor de tamano.
     * @param tamano contiene el valor del tamano.
     */
    Rueda(int tamano){
        this.tamano=tamano;
    }

    /**
     * Permite recuperar el String tamano.
     * @return devuelve el String tamano.
     */
    public int getTamano(){
        return tamano;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada tamaño.
     * @return devuelve un int que es el porcentaje.
     */
    public int Porcentaje(){
        switch (tamano){
            case 20:
                return 2;
            case 19:
                return 1;
            default:
                return 0;

        }
    }

}
