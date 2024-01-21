/*
O každém prodejci potřebujeme evidovat tyto údaje:

Jméno a příjmení prodejce
Datum narození prodejce.
Počet dosud sjednaných smluv.
Celkové množství prodané mrkve v tunách.
Název města, kde prodejce sídlí.
Registrační značka vozidla („SPZ“).
Spotřeba firemního vozidla v litrech na 100 km.
IP adresa verze 4 firemního počítače.


Na základě zadaných údajů vypiš v metodě main na obrazovku průměrné množství prodané
mrkve na jednu smlouvu.
*/

import java.time.LocalDate;

public class Main {


    public static void prodejce1() {
        String name = "Pavel Novotny";
        LocalDate date = LocalDate.of(1980, 4, 12);
        int agreement = 2;
        double totalQuantity = 90.5;
        String city = "Olomouc";
        String spz = "6M01224";
        double fuel = 240.4;
        String ip = "192.0.2.146";

        double prumer =  totalQuantity / agreement;

        System.out.println("Jmeno prodejce: " +name+ ".");
        System.out.println("Datum narozeni: " +date+ ".");
        System.out.println("Pocet uzavrenych smluv: " +agreement+ ".");
        System.out.println("Celkove mnozstvi prodane mrkve: " +totalQuantity+ "tn.");
        System.out.println("Sidlo prodejce: " +city+ ".");
        System.out.println("SPZ: " +spz+ ".");
        System.out.println("Celkova spotreba auta: " +fuel+ "l/100km.");
        System.out.println("IP adresa verze 4: " +ip+ ".");
        System.out.println("Prumerne mnozstvi prodane mrkve na jednu smlouvu je: " +prumer+"ks.");

    }

    public static void prodejce2() {
        String name = "Otakar Vesely";
        LocalDate date = LocalDate.of(1956, 3, 22);
        int agreement = 6;
        double totalQuantity = 800;
        String city = "Prerov";
        String spz = "6M72324";
        double fuel = 1245;
        String ip = "192.0.1.189";

        double prumer =  totalQuantity / agreement;


        System.out.println("Jmeno prodejce: " +name+ ".");
        System.out.println("Datum narozeni: " +date+ ".");
        System.out.println("Pocet uzavrenych smluv: " +agreement+ ".");
        System.out.println("Celkove mnozstvi prodane mrkve: " +totalQuantity+ "tn.");
        System.out.println("Sidlo prodejce: " +city+ ".");
        System.out.println("SPZ: " +spz+ ".");
        System.out.println("Celkova spotreba auta: " +fuel+ "l/100km.");
        System.out.println("IP adresa verze 4: " +ip+ ".");
        System.out.println("Prumerne mnozstvi prodane mrkve na jednu smlouvu je: " +prumer+"ks.");



    }


    public static void main(String[] args) {

        System.out.println("Prodejci:");

        prodejce1();
        System.out.println();
        prodejce2();

    }

}