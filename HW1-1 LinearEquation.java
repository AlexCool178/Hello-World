import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args){
        /*решить уравнение ax+b=0
        a и b фиксированные, x вводится с клавиатуры */
        int a = -1;
        int b = 2;
        int x;
        System.out.println("Введите значение x чтобы уравнение ax+b=0 было верно, где a = -1, b = 2:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (a*x+b == 0) {
            System.out.println("Решение верно!");
        }
        else {
            System.out.println("Решение неверно!");
        }
    }
}
