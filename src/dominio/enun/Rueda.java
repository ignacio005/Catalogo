package dominio.enun;

public enum Rueda {

    PEQUENO(1),
    GRANDE(2);
    private int tamano;

    Rueda(int tamano){
        this.tamano=tamano;
    }

    public int getTamano(){
        return tamano;
    }


}
