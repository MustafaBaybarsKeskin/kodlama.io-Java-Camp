package oop1;// PascalCase isimlendirme standartı ismidir. Kelimelerin ilk harfi büyüktür, Class'lar bu şekilde adlandırılır.
// Henüz ürünü tanımlamıyoruz, tanımlayabileceğimiz ortamı hazırlıyoruz.
// public dışarıya erişime açar, class sınıf, oop1.Product sınıfın ismidir.

public class Product {
    // oop1.Product'ın özellikleri. Class aslında bir şablondur, şablonu hazırlıyoruz.
    // Class içindeki özelliklerin her birine field (alan) denir.
    // Adlandırmaları camleCase standartındadır.

    // Bazı field'lar için, Java ve C# da yaygındır.
    // Getter ve Setter'lar vardır
    // Sadece okunabilmesi için veya sadece yazılabilsin diye private erişim blirtecini kullanıyoruz.
    // private sadece o class'ın içinde kullanılabilir anlamına gelir.

    private String name; // İsim
    private double unitPrice; // Fiyat
    private double discount; // İndirim oranı
    private String imageUrl; // Ürünün görsel resim bağlantısı
    private int unitsInStock; // Stok sayısı

    // mouse right click button --> Generate --> Getter and Setters --> select all --> create

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Daha fazla indiriö yapılmak istenirse. Eskiden çok daha sık kullanılırdı.
    public double getDiscount() {
        // discount = discount + 5;
        return discount;
    }

    // Yönetici artık indirim belirlenemesin derse setter silinebilir.
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
