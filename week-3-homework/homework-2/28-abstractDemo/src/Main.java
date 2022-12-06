public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
// SOLID O = open closed principle: açıklık kapalılık prensibi
// Bir sisteme, yeni bir özellik getirildiğinde mevcuttatki hiçbir kodu değiştiremezsin.