package algoritmit;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author lassi
 * @version 1.11.2022
 *
 */
public class etsinta {

    /**
     * @param t t
     * @param m m
     * @return maara
     */
    public static int jaettavat(int[] t, int m) {
        int maara = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % m == 0) maara++;
        }
        return maara;
    }
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] t = IntStream.generate(() -> new Random().nextInt(100)).limit(20).toArray();
        int maara = jaettavat(t, 2);
        int maara1 = jaettavat(t, 3);
        int maara3 = jaettavat(t, 5);
        System.out.println(Arrays.toString(t));
        System.out.println("2 jaollisia on " + maara + ", 3 jaollisia on " + maara1 + ", 5 jaollisia on " + maara3 + ".");
        int[] t2 = IntStream.generate(() -> new Random().nextInt(50)).limit(25).toArray();
        int montako = jaettavat(t2, 2);
        int montako1 = jaettavat(t2, 3);
        int montako2 = jaettavat(t2, 5);
        System.out.println(Arrays.toString(t2));
        System.out.println("2 jaollisia on " + montako + ", 3 jaollisia on " + montako1 + ", 5 jaollisia on " + montako2 + ".");

    }

}
