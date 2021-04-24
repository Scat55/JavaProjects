import java.util.Scanner;
public class Main {
    static int guess;
    static int random_num;
    static int range;
    static int attempt = 0;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        range = 100;
        random_num = (int)(Math.random() * (double)range);
        System.out.println("Введите число: ");
        guess = num.nextInt();

        while(guess != random_num) {
            if (guess > random_num) {
                System.out.println("Введите меньше: ");
                guess = num.nextInt();
                ++attempt;
            }

            if (guess < random_num) {
                System.out.println("Ведите больше: ");
                guess = num.nextInt();
                ++attempt;
            }

            if (guess == random_num) {
                System.out.println("Да, это " + random_num);
                System.out.println("Кол-во попыток: " + attempt);
            }
        }

    }
}
