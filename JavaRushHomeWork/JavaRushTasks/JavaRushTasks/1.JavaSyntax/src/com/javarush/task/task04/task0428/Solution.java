package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] anArray={1,2,3};
        int temp=0;
        for(int i =0;i<3;i++)
            anArray[i]=Integer.parseInt(reader.readLine());
        for(int i =0;i<anArray.length;i++)
            if (anArray[i] >0)
                temp+=1;
        System.out.println(temp);

    }
}
