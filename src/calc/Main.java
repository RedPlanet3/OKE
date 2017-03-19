package calc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
//	 3 Написать калькулятор – программа, которая на входе получает два целых числа
//
//        (число А и число В), выполняет арифметическую операцию («+» - сложение, «-»
//
//        - вычитание, «*» - умножение, «/» - деление) и выводит результат в консоль.
//
//                Для каждой операции использовать отдельный метод (нельзя использовать
//
//                методы библиотечного класса Math). Предусмотреть пользовательское меню
//
//        для выбора необходимой операции. Ввод входных данных осуществлять с
//
//        клавиатуры.
        Scanner scanner = new Scanner(System.in);
        int a,b;
        //ArrayList<String> stringList = new ArrayList<>();
        System.out.println("Enter two num");
        a = scanner.nextInt();
        b = scanner.nextInt();
        //scanner.next();

        System.out.println("+ - * /");
        String viborMetod = scanner.next();

        switch (viborMetod) {
            case "+" :
                System.out.println(summ(a,b)); break;
            case "-":
                System.out.println(subtraction(a,b)); break;
            case "*":
                System.out.println(multiplication(a,b)); break;
            case "/":
                System.out.printf("%.2f",division(a,b)); break;
            default:
                System.out.println("Wrong method");
        }


    }
    public static int summ(int a,int b) {
    return a+b;
    }
    public static int subtraction(int a,int b) {
        return a-b;}
    public static int multiplication(int a,int b) {
        return a*b;}
    public static double division(int a,int b) {
     double div = (double) a/b;
       return div;
        }

}
