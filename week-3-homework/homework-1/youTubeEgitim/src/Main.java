/*
Referans tipleri değişimi ve bağımlılığı koruyan bir yapıdır.

Interface: İş yapan sınıfların operasyonlarını sadece imza seviyesinde yazarak, bağımlılığı korumak adına yapılan çalışmadır.
interface'imizi kim implemente ederse bu interface bununda bununda referansını tutabilir anlamına gelir.
Interfaceler'in amacı temel olarak, yazılımdaki bağımlılıkları engellemek, if'lerdem kurtulmaktır.

Bir sınıf, sadece bir sınıfı inherit edebilir. Bir sınıf birden fazla interface'i implemente edeblir.

Abstract class: Bizim için ortak operasyonları tutar, bu operasyonların tamamlanmış ve tamamlanmamış olanlarını tutacaktır.
Abstract class'lar sınıf özelliği gösterir bu yüzden bir class sadece bir abstract class'ı veya başka bir class'ı inherit edebilir.
Hem Abstract class hem normal class aynı anda inherit edilemez ikisinden biri seçilmek zorunda.

Abstract class'lar ve Interface'ler newlenemez.

if - switch ne kadar az o kadar iyi.
sonar qube: projenizi denetler.
DRY --> don't repeat yourself prensibi
 */

public class Main {

    public static void main(String[] args) {
        /* // Örnek - 1 Değer Tip int bir değer tipidir
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;

        System.out.println(sayi1);
         */

        /* // Örnek - 2 Referans Tip Diziler bir referans tiptir
        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {4, 5, 6};
        sayilar1 = sayilar2;
        sayilar2[0] = 10;
        System.out.println(sayilar1[0]);
        */

        /* // Main'i temizlemek adına yorum satırına alınmıştır.
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer1 = new Customer(); // örneğini oluşturmak, instance oluşturmak, instance creation

        customer1.setId(1);;
        customer1.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer1);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompamyName("Arcelik");
        company.setId(100);

        CustomerManager customerManager2 = new CustomerManager(new Person());

        Person person = new Person();
        person.setNationalIdentity("123456453");

        // Referans numarasını tutabilmesi ile bu meydana geldi.
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        */

        // IoC Container Dependancy injection | eğer alttaki gibi new kullanılıyorsa orada bir zafiyet vardır.
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCreidt();

        // 2.14.39

    }

}