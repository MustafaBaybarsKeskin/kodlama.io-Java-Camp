/*
-- OVERLOADING --
İki metodunda aynı isme sahip olmalarına rağmen hata vermemelriniz sebebi imzalarının farklı olmasıdır.
Nedir peki bu imza? İmza metotların parametreleridir.
Fark ettiyseniz birinde iki diğerinde ise üç parametre vardır.
 */

public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}
