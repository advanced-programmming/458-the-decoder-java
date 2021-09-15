package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String value = replaceString(line.toCharArray());
            System.out.println(value);
        }
    }

    public static String replaceString(char[] charArray){
        for(int i = 0; i < charArray.length; i++)
            charArray[i] = (char) (charArray[i] - 7);
        return new String(charArray);
    }
}
