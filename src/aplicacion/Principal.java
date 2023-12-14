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
package aplicacion;

import dominio.Catalogo;
import dominio.Coche;
import dominio.enun.*;
import presentacion.Interfaz;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        /**
         * Creo el catálogo.
         */
        Catalogo catalogo = new Catalogo();
        /**
         * Creo tres coches.
         */
        Coche coche1 = new Coche("BMW", "X5", new BigDecimal(86800));
        coche1.setnuevaRueda(Rueda.GRANDE);
        coche1.setnuevoCombustible(Combustible.HIBRIDO);
        coche1.setnuevoColor(Color.NEGRO);
        coche1.setnuevosAsientos(Asientos.CUERO);
        coche1.setnuevoTipoDeCambio(Tipodecambio.MANUAL);
        catalogo.annadirCoche(coche1);

        Coche coche2 = new Coche("Ford", "Explorer", new BigDecimal(91638.1));
        coche2.setnuevaRueda(Rueda.GRANDE);
        coche2.setnuevoCombustible(Combustible.DIESEL);
        coche2.setnuevoColor(Color.ROJO);
        coche2.setnuevosAsientos(Asientos.CUERO);
        coche2.setnuevoTipoDeCambio(Tipodecambio.AUTOMATICO);
        catalogo.annadirCoche(coche2);

        Coche coche3 = new Coche("Toyota", "Rav4", new BigDecimal(40100));
        coche3.setnuevaRueda(Rueda.PEQUENO);
        coche3.setnuevoCombustible(Combustible.ELECTRICO);
        coche3.setnuevoColor(Color.AZUL);
        coche3.setnuevosAsientos(Asientos.TELA);
        coche3.setnuevoTipoDeCambio(Tipodecambio.MANUAL);
        catalogo.annadirCoche(coche3);

        Interfaz.MostrarInstrucciones();

        String p;
        Boolean seguir;
        do {
            p=Interfaz.leerPeticion();
            seguir=Interfaz.procesarPeticion(p, catalogo);
        }
        while(seguir);
    }
}
