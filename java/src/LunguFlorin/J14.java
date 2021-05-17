package LunguFlorin;

/**
 J14. Calculati deviatia standard si media, a urmatorului sir de numere 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
 */
public class J14 {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.format("Deviatia standard : " + standardDeviation(array) + "\nMedia : " + mean(array));
    }

    public static double standardDeviation(int array[])
    {
        double standardDeviation = 0, length = array.length, mean = mean(array);

        for(int num: array) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/(length-1));
    }

    public static double mean(int array[]) {
        int length = array.length , sum = 0;
        for(int num : array) {
            sum += num;
        }

        return (double) sum/length;
    }
}
