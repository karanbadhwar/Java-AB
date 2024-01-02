//
//class Car {
//    String brand;
//    int year;
//
//    public Car(String brand, int year) {
//        this.brand = brand;
//        this.year = year;
//    }
//
//    public void displayInfo() {
//        System.out.println("Brand: " + brand + ", Year: " + year);
//    }
//}
//
//public class Demo {
//
//    public static Car Mycar;
//    public static void main(String[] args) {
//        Car carInstance = new Car("Toyota", 2022);
//
//        Mycar = carInstance;
//        M
//    }
//}


public class Demo {
    private Object printer1Lock = new Object(); // Lock for Printer 1
    private Object printer2Lock = new Object(); // Lock for Printer 2

    public void usePrinter1(String teamName) {
        synchronized (printer1Lock) {
            System.out.println(teamName + " is using Printer 1.");
            // Simulating printing task
            try {
                Thread.sleep(1000); // Simulating printing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void usePrinter2(String teamName) {
        synchronized (printer2Lock) {
            System.out.println(teamName + " is using Printer 2.");
            // Simulating printing task
            try {
                Thread.sleep(1000); // Simulating printing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Demo office = new Demo();

        // Creating threads for multiple teams
        for (int i = 1; i <= 5; i++) {
            final int teamNumber = i;
            Thread teamThread1 = new Thread(() -> {
                office.usePrinter1("Thread1 " + teamNumber );
            });
            Thread teamThread3 = new Thread(() -> {
                office.usePrinter1("Thread3 " + teamNumber );
            });


            Thread teamThread2 = new Thread(() -> {
                office.usePrinter2("Thread2 " + teamNumber);
            });

            teamThread1.start();
            teamThread2.start();
            teamThread3.start();

        }
    }
}