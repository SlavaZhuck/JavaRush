package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sA = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sB = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sC = bufferedReader.readLine(); //читаем строку с клавиатуры
        int a = Integer.parseInt(sA); //преобразовываем строку в число.
        int b = Integer.parseInt(sB); //преобразовываем строку в число.
        int c = Integer.parseInt(sC); //преобразовываем строку в число.

        if(a<b+c && b<a+c && c <a+b)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }
}