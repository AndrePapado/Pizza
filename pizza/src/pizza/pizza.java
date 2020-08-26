package pizza;

import java.util.Scanner;

public class pizza {

public static void main (String[] args) {
		
        int persons; // number of persons
        double diameterPersonalPizza, diameterFamilyPizza; // diameters of pizza
        double pricePersonalPizza, priceFamilyPizza; // prices of pizza
        double ratioPersonalPizza, ratioFamilyPizza; // price/surface rates
        double radiusPersonalPizza, radiusFamilyPizza;

        //Create an input object in order to obtain the user input
        Scanner sc = new Scanner (System.in);
         
        System.out.println("PIZZA CHOOSER!");

        System.out.println("Enter the number of persons:");
        persons = sc.nextInt();

        System.out.println("Enter the diameters of personal and family pizzas (separated by spaces):");
        diameterPersonalPizza = sc.nextDouble();
        diameterFamilyPizza = sc.nextDouble();

        System.out.println("Enter the prices of personal and family pizzas (separated by spaces):");
        pricePersonalPizza = sc.nextDouble();
        priceFamilyPizza = sc.nextDouble();
        
        sc.close();

        //Personal Pizza Ratio Calculation
        radiusPersonalPizza = diameterPersonalPizza / 2;
        ratioPersonalPizza = pricePersonalPizza / (Math.PI* Math.pow(radiusPersonalPizza,2)); // no need to multiple and divide by X

        //Family Pizza Ratio Calculation
        radiusFamilyPizza = diameterFamilyPizza / 2;
        ratioFamilyPizza = (Math.ceil(persons/2.0) * priceFamilyPizza)  / (persons/2.0 * Math.PI* Math.pow(radiusFamilyPizza,2));

        //Decision which type of pizza will be ordered
        if (ratioPersonalPizza <= ratioFamilyPizza) // in case of equality, we arbitrarily prefer personal pizzas
            System.out.println ("order " + persons + " personal pizzas, the price/surface rate is " + ratioPersonalPizza);
        else
            System.out.println ("order " + (int) Math.ceil(persons/2.0) + " family pizzas, the price/surface rate is " + ratioFamilyPizza);
        }
}


