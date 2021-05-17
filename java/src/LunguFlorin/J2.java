package LunguFlorin;


import java.util.ArrayList;
import java.util.List;

/**
 * J2. Va rog sa definiti un array de String pe care sa-l initializati cu denumirea tuturor materiilor pe care le urmati in acest semestru la masterul TCSI.
 * Va rog sa afisati la consola indexul pozitie a carei valoare este regasita materia de "Programare Java si sotware matematic".
 */
public class J2 {
    public static void main(String[] args) {

        String[] vector = {"Cercetare științifică și practică 2",
                "Limbaje de programare pentru aplicaţii pe internet",
                "Matematici aplicate în realitatea virtuală",
                "Programare Java si software matematic",
                "Metode statistice avansate pentru modelarea sistemelor haotice cu aplicații în criptologie",
                "Metodologia cercetării științifice"};

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].equals("Programare Java si software matematic")) {
                System.out.println(i);
                break;
            }
        }
        /*List<String> array = new ArrayList<>();
        array.add("Cercetare științifică și practică 2");
        array.add("Limbaje de programare pentru aplicaţii pe internet");
        array.add("Matematici aplicate în realitatea virtuală");
        array.add("Programare Java si software matematic");
        array.add("Metode statistice avansate pentru modelarea sistemelor haotice cu aplicații în criptologie");
        array.add("Metodologia cercetării științifice");
        System.out.println(array.indexOf("Programare Java si software matematic"));*/
    }
}
