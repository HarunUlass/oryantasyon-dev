public class sayıçevirme {

    public static void çeviri (int sayı1 ){
        int[] dizi = new int[30];
        int sayaç=0;
        do {
            dizi[sayaç]=sayı1%2;
            sayı1 = sayı1/2;
            sayaç++;

        }while(sayı1>0);
        for (int i=sayaç-1;i>-1;i--){
            System.out.print(dizi[i]);

        }

    }
}


