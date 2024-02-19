import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of gallons of gas in the tank :");
        if(input.hasNextDouble()) {
            double efficiency = input.nextDouble();

            System.out.print("Enter the efficiency in miles per gallon:");
                if(input.hasNextDouble()) {
                    efficiency = input.nextDouble();
                    System.out.print("Enter the price pf gas per gallon:");
                    if (input.hasNextDouble()) {
                        double pricePerGallon = input.nextDouble();

                        double costPer100Mile = (100.0 / efficiency) * pricePerGallon;

                        double distance = pricePerGallon * efficiency;

                        System.out.println("Cost per 100 miles: $" + costPer100Mile);

                        System.out.println("Distance the car can go with the gas in the tank:" + distance + "miles");
                    }else {
                        System.out.println("Invalid input for fuel efficiency");
                    }
                    input.close();
                    }
                }

        }
    }
