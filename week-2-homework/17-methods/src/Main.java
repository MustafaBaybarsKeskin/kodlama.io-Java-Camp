/* NOTLAR *\
Programlamada don't repeat yourself (DRY) prensibi vardır, kendini tekrar etme anlamına gelir.
Bir metodun içinde birden çok iş yapacak o anki operasyonu kurtarır ancak içersindeki bir yeri daha sonra tekrar ihtiacınız olduğunda tekrar yazmak zorunda kalırsınız.
main de bir metotdur.
*/

public class Main {

    public static void main(String[] args) {
        // Kodlar çalışmaya mainden başlar.
        // Metodu çağırmak için metodun ismini yazmamız yyeterlidir ancak bu drurum sadece aynı class içinde yer aldıkları zaman geçerlidir.
        sayiBulmaca();
    }

    // Metot tanımlama en basit şekilde: erişim belirteci (daha sonra anlatılacak) + geri döndürüş tipi (daha sonra anlatılacak) + metotAdi() {}
    // Eğer sizden aranacak sayida istenseydi ve sizde farklı yerlere çıktı vermek isteseydiniz her kısımda değişiklik yapmak zorunda kalacaktınız.
    // Ancak fonksiyon kullanırsanız tek bir yerde değişikli yapmanız yeterli olacaktır.
    // Adlandırma camelCaseing standartındadır.
    // Class isimleri ise PascalCase standartındadır.

    public static void sayiBulmaca() {
        int[] sayilar = new int[] {1, 2, 3, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            // mesaj = "Sayi mevcuttur. Sayi: " + aranacak
            // mesajVer(mesaj);
            mesajVer("Sayi mevcuttur. Sayi: " + aranacak);
        } else {
            mesajVer("Sayi mevcut degildir. Sayi: " + aranacak);
        }

    }

    // Parametreli metot
    // Eğer parametre verilmez ise değişkene ulaşamaz ve hata verir.

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}
