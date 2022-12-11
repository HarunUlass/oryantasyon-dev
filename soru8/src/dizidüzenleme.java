public class dizidüzenleme {
    public static int[] elemanekle(int[] sayidizi){
        for (int i=0;i<5;i++){
            int l = (int)((Math.random()*10));
            sayidizi[l]=(int)(1+(Math.random()*10));
        }
        return sayidizi;

    }
    public static int[] Listele(int[]sayıdizisi){
        System.out.println("Dizinizin içerisindeki elemanlar aşağıdaki gibidir.");
        for (int dizi:sayıdizisi) {
            System.out.print(dizi+",");

        }
        System.out.println();
        return sayıdizisi;
    }
    public static int Enküçükeleman(int[] sayıdizisi){
        System.out.print("dizi içerisindeki en küçük eleman : ");
        int karşılaştırma = sayıdizisi[0];
        for (int dizi:sayıdizisi) {
            if(dizi<karşılaştırma){
                karşılaştırma=dizi;
            }

        }
        return karşılaştırma;


    }
    public static int[] ElamanSil(int []sayıdizisi,int kullanıcısil){
        int değiştirme=0;
        for (int m = 0; m < sayıdizisi.length; m++)
            if (sayıdizisi[m] == kullanıcısil) {
                sayıdizisi[m] = 0;
                break;
            }
        for (int k=0;k<10;k++) {
            for (int i = 0; i < 9; i++) {
                if (sayıdizisi[i] > sayıdizisi[i + 1]) {
                    değiştirme = sayıdizisi[i];
                    sayıdizisi[i] = sayıdizisi[i + 1];
                    sayıdizisi[i + 1] = değiştirme;
                }

            }
        }
        return sayıdizisi;
    }
    public static int[] Yenielemanekle(int []sayıdizisi,int kullanıcıekle) {
        int değiştirme = 0;
        for (int m = 0; m < sayıdizisi.length; m++)
            if (sayıdizisi[m] == 0) {
                sayıdizisi[m] = kullanıcıekle;
                break;
            }
            for (int k = 0; k < 10; k++) {
                for (int i = 0; i < 9; i++) {
                    if (sayıdizisi[i] > sayıdizisi[i + 1]) {
                        değiştirme = sayıdizisi[i];
                        sayıdizisi[i] = sayıdizisi[i + 1];
                        sayıdizisi[i + 1] = değiştirme;
                    }

                }
            }
            return sayıdizisi;

        }
    }

