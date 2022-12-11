import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hesapmakinesiiçi hesaplama =new Hesapmakinesiiçi();
        boolean seçim = false;
        do {

            hesaplama.menü();

            int kullanıcıseçim = input.nextInt();
            System.out.print("İşlem yapacağınız 1. sayı değerini giriniz : ");
            double sayı1 = input.nextDouble();
            System.out.print("İşlem yapacağınız 2. sayı değerini giriniz : ");
            double sayı2 = input.nextDouble();
            double sonuç = 0;
            switch (kullanıcıseçim) {
                case 1:
                    sonuç = hesaplama.toplama(sayı1, sayı2);
                    hesaplama.Ekranayazdır(sayı1, sayı2, sonuç, "+");
                    break;
                case 2:
                    sonuç = hesaplama.çıkarma(sayı1, sayı2);
                    hesaplama.Ekranayazdır(sayı1, sayı2, sonuç, "-");
                    break;
                case 3:
                    sonuç = hesaplama.çarpma(sayı1, sayı2);
                    hesaplama.Ekranayazdır(sayı1, sayı2, sonuç, "*");
                    break;
                case 4:
                    sonuç = hesaplama.bölme(sayı1, sayı2);
                    hesaplama.Ekranayazdır(sayı1, sayı2, sonuç, "/");
                    break;
                default:
                    System.out.println("Belirtmiş olduğunuz seçenek liste içerisinde bulunamadı.");
                    break;
            }
            System.out.print("Yeniden işlem yapmak istermisiniz [E=1/H= 1 dışında sayısa basınız] : ");
            int  karar = input.nextInt();
            if (karar==1){
                seçim=true;
            }
            else {
                seçim=false;
            }

        }while(seçim);

    }
}