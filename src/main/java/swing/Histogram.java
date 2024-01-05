package swing;

import java.util.Map;

public record Histogram(String Title, String X, String Y, Map<String, Integer> data){}
