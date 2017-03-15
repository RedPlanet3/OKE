/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1010;

/**
 *
 * @author Administrator
 */
public class Array1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;
//        for (int cel:arr) {
//            cel = ((int)(Math.random()*21))-10;
//            System.out.print(cel+",");
//        }
                for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random()*21))-10;
            System.out.print(arr[i]+",");
        }
                System.out.println("");
        //1. В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный. 
//      System.out.print("Задание 1. ");
//       int minPol = Integer.MAX_VALUE;
//       int minI=0,maxI=0;
//       int maxOtr = Integer.MIN_VALUE;
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]>0){
//                minPol = Math.min(minPol, arr[i]);
//            if (minPol==arr[i])
//                minI = i;
//            }
//            if (arr[i]<0) {
//                maxOtr = Math.max(maxOtr, arr[i]);
//                        if(maxOtr == arr[i])
//                            maxI = i;
//            }
//           }
//        System.out.println("\nМинимПоложит "+minPol+" индекс "+minI+"\nМаксимальноОтрицат "+maxOtr+" Индекс "+maxI);
        
        //2. В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
//        System.out.print("Задание 2. ");
//
//            for (int i=0; i<arr.length; i+=2) {
//            sum +=arr[i];
//        }
//        System.out.println("Сумма "+sum);
        //3. В массиве целых чисел заменить нулями отрицательные элементы.
//       System.out.print("Задание 3. ");
//        for (int i=0; i<arr.length; i++) {
//            if(arr[i]<0){
//                arr[i]=0;
//               
//            }
//            System.out.print(arr[i]+",");
//        }
        //4. В массиве целых чисел утроить каждый положительный элемент,который стоит перед отрицательным.

//        System.out.print("Задание 4. ");     
//        for (int i=1; i<arr.length; i++) {
//            if((arr[i]>0)&(arr[i-1]<0)){
//                arr[i]*=3;
//            }
//            System.out.print(arr[i]+",");   
//            }

//5. В массиве целых чисел найти разницу между средним арифметическим и значением минимального элемента.
//       int minEl = Integer.MAX_VALUE;
//       double raznost;
//        for (int i=0; i<arr.length; i++){
//                sum+=arr[i];
//                minEl = Math.min(minEl, arr[i]);
//        }
//        raznost=sum/arr.length-minEl;
//        System.out.println(raznost);

//6. В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
        
          for (int i=0; i<arr.length; i++){
                
                for (int j=i+1; j<arr.length; j++) {
                    if ((arr[i]==arr[j])&(j%2==1))
                        System.out.println("Число "+arr[j]+" индекс1:"+i+" индекс2:"+j);
                        }
                        
        }
    }
}

