public class Öğrenci {
    public static void ÖğrenciNotDurumu (String ad, String soyad, double not1, double not2, double not3){
      System.out.println("Öğrenci bilgileri aşağıdaki gibidir.");
      System.out.println("Ad Soyad: "+ad+soyad);
      double ortalama = (not1 +not2+not3) / 3;
      if(ortalama<45){
          System.out.println("Ortalama değeriniz : "+ ortalama + " Kaldınız.");
      }
      else {
          System.out.println("Ortalama değeriniz : "+ ortalama + " Geçtiniz.");
      }
    }
}
