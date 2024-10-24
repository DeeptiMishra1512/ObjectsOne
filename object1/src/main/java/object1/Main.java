package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    //}

        //Created object Person and passed a new value to the variable height
        //Variable height is a new variable created in Class Person

        Person Person1 = new Person("Deepti", 10, 136 );
        System.out.println("\nTask1 : Class Person");
        System.out.println("Height of the person is: "+Person1.height);

        //creating object for Car.
        Car Car = new Car("Honda", "CRV", 2023,200 );

       /* Car.setMake("Honda");
        Car.setMileage(200);
        Car.setModel("CRV");
        Car.setYear(2023);
    */
        //Used \n to create a space
        System.out.println("\nTask2 : Class Car");
        System.out.println("Make of the Car is: " + Car.getMake());
        System.out.println("Model of the car is : " + Car.getModel());
        System.out.println("This car has mileage : " + Car.getMileage());
        System.out.println("Year this car was made : "+ Car.getYear());


        //Creating Object for Chair
        Chair Chair = new Chair("Wood", "Brown", 4);
        System.out.println("\nTask3 : Class Chair");
        System.out.println("Chair is made of: " + Chair.getMaterial());
        System.out.println("Color of Chair is: "+ Chair.getColor());
        System.out.println("Chair has " + Chair.getLegs() + " Legs");

    //Creating Object for Dog
        Dog Dog1 = new Dog("Pluto", 8, "Dalmatian");
        Dog Dog2 = new Dog("Simba", 10,"Puppy");

        System.out.println("\nTask4 : Class Dog");
        System.out.println("Dog Name : " + Dog1.getName() +
                "\nDog age & Breed : " + Dog1.getAge() + " & " + Dog1.getBreed());

        System.out.println("Dog Name : " + Dog2.getName() +
                "\nDog age & Breed : " + Dog2.getAge() + " & " + Dog2.getBreed());


    }
    }


