
package funcionesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class SPTK {
    

    
    public static LinkedList<SPTK> TokensSP = new LinkedList<SPTK>();// Se crea una lista de objetos la cual guardara los tokens para el reporte 
    
    public static List<String> TraduccionPy = new ArrayList<>(); // Usar List en lugar de LinkedList // Tamaño del array a ajustar según tus necesidades

    
       public int  fila, columna;
        public String lexem, token;
       
    public SPTK(String lexem, String token,  int fila, int columna){ //se crean y se retornan los objetos de lexema, token, columna y fila
        this.token = token;
        this.lexem = lexem; 
        this.fila = fila; 
        this.columna = columna;        
           
    }

   
     public int getL() {
        return fila;
    }

    public String getlexema() {
        return lexem;
    }

   
   
    public int getC() {
        return columna;
    }
    
    
     @Override  //retorno los tokens de la lista 
    public String toString(){
        return   "lexema:"  + lexem  + " "
                   + "TOKEN:"   + token   + " "
                   + "LINEA:"   + fila   + " " 
                   + "COLUMNA:" + columna + " "
                ;
    }
    
     public String getTk() {
        return token;
    }
     
     public static Object buscarDatoEnMapa(String archivo, String variable) {
    if (!funcionesJava.JSTK.HashJson2.containsKey(archivo)) {
        System.out.println("La clave '" + archivo + "' no se encontró en el nivel externo.");
        return null;
    }

    Object archivo2 = funcionesJava.JSTK.HashJson2.get(archivo);

    if (!(archivo2 instanceof Map<?, ?>)) {
        System.out.println("El archivo '" + archivo + "' no contiene un mapa interno válido.");
        return null;
    }

    Map<?, ?> Interno = (Map<?, ?>) archivo2;

    if (Interno.containsKey(variable)) {
        Object val = Interno.get(variable);
        System.out.println("Valor encontrado en el archivo '" + archivo + "': " + val);
        return val;
    }

    System.out.println("La clave '" + variable + "' no se encontró en el nivel interno del archivo '" + archivo + "'.");
    return null;
}
     
     
     
     
     public static  Object ValorDeVariableGlobal(String variable) {
    System.out.println("Entrando a obtenerValorDeVariableGlobal con variable: " + variable);
    Object valor = "";

    if (Graficas.GPies.VGlobales.containsKey(variable)) {
        valor = Graficas.GPies.VGlobales.get(variable);
        System.out.println("Valor encontrado en: " + valor);
    } else {
        System.out.println("La clave " + variable + " no existe variable interna en globales.");
    }

    return valor;
}
     
     
    

public List<String> getLista() {
    return TraduccionPy;
}

public void limpiarLista() {
    TraduccionPy.clear();
}
     
     
     

}
