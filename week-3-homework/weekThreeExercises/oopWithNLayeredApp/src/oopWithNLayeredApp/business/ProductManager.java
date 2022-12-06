package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HinernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers; // List<Logger> loggers; // da olabilir.

    // ProductManager new'lendiğinde bana bir ProductDao ver.
    // Yaptığımız bağımsızlık enjeksiyonudur (dependency injection).
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { // response request pattern
        // Sisteme girdiğimiz verileri bu kısma gönderiyoruz.
        // iş kurallarımızı yazıyoruz, businnes rules
        if(product.getUnitPrice() < 10) {
            throw new Exception("Urun fiyarın 10'dan kucuk olamaz.");
        }

        productDao.add(product);

        for(Logger logger : loggers) { // [db, email] polymorphism
            logger.log(product.getName());
        }

        /*
        Kötü Kod!
        // JdbcProductDao jdbcProductDao = new JdbcProductDao();
        // jdbcProductDao.add(product);

        // ProductDao productDao = new HinernateProductDao();
        */

    }
}
