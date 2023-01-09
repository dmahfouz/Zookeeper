import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = scanner.nextInt();
        int num = 1;

        while (num * num <= maxValue) {
            System.out.println(num * num);
            num++;
        }

    }
}