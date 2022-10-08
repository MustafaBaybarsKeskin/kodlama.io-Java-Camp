/*
                *** NOTLAR ***
                *
Java gibi bir dil ancak class'ları doğru öğrendiğiniz zaman anlam kazanır.
Java'yı java yapan onun nesnel yapısıdır.
Nesnel altyapıyı anlarsanız sürdürülebilir yazılım geliştirmeyi de başarabilirsiniz.
Sürdürülebilir yazılım: İhtiyaçlara direnmeyen yazılımdır yani sürekli yenilenmeye veya değişiklik yapılmaya uygun olmalıdır.

Aslında bu zamana kadar hep class ile çalıştık.
Java da iş yapan her şey class'tır.

class tanımlama : class + ClassAdi {}

class'ların bir çok özellikleri vardır.
1. Gruplama yapmak için kullanılır. Operasyonları veya metotları bir arada toplayabilmek için.
2. Class'lar referans tiptir.
3. Bir class'ı kullanabilmek için onun new'lenmiş olması gerekir.

\---------------------------------------------------------------------------/

Bellekte iki farklı alan vardır bunlardan biri Stack diğer ise Heap'dir.

CustomerManager customerManager1 = new CustomerManager();
CustomerManager customerManager2 = new CustomerManager();
[             STACK            ]  [        HEAP         ]

                *** REFERANS TİP ***

        [STACK]                         [HEAP]
101 CustomerManager1    --->     {add, remove, update}
102 CustomerManager2    --->     {add, remove, update}

101 nolu adresin referansı, ok ile gösterilen kısımdır.
102 nolu adresin referansı, ok ile gösterilen kısımdır.

customerManager1 = customerManager2;

Bu şekilde bir tanımlama şu anlama gelir:
customerManager1'in referans numarası = customerManager2'nin referans rumarasıdır.

        [STACK]                         [HEAP]
102 CustomerManager1      --      {add, remove, update}
                           |
                           |
                          \|/
102 CustomerManager2    --->     {add, remove, update}

CustomerManager customerManager1 = new CustomerManager();
Artık bu ifade anlamını yitirmiş olur çünkü referansı farklı bir yere bağlandı.
Bunu birazdan Garbage Collector (çöp toplayıcı) Java'nın bellek yöneticisi onu bellekten silecektir.
Bir class'ı oluşturan programcının, onu oluşturuken dikkat etmesi gerekiyor çünkü new pahalıdır.
Bellekte bir nesneyi new'lemek pahalıdır, o yüzden sadece ihtiyaç duyduğumuz zaman new'lemeliyiz.


        *** DEĞER TİPİ (VALUE TYPE) ***

Primitive types: int, double, float, byte bu sayısal değikenler değer tipleridir.

Örnek - 1:

int sayi1 = 10;  // sayi1'in değeri 10'dur
int sayi2 = 20;  // sayi2'nin değeri 20'dir
sayi2 = sayi1;   // sayi2'nin değeri eşittir sayi1'in değeri anlamına gelir yani sayi2 artık 10 oldu.
sayi1 = 30;      // sayi1'in değeri 30'dur,

sayi1 ve sayi2 referans tip olmadıkları için, sayi1'in değeri değişse de sayi2'nin değer sabit kalacaktır.

Değer tiplerinde bir referans yoktur direk tanımlanan öğeyi benimser.


        [STACK]      |       [HEAP]
    sayi1 = 10 -> 30 |
    sayi2 = 20 -> 10 |
    sayi2 = sayi1    |

Örnek - 2

Diziler bir referans tiptir, başında int yazması sizi yanıltmasın.

int[] sayilar1 =  new int[] {1, 2, 3};
int[] sayilar2 =  new int[] {4, 5, 6};
sayilar2 = sayilar1; // sayilar2'nin referans numarası eşittir sayilar1'in referans numarasıdır.
sayilar1[0] = 10;

Bu durumda bellekte tek nesne var ve iki değişken aynı nesneyi tutmaktadır.

        [STACK]          |       [HEAP]
101     sayilar1         |  101  {1, 2, 3}
102     sayilar2         |  102  {4, 5, 6}

sayilar2 = sayilar1;

        [STACK]          |       [HEAP]
101     sayilar1         |  101  {1, 2, 3}
101     sayilar2         |  [102  {4, 5, 6}]

Artık sayilar2 de sayilar1'in karşılığını tutacaktır çünkü referann numaraları eşitlendi.

sayilar1[0] = 10

        [STACK]          |       [HEAP]
101     sayilar1         |  101  {10, 2, 3}
101     sayilar2         |  [102  {4, 5, 6}]

sayilar1 de sayilar2 de heap'teki 101 referans nolu {10, 2, 3} tuttuklarından,
sayilar2[0] da 10'a eşittir.

*/

public class Main {

    public static void main(String[] args) {
        // oluşturduğumuz class'ı kullanma
        // CusomerManager türünde bir örnek yani bir nesne oluşturduk.
        // Bunu yaparak bellekte bir alan oluşturuyoruz.
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.update();
        customerManager.remove();

        // ------------------------------------  \\

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println("sayi2: " + sayi2);

        int[] sayilar1 =  new int[] {1, 2, 3};
        // int[] sayilar = {1, 2, 3}; // Şeklinde tanımlamak da mümkün.
        int[] sayilar2 =  new int[] {4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println("sayilar2[0]: " + sayilar2[0]);
    }

}
