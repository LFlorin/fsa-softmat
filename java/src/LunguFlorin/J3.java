package LunguFlorin;

/**
 * J3. Va rog sa definiti un array de numere integer pe care sa-l initializati.
 * Va rog sa afisisati indexul la care se afla maximul si minimul din acest vector.
 */
public class J3 {
    public static void main(String... args) {
        int[] vector = {4, 6, 7, 89, 1, 3, 6, 49, 1, 6, 3, 6, 49, 7, 98, 7, 4};
        int min, max;
        if (vector.length > 0) {
            min = max = 0;
            for (int i = 1; i < vector.length; i++) {
                if (vector[min] > vector[i]) {
                    min = i;
                }
                if (vector[max] < vector[i]) {
                    max = i;
                }
            }
            System.out.println("Maxim " + max + "\nMinim " + min);
        }
    }
}
