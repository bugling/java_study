package self.generic.ex2;

import self.generic.animal.Animal;
import self.generic.animal.Dog;
import self.generic.animal.Cat;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 200);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);     // findDog = Animal{name='멍멍이', size=100}

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);     // findCat = Animal{name='냐옹이', size=200}

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);       // findAnimal = Animal{name='동물', size=0}
    }
}
