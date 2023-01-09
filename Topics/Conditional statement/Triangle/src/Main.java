import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean firstCase = (a + b) > c;
        boolean secondCase = (b + c) > a;
        boolean thirdCase = (a + c) > b;

        if (firstCase && secondCase && thirdCase) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}