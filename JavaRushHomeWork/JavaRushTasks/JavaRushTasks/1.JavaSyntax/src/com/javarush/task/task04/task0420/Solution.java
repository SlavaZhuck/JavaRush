package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] anArray={1,2,3};
        for(int i =0;i<3;i++)
            anArray[i]=Integer.parseInt(reader.readLine());

        Arrays.sort(anArray);

        for( int i =2;i>=0;i-- )
            System.out.print(anArray[i] + " ");


    }
}
