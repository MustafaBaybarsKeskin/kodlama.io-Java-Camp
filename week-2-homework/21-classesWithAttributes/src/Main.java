/*
            *** NOTLAR ***

Class'ların bir diğer özelliği özellik tutmasıdır.
Field veya attribute olarak isimlendirilirler.
C#'taki property'lere benzemektedir.

Gerçek hayatta: kullanıcıya bir ekran sunulur, id otomatik olarak sistem tarafından atanır diğer bilgiler ise kullanı tarafından girilir ve alanlara eşittlenir.
Class'lar ilgili operasyonları ilgili özellikleri tutar.
Bir class'ın içinde farklı bir class'ı kullanabiliriz.

SOLID
S -> Single Responsibility Rrinciple (Tek Sorumluluk Prensibi):
bir class, bir metot ve bir if bloğu sadece bir işi yapar.

Yani Product class'ının içinde add operasyonu bulunamaz!


Encapsulation: en kapsülleme dediğimiz bir yöntemdir.
Kullanıcıyı herhangi bir alanı kullanımını kısıtlamayı öngürür.

Eğer biz fiyatın en az 0 (sıfır) olacağını kısıtını getirmek isteseydik encapsulation kullanacaktık aksi takdirde kullanıcı girilmemesi gerekn bir değeri o alana girebilir.
*/

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("ASUS Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setColour("Black");

        ProductManager productManager = new ProductManager();
        productManager.Add(product); // Şu ürün al ekle dedik.

        System.out.println(product.getName());
        System.out.println(product.getKod());

        /*
        // Eğer biz add2 metodunda bir değişiklik yaparsak alttaki tüm tanımlamalarda da değişikliğe gitmemiz gerekecek.
        // Örnek add2 metotuna renk parametresini eklersek, önceden çağrılmış olan metoda da renk özelliğini eklememiz gerekecek.
        // Buna rağmen Product class'ına renk field'ı eklesek dahi önceden eklenmiş ürün bir problem çıkarmayaacktır.
        productManager.add2(1, "", "", 3, 200);
        productManager.add2(1, "", "", 3, 200);
        productManager.add2(1, "", "", 3, 200);
        productManager.add2(1, "", "", 3, 200);
       */

    }
}