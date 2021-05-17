package LunguFlorin;

/**
 * J12. Definiti o matrice in care sa calculati sinusul, cosinusul, tangenta unghiurilor: de 0 grade, 45 de grade, 90 grade si 180 de grade.
 * Va rog sa afisati aceste valori.
 */
public class J12 {
    public static void main (String... args) {
        double[][] matrix = new double[3][4];
        matrix[0][0]=Math.sin(Math.toRadians(0));
        matrix[0][1]=Math.sin(Math.toRadians(45));
        matrix[0][2]=Math.sin(Math.toRadians(90));
        matrix[0][3]=Math.sin(Math.toRadians(180));

        matrix[1][0]=Math.cos(Math.toRadians(0));
        matrix[1][1]=Math.cos(Math.toRadians(45));
        matrix[1][2]=Math.cos(Math.toRadians(90));
        matrix[1][3]=Math.cos(Math.toRadians(180));

        matrix[2][0]=Math.tan(Math.toRadians(0));
        matrix[2][1]=Math.tan(Math.toRadians(45));
        matrix[2][2]=Math.tan(Math.toRadians(90));
        matrix[2][3]=Math.tan(Math.toRadians(180));

        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
