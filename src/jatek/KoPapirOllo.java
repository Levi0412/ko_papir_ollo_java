package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);


        int gepValasztasSzam = rnd.nextInt(3) + 1; 
        String gepValasztas = "";
        if (gepValasztasSzam == 1) {
            gepValasztas = "kő";
        } else if (gepValasztasSzam == 2) {
            gepValasztas = "papír";
        } else {
            gepValasztas = "olló";
        }


        System.out.println("Adj meg egy számot 1-től 3-ig (1: Kő, 2: Papír, 3: Olló): ");
        int jatekosValasztasSzam = sc.nextInt();
        String jatekosValasztas = "";
        if (jatekosValasztasSzam == 1) {
            jatekosValasztas = "kő";
        } else if (jatekosValasztasSzam == 2) {
            jatekosValasztas = "papír";
        } else if (jatekosValasztasSzam == 3) {
            jatekosValasztas = "olló";
        }


        System.out.println("A gép választása: " + gepValasztas);
        System.out.println(jatekosValasztas + " a te választásod: ");
        
        if (gepValasztasSzam == jatekosValasztasSzam) {
            System.out.println("Döntetlen!");
        } else if (jatekosValasztasSzam == 1 && gepValasztasSzam == 3) {
            System.out.println("Nyertél!");
        } else if (jatekosValasztasSzam == 2 && gepValasztasSzam == 1) {
            System.out.println("Nyertél!");
        } else if (jatekosValasztasSzam == 3 && gepValasztasSzam == 2) { 
            System.out.println("Nyertél!");
        } else {
            System.out.println("Vesztettél!");
        }
    }
}
