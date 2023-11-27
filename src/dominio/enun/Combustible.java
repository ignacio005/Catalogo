package dominio.enun;

public enum Combustible {

    GASOLINA("Gasolina"),
    ELECTRICO("Electrico"),
    HIBRIDO("Hibrido"),
    DIESEL("Diesel");
    private String combustible;

    Combustible(String combustible){
        this.combustible=combustible;
    }

    public String getCombustible(){
        return combustible;
    }
}
