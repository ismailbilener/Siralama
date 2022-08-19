import com.sun.media.sound.RIFFReader;

import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        sayi3 = input.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3){
            System.out.println("en küçük sayi: "+sayi1);
        }
        else if (sayi2<sayi1 && sayi2<sayi3){
            System.out.println("En küçük sayi: " + sayi2);
        }
        else
            System.out.println("En küçük sayi: " + sayi3);
    }
}
