package Task1;


public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("August", 25);
        Car car = new Car("BMW", "M5", 2020, "Muscle Car");
        Car car2 = new Car("Honda","Don't know bro",2077,"Big pp");

        car.getDriver();
        System.out.println(driver.toString());
        System.out.println(car.toString());
        System.out.println(car2.toString());
        }
    }


