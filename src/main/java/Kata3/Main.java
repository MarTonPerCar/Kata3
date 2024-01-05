package Kata3;

import swing.Histogram;
import swing.MainFrame;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SalesLoader l = new CsvFileSalesLoader(new File("src/main/java/10000_Sales_Records.csv"));
        List<Sales> sales = l.load();
        Map<String, Integer> map = new HashMap<>();
        for (Sales sale : sales) {
            String itemType = sale.getItem_Type();
            map.put(itemType, map.getOrDefault(itemType, 0) + 1);
        }

        Histogram histogram = new Histogram("Diagrama", "Tipo de Objetos", "Cantida de objetos", map);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
