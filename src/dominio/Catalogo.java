/*
Copyright [2023] [Ignacio Tirado Meza]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package dominio;

import java.util.ArrayList;

/**
 * La clase catalogo se encarga de gestionar una colección de coches.
 */
public class Catalogo {

    private ArrayList<Coche>coches=new ArrayList<>();

    /**
     * Este método añade el objeto coche a la lista coches.
     * @param coche objeto a añadir a la lista coches.
     */
    public void annadirCoche(Coche coche){
        this.coches.add(coche);
    }

    /**
     * Este método elimina el objeto coche a la lista coches.
     * @param i es la posición a borrar de la lista coches y tiene que ser mayor o igual que 0.
     */
    public void eliminarCoche(int i){
        this.coches.remove(i);
    }

    /**
     * Permite recuperar el ArrayList de coches.
     * @return devuelve la lista coches.
     */
    public ArrayList<Coche> getCoches() {
        return coches;
    }

    /**
     * Genera la información del contenido del catalogo en una cadena de texto.
     * @return devuelve un String con los coches de la lista enumerados.
     */
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
