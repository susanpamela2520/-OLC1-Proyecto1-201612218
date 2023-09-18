
package proyecto;

import funcionesJava.JSTK;
import funcionesJava.SPERR;
import funcionesJava.SPTK;
import funcionesJava.erroresJS;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



import funcionesJava.SPTK;
import java.util.List;

public class interfaz extends javax.swing.JFrame {
private File abrirArchivo;
public static String nombreArchivo;
    public interfaz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Entrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Salir = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        Abrir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        GuardarCM = new javax.swing.JButton();
        Analizador = new javax.swing.JComboBox<>();
        Reporte = new javax.swing.JButton();
        ReporteSP = new javax.swing.JButton();
        Ejecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Entrar.setBackground(new java.awt.Color(204, 204, 204));
        Entrar.setColumns(20);
        Entrar.setForeground(new java.awt.Color(0, 102, 102));
        Entrar.setRows(5);
        jScrollPane1.setViewportView(Entrar);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Stat/Json");

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("traductor");

        Salir.setBackground(new java.awt.Color(204, 204, 204));
        Salir.setForeground(new java.awt.Color(0, 102, 102));
        Salir.setCaretColor(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(Salir);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));

        Abrir.setBackground(new java.awt.Color(51, 0, 51));
        Abrir.setForeground(new java.awt.Color(255, 255, 255));
        Abrir.setLabel("abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(51, 0, 51));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setLabel("guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        GuardarCM.setBackground(new java.awt.Color(51, 0, 51));
        GuardarCM.setForeground(new java.awt.Color(255, 255, 255));
        GuardarCM.setText("guardar como");
        GuardarCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCMActionPerformed(evt);
            }
        });

        Analizador.setBackground(new java.awt.Color(51, 0, 51));
        Analizador.setForeground(new java.awt.Color(255, 255, 255));
        Analizador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JSON", "STATPY" }));
        Analizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizadorActionPerformed(evt);
            }
        });

        Reporte.setBackground(new java.awt.Color(51, 0, 51));
        Reporte.setForeground(new java.awt.Color(255, 255, 255));
        Reporte.setText("reporte JS");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        ReporteSP.setBackground(new java.awt.Color(51, 0, 51));
        ReporteSP.setForeground(new java.awt.Color(255, 255, 255));
        ReporteSP.setText("reporte SP");
        ReporteSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GuardarCM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReporteSP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Analizador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Abrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GuardarCM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReporteSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Analizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Ejecutar.setBackground(new java.awt.Color(51, 0, 51));
        Ejecutar.setForeground(new java.awt.Color(255, 255, 255));
        Ejecutar.setText("ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel1)
                                .addGap(125, 125, 125)
                                .addComponent(Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ejecutar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalizadorActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        //LISTA PARA LA GENERACION DE TOKENS
        LinkedList<JSTK> JSlist = funcionesJava.JSTK.TokensJSon;
        LinkedList<erroresJS> JSerr = funcionesJava.erroresJS.erroresJSon;
        // Generar el HTML utilizando la clase HTMLGenerator
        Reportes.HTMLJS.generarReporteHTML(JSlist);        
        Reportes.HTMLJSERR.generarReporteERR(JSerr);
        JSerr.clear();
        JSlist.clear();
    }//GEN-LAST:event_ReporteActionPerformed

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        // Llamando a la función add en la clase funcionesJava.SPTK.TraduccionPy
    /* String[] traduccion=  funcionesJava.SPTK.getLista();
        Salir.setText(traduccion.toString());
        
        funcionesJava.SPTK.limpiarLista();*/


        Salir.setEditable(false);

        // Obtiene el elemento seleccionado en el componente Analizador y lo convierte en una cadena.
        String seleccionAnalisis = Analizador.getSelectedItem().toString();       
        // Comprueba si la cadena seleccionAnalisis es igual a "JSON".
        if (seleccionAnalisis == "JSON") {
             String JsonAnalisis = Entrar.getText();// Analiza el contenido JSON ingresado en el componente Entrar.
           
             //analizadoresJson("src/JSON_Analisis/", "JSlexico.jflex", "Jsonsintactico.cup");
            analizarJson(JsonAnalisis); // Llama a una función llamada analizarJson para analizar el JSON.
            if (nombreArchivo != null) {
               
                 funcionesJava.JSTK.variable(nombreArchivo); // Llama a la función variable() del objeto funcionesJava.JSTK y pasa el nombre del archivo como argumento.
               
            } else {
                // Imprime un mensaje en la consola si el objeto abrirArchivo es nulo.
                System.out.println("El objeto abrirArchivo es nulo.");
            }

        }else if (seleccionAnalisis=="STATPY"){  
          //analizadoresSp("src/STAT_analisis/", "Statlexico.jflex", "STATsintactico.cup");
          
           String SPAnalisis = Entrar.getText();
            analizarsp(SPAnalisis);
             List<String> listaTraduccion = SPTK.TraduccionPy;
            String listaSinCorchetes = String.join(", ", listaTraduccion);         
            Salir.setText("def main (): \n" + listaSinCorchetes+ "if __name__ == \"__main__\": \n main()" + "\n");
            
            
        }
    }//GEN-LAST:event_EjecutarActionPerformed

    private void GuardarCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCMActionPerformed
        JFileChooser NuevoGuardar = new JFileChooser();

        FileNameExtensionFilter archivoJson = new FileNameExtensionFilter("Archivo JSON (*.json)", "json");
        NuevoGuardar.addChoosableFileFilter(archivoJson);
        FileNameExtensionFilter archivosp = new FileNameExtensionFilter("Archivo StatPy (*.sp)", "sp");
        NuevoGuardar.addChoosableFileFilter(archivosp);
        int result = NuevoGuardar.showOpenDialog(Entrar);
        if (result == JFileChooser.APPROVE_OPTION) {
            abrirArchivo =NuevoGuardar.getSelectedFile();

            int selectedFilterIndex = NuevoGuardar.getFileFilter().equals(archivoJson) ? 0 : 1;  // Obtener el filtro seleccionado por el índice

            if (selectedFilterIndex == 0) {
                if (!abrirArchivo.getAbsolutePath().endsWith(".json")) {
                    abrirArchivo = new File(abrirArchivo.getAbsolutePath() + ".json");
                }
                try {
                    FileWriter writer = new FileWriter(abrirArchivo);// Crea un FileWriter para escribir en el archivo seleccionado
                    writer.write(Entrar.getText());  // se Escribe el contenido del componente de GUI "Editor" en el archivo
                    writer.close(); // Cierra el FileWriter para finalizar la escritura en el archivo
                    JOptionPane.showMessageDialog(null,"Archivo Json guardado con exito"); // Actualiza el componente de GUI "consola" para mostrar un mensaje de éxito
                } catch (Exception ex) {
                    ex.printStackTrace();// Si ocurre una excepción durante la escritura, imprime la traza de la excepción para depuración
                }

            } else if (selectedFilterIndex == 1) {

                if (!abrirArchivo.getAbsolutePath().endsWith(".sp")) {
                    abrirArchivo = new File(abrirArchivo.getAbsolutePath() + ".sp");
                }
                try {
                    FileWriter writer = new FileWriter(abrirArchivo); // Crea un FileWriter para escribir en el archivo seleccionado
                    writer.write(Entrar.getText()); // Escribe el contenido del componente de GUI "Editor" en el archivo
                    writer.close();
                    JOptionPane.showMessageDialog(null,"Archivo  SP guardado con exito");

                } catch (Exception ex) {
                    ex.printStackTrace();// Si ocurre una excepción durante la escritura, imprime la traza de la excepción para depuración
                }
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"se canselo la opcion guardar");
        }
    }//GEN-LAST:event_GuardarCMActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
         String texto = Entrar.getText(); // Obtener el texto de la entrada.
        File archivo = abrirArchivo; // Obtener el archivo abierto.
        String nombreArchivo = abrirArchivo.getName();
        System.out.println(nombreArchivo);
    try (PrintWriter escritor = new PrintWriter(archivo, StandardCharsets.UTF_8)) {
        escritor.print(texto);
        JOptionPane.showMessageDialog(null, "El archivo se guardó correctamente.");
    } catch (IOException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_GuardarActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this); // Cambiado a showOpenDialog y uso "this" en lugar de "Entrar".

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
             nombreArchivo = archivoSeleccionado.getName();
              System.out.println(nombreArchivo);

            try (Scanner scanner = new Scanner(archivoSeleccionado)) {
                StringBuilder contenidoArchivo = new StringBuilder(); // Usar StringBuilder para concatenar cadenas eficientemente.

                while (scanner.hasNextLine()) {
                    contenidoArchivo.append(scanner.nextLine()).append("\n");
                }

                Entrar.setText(contenidoArchivo.toString()); // Usar toString() para establecer el contenido en Entrar.
            } catch (IOException ex) { // Cambiado a IOException para una gestión más específica de excepciones de E/S.
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void ReporteSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteSPActionPerformed
       //LISTA PARA LA GENERACION DE TOKENS
        LinkedList<SPTK> SPlist = funcionesJava.SPTK.TokensSP;
        LinkedList<SPERR> SPerre =funcionesJava.SPERR.ERRSPtokens;        
        // Generar el HTML utilizando la clase HTMLSP
        Reportes.HTMLSP.HTMLSP(SPlist);
        SPlist.clear();
        // Generar el HTML utilizando la clase HTMLSPERR
        Reportes.HTMLSPERR.HTMLSPERR(SPerre);
        SPerre.clear();
    }//GEN-LAST:event_ReporteSPActionPerformed

     public static void analizarJson (String entrada){
        //CODIGO DADO POR EL AUXILIAR
         try {
            JSON_Analisis.Lexer lexer = new JSON_Analisis.Lexer(new StringReader(entrada)); 
            JSON_Analisis.Parser parser = new JSON_Analisis.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
    
     public static void analizadoresJson(String ruta, String jflexFile, String cupFile){
       //CODIGO DADO POR EL AUXILIAR
         try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
     
     public static void analizarsp (String entrada){
        //CODIGO DADO POR EL AUXILIAR
         try {
            STAT_analisis.Lexer lexer = new STAT_analisis.Lexer(new StringReader(entrada)); 
            STAT_analisis.Parser parser = new STAT_analisis.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
    
     public static void analizadoresSp(String ruta, String jflexFile, String cupFile){
        //CODIGO DADO POR EL AUXILIAR
         try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JComboBox<String> Analizador;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JTextArea Entrar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton GuardarCM;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton ReporteSP;
    private javax.swing.JTextPane Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
