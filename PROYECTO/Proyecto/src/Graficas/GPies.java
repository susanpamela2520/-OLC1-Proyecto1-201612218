
package Graficas;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.title.TextTitle;


public class GPies {

       public static  HashMap<String, Object> VGlobales = new HashMap<>();
      
         public void Graficar(String titulo,ArrayList<String> ValuesX,ArrayList<Double> Values) throws IOException{
          /* System.out.println("grafica de pie");
           System.out.println(titulo);
            System.out.println("Valores X:");
            for (String valueX : ValuesX) {
                System.out.println(valueX);
            }

            // Imprimir los valores contenidos en Values
            System.out.println("Valores:");
            for (Double value : Values) {
                System.out.println(value);
    }*/
           
                        DefaultPieDataset dataset = new DefaultPieDataset();
              for (int i = 0; i < ValuesX.size(); i++) {
                  dataset.setValue(ValuesX.get(i), Values.get(i));
              }

              JFreeChart chart = ChartFactory.createPieChart(
                      titulo,   // Título del gráfico
                      dataset,          // Dataset
                      true,             // Mostrar leyenda
                      true,
                      false);

              // Personalización adicional
              PiePlot plot = (PiePlot) chart.getPlot();
              plot.setSectionOutlinesVisible(false); // No mostrar bordes entre secciones
              plot.setCircular(true); // Hacer el gráfico de pastel circular
              plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12)); // Fuente de etiquetas
              plot.setLabelGap(0.02); // Espacio entre etiquetas y gráfico

              // Ocultar los valores en el gráfico de pastel
    plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}")); // Solo muestra las etiquetas de las secciones

    // Título personalizado
    /*TextTitle chartTitle = chart.getTitle();
    chartTitle.setFont(new Font("SansSerif", Font.BOLD, 16));*/

              int width = 1000;
              int height = 900;
              File pieChart = new File("GRAFICA_PIE.PNG");
              ChartUtilities.saveChartAsJPEG(pieChart, chart, width, height);
          }
}