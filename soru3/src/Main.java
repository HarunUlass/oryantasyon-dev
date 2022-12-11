public class Main {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 1; i <= 10; i++)
        {

            for (int j = 1; j <= 10; j++)
            {
                toplam = i * j;
                System.out.println(i+"*"+j+"="+toplam);
            }
           System.out.println();


        }
    }
}