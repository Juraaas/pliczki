package pl.imiajd.jurewicz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> zad_3 = new ArrayList<>();
    File file = new File("pliczek.txt");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()){
        zad_3.add(scanner.nextLine() + "\n");
    }
    Collections.sort(zad_3);
    System.out.println(zad_3);
}
}
