package LunguFlorin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * J10. Scrieti o aplicatie in Java care preia de la tastatura un array de caractere. Lungimea arrayului se va citi la inceput de la tastarura.
 */
public class J10 {
    public static void main(String[] args) {
        InputStreamReader imputStream = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(imputStream);
        int lenght = -1;

        do {
            try {
                System.out.print("Lenght of array : ");
                lenght = Integer.parseInt(in.readLine());
                if (lenght < 1) {
                    System.out.println("Try a positive one");
                }
                if (lenght > 100) {
                    System.out.println("Try a small one");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Enter a number");
            }
        } while (lenght < 1 || lenght > 100);

        char[] string = new char[100];

        try {
            System.out.println("Enter your text");
            in.read(string, 0, lenght);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(string);

    }
}
