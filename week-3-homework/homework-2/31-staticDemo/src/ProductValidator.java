public class ProductValidator {
    // Ancak bu şeilde constructor çağrılabilir. Java'nın C#'tan farklarndan biridir.
    // Ana class static olamaz bu da bir başka farktır.
    static {
        System.out.println("Static yapici blok calisti");
        // Birden çok static constructor tanımlanabilir ancak pek de kullanışlı değilldir.
    }

    public ProductValidator() {
        System.out.println("Yapici blok calisti.");
    }

    public static boolean isValid(Product product) {
        if(product.price > 0 && !product.name.isEmpty()) { // ! değilse operatörüdür.
            return true;
        } else {
            return false;
        }
    }

    public void birşey() {

    }

    /*
    // inner class : iç içe sınıf
    public static class BaskaBirClass {
        public static void sil() {

        }
    }
    */
}

// Bir ürünü kaydederken veya güncellereken, kurallara uyuyor mu diye kontrol ederiz.
