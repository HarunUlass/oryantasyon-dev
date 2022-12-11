import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci bilgi sistemine hoşgeldiniz.");
        System.out.print("Öğrenci Adı: ");
        String ad = input.next();
        System.out.print("Öğrenci Soyadı: ");
        String soyad = input.next();
        System.out.print("Öğrenci Not 1 :");
        double not1 = input.nextDouble();
        System.out.print("Öğrenci Not 2 :");
        double not2 = input.nextDouble();
        System.out.print("Öğrenci Not 3 :");
        double not3 = input.nextDouble();
        Öğrenci hesaplama= new Öğrenci();
        hesaplama.ÖğrenciNotDurumu(ad,soyad,not1,not2,not3);


    }
}