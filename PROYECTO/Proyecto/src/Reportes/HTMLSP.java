
package Reportes;

import funcionesJava.SPTK;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class HTMLSP {
    

    public static void HTMLSP(LinkedList<SPTK> TokensSP) {
        StringBuilder contenido = new StringBuilder("<html>\n" +
                                                    "<head><title>Lista de Tokens</title></head>\n" +
                                                    "<body>\n" +
                                                  
                                                    "<table border=\"1\" style=\"margin: 0 auto;\">\n" +
                                                    "<tr><th>LEXEMA</th>\n" +
                                                    "<th >TOKEN</th>\n" +
                                                    "<th >LINEA</th>\n" +
                                                    "<th >COLUMNA</th></tr>");

        for (SPTK token : TokensSP) {
            contenido.append("<tr >\n" +
                             "<td >").append(token.getlexema()).append("</td>\n" +
                             "<td >").append(token.getTk()).append("</td>\n" +
                             "<td>").append(token.getL()).append("</td>\n" +
                             "<td>").append(token.getC()).append("</td>\n" +
                             "</tr>");
        }

        contenido.append("</table>\n" +
                        "</div>\n"+
                        "</body>\n" +
                        "</html>");
        
        String nombreArchivo = "Tokenssp.html";
        
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write(contenido.toString());
            JOptionPane.showMessageDialog(null, "Se creó el reporte de tokens SP");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte SP");
            e.printStackTrace();
        }
    }
}
