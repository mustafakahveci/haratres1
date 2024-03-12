package haratres1;

import java.util.Scanner;

public class Haratres1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Maksimum karakter sayısını belirleyin :");
        int maxChar = sc.nextInt();
        sc.nextLine();

        System.out.println("Lütfen bir cümle girin :");
        String text = sc.nextLine();

        while (true) {
            if (text == null) {
                System.out.println("Lütfen bir cümle girin : ");
                text = sc.nextLine();
            }
            if (text.length() > maxChar) {
                System.out.println("Girdiğiniz cümle maksimum karakter sayısını aşıyor! ");
                System.out.println("Lütfen bir cümle girin :");
                text = sc.nextLine();
            } else {
                break;
            }
        }

        boolean caseSensitivity;
        System.out.println("Büyük/küçük harf duyarlılığı aktif olsun mu? (E/H): ");
        String secim = sc.nextLine();
        secim = secim.toUpperCase();
        while (true) {
            if (secim == null) {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
                System.out.println("Büyük/küçük harf duyarlılığı aktif olsun mu? (E/H): ");
                secim = sc.nextLine();
            }
            if ("E".equals(secim)) {
                caseSensitivity = true;
                break;
            } else if ("H".equals(secim)) {
                caseSensitivity = false;
                break;
            } else {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
                System.out.println("Büyük/küçük harf duyarlılığı aktif olsun mu? (E/H): ");
                secim = sc.nextLine();
            }
        }

        char analizHarfi;
        while (true) {
            System.out.print("Analiz etmek için bir harf girin: ");
            String giris = sc.nextLine();
            if (giris.length() == 1) {
                analizHarfi = giris.charAt(0);
                break;
            } else {
                System.out.println("Geçerli bir karakter giriniz.");
            }
        }

        int toplamSayi = 0;
        if (caseSensitivity) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == analizHarfi) {
                    toplamSayi++;
                }
            }
        } else {
            text = text.toLowerCase();
            analizHarfi = Character.toLowerCase(analizHarfi);
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == analizHarfi) {
                    toplamSayi++;
                }
            }
        }

        System.out.printf("Girilen cümlede '%c' harfi toplamda %d defa geçmektedir.%n", analizHarfi, toplamSayi);

    }
}
