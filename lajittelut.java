package algoritmit;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author ll
 * @version 29.11.2022
 *
 */
public class lajittelut {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        // Kuplalajittelu
        int[] t = IntStream.generate(() -> new Random().nextInt(100)).limit(20).toArray();
        System.out.println(Arrays.toString(t));
        kuplaLajittelu(t);
        
        // Valintalajittelu
        int[] tt = IntStream.generate(() -> new Random().nextInt(100)).limit(20).toArray();
        System.out.println(Arrays.toString(tt));
        valintaLajittelu(tt);
    }
    
    
    /**
     * Aliohjelma lajittelee kokonaislukutaulukon alkiot 
     * kasvavaan suuruusjärjestykseen käyttäen valintalajittelua
     * @param t kokonaislukutaulukko
     */
    public static void valintaLajittelu(int[] t) {
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
        System.out.println("Valintalajittelun jälkeen: ");
        System.out.println(Arrays.toString(t));
    }
    
    
    /**
     * Aliohjelma lajittelee kokonaislukutaulukon alkiot 
     * kasvavaan suuruusjärjestykseen käyttäen kuplalajittelua
     * @param t kokonaislukutaulukko
     */
    public static void kuplaLajittelu(int[] t) {
        int apu = 0;
        for (int i = 0; i < t.length-1; i++) {
            for (int j = i+1; j < t.length; j++) {
                if (t[j] <= t[i]) {
                    apu = t[i]; t[i] = t[j]; t[j] = apu;
                }
            }
        }
        System.out.println("Kuplalajittelun jälkeen: ");
        System.out.println(Arrays.toString(t));
    }

}
