package oop1;// OOP = Object Oriented Programming - Nesne Güdümlü / Yönelimli Programlama
// Nesneleri nesne yapan faktör özellikleridir.
// Bir insan düşünelim, bu insanın: adı, soyadı, baba adı, anne adı, TC kimlok no vb. bilgileri bulunacaktır.
// Biz bunları nesne olarak tanımlıyoruz, işte biz bu nesnelere Class diyoruz.
// İki tip Class vardır: 1. özellik tutucu 2. Operasyon tutucu

// set value --> değer atama
// get value --> değer okuma
// getProductById(); Frontend

// SOLID prensibi
// Inheritance soyutlama oldukça önemlidir.

public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade orani";

        // oop1.Product veri tipi, product1 ismi. oop1.Product türünden product1
        // Bir class değişkeni tanımalanın yoludur.
        // Tüm class'ların bir ebeveyni vardır biz buna Object diyoruz. Oradan gelen inheritance (miras).

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.url");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.url");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.url");

        // Normalde veriler bu şekilde olmaz bir database'den gelir.
        // Diziye Kendi tipinden data vermeliyiz.

        Product[] products = {product1, product2, product3};

        // oop1.Product -> veri tipi, product -> takma ismi, products -> dizinin ismi

        System.out.println("<ul>");
        for(Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05555555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("05052225522");
        corporateCustomer.setTaxNumber("1111111111111");
        corporateCustomer.setCustomerNumber("54321");

        // Hata vermez çünkü individualCustomer ve corporateCustomer birer Customer'dır. Onun referansını tutar.
        Customer[] customers = {individualCustomer, corporateCustomer};

        // Değer ve referans tipleri.

    }

}
