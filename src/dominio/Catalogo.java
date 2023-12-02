package dominio;
import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Coche>coches=new ArrayList<>();

    public void annadirCoche(Coche coche){
        this.coches.add(coche);
    }

    public void eliminarCoche(Coche coche){
        this.coches.remove(coche);
    }

    public Catalogo(){

    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        String str = "Este es el contenido de la lista de coches:\n";
        int i = 0;
        for (Coche c: coches){
            str += i++ + ": " + c.toString() + "\n";
        }
        return str;
    }
}
