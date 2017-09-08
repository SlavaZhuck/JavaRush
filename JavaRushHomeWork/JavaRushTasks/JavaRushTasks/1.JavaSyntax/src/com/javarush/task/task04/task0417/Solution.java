package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        if(first == second && second == third)
            System.out.println(first + " " + second +" " + third);
        else if (first == second )
            System.out.println(first + " " + second);
        else if (second == third )
            System.out.println(second + " " + third);
        else if (first == third )
            System.out.println(first + " " + third);
    }
}