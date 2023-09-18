
package funcionesJava;



import java.util.LinkedList;

import java.util.LinkedList;

public class erroresJS {
    
    public static LinkedList<erroresJS> erroresJSon = new LinkedList<erroresJS>();// Se crea una lista de objetos la cual guardara los tokens para el reporte 
   
       public int  fila, columna;
        public String lexem;
       public String  token;
       
    public erroresJS(String lexem, String token,  int fila, int columna){ //se crean y se retornan los objetos de lexema, token, columna y fila
        this.token = token;
        this.lexem = lexem; 
        this.fila = fila; 
        this.columna = columna;        

       
    }
     public int getcolum() {
        return columna;
    }
     
    public String getLEX() {
        return lexem;
    }


    public int getLinea() {
        return fila;
    }
   
    
    public String getToken() {
        return token;
    }
     @Override  //retorno los tokens de la lista 
    public String toString(){
        return   "l:"  + lexem  + " "
                   + "Tk:"   + token   + " "
                   + "LIN:"   + fila   + " " 
                   + "COL:" + columna + " "
                ;
    }
    
}
