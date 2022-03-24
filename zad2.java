package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad2 {
    public static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
        return count;

    }

    public static int fileCountChar(String filename, char znak) {
        try {
            int count = 0;
            File file = new File(filename);
            String reader;
            Scanner wczytaj = new Scanner(file);
            while (wczytaj.hasNextLine()) {
                reader = wczytaj.nextLine();
                count = count + countChar(reader, znak);
            }
            return count;
        } catch (FileNotFoundException err) {
            System.out.println("Mamy klopot");
            err.printStackTrace();
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.printf("%d", fileCountChar("filefile.txt", 'i'));
    }
}