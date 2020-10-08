package Task1;
public class Driver {
    String name;
    int age;

    @Override
    public String toString() {
        return "Is driven by" + name;
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


