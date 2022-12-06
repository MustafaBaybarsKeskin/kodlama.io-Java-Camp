/*
Java - Dao: data access object
C# - Dal: data access layer
PHP - Pdo: php data object (?)
Burada veritabanına erişim işlemlerini gerçekleştiriyoruz.
 */

package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        // Sadece ve sadece db erişim kodları buraya yazılır. Bunun için sql bilmek gerekir.
        System.out.println("JDBC ile veritabanina eklendi.");
    }
}

// Hibernate
