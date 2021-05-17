package LunguFlorin;

/**
 * J15. Calculati cel mai mic multiplu comun al numerelor 3, 9, 12, 2, 8, 6, 18
 */
public class J15 {
    public static void main(String... args) {
        int[] array = {3, 9, 12, 2, 8, 6, 18};
        int cmmcValue = 1;
        for (int value : array) {
            cmmcValue = cmmmc(cmmcValue,value);
        }
        System.out.println(cmmcValue);
    }

    public static int cmmmc(int x, int y) {
        int p=x*y;
        while (x!=y) {
            if (x>y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return p/x;
    }
}
