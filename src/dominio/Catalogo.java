package dominio;

import dominio.enun.Rueda;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Coche>coches=new ArrayList<>();

    public void annadirCoche(Coche c){
        this.coches.add(c);
    }

    public Catalogo(){

    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
}
