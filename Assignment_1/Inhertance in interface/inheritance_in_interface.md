   Inheritance in interface:
    An interface in Java is a blueprint of a class. It has static constants and abstract methods.

   The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and    multiple inheritance in Java.

   In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

   Java Interface also represents the IS-A relationship.

   It cannot be instantiated just like the abstract class.
                  
                       code
                     
          interface AnimalEat {
          void eat();
        }
          interface AnimalTravel {
          void travel();
        }
       class Animal implements AnimalEat, AnimalTravel {
          public void eat() {
          System.out.println("Animal is eating");
        } 
           public void travel() {
           System.out.println("Animal is travelling");
        }
        }
           public class Demo {
           public static void main(String args[]) {
           Animal a = new Animal();
           a.eat();
           a.travel();
        }
        }
                         
              output
          Animal is eating
          Animal is travelling