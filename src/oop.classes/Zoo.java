package oop.classes;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 10.04.12
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */
public class Zoo {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", 5.0);
        Dog dog2 = new Dog("Bobby", 5.0);
        Dog dog3 = new Dog("Doggy", 1.0);

        System.out.println(compareDogs(dog1, dog2));
        System.out.println(compareDogs(dog1, dog3));
    }

    public void createAnimals() {

    }

    private static boolean compareDogs(Dog dog1, Dog dog2) {
        if(dog1.equals(dog2)) {
            return true;
        } else {
            return false;
        }
    }
}
