package APIMAIN;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        Random random = new Random();
        
        Kvet[] kvety = new Kvet[] {
            new Kvet("Oleander", "Vonkajsia", 6, 120),
            new Kvet("Orchudea", "Vnutorna", 8, 230),
            new Kvet("Ruža", "Vonkajšia", 14, 17),
            new Kvet("KvetX1", "Vnútorná", 1, 205),
            new Kvet("KvetX2", "Vnútorná", 270, 125),
        };
        
        String[] darceky = new String[] {
            new String("metla"),
            new String("lopata"),
            new String("ryl"),
        
        };
        
System.out.println("Vyberte si:");

for (int i = 0; i < kvety.length; i++) {
            Kvet kvetina = kvety[i];
            System.out.printf("  %d) %s (%s) x%d | %d €\n",
                    i + 1,
                    kvetina.getNazov(),
                    kvetina.getTyp(),
                    kvetina.getPocetKusov(),
                    kvetina.getCena());
        }
        
Kvet vyber;

        int index;
        do {
            System.out.printf("Prosim, teraz si vyberte kvetinu: 1 do %d: ", kvety.length);
            index = vstup.nextInt();
        } while(index < 1 || index > kvety.length);

        vyber = kvety[index - 1];

        vstup.nextLine();

 System.out.printf("Priali by ste si viac ako jeden kus '%s' (ano / )? ", vyber.getNazov());
        int pocet = 1;
        if (vstup.nextLine().charAt(0) == 'a') {
            do {
                System.out.printf("Zadajte pocet kusov (1 - %d): ", vyber.getPocetKusov());
                pocet = vstup.nextInt();
            } while(pocet < 1 || pocet > vyber.getPocetKusov());

            vstup.nextLine();
       }

        vyber.setPocetKusov(vyber.getPocetKusov() - pocet);

if (pocet >= 5){
String darcek = darceky[random.nextInt(darceky.length)];
System.out.println("Za nakup dostavate darcek: " + darcek);
}
else {
System.out.println("Na darcek potrebujete nakupit aspon 5 produktov");
}

System.out.println("\nObjednavka:");
        System.out.printf("%s| %d € x %d = %d €\n",
                vyber.getNazov(),
                vyber.getCena(),
                pocet,
                pocet * vyber.getCena());
        System.out.println("Dokoncili ste nakup!");
    }
}

