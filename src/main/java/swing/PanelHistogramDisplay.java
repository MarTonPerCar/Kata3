package swing;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Map;

public class PanelHistogramDisplay extends JPanel implements HistogramDisplay{
    @Override
    public void show(Histogram histogram) {
        add(new ChartPanel(DisplayDiagram(histogram)));
    }

    private JFreeChart DisplayDiagram(Histogram histogram) {
        return ChartFactory.createBarChart(
                histogram.Title(),
                histogram.X(),
                histogram.Y(),
                dataset(histogram.data())
        );
    }

    private CategoryDataset dataset(Map<String, Integer> data) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String k : data.keySet()) {
            dataset.addValue(data.get(k), k, "");
        }
        return dataset;
    }
}
