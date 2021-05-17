package LunguFlorin;

/**
 * J13. Definiti o functie f(x,y)=sqrt(sin(x)^2+cos(y)^2) si calculati expresia f(1,2)-10
 */
public class J13 {

    private static double f(double x, double y) {
        return Math.sqrt(Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(y), 2));
    }

    static public void main(String... args) {
        System.out.println(f(1, 2) - 10);
    }
}
