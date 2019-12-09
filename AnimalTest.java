import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTests {
    Cat cat = new Cat();
    Dog dog= new Dog();
    @Test
    void TestDogSound(){
        System.out.println("Does dog Bark");
        assertEquals("Barks",dog.sound());
    }
    @Test
    void TestDogEats(){
        System.out.println("Does dog eat food");
        assertEquals("Food", dog.eat());
    }
    @Test
    void TestCatSound(){
        System.out.println("Does cat Meow");
        assertEquals("Meow",cat.sound());

    }
    @Test
    void TestCatEats(){
        System.out.println("Does cat eat food");
        assertEquals("Food",cat.eat());
    }
}