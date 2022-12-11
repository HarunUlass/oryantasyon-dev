public class Hesapmakinesiiçi {
    public static void menü(){
        System.out.println("******MENÜ******");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.print("Yapacağınız işlemi seçiniz : ");
    }
    public static double toplama(double a ,double b){
        double sonuç=a+b;
        return sonuç;
    }
    public static double çıkarma(double a ,double b){
        double sonuç=a-b;
        return sonuç;
    }
    public static double çarpma(double a ,double b){
        double sonuç=a*b;
        return sonuç;
    }
    public static double bölme(double a ,double b){
        double sonuç=a/b;
        return sonuç;
    }
    public static void Ekranayazdır(double sayı1,double sayı2,double sonuç,String operatör){
        System.out.println(sayı1+" "+operatör+" "+ sayı2+ " = "+sonuç);
    }
}
