/**
 * 
 */
package algoritmit;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author lassi
 * @version 7.12.2022
 *
 */
public class binaarihaku {

    
    /**
     * Aliohjelma lajittelee kokonaislukutaulukon alkiot 
     * kasvavaan suuruusjärjestykseen käyttäen kuplalajittelua
     * @param t kokonaislukutaulukko
     */
    public static void jarjesta(int[] t) {
        int pienin = 0;
        for (int i = 0; i < t.length-1; i++) {
            pienin = t[i];
            for (int j = i+1; j < t.length; j++) {
                if (t[j] <= pienin) {
                    pienin = t[j];
                    t[j] = t[i]; t[i] = pienin; 
                }
            } 
        }
    }
    
    
    /**
     * Tehdään binäärihaku
     * @param t järjestetty taulukko
     * @param a hakuavain
     */
    public static void puolitushaku(int[] t, int a) {
        int i = -1;
        int j = t.length;
        int k;
        int vert = 0;
        while (j-i > 1) {
          k = (i + j)/2;
          vert++;
          if (a <= t[k]) {
              j = k; 
          }
          else i = k;
        }
        
        if (j < t.length && a == t[j]) {
            System.out.println("Löytyi paikasta " + j + "!");
            System.out.println("Vertailtiin " + vert + " kertaa.");
        }
        else {
            System.out.println("Luku ei ole taulukossa..");
            System.out.println("Vertailtiin " + vert + " kertaa.");
        }
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] t = IntStream.generate(() -> new Random().nextInt(10)).limit(10).toArray();
        jarjesta(t);
        System.out.println(Arrays.toString(t));
        puolitushaku(t, 7);
        puolitushaku(t, 3);
           
        
    }

}
