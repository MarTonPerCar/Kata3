package swing;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public MainFrame() {
        setTitle("Diagrama");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500, 1500);
        setLocationRelativeTo(null);
        add(CreateDiagram());
    }

    public HistogramDisplay histogramDisplay() {
        return histogramDisplay;
    }

    private Component CreateDiagram() {
        PanelHistogramDisplay display = new PanelHistogramDisplay();
        histogramDisplay = display;
        return display;
    }
}
