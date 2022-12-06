package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HinernateProductDao implements ProductDao {
    public void add(Product product) {
        // Sadece ve sadece db erişim kodları buraya yazılır. Bunun için sql bilmek gerekir.
        System.out.println("Hibernate ile veritabanina eklendi.");
    }
}
