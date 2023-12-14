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
 * El enum asientos contiene los dos tipos de asientos disponibles para un coche.
 */
public enum Asientos {

    CUERO("Cuero"),
    TELA("Tela");

    private String materialasientos;

    /**
     * Permite almacenar en la variable materialasientos el valor de materialasientos.
     * @param materialasientos contiene el valor del material de los asientos.
     */
    Asientos(String materialasientos){
        this.materialasientos=materialasientos;
    }

    /**
     * Permite recuperar el String materialasientos.
     * @return devuelve el String materialasientos.
     */
    public String getMaterialasientos(){
        return materialasientos;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada tipo de material.
     * @return devuelve un int que es el porcentaje.
     */
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
