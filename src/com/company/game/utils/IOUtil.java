package com.company.game.utils;

import java.util.Scanner;

public class IOUtil {
    public static Scanner sc = new Scanner(System.in);

    public static String getInput() {
        return sc.nextLine();
    }

    public static void printText(String text) {
        try {
            for (String s : text.split(" ")) {
                for (char c : s.toCharArray()) {
                    Thread.sleep(15);
                    System.out.print(c);
                }
                System.out.print(" ");
                Thread.sleep(15);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

