// Katmanlı Mimariler
public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) { // polymorphism
        _customer = customer;
        _creditManager = creditManager;
    }

    public void save() {
        System.out.println("Musteri kaydedildi. ");
    }

    public void delete() {
        System.out.println("Musteri silindi. ");
    }

    public void giveCreidt() {
        _creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}
