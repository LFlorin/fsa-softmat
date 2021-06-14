package LunguFlorin;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * J17. Vizualizati histograma a 100 de numere generate random
 */
public class J17 extends ApplicationFrame {
    int[] hst = new int[10];

    public J17(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "",
                "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i;
        for (i = 0; i < 100; i++) {
            hst[(int) (Math.random() * 10)]++;
        }
        for (i = 0; i < 10; i++) {
            dataset.addValue(hst[i], "aparition", String.valueOf(i));
        }

        return dataset;
    }

    public static void main(String... arg) {
        //Math.random();
        //Random random = new Random(); random.nextInt(12);
        J17 chart = new J17("Histogram", "Histogram of numbers 0-9 with Math.random");
        chart.pack();
        chart.setVisible(true);
    }
}
