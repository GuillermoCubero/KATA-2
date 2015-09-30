package histograma;

import java.util.HashMap;

public class Histograma {
    public static void main(String[] args) {
        
        int[] vector = {1,1,2,6,7,5,3,4,7,8,9,9,3,2,1,100,-4};
        
        Histogram mihisto = new Histogram(vector);
   
        HashMap<Integer, Integer> histogram = mihisto.getHisto();
        for (int clave : histogram.keySet()){
            System.out.println("Para la ocurrencia de: " + clave + " su frecuencia es: " + histogram.get(clave));
        }
    }
}
