package LunguFlorin;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

/**
 * J16. Vizualizati graficul f(x)=x^2
 */
public class J16 extends ApplicationFrame {

    public J16(String title, String chartTitle) {
        super(title);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "", "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (double i = -3; i <= 3; i += 0.5) {
            dataset.addValue(f(i), "f(x)", String.valueOf(i));
        }
        return dataset;

        /*dataset.addValue(15,"schools","1970");
        dataset.addValue(30,"schools","1980");
        dataset.addValue(60,"schools","1990");*/
    }

    private double f(double x) {
        return x * x;
    }

    public static void main(String... args) {
        J16 j16 = new J16("f(x)", "f(x) = x^2");
        j16.pack();
        j16.setVisible(true);
    }
}
