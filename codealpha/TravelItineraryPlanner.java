//public class TravelItineraryPlanner {
//}
import java.util.ArrayList;
import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> destinations = new ArrayList<>();
        ArrayList<String> dates = new ArrayList<>();

        System.out.println("Enter the number of destinations:");
        int numberOfDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfDestinations; i++) {
            System.out.println("Enter destination " + (i + 1) + ":");
            destinations.add(scanner.nextLine());
            System.out.println("Enter date (YYYY-MM-DD) for destination " + (i + 1) + ":");
            dates.add(scanner.nextLine());
        }

        System.out.println("Enter your budget:");
        double budget = scanner.nextDouble();

        // Further processing with collected data
        System.out.println("Destinations: " + destinations);
        System.out.println("Dates: " + dates);
        System.out.println("Budget: $" + budget);
    }
}
