/*
Static yapılar, Main'i başka bir yerden çağırmaya çalışırsak ve orada main operasyonunu çağırmaya çalışırsak
Main'i newleyerek ona ulaşamayız. Onun yerine Main.main diyerek ulaşabiliriz.

Staticlerin kullanım alanlarından bir tanesi; uygulamaların içerisinde utility (araç) yazarken kullanırız.
static nesne program sonlanana kadar bellekten silinmez.
Manager sınıfları asla static yapılmaz. Kullan bırak araçlar static yapılabilir.
Bir metodu static yaptığınızda class ismi ile direkt olarak çağırabilirsiniz.

Best practice
Birbirine benzeyen operasyonları parçalayın, ancak bir class sadece bir işi yapar aksi takdirde SOLID'in S'si
single responsibility principle çiğnenmiş olur.
 */

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name = "Mouse";
        product.price = 10;

        productManager.add(product);
        // Constructor consolda gelmez çünkü yapıcı blok new'lenince gelir.

        // DatabaseHelper.Connection.createConnection();
    }
}