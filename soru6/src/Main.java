import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz dizinin uzunluğunu giriniz : ");
        int diziuzunluğu = input.nextInt();
        int[] dizi = new int[diziuzunluğu];
        int toplam=0;
        int sayaç=0;
        for (int mm:dizi) {
            System.out.print(sayaç+" indexli dizi değerini giriniz : ");
            mm=input.nextInt();
            toplam+=mm;
            sayaç++;
        }
        int ortalama = toplam/diziuzunluğu;
        System.out.println("oluşturmuş olduğunuz dizinin toplamı : "+toplam+",ortalaması: "+ortalama);


    }
}