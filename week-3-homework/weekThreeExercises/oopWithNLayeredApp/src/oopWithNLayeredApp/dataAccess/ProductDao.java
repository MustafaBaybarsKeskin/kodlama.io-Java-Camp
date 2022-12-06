package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
// ProductDao ile ilgili alternatifler şöyle bir imza ile eşleşiyor mu?
// İsmine parametresine kadar uymak zorunda.
// Burada kurallar belirlenir ve bu interface implemente eden class'lar kurallara uymak zorundadır.
public interface ProductDao {
    void add(Product product);
}
