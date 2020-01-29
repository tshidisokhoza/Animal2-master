import java.util.ArrayList;

class Home {
    ArrayList<Animal> list = new ArrayList<Animal>();

   public boolean adoptPet(Cat cat){
        if(list.contains(cat)) {
            System.out.println("already Adopted");
            return false;

        }else {
            list.add(cat);
            return true;
        }
    }
    public boolean adoptPet(Dog dog){
        if(list.contains(dog)) {
            System.out.println("already Adopted");
            return  false;

        }else {
            list.add(dog);
            return true;
        }
    }

}