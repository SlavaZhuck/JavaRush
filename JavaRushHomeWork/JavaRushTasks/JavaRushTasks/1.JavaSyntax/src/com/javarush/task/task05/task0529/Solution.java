package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp_sum = 0;
        String temp_str = new String("0");
        while(true){
            temp_str = reader.readLine();
            if(temp_str.equals("сумма"))break;
            temp_sum += Integer.parseInt(temp_str);
           // System.out.println(temp_sum);
        }
        System.out.println(temp_sum);
    }
}
