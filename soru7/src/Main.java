public class Main {
    public static void main(String[] args) {
        int[] dizi = new int[20];

        for (int sayaç = 0; sayaç < 20; sayaç++)
        {
            dizi[sayaç] = (int)(Math.random()*10);
        }
        int sayı1=0;
        for (int dönendizi:dizi) {
            if (dönendizi==4){
                System.out.println(dönendizi);
                sayı1++;
            }
            else {
                System.out.println(dönendizi);
            }
        }
        System.out.println("dizi içerisinde "+sayı1+" tane 4 vardır.");

    }
}