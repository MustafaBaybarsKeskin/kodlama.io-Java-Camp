package oopWithNLayeredApp;
/*
Veriler bizlere database'den gelir.
Uygulamalar database ile çalışır.

Kodlarımızı 3 temel parçaya bölecek olursak:
1 - Data Access: Veri erişim kodları
2 - Business: Kişiye özel data'nın gelmesidir.
        [Yardımcı Katman - API]
3 - UI (User Interface): Arayüz anlamına gelir.

İşlemlerin bu şekilde ayrıştırılmasının nedenleri:
- Böl, paraçala, yönet metodu ile işleri daha kolay halletmek için.
- Sürdürülebilirliktir. JDBC - Hibernate-ORM - JPA bunlar yöntem olarak bakabilirsiniz. Bu tip yapıları kullanabilmek için uygulamalarımızı parçalara ayırıyoruz.
-

Entities: bizim veri tabanı nesnelerimizdir.

Bir ürün ekleyeceğimizi düşünelim ancak aynı isimden birden fazla ürün olmamasını istiyoruz, bu bağlamda
business domain devreye girer yani iş kuralı sizin iş yapınıza özgü şeylerdir ve business katmanına yazılır.

Bir katman başka bir katmanın class'ını kullanıyorken sadece interface'inden erişim kurmalıdır.

Alternatifli sistemlere bir örnek: loglama
 */

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HinernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception{
        Product product1 = new Product(1, "IPhone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(), new MailLogger()};

        // ProductManager productManager = new ProductManager(new HinernateProductDao());
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);

    }

}