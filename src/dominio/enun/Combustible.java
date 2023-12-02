package dominio.enun;

public enum Combustible {

    GASOLINA("Gasolina"),
    ELECTRICO("Eléctrico"),
    HIBRIDO("Híbrido"),
    DIESEL("Diesel");
    private String combustible;

    Combustible(String combustible){
        this.combustible=combustible;
    }

    public String getCombustible(){
        return combustible;
    }

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
