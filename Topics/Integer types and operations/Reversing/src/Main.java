import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        int reversed = 0;

        reversed += (inputNum % 10) * 100;
        reversed += ((inputNum / 10) % 10) * 10;
        reversed += (inputNum / 100) % 10;

        System.out.println(reversed);



    }
}

