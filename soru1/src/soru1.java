
import java.util.Scanner;
public class soru1 {
    public static void main(String[] args){

        //Onluk sayı sistemindeki sayıyı 2 lik sayı sistemine çevirme
        Scanner input = new Scanner(System.in);
        boolean seçenek=true;

            System.out.print("tam sayı olcak şekilde onluk sayı sisteme uyan bir sayı giriniz:");
            int sayı = input.nextInt();
            sayıçevirme o1 = new sayıçevirme();
            o1.çeviri(sayı);

    }
}