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
}
