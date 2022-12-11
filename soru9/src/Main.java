import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> kullanıcıarray = new ArrayList<>();
        boolean döngü = true;
        int count= 0;
        do {
            System.out.println("*****Menü*****");
            System.out.println("1-Değer ekle");
            System.out.println("2-Değer listele");
            System.out.println("3-Değer ara");
            System.out.println("4-Değer düzenle");
            System.out.println("5-Değer sil");
            System.out.println("6-Uygulamadan çıkış");
            System.out.print("Seçiniz: ");
            String kullanıcıseçim = input.next();
            switch (kullanıcıseçim) {
                case "1":
                    System.out.print("Eklemek istediğiniz değeri giriniz: ");
                    kullanıcıarray.add(input.next());
                    System.out.println("Değeriniz eklenmiştir.");
                    break;
                case "2":
                    System.out.println("Dizinizin içerisindeki değerler şunlardır.");
                    count=kullanıcıarray.size();
                    for (int i=0;i<count;i++){
                        System.out.println(kullanıcıarray.get(i));
                    }
                    break;
                case "3":
                    System.out.print("Aramak istediğiniz değeri giriniz: ");
                    if (kullanıcıarray.contains(input.next())){
                        System.out.println("Aradığınız değer bulanmaktadır.");
                    }
                    else{
                        System.out.println("Aradığınız değer bulunmamaktadır.");
                    }
                    break;
                case "4":
                    System.out.print("Düzenlemek istediğiniz değeri giriniz: ");
                    String kullanıcıdüzenlenecek =input.next();
                    if(kullanıcıarray.contains(kullanıcıdüzenlenecek)){
                        kullanıcıarray.remove(kullanıcıdüzenlenecek);
                        System.out.print("Yerini almasını istediğiniz değeri giriniz: ");
                        kullanıcıarray.add(input.next());

                    }
                    else{
                        System.out.println("Düzenlemek istediğiniz değer bulunmamaktadır.");
                    }
                    break;
                case "5":
                    System.out.print("Silmek istediğinz değeri giriniz: ");
                    String kullnacısilinecek = input.next();
                    if(kullanıcıarray.contains(kullnacısilinecek)) {
                        int silinecekdeğerindex = kullanıcıarray.indexOf(kullnacısilinecek);
                        kullanıcıarray.remove(silinecekdeğerindex);
                        System.out.println("İstediğiniz değer silinmiştir.");
                    }
                    else{
                        System.out.println("Silmek istediğiniz değer zaten dizide yoktur.");
                    }
                    break;
                case "6":
                    döngü=false;
                    break;
                default:
                    System.out.println("Menü arasından seçim yapınız.");
                    break;
            }

        }while (döngü);
    }
}