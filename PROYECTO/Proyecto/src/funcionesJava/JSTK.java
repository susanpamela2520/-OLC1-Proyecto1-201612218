
package funcionesJava;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class JSTK {
    
   // Se declara una lista enlazada para almacenar objetos de tipo JSTK que representan tokens JSON.
        public static LinkedList<JSTK> TokensJSon = new LinkedList<JSTK>();

        // Se declaran dos HashMaps para almacenar datos asociados con el análisis JSON.
        public static HashMap<String, Object> HashJson1 = new HashMap<>();
        public static HashMap<String, Object> HashJson2 = new HashMap<>();

        // Variables de instancia para la clase JSTK que almacenan información sobre un token JSON.
        public int fila, columna; // Variables para la ubicación del token en el archivo JSON.
        public String lexem, token; // Variables para el lexema y el tipo de token.

        // Constructor de la clase JSTK que recibe valores para inicializar las variables de instancia.
        public JSTK(String lexem, String token, int fila, int columna) {
            this.token = token;
            this.lexem = lexem;
            this.fila = fila;
            this.columna = columna;
        }

        // Métodos de acceso (getters) para obtener valores de lexema, token, fila y columna.
        public String getLEX() {
            return lexem;
        }

        public String getToken() {
            return token;
        }

        public int getLinea() {
            return fila;
        }

        public int getcolum() {
            return columna;
        }

        // Implementación del método toString para obtener una representación de cadena de un objeto JSTK.
        @Override
        public String toString() {
            return "lexema:" + lexem + " "
                 + "TOKEN:" + token + " "
                 + "LINEA:" + fila + " "
                 + "COLUMNA:" + columna + " ";
        }

        // Método estático que gestiona variables relacionadas con el análisis JSON.
        public static void variable(String nombreA) {
            // Se crea una copia de HashJson1 en una nueva variable llamada 'variables'.
            Map<String, Object> variables = new HashMap<>(HashJson1);

            // Se verifica si 'nombreA' no existe en HashJson1.
            if (!HashJson1.containsKey(nombreA)) {
                // Si no existe, se agrega una entrada en HashJson2 con 'nombreA' como clave y 'variables' como valor.
                HashJson2.put(nombreA, variables);
            }
        }

  /*  public static void mostarvalores_delH (){
           for (String i :  HashJson2.keySet()) {
                System.out.println("key: " + i + " value: " +  HashJson2.get(i));
              }
    }*/
        
        //muestro los tokens que estan guardados en el hash 2 
}
