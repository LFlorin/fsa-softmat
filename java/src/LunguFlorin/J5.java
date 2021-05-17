package LunguFlorin;

/**
 * J5. Folosind instructiunea while va rog sa parcurgeti un array de numere intregi pentru care sa calculati suma tuturor valorilor.
 */
public class J5 {
    public static void main(String... args) {
        int[] vector = {4, 6, 7, 89, 1, 3, 6, 49, 1, 6, 3, 6, 49, 7, 98, 7, 4};
        int sum = 0, i = 0;
        while (i < vector.length) {
            sum += vector[i++];
        }
        System.out.println(sum);
    }
}
