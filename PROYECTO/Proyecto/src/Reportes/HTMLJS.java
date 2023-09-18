package Reportes;

import funcionesJava.JSTK;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class HTMLJS {

    // Método para generar un reporte HTML a partir de una lista de tokens JSTK.
    public static void generarReporteHTML(LinkedList<JSTK> listaTokens) {
        // Se crea un StringBuilder para construir el contenido del archivo HTML.
        StringBuilder contenido = new StringBuilder("<html>\n" +
                                                    "<head><title>Lista de Tokens</title></head>\n" +
                                                    "<body>\n" +                                                    
                                                    "<table border=\"1\" style=\"margin: 0 auto;\">\n" +
                                                    "<tr><th>LEXEMA</th>\n" +
                                                    "<th >TOKEN</th>\n" +
                                                    "<th >LINEA</th>\n" +
                                                    "<th >COLUMNA</th></tr>");

        // Se itera a través de la lista de tokens y se agrega cada token como una fila en la tabla HTML.
        for (JSTK token : listaTokens) {
            contenido.append("<tr >\n" +
                             "<td >").append(token.getLEX()).append("</td>\n" +
                             "<td >").append(token.getToken()).append("</td>\n" +
                             "<td>").append(token.getLinea()).append("</td>\n" +
                             "<td>").append(token.getcolum()).append("</td>\n" +
                             "</tr>");
        }

        // Se cierra la estructura HTML.
        contenido.append("</table>\n" +
                        "</div>\n"+
                        "</body>\n" +
                        "</html>");
        System.out.println(contenido);
        // Se especifica el nombre del archivo HTML resultante.
        String nombreArchivo = "TokensJSon.html";
        
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            // Se escribe el contenido en el archivo HTML.
            escritor.write(contenido.toString());
            // Se muestra un mensaje de éxito en un cuadro de diálogo.
            JOptionPane.showMessageDialog(null, "Se creó el reporte de tokens JSON");
        } catch (IOException e) {
            // Se muestra un mensaje de error en caso de problemas con la escritura del archivo.
            JOptionPane.showMessageDialog(null, "Ocurrió un error al generar el reporte JSON");
            e.printStackTrace();
        }
    }
}
