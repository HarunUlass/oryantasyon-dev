import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Dik üçgenin zeminin yıldız sayısını giriniz : ");
        int yıldızsayısı = input.nextInt();
        for (int i = 0; i <= yıldızsayısı;i++){
            for (int k= 0;k<i;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}