package dominio.enun;

public enum Rueda {

    PEQUENO(19),
    GRANDE(20);
    private int tamano;

    Rueda(int tamano){
        this.tamano=tamano;
    }

    public int getTamano(){
        return tamano;
    }
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
