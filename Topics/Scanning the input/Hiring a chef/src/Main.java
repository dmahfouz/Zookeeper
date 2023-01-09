import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String yearsOfExperience = scanner.next();
        String cuisinePreference = scanner.next();

        String output = "The form for " + firstName + " is completed. "
                + "We will contact you if we need a chef who cooks "
                + cuisinePreference + " dishes and has " + yearsOfExperience
                + " years of experience.";

        System.out.println(output);



    }
}