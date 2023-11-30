package dominio.enun;

public enum Tipodecambio {
    MANUAL("Manual"),
    AUTOMATICO("Automatico");
    private String tipodecambio;

    Tipodecambio(String tipodecambio){
        this.tipodecambio=tipodecambio;
    }

    public String getTipodecambio() {
        return tipodecambio;
    }

    public int Porcentaje(){
        switch (tipodecambio){
            case "Manual":
                return 1;
            case "Automatico":
                return 2;
            default:
                return 0;

        }
    }

}
