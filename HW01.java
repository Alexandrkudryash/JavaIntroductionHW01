// Семинар-1, ДЗ-1
// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

// Решение

// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i

import java.util.Random;
public class HW01 {

    public static void main(String[] args) {
        int i = createRandom();
        System.out.println("Задача1: Случайное целое число в диапазоне от -1000 до 1000 = " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
       
        int n = biggerBit(i);
        System.out.println("Задача2: Старший бит выпавшего числа "+n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        
        int arrLength1 = findArrMultiples(n, i);
        int [] m1 = findMultiples(n, i, arrLength1);
        System.out.println("m1: ");
        printArray(m1);
        
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2        
        System.out.println();
        System.out.println(Short.MIN_VALUE);

        int arrLength2 = findArrNoMultiples(arrLength1, i);
        int [] m2 = findNoMultiples(n, i, arrLength2);
        System.out.println("m2: ");
        printArray(m2);
        
    }

    // Методы
    // Задача1: создание случайного числа

    static int createRandom() {
        return new Random().nextInt(-1000, 1000);
        }
    // Задача 2: старший бит
    static int biggerBit(int i) {
              if (i < 0) {
                  i = -i;
              }
              int n = 0;
              while (i != 1) {
                i>>=1;
                n++;
              }
              return n;
         }
    // Задача-3: поиск кратных n чисел в указанном диапазоне от i до Short.MAX_VALUE:
  

    static int findArrMultiples(int n, int i) {
         int k = 0;
         for (int j = i; j <= Short.MAX_VALUE; j++) {
             if (j% n == 0){
               k++;
              }      
             } 
         return k;
     }

     static int[] findMultiples(int n, int i, int arrLength1){
          int[] m1 = new int [arrLength1];
          int k = 0;
          for (int j = 0; j <=Short.MAX_VALUE; j++) {
                if (j % n == 0){
                    m1[k]=j;
                    k++;
                    }
           }
        return m1;
     }

     static void printArray(int[] arr){
           for (int i: arr) {
               System.out.printf("%d ", i);               
           }
     }

  // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

     static int findArrNoMultiples(int n, int i) {
         int k = 0;
         for (int j = Short.MIN_VALUE; j <= i; j++) {
             if (j % n != 0) {
                  k++;
             }
         }
       return k;   
     }

     static int [] findNoMultiples(int n, int i, int arrLength2) {
          int[]  m2 = new int [arrLength2];
          int k = 0;
          for (int j = Short.MIN_VALUE; j <=i; j++){
                 if (j % n != 0){
                     m2[k] = j;
                     k++;
                 }
          }
          return m2;
     }

}

    