public abstract class BaseCreditManager implements ICreditManager {
    // Tamamlanmamış operasyon
    public abstract void calculate(); // ortak değil her yerde değişebilir dedik

    // Tamamlanmış operasyon
    public void save() {
        System.out.println("Kaydedildi");
    }
}
