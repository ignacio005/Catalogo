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
}
