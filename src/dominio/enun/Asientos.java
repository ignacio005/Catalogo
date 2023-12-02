package dominio.enun;

public enum Asientos {

    CUERO("Cuero"),
    TELA("Tela");

    private String materialasientos;

    Asientos(String materialasientos){
        this.materialasientos=materialasientos;
    }

    public String getMaterialasientos(){
        return materialasientos;
    }

    public int Porcentaje(){
        switch (materialasientos){
            case "Cuero":
                return 2;
            case "Tela":
                return 1;
            default:
                return 0;
        }
    }
}
