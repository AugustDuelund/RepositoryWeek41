package Task3;

import java.util.ArrayList;


public class Zoo {
    ArrayList<Animal> animals;
    public Zoo(){
        this.animals=new ArrayList<>();
    }
    public void makeAllSounds(){
        for (Animal animals: this.animals)
            animals.makeSound();{

        }
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);

    }
    public void numberOfLegs(){
        int sum = 0;
        for (Animal animals: this.animals) {
            sum += animals.getNumberOfLegs();

        }
        System.out.println("Total number of legs: " + sum);

    }
}


