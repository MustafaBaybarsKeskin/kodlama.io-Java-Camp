/*
Programcı olarak amacımız, yeniliğe karşı direnmeyen programlar geliştirmek olacaktır.
Bir class sadece bir tane başka classı inherit edebilir. Yani bir kişinin sadece bir ebeveyni var olarak düşünebiliriz.
Birbirinin alternatifi olan geçişleri sağlamak için if'Leri kullanmayınız. Bunun olmaması için inheritance'tan referans tiplerinde yararlanacağız.
Bu yaptıklarımız tam olarak Polymorphism'dir
 */

public class Main {

    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager()); // Polymorphism
    }
}