package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i =10;
        int j =10;
        while(i>0) {
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            j=10;
            System.out.println("");
            i--;
        }
    }
}
