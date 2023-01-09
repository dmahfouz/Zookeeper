import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int num;

        while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);



    }
}