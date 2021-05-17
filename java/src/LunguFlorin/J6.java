package LunguFlorin;

/**
 * J6. Folosind instructiune do while calculati suma numerelor impare dintr-un array de numere integer.
 */
public class J6 {
    public static void main(String[] args) {
        int[] vector = {4, 6, 7, 89, 1, 3, 6, 49, 1, 6, 3, 6, 49, 7, 98, 7, 4};
        int sum = 0, i = 0;
        while (i < vector.length) {
            if (vector[i] % 2 == 1) {
                sum += vector[i];
            }
            i++;
        }
        System.out.println(sum);
    }
}
