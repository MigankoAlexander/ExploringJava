package oop.classes;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 10.04.12
 * Time: 10:41
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Animal {

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public void bark() {

    }

    @Override
    void move() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void eat() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object o) {
       return super.equals(o);
    }
}
