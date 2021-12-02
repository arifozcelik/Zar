package kitapSonuOrnekleri;

import java.util.Scanner;

public class Zar {
    private static Scanner gir;
    static void TahminEt(int N){
        int bir = 0, iki = 0, uc = 0;
        int dort = 0, bes = 0, alti = 0;
        for (int i = 0; i<N; i++)
        {
            int sayi = 1 + (int) (Math.random() * 6);
            if (sayi == 1) bir++;
            if (sayi == 2) iki++;
            if (sayi == 3) uc++;
            if (sayi == 4) dort++;
            if (sayi == 5) bes++;
            if (sayi == 6) alti++;
        } //FOR SONU
        System.out.println("1\t" + bir + "\tkez geldi");
        System.out.println("2\t" + iki + "\tkez geldi");
        System.out.println("3\t" + uc + "\tkez geldi");
        System.out.println("4\t" + dort + "\tkez geldi");
        System.out.println("5\t" + bes + "\tkez geldi");
        System.out.println("6\t" + alti + "\tkez geldi");
    } //TahminEt fonk. kapat

    public static void main(String[] args) {
        gir = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int N = gir.nextInt();
        TahminEt(N);
    }
}
