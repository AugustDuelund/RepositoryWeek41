package Task3;

public class Animals2 extends Animal {
    public Animals2(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("You wot mate?");
    }
}
