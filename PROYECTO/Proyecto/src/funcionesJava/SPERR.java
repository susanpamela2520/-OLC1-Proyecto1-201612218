
package funcionesJava;

import java.util.LinkedList;

public class SPERR {
    
    
    public static LinkedList<SPERR> ERRSPtokens = new LinkedList<SPERR>();// Se crea una lista de objetos la cual guardara los tokens para el reporte 
    
       public int  fila, columna;
        public String lexem, token;
       
    public SPERR(String lexem, String token,  int fila, int columna){ //se crean y se retornan los objetos de lexema, token, columna y fila
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

}
