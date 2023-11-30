package dominio.enun;

public enum Asientos {
    ASIENTOS (5);
    private int numeroasientos;

    Asientos(int numeroasientos){
        this.numeroasientos=numeroasientos;
    }

    public int getNumeroasientos() {
        return numeroasientos;
    }
    public int Porcentaje(){
        switch (numeroasientos){
            case 5:
                return 1;
            default:
                return 0;

        }
    }

}
