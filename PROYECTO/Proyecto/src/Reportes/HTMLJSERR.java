
package Reportes;

import funcionesJava.erroresJS;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class HTMLJSERR {

    public static void generarReporteERR(LinkedList<erroresJS> listaERR) {
        //se hace un string para guardar los datos de el html 
        StringBuilder contenido = new StringBuilder("<html>\n" +
                                                    "<head><title>Lista de Tokens</title></head>\n" +
                                                    "<body>\n" +
                                                 
                                                    "<table border=\"1\" style=\"margin: 0 auto;\">\n" +
                                                    "<tr><th>LEXEMA</th>\n" +
                                                    "<th >TOKEN</th>\n" +
                                                    "<th >LINEA</th>\n" +
                                                    "<th >COLUMNA</th></tr>");

        for (erroresJS token : listaERR) {
            contenido.append("<tr >\n" +
                             "<td >").append(token.getLEX()).append("</td>\n" +
                             "<td >").append(token.getToken()).append("</td>\n" +
                             "<td>").append(token.getLinea()).append("</td>\n" +
                             "<td>").append(token.getcolum()).append("</td>\n" +
                             "</tr>");
        }

        contenido.append("</table>\n" +
                        "</div>\n"+
                        "</body>\n" +
                        "</html>");
        
        String nombreArchivo = "erroresJSon.html";
        //try catch para dar alerta si se creo o no el archivo 
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write(contenido.toString());
            JOptionPane.showMessageDialog(null, "Se creó el reporte de tokens JSON");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al generar el reporte JSON");
            e.printStackTrace();
        }
    }
}
