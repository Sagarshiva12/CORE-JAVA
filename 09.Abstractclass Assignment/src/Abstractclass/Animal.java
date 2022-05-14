/**
   01. Create an abstract class with abstract and non-abstract methods.
   02. Create a subclass for an abstract class. Create an object in the child class for the
   abstract class and access the non-abstract methods
   03. Create an instance for the child class in child class and call abstract methods
   04. Create an instance for the child class in child class and call non-abstract methods
 */


package Abstractclass;
//An abstract method doesn't have its body
public abstract class Animal {
	//non-abstract method
    
    abstract void sound();

    
    void eat() {
        System.out.println("Animal is eating");
    }
}

//subclass for an abstract class
class Lion extends Animal {
    //provide implementation of abstract method
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Animal A = new Lion();
        //accessing the non-abstract methods
        A.eat();

        //instance for the child class
        Lion L = new Lion();
        //calling abstract methods
        L.sound();
        //calling non-abstract methods
        L.eat();
    }
}