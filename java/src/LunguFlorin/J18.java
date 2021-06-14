package LunguFlorin;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * J18. Vizualizati pretul aurului din 1970 folosind data setul din https://datahub.io/core/gold-prices
 */
public class J18 extends ApplicationFrame {

    public J18(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart lineChart = null;
        try {
            lineChart = ChartFactory.createLineChart(
                    chartTitle,
                    "year",
                    "USD",
                    createDataset(),
                    PlotOrientation.VERTICAL,
                    true, true, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1920, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() throws IOException {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i;

        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader("./LunguFlorin/annual_csv.csv"));
        String[] data;
        Integer year;
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            data = row.split(",");
            data[0] = data[0].substring(0,data[0].indexOf('-'));
            if (Integer.parseInt(data[0])>1970) {
                dataset.addValue(Double.parseDouble(data[1]), "value", data[0]);
            }
        }
        csvReader.close();

        return dataset;
    }

    public static void main(String... arg) {
        J18 chart = new J18("Gold Prices", "Gold Prices 1970-2019");
        chart.pack();
        chart.setVisible(true);
    }

}
