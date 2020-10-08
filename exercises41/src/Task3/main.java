package Task3;

public class main {
    public static void main(String[] args) {
        Animal animals = new Animal(5);
        Animal animals2 = new Animals2(3);
        Animal animals3 = new Animals3(2);

        Zoo zoo = new Zoo();

        zoo.addAnimal(animals);
        zoo.addAnimal(animals2);
        zoo.addAnimal(animals3);
        zoo.makeAllSounds();
        zoo.numberOfLegs();
    }
}
