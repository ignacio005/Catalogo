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
 * El enum rueda contiene los dos tipos de tamaño disponibles para un coche.
 */
public enum Rueda {

    PEQUENO(19),
    GRANDE(20);
    private int tamano;

    /**
     * Permite almacenar en la variable tamano el valor de tamano.
     * @param tamano contiene el valor del tamano.
     */
    Rueda(int tamano){
        this.tamano=tamano;
    }

    /**
     * Permite recuperar el String tamano.
     * @return devuelve el String tamano.
     */
    public int getTamano(){
        return tamano;
    }

    /**
     * Este método permite saber el porcentaje que se a de utilizar para cada tamaño.
     * @return devuelve un int que es el porcentaje.
     */
    public int Porcentaje(){
        switch (tamano){
            case 20:
                return 2;
            case 19:
                return 1;
            default:
                return 0;

        }
    }

}
