package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);


       int gepValSzam = rnd.nextInt(3) + 1; 
       //  int gepValSzam = 3; (tesztelés)
        String gepValasz = "";
        if (gepValSzam == 1) {
            gepValasz = "kő";
        } else if (gepValSzam == 2) {
            gepValasz = "papír";
        } else {
            gepValasz = "olló";
        }

        System.out.println("Adj meg egy számot 1-től 3-ig (1: Kő, 2: Papír, 3: Olló): ");
        int jatekosValSzam = sc.nextInt();
        String jatekosValasz = "";
        if (jatekosValSzam == 1) {
            jatekosValasz = "kő";
        } else if (jatekosValSzam == 2) {
            jatekosValasz = "papír";
        } else if (jatekosValSzam == 3) {
            jatekosValasz = "olló";
        }

        System.out.println("A gép választása: " + gepValasz);
        System.out.println(jatekosValasz + " a te választásod: ");
        
        if (gepValSzam == jatekosValSzam) {
            System.out.println("Döntetlen!");
        } else if (jatekosValSzam == 1 && gepValSzam == 3) {
            System.out.println("Nyertél!");
        } else if (jatekosValSzam == 2 && gepValSzam == 1) {
            System.out.println("Nyertél!");
        } else if (jatekosValSzam == 3 && gepValSzam == 2) { 
            System.out.println("Nyertél!");
        } else {
            System.out.println("Vesztettél!");
        }
    }
}
