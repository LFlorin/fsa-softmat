package LunguFlorin;

/**
 * J4. Folosind instructiunea for parcurgeti un array de numere integer si printati la consola doar acele valori care sunt pare.
 * Pentru cele impare treceti mai departe.
 */
public class J4 {
    public static void main(String... arg) {
        int[] vector = {4, 6, 7, 89, 1, 3, 6, 49, 1, 6, 3, 6, 49, 7, 98, 7, 4};
        for (int number : vector) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
