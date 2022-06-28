package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int age = 19;
        isAdult(age);
    }
    public static boolean isAdult(int age){
        if (age >= 18)
            return true;
        else
            return false;
    }
}
