package LunguFlorin;

import java.util.ArrayList;
import java.util.List;

/**
 * J11. Folosind metoda Math.Random() va rog sa generati un array de numere intregi.
 * Folosind metoda Math.min si Math.max gasiti valoarea minima si maxima a elementelor din array.
 */
public class J11 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int i = 0;
        int min = 101;
        while ( i++ < 10) {
            array.add((int) (Math.random()*(min-1)));
        }

        for (Integer element : array) {
            min = Math.min(min,element);
        }

        System.out.println(min);
    }
}
