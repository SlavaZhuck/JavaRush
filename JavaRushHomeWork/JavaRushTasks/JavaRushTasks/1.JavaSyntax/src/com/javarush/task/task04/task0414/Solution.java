package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

       String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int year = Integer.parseInt(sAge); //преобразовываем строку в число.
        if (year%100==0 && year%400!=0)
            System.out.println("количество дней в году: 365");
        else if (year%4==0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}