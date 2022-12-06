/*
Interface'ler: uygulamalarda bağımlılığı yönettiğimiz yapılardan bir tanesidir.
Nesne tabanlı programlamanın yapı taşları: Class - Abstract Class - Interface
Interface'ler bir class kabul edilmez ancak onlarda normal class veya abstract class gibi referans tutmaktadırlar.

class'larda metotlar tamamlanmış olmalıdır.
Abstract Class'larda metotlar boş olabilrdi onu inherit eden içini doldurmak zorundaydı.
Interface'lerde abstract metotlar gibi bir durum söz konusudur. Tamamlanmamış operasyonlar içerirler.
Interface'ler inherit edilemez implemente edilir.
Bir class birden çok interface'i implemente edebilir.
Bir interface'in üyeleri default (varsayılan) olarak public'tir
Interface'ler new'lenemez. İmza taşırlar.
Interfaceler referans tutar bunu asla unutmuyoruz!

Eğer hem inherit hem de impelente varsa syntax (dilin yazım kuralları) şu şekilde olur:
public class ClassAdi1 extends ClassAdi2 implements InterfaceAdi

dal = data access layer --> veri erişimi ile ilgili kodlar buraya yazılır

Katmanlar
[Data Access - Dal]
[İş - Manager]
[Arayüz - Swing, JavaFx, HTML]
Katmanların geçişleri genellikle interface'ler ile yapılır, bunun nedeni bağımlılıkları önlemek içindir.
 */

public class Main {

    public static void main(String[] args) {
        // ICustomerDal customerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); // Polymorphism
        // customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
    }
}