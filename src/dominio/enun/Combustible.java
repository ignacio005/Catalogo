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
package dominio.enun;

/**
 * El enum combustible contiene los cuatro tipos de combustibles disponibles para un coche.
 */
public enum Combustible {

    GASOLINA("Gasolina"),
    ELECTRICO("Eléctrico"),
    HIBRIDO("Híbrido"),
    DIESEL("Diesel");
    private String combustible;

    /**
     * Permite almacenar en la variable combustible el valor de combustible.
     * @param combustible contiene el valor del combustible.
     */
    Combustible(String combustible){
        this.combustible=combustible;
    }

    /**
     * Permite recuperar el String combustible.
     * @return devuelve el String combustible.
     */
    public String getCombustible(){
        return combustible;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada combustible.
     * @return devuelve un int que es el porcentaje.
     */
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
