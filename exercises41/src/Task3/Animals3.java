package Task3;

public class Animals3 extends Animal {
    public Animals3(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Surprise Motherfucker");
    }
}
