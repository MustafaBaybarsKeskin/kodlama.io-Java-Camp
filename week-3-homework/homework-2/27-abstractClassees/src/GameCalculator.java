/*
GameCalculator'ı kim kullanıyorsa gameOver'ı olduğu gibi kullanmak zorunda, bu hiçbir zaman değişmeyecek bir kuraldır.
GameCalculator'ı kim inherit ediyorsa hesapla'yı içermek zorunda fakat hesaplayı override etmek zorunda yeani
kendi hesaplasını yazmak zorunda.

 */
public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
