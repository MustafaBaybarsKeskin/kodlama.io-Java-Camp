// Opersayon, metot ve fonksiyon hepsi aynı anlama gelmektedir.

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        mesaj.substring(0, 2); // bir şey oluşturdu ve bize bir sonuç verdi, yani bir değer döndürdü.

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(15, 7);
        // Değişkenin tipi ile fonksiyonun geri döndürüş tipi aynı oldu takdirde atama işlmei yapılır.
        System.out.println(sayi); // Çıktı 12 olacaktır

        int toplam = topla2(1, 2, 3, 4, 5); // arka planda diiye çevrilir
        System.out.println(toplam);

    }

    // Void opersayonlar emir kipi gibidir, fonksiyondan bir şey yapmasını istersiniz o da yapar
    // Ekranda bir çıktının gösterilmesi bir şey döndürüldüğü anlamına gelmez
    // void metotlar bir değişkene atanamaz.

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Guncellendi.");
    }

    // Bu fonksiyon int tipinde bir değer döndürür.
    public static int topla(int sayi1, int sayi2) {
        // return 5; // Bitir ama 5 döndür. return tek başına bitir anlamına gelir.
        return sayi1 + sayi2;
    }

    // Variable Arguments, çoklu veri almak için kullanabiliriz.
    // Sıklıkla kullanılan bir yapıdır, bunun yerine koleksiyonlar ve daha nesnel yapıları kullanmak daha sağlıklıdır.
    // Daha sonralarında nesneler ile çalışmaya başladığımızda, değişken tipinden dolayı problemlerle karşılaşbiliriz.

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
