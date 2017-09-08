package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());

        double dec = time%5;
        if(dec >=0 && dec<3)
            System.out.println("зелёный");
        else if(dec >=3 && dec<4)
            System.out.println("желтый");
        else if(dec >=4 && dec<5)
            System.out.println("красный");
    }
}