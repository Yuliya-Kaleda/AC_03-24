package nyc.c4q.yuliyakaleda;

/**
 * Created by Yuliya Kaleda on 3/24/15.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static ArrayList carList() {
        //Create an ArrayList that holds type Car.
        ArrayList<Car> cars = new ArrayList<Car>();

        //Create a few new Car objects and add them to the ArrayList.
        Car car1 = new Car("Toyota", "Corolla", 2015, 25000);
        Car car2 = new Car("Tesla", "ModelS", 2016, 90000);
        Car car3 = new Car("BMW", "X5", 2014, 80000);
        Car car4 = new Car("Chevy", "Camaro", 2015, 40000);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        return cars;
    }

    public static void main(String[] args) {
        //Create a Scanner for user input.
        Scanner in = new Scanner(System.in);


        // Prompt the user for the car's make, model, and year, and store the inputs in variables.
        System.out.println("What is your car's make?");
        String userMake = in.next();

        System.out.println("What is your " + userMake + "'s model?");
        String userModel = in.next();

        System.out.println("What is your " + userMake + " " + userModel + "'s year?");
        int userYear = in.nextInt();

        // Iterate over ArrayList of cars and check for a Car instance that has the same make, model, year
        boolean notFound = true;
        ArrayList<Car> cars = carList();
        for (int i = 0; i < carList().size(); i++) {
            if (cars.get(i).getMake().equalsIgnoreCase(userMake)) {
                if (cars.get(i).getModel().equalsIgnoreCase(userModel)) {
                    if (cars.get(i).getYear() == userYear) {
                        // Print the price of that car.
                        System.out.println("Your " + userYear + " " + userMake + " " + userModel + " is worth " + " $ " + cars.get(i).getPrice() + ".");
                        notFound = false;
                    }
                }
            }

        }
        if (notFound) {
            System.out.println("Sorry, we don't have such a car in stock. Could you please set a price range for us?");
            double userPrice = in.nextDouble();
            Car userChoice = new Car(userMake, userModel, userYear, userPrice);
            cars.add(userChoice);
        }
    }
}