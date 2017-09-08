package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] anArray={1,2,3};
        int temp_P=0;
        int temp_N=0;
        for(int i =0;i<3;i++)
            anArray[i]=Integer.parseInt(reader.readLine());
        for(int i =0;i<anArray.length;i++) {
            if (anArray[i] > 0)
                temp_P += 1;
            else if (anArray[i] < 0)
                temp_N += 1;
        }

        System.out.println( "количество отрицательных чисел: "+ temp_N);
        System.out.println( "количество положительных чисел: "+ temp_P);
    }
}
