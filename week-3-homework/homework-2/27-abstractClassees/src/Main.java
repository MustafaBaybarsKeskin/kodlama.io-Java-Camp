/*
Abstract Class: Programlamada çok önemli bir yere sahiptir.
abstract class'lar daha önceden öğrendiğimiz class'lardan yapısal olarak bir farkı yoktur, kullanım olarak
farklılıları mevcıttır.
Bir class sadece bir sınıf inherit edebilir yani bir sınıf sadece başka bir sınıftan miras alabilir.
Bir abstract class saddece başka bir sınıfı inherit edebilir veya bir sınıf sadece bir abstract class'ı inherit edebilir
Bir sınıf herhangi bir sınıfı artı abstract bir sınıfı miras alamaz. Class'lardaki durum burada aynen geçerlidir.
Ancak abstract class'ların syntax'ı ihtiyaca göre farkındalık gösterir.

Bir operasyonum var ve onun içerisini base de belirlemek istemiyorum, onu kim inherit ediyorsa operasyonu override
etmek zorunda yani kendi kodunu yazmak zorunda. Bizim zorunlu kıldığımız tek şey bu operasyon mutlaka olack.

Abstract bir sınıfın, abstract olabilmesi için; abstract imzasıyla beslenmesi gerekiyor.
Operasyonun abstract olabilmesi için yine abstract ile beslenmesi gerekiyor.
Abstract bir class'ta illa bir abstract olmak zorunda değil, tamamlanmış (işi birmiş, çalışan) operasyon
tek başına bulunabilir. Hem o hem abstract, sadece abstract da olabilir.

Abstract Class'lar base'i gizlemek istdeiniz zaman da kullanılabilir.
Abstract sınıflar asla new'lenemez. New'lenebilmesi için sizin onun operasyonlarını ezmeniz gerekmekte ama iyi
bir kullanım değildir.

Base tek başına bir anlam ifade etmiyor, base burada bizim için sadece referans tutucu görevi ve kuralları
ortaya koyma görevini üstlenmektedir.
 */

public class Main {

    public static void main(String[] args) {
        GameCalculator gameCalculators = new WomanGameCalculator();
    }
}