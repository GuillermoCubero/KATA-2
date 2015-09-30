package histograma;

import java.util.HashMap;

public class Histogramav2 {
    public static void main(String[] args) {
        
        Integer[] vector = {1,1,2,6,7,5,3,4,7,8,9,9,3,2,1,100,-4};
        
        Histogramv2 <Integer> histogram = CalculaHistograma.calcHisto(vector);
        for (Object clave : histogram.keySet()) {
            System.out.println("Para la ocurrencia de: " + clave + " su frecuencia es: " + histogram.get(clave));
        }
    }
}
