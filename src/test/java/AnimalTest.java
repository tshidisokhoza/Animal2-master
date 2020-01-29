import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTests {
    Cat cat = new Cat();
    Dog dog= new Dog();
    @Test
    void TestDogSound(){

        assertEquals("Barks",dog.sound());
    }
    @Test
    void TestDogEats(){

        assertEquals("Food", dog.eat());
    }
    @Test
    void TestCatSound(){

        assertEquals("Meow",cat.sound());

    }
    @Test
    void TestCatEats(){

        assertEquals("Food",cat.eat());
    }
    @Test
    void TestHomeDog(){
        Home home = new Home();
        Dog dog = new Dog();
        dog.name = "dog";

        assertTrue(home.adoptPet(dog));
        assertFalse(home.adoptPet(dog));
    }
    @Test
    void TestHomeCat(){
        Home home = new Home();
        Cat cat = new Cat();
        cat.name = "dog";

        assertTrue(home.adoptPet(cat));
        assertFalse(home.adoptPet(cat));
    }


}