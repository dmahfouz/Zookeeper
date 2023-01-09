import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSquirrels = scanner.nextInt();
        int numNuts = scanner.nextInt();

        int nutsPerSquirrel = numNuts / numSquirrels;
        System.out.println(nutsPerSquirrel);
    }
}