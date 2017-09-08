package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] anArray={1,2,3};
        for(int i =0;i<3;i++)
            anArray[i]=Integer.parseInt(reader.readLine());

        if(anArray[0]!=anArray[1] && anArray[1]==anArray[2])
            System.out.println("1");
        else if(anArray[1]!=anArray[0] && anArray[0]==anArray[2])
            System.out.println("2");
        else if(anArray[2]!=anArray[0] && anArray[0]==anArray[1])
            System.out.println("3");


    }
}
