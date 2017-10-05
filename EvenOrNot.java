import java.util.Scanner;

public class EvenOrNot {
    public static void main (String[] args){                         //Проверка вводимого числа на четность
     System.out.println("Введите число для проверки на четность:");
     Scanner s = new Scanner(System.in);
     int y = s.nextInt() % 2;
     if (y == 0) {
         System.out.println("Введено четное число!");
      }else {
         System.out.println("Введено нечетное число!");
     }
    }
}
