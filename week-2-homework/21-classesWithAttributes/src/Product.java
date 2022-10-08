/*
ProductManager ismini vemedik bunun nedeni adı üzerinde ürün yönetimi (ekle, sil, güncelle vs.) biz burada ürünün yönetimi ile ilgili bir işlem yapmayacağız.
Product da ise özellikleri yer alacak: adı, ağırlığı, fiyatı vs.

 */

public class Product {
    // attribute veya field
    // Erişim belirteci olmadan direk olarak tanımlamış olduğumuz alanlar varsayılan olarak public'tir yani her yerden erişilebilir.
    // C#'ta varsayılan olarak private'tır.
    // private erişim belirteci özel yani sadece tanımlandığı blokta geçerlidir anlamına gelir.

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _colour;
    private String _kod;

    // Sadece burada kullanılabilirler, tanımlanan blokta geçerlidir yanid Product'ta.
    // Eğer bir if'in içinde tanımlasaydık sadece orada kullanılacaktı.
    // Bir üstteki { (süslü parantez) nerede ise orada geçerlidir.
    // kod adlı özel bir alan oluşturduk, bu alanın kullanıcı tarafından doldurulmasını istemiyoruz ancak görmesini istiyoruz işte bu gibi durumlarda getter ve setter devreye girecek

    // getter get, almak anlamına gelir. Bir değeri okumaya yönelik işlemdir.
    // setter set, kurmak anlamına gelir. Bir değere atama, yani değerini atamaya yarar.
    // getter'ı public yazıyorum çümkü ona ulaşmak istiyorum.
    // getId() ile id okunabilir. get yazdık diye set'te yazmak zorunda değiliz.
    // Readonly yani sadece okunabilir bir değer istiyorsak getter yeterlidir.

    // getter
    public int getId() {
        return _id;
    }

    // Kullanıcıdan bir veri alınacağı için metot parametre almalıdır.
    // this içerisinde bulunduğum class demektir.
    // best practice olarak field'laın başına _ ekleyebiliriz: _id

    // setter
    public void setId(int id) {
        _id = id;
        // id = id; // Bu şekilde karışıklık meydana gelebiliyor.
        // this.id = id;
    }

    // Sağ tık -> Refactor -> Encapsulate Fields
    // Adımlarını izleyerek, getter ve setter'ları otomatik olarak oluşturailirsiniz.

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getColour() {
        return _colour;
    }

    public void setColour(String colour) {
        _colour = colour;
    }

    public String getKod(){
        return _name.substring(0,1) + _id;
    }

}
