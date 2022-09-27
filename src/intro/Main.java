package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String midText = "You may Interested ";
        String subTest = "Vade Süresi";

        System.out.println(subTest);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.14;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.swg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.swg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan Alanlar","Mutlu Emekli","Öğrenci"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
        System.out.println(krediler[3]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }
}

