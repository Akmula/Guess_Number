import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        System.out.println("Угадайте загаданное мною число! От 1 до 100!");
        System.out.print("Введите ваше число: ");
        int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
        Scanner in = new Scanner(System.in);
        int guess;

        do {
            guess = in.nextInt(); // число, прочитанное с клавиатуры
            if (number == guess) {
                System.out.println("Поздравляем! Вы угадали!");
            } else if (number > guess) {
                System.out.println("Не угадали! Мое число больше!");
            } else {
                System.out.println("Не угадали! Мое число меньше!");
            }
        }
        while (guess != number);
        System.out.println("До свидания!");
    }
}