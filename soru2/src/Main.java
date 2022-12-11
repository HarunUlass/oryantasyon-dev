import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          System.out.println("taş kağıt makas oyununa hoşgeldiniz.");
          System.out.println("taş(0), kağıt (1),makas (2) dir");
          int bilgisayar= (int)(System.currentTimeMillis()%3);
          Scanner kullanıcı = new Scanner(System.in);
          int kullanıcıseçim=kullanıcı.nextInt();
        switch (bilgisayar){
            case 0:
                if(kullanıcıseçim==0){
                    System.out.println("Bilgisayar:taş , kullanıcı : taş , sonuç: berabere");
                }
                else if(kullanıcıseçim==1){
                    System.out.println("Bilgisayar:taş , kullanıcı : kağıt , sonuç: kazanan kullanıcı");
                }
                else{
                    System.out.println("Bilgisayar:taş , kullanıcı : makas , sonuç: kazanan bilgisayar");
                }

                break;
            case 1:
                if(kullanıcıseçim==0){
                    System.out.println("Bilgisayar:kağıt , kullanıcı : taş , sonuç: kazanan bilgisayar");
                }
                else if(kullanıcıseçim==1){
                    System.out.println("Bilgisayar:kağıt , kullanıcı : kağıt , sonuç: berabere");
                }
                else{
                    System.out.println("Bilgisayar:kağıt , kullanıcı : makas , sonuç: kazanan kullanıcı");
                }
                break;
            case 2:
                if(kullanıcıseçim==0){
                    System.out.println("Bilgisayar:makas , kullanıcı : taş , sonuç: kazanan kullanıcı");
                }
                else if(kullanıcıseçim==1){
                    System.out.println("Bilgisayar:makas , kullanıcı : kağıt , sonuç: kazanan bilgisayar");
                }
                else{
                    System.out.println("Bilgisayar:makas , kullanıcı : makas , sonuç: berabere");
                }
                break;
            default:
                break;

        }
    }
}