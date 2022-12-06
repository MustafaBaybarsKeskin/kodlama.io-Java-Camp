/*
Polymorphism: çok biçimlilik demektir. Yani referans tiplerin birbirinin referansını tutması ile olan durumdur
Aralarında bir inheritance varsa birbirlerinin referansını tutabiliyorlar.

Override: Üzerine yazma
 */

public class Main {

    public static void main(String[] args) {
        /*
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()}; // polymorphism

        for(BaseLogger logger : loggers) {
            logger.log("Log Message!");
        }
        */

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); // tam olarak Polymorphism burada
        customerManager.add();

    }
}