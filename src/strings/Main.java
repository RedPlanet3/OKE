package strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Написать программу, осуществляющую обработку строк.

        Варианты заданий:

        1. Ввести n строк с консоли, найти самую короткую и самую длинную

        строки. Вывести найденные строки и их длину.

        2. Ввести n строк с консоли. Вывести на консоль те строки, длина которых

        больше средней, а также длину.

        3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых

        меньше средней, а также длину.

        4. Ввести n слов с консоли. Найти слово, в котором число различных

        символов минимально. Если таких слов несколько, найти первое из них.

        5. Ввести n слов с консоли. Найти слово, состоящее только из различных

        символов. Если таких слов несколько, найти первое из них.

        6. Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если

        таких слов больше одного, найти второе из них.*/

        String line;
        ArrayList<String> stringList = new ArrayList<>();

        while (true)
        {
            line = scanner.nextLine();
            if (line.equals("end"))
            {
                break;
            }
            else {
                stringList.add(line);

            }
        }
       // System.out.println(MinMax(stringList)); // 1
      //  middleSize(stringList);//2
     //   differentSymbols(stringList); //4
     //   numbers(stringList); //6
    }

    public static String MinMax(ArrayList<String> stringListMinMax){
        System.out.println("1. stringListMinMax");
        String minLine = stringListMinMax.get(0);
        String maxLine = stringListMinMax.get(0);
        for (int i=1; i<stringListMinMax.size(); i++){
            if (stringListMinMax.get(i).length()<minLine.length()){
                minLine = stringListMinMax.get(i);
            }
            if (stringListMinMax.get(i).length()>maxLine.length()){
                maxLine = stringListMinMax.get(i);
            }
        }

        return "min: "+minLine + "\nmax: "+ maxLine;
    }

    public static void middleSize(ArrayList<String> stringListMinMax) {
        System.out.println("2. stringListMinMax");
        int lenLine = 0;
        for (int i =0; i<stringListMinMax.size(); i++) {
            lenLine += stringListMinMax.get(i).length();
        }
        for (String line : stringListMinMax) {
            if (line.length() > lenLine/stringListMinMax.size()) {
                System.out.println(line);
            }
        }
        System.out.println("middle length: " + lenLine/stringListMinMax.size());
    }

    public static void differentSymbols(ArrayList<String> stringDifferent) {
        //  int schet;
        int[] diff = new int[stringDifferent.size()];
        for (int i=0; i<stringDifferent.size(); i++) {
            int schet = 1;
            char[] arrayChar =  stringDifferent.get(i).toCharArray();
            Arrays.sort(arrayChar);
            for (int g=1; g<arrayChar.length; g++) {
                //  char difSym = stringDifferent.get(i).charAt(g);
                if (arrayChar[g - 1] != arrayChar[g]) {
                    schet += 1;
                }
            }
            diff[i] = schet;
        }

        int min = -1;
        int minI = -1;
        for (int d = 0; d >diff.length; d++) {
            if(min>diff[d]&&diff[d]!=1)
                min= diff[d];
            minI = d;
        }
        if (minI>-1)
            System.out.println(stringDifferent.get(minI));
        else System.out.println("Goodbay");
    }

    public static void numbers (ArrayList<String> stringNumbers) {
        ArrayList<String> numbersList = new ArrayList<>();
        for (int i=0; i<stringNumbers.size(); i++) {
            char[] arrayChar =  stringNumbers.get(i).toCharArray();
            //Arrays.sort(arrayChar);
            for (int j = 0; j < arrayChar.length; j++) {
                if (!Character.isDigit(arrayChar[j])){
                    break;
                }
                if (j==(arrayChar.length-1)) {
                    numbersList.add(stringNumbers.get(i));
                }


            }
        }
switch (numbersList.size()) {
    case 0:
        System.out.println("Чисел нет"); break;
    case 1:
        System.out.println(numbersList.get(0)); break;
    default:
        System.out.println(numbersList.get(1)); break;
}



    }
}
