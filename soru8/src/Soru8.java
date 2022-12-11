import java.util.Scanner;
public class Soru8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menü = true;
        int[] sayıdizisi = new int[10];
        do {
            dizidüzenleme düzen = new dizidüzenleme();
            System.out.println("Dizi üzerinde yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-rastgele 5 indexe eleman ekleme(1-10 arasından belirler)");
            System.out.println("2-Elamanları sırala");
            System.out.println("3-En küçük elemanı bul");
            System.out.println("4-Elaman Sil");
            System.out.println("5-Eleman ekle");
            int kullanıcıseçim = input.nextInt();
            switch (kullanıcıseçim){
                case 1:
                    System.out.println("Rastgele elemanlarıznız ekleniyor...");
                    sayıdizisi= düzen.elemanekle(sayıdizisi);
                    break;
                case 2:
                    sayıdizisi=düzen.Listele(sayıdizisi);
                    break;
                case 3:
                    System.out.println("en küçük" + düzen.Enküçükeleman(sayıdizisi));
                    break;
                case 4:
                    System.out.print("Silemek istediğiniz değeri giriniz : ");
                    int Silinecekeleman= input.nextInt();
                    sayıdizisi=düzen.ElamanSil(sayıdizisi,Silinecekeleman);
                    break;
                case 5:
                    System.out.print("Eklemek İstediğiniz değerleri giriniz: ");
                    int eklenecekeleman=input.nextInt();
                    sayıdizisi= düzen.Yenielemanekle(sayıdizisi,eklenecekeleman);
                    break;
                default:
                    System.out.println("Belirtilen seçeneklerden birini seçiniz.");
                    break;
            }
            System.out.println("Uygulamdan çıkmak istiyorsanız 2 ye tıklayın.Devam etmek istiyorsanız herhangi bir sayıya basın");
            int menüseçim = input.nextInt();
            if (menüseçim==2){
                menü=false;
            }
        }while (menü);
    }
}