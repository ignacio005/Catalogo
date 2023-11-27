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

}
