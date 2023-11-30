package dominio.enun;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    ROJO("Rojo"),
    AZUL("Azul");
    private String color;

    Color(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

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
