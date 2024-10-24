package object1;

public class Person {
    // Define a class
    //class Person {
        // Define Instance Variables
        // different for each object!
        String name;
        int age = 0;
        int height=0;   //the unit for height in Centimeters.
        // Constructor
        public Person(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public static void main(String[] args) {
            // Declare and initialize an object
            Person Person = new Person("John", 30, 125);

            /* Now you can use the Object `person1` */

        }
    }


