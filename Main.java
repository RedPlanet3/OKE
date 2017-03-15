package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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
        //char ch=' ';
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
        differentSymbols(stringList); //3
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
        int schet = 0;
        int[] diff = new int[stringDifferent.size()];
        for (int i=0; i<stringDifferent.size(); i++) {
            schet = 0;
            for (int g=1; g<stringDifferent.get(i).length(); g++) {
                if (stringDifferent.get(i).charAt(g-1)== stringDifferent.get(i).charAt(g)){
                    schet+=1;
                }
            }
            diff[i] = schet;
        }
        int max = diff[diff.length-1];
        int maxI = 0;
        for (int i = diff.length-2; i >0; i--) {
            if(max<diff[i])
                max= diff[i];
                maxI = i;
        }

        System.out.println(stringDifferent.get(maxI));
    }
}
