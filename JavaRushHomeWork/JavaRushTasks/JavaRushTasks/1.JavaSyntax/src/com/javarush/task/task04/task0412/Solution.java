package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String num = bufferedReader.readLine(); //читаем строку с клавиатуры
        int numm = Integer.parseInt(num); //преобразовываем строку в число.
        if(numm>0)
            System.out.println(numm*2);
        else if(numm<0)
            System.out.println(numm+1);
        else
            System.out.println(numm);


    }

}