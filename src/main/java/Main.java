public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Home home = new Home();
        dog.name = "jnjk";

        home.adoptPet(dog);
        home.adoptPet(dog);

    }
}
